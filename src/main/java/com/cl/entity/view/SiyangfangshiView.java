package com.cl.entity.view;

import com.cl.entity.SiyangfangshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 饲养方式
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
@TableName("siyangfangshi")
public class SiyangfangshiView  extends SiyangfangshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SiyangfangshiView(){
	}
 
 	public SiyangfangshiView(SiyangfangshiEntity siyangfangshiEntity){
 	try {
			BeanUtils.copyProperties(this, siyangfangshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
