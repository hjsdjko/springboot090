package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.MuhuxinxiDao;
import com.cl.entity.MuhuxinxiEntity;
import com.cl.service.MuhuxinxiService;
import com.cl.entity.view.MuhuxinxiView;

@Service("muhuxinxiService")
public class MuhuxinxiServiceImpl extends ServiceImpl<MuhuxinxiDao, MuhuxinxiEntity> implements MuhuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MuhuxinxiEntity> page = this.selectPage(
                new Query<MuhuxinxiEntity>(params).getPage(),
                new EntityWrapper<MuhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MuhuxinxiEntity> wrapper) {
		  Page<MuhuxinxiView> page =new Query<MuhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<MuhuxinxiView> selectListView(Wrapper<MuhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MuhuxinxiView selectView(Wrapper<MuhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<MuhuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<MuhuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<MuhuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
