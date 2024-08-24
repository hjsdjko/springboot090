package com.cl.dao;

import com.cl.entity.ChumuzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChumuzhongleiView;


/**
 * 畜牧种类
 * 
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
public interface ChumuzhongleiDao extends BaseMapper<ChumuzhongleiEntity> {
	
	List<ChumuzhongleiView> selectListView(@Param("ew") Wrapper<ChumuzhongleiEntity> wrapper);

	List<ChumuzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<ChumuzhongleiEntity> wrapper);
	
	ChumuzhongleiView selectView(@Param("ew") Wrapper<ChumuzhongleiEntity> wrapper);
	

}
