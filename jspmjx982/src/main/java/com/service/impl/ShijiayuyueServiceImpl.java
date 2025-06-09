package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShijiayuyueDao;
import com.entity.ShijiayuyueEntity;
import com.service.ShijiayuyueService;
import com.entity.vo.ShijiayuyueVO;
import com.entity.view.ShijiayuyueView;

@Service("shijiayuyueService")
public class ShijiayuyueServiceImpl extends ServiceImpl<ShijiayuyueDao, ShijiayuyueEntity> implements ShijiayuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijiayuyueEntity> page = this.selectPage(
                new Query<ShijiayuyueEntity>(params).getPage(),
                new EntityWrapper<ShijiayuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijiayuyueEntity> wrapper) {
		  Page<ShijiayuyueView> page =new Query<ShijiayuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShijiayuyueVO> selectListVO(Wrapper<ShijiayuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijiayuyueVO selectVO(Wrapper<ShijiayuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijiayuyueView> selectListView(Wrapper<ShijiayuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijiayuyueView selectView(Wrapper<ShijiayuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
