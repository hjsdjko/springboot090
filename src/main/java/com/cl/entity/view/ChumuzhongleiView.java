package com.cl.entity.view;

import com.cl.entity.ChumuzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 畜牧种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
@TableName("chumuzhonglei")
public class ChumuzhongleiView  extends ChumuzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChumuzhongleiView(){
	}
 
 	public ChumuzhongleiView(ChumuzhongleiEntity chumuzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, chumuzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
