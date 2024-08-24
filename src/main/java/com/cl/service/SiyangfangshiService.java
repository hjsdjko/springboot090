package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.SiyangfangshiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.SiyangfangshiView;


/**
 * 饲养方式
 *
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
public interface SiyangfangshiService extends IService<SiyangfangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SiyangfangshiView> selectListView(Wrapper<SiyangfangshiEntity> wrapper);
   	
   	SiyangfangshiView selectView(@Param("ew") Wrapper<SiyangfangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SiyangfangshiEntity> wrapper);
   	

}

