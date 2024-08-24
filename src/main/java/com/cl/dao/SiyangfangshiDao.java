package com.cl.dao;

import com.cl.entity.SiyangfangshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.SiyangfangshiView;


/**
 * 饲养方式
 * 
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
public interface SiyangfangshiDao extends BaseMapper<SiyangfangshiEntity> {
	
	List<SiyangfangshiView> selectListView(@Param("ew") Wrapper<SiyangfangshiEntity> wrapper);

	List<SiyangfangshiView> selectListView(Pagination page,@Param("ew") Wrapper<SiyangfangshiEntity> wrapper);
	
	SiyangfangshiView selectView(@Param("ew") Wrapper<SiyangfangshiEntity> wrapper);
	

}
