package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.SiyangfangshiEntity;
import com.cl.entity.view.SiyangfangshiView;

import com.cl.service.SiyangfangshiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 饲养方式
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
@RestController
@RequestMapping("/siyangfangshi")
public class SiyangfangshiController {
    @Autowired
    private SiyangfangshiService siyangfangshiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SiyangfangshiEntity siyangfangshi,
		HttpServletRequest request){
        EntityWrapper<SiyangfangshiEntity> ew = new EntityWrapper<SiyangfangshiEntity>();

		PageUtils page = siyangfangshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, siyangfangshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SiyangfangshiEntity siyangfangshi, 
		HttpServletRequest request){
        EntityWrapper<SiyangfangshiEntity> ew = new EntityWrapper<SiyangfangshiEntity>();

		PageUtils page = siyangfangshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, siyangfangshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SiyangfangshiEntity siyangfangshi){
       	EntityWrapper<SiyangfangshiEntity> ew = new EntityWrapper<SiyangfangshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( siyangfangshi, "siyangfangshi")); 
        return R.ok().put("data", siyangfangshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SiyangfangshiEntity siyangfangshi){
        EntityWrapper< SiyangfangshiEntity> ew = new EntityWrapper< SiyangfangshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( siyangfangshi, "siyangfangshi")); 
		SiyangfangshiView siyangfangshiView =  siyangfangshiService.selectView(ew);
		return R.ok("查询饲养方式成功").put("data", siyangfangshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SiyangfangshiEntity siyangfangshi = siyangfangshiService.selectById(id);
		siyangfangshi = siyangfangshiService.selectView(new EntityWrapper<SiyangfangshiEntity>().eq("id", id));
        return R.ok().put("data", siyangfangshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SiyangfangshiEntity siyangfangshi = siyangfangshiService.selectById(id);
		siyangfangshi = siyangfangshiService.selectView(new EntityWrapper<SiyangfangshiEntity>().eq("id", id));
        return R.ok().put("data", siyangfangshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SiyangfangshiEntity siyangfangshi, HttpServletRequest request){
    	siyangfangshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(siyangfangshi);
        siyangfangshiService.insert(siyangfangshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SiyangfangshiEntity siyangfangshi, HttpServletRequest request){
    	siyangfangshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(siyangfangshi);
        siyangfangshiService.insert(siyangfangshi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SiyangfangshiEntity siyangfangshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(siyangfangshi);
        siyangfangshiService.updateById(siyangfangshi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        siyangfangshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
