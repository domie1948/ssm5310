package com.entity.view;

import com.entity.ShijiayuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 试驾预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 20:17:46
 */
@TableName("shijiayuyue")
public class ShijiayuyueView  extends ShijiayuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShijiayuyueView(){
	}
 
 	public ShijiayuyueView(ShijiayuyueEntity shijiayuyueEntity){
 	try {
			BeanUtils.copyProperties(this, shijiayuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
