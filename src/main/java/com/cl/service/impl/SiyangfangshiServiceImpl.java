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


import com.cl.dao.SiyangfangshiDao;
import com.cl.entity.SiyangfangshiEntity;
import com.cl.service.SiyangfangshiService;
import com.cl.entity.view.SiyangfangshiView;

@Service("siyangfangshiService")
public class SiyangfangshiServiceImpl extends ServiceImpl<SiyangfangshiDao, SiyangfangshiEntity> implements SiyangfangshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SiyangfangshiEntity> page = this.selectPage(
                new Query<SiyangfangshiEntity>(params).getPage(),
                new EntityWrapper<SiyangfangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SiyangfangshiEntity> wrapper) {
		  Page<SiyangfangshiView> page =new Query<SiyangfangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<SiyangfangshiView> selectListView(Wrapper<SiyangfangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SiyangfangshiView selectView(Wrapper<SiyangfangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
