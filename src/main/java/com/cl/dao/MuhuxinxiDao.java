package com.cl.dao;

import com.cl.entity.MuhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MuhuxinxiView;


/**
 * 牧户信息
 * 
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
public interface MuhuxinxiDao extends BaseMapper<MuhuxinxiEntity> {
	
	List<MuhuxinxiView> selectListView(@Param("ew") Wrapper<MuhuxinxiEntity> wrapper);

	List<MuhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<MuhuxinxiEntity> wrapper);
	
	MuhuxinxiView selectView(@Param("ew") Wrapper<MuhuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MuhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MuhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MuhuxinxiEntity> wrapper);



}
