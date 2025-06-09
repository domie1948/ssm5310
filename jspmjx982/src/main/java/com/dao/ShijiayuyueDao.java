package com.dao;

import com.entity.ShijiayuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijiayuyueVO;
import com.entity.view.ShijiayuyueView;


/**
 * 试驾预约
 * 
 * @author 
 * @email 
 * @date 2021-03-15 20:17:46
 */
public interface ShijiayuyueDao extends BaseMapper<ShijiayuyueEntity> {
	
	List<ShijiayuyueVO> selectListVO(@Param("ew") Wrapper<ShijiayuyueEntity> wrapper);
	
	ShijiayuyueVO selectVO(@Param("ew") Wrapper<ShijiayuyueEntity> wrapper);
	
	List<ShijiayuyueView> selectListView(@Param("ew") Wrapper<ShijiayuyueEntity> wrapper);

	List<ShijiayuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ShijiayuyueEntity> wrapper);
	
	ShijiayuyueView selectView(@Param("ew") Wrapper<ShijiayuyueEntity> wrapper);
	
}
