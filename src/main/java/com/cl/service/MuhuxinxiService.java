package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.MuhuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MuhuxinxiView;


/**
 * 牧户信息
 *
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
public interface MuhuxinxiService extends IService<MuhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MuhuxinxiView> selectListView(Wrapper<MuhuxinxiEntity> wrapper);
   	
   	MuhuxinxiView selectView(@Param("ew") Wrapper<MuhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MuhuxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MuhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MuhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MuhuxinxiEntity> wrapper);



}

