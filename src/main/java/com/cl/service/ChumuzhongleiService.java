package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChumuzhongleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChumuzhongleiView;


/**
 * 畜牧种类
 *
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
public interface ChumuzhongleiService extends IService<ChumuzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChumuzhongleiView> selectListView(Wrapper<ChumuzhongleiEntity> wrapper);
   	
   	ChumuzhongleiView selectView(@Param("ew") Wrapper<ChumuzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChumuzhongleiEntity> wrapper);
   	

}

