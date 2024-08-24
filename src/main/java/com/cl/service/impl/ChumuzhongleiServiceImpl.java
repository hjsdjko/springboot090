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


import com.cl.dao.ChumuzhongleiDao;
import com.cl.entity.ChumuzhongleiEntity;
import com.cl.service.ChumuzhongleiService;
import com.cl.entity.view.ChumuzhongleiView;

@Service("chumuzhongleiService")
public class ChumuzhongleiServiceImpl extends ServiceImpl<ChumuzhongleiDao, ChumuzhongleiEntity> implements ChumuzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChumuzhongleiEntity> page = this.selectPage(
                new Query<ChumuzhongleiEntity>(params).getPage(),
                new EntityWrapper<ChumuzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChumuzhongleiEntity> wrapper) {
		  Page<ChumuzhongleiView> page =new Query<ChumuzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChumuzhongleiView> selectListView(Wrapper<ChumuzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChumuzhongleiView selectView(Wrapper<ChumuzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
