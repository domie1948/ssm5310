package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShijiayuyueEntity;
import com.entity.view.ShijiayuyueView;

import com.service.ShijiayuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 试驾预约
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-15 20:17:46
 */
@RestController
@RequestMapping("/shijiayuyue")
public class ShijiayuyueController {
    @Autowired
    private ShijiayuyueService shijiayuyueService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShijiayuyueEntity shijiayuyue, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shijiayuyue.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShijiayuyueEntity> ew = new EntityWrapper<ShijiayuyueEntity>();
    	PageUtils page = shijiayuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shijiayuyue), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShijiayuyueEntity shijiayuyue, HttpServletRequest request){
        EntityWrapper<ShijiayuyueEntity> ew = new EntityWrapper<ShijiayuyueEntity>();
    	PageUtils page = shijiayuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shijiayuyue), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShijiayuyueEntity shijiayuyue){
       	EntityWrapper<ShijiayuyueEntity> ew = new EntityWrapper<ShijiayuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shijiayuyue, "shijiayuyue")); 
        return R.ok().put("data", shijiayuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShijiayuyueEntity shijiayuyue){
        EntityWrapper< ShijiayuyueEntity> ew = new EntityWrapper< ShijiayuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shijiayuyue, "shijiayuyue")); 
		ShijiayuyueView shijiayuyueView =  shijiayuyueService.selectView(ew);
		return R.ok("查询试驾预约成功").put("data", shijiayuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShijiayuyueEntity shijiayuyue = shijiayuyueService.selectById(id);
        return R.ok().put("data", shijiayuyue);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShijiayuyueEntity shijiayuyue = shijiayuyueService.selectById(id);
        return R.ok().put("data", shijiayuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShijiayuyueEntity shijiayuyue, HttpServletRequest request){
    	shijiayuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shijiayuyue);

        shijiayuyueService.insert(shijiayuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShijiayuyueEntity shijiayuyue, HttpServletRequest request){
    	shijiayuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shijiayuyue);

        shijiayuyueService.insert(shijiayuyue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShijiayuyueEntity shijiayuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shijiayuyue);
        shijiayuyueService.updateById(shijiayuyue);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shijiayuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShijiayuyueEntity> wrapper = new EntityWrapper<ShijiayuyueEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = shijiayuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
