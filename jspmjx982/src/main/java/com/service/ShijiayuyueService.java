package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijiayuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijiayuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijiayuyueView;


/**
 * 试驾预约
 *
 * @author 
 * @email 
 * @date 2021-03-15 20:17:46
 */
public interface ShijiayuyueService extends IService<ShijiayuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijiayuyueVO> selectListVO(Wrapper<ShijiayuyueEntity> wrapper);
   	
   	ShijiayuyueVO selectVO(@Param("ew") Wrapper<ShijiayuyueEntity> wrapper);
   	
   	List<ShijiayuyueView> selectListView(Wrapper<ShijiayuyueEntity> wrapper);
   	
   	ShijiayuyueView selectView(@Param("ew") Wrapper<ShijiayuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijiayuyueEntity> wrapper);
   	
}

