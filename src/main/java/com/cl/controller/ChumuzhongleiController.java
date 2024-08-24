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

import com.cl.entity.ChumuzhongleiEntity;
import com.cl.entity.view.ChumuzhongleiView;

import com.cl.service.ChumuzhongleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 畜牧种类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
@RestController
@RequestMapping("/chumuzhonglei")
public class ChumuzhongleiController {
    @Autowired
    private ChumuzhongleiService chumuzhongleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChumuzhongleiEntity chumuzhonglei,
		HttpServletRequest request){
        EntityWrapper<ChumuzhongleiEntity> ew = new EntityWrapper<ChumuzhongleiEntity>();

		PageUtils page = chumuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chumuzhonglei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChumuzhongleiEntity chumuzhonglei, 
		HttpServletRequest request){
        EntityWrapper<ChumuzhongleiEntity> ew = new EntityWrapper<ChumuzhongleiEntity>();

		PageUtils page = chumuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chumuzhonglei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChumuzhongleiEntity chumuzhonglei){
       	EntityWrapper<ChumuzhongleiEntity> ew = new EntityWrapper<ChumuzhongleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chumuzhonglei, "chumuzhonglei")); 
        return R.ok().put("data", chumuzhongleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChumuzhongleiEntity chumuzhonglei){
        EntityWrapper< ChumuzhongleiEntity> ew = new EntityWrapper< ChumuzhongleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chumuzhonglei, "chumuzhonglei")); 
		ChumuzhongleiView chumuzhongleiView =  chumuzhongleiService.selectView(ew);
		return R.ok("查询畜牧种类成功").put("data", chumuzhongleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChumuzhongleiEntity chumuzhonglei = chumuzhongleiService.selectById(id);
		chumuzhonglei = chumuzhongleiService.selectView(new EntityWrapper<ChumuzhongleiEntity>().eq("id", id));
        return R.ok().put("data", chumuzhonglei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChumuzhongleiEntity chumuzhonglei = chumuzhongleiService.selectById(id);
		chumuzhonglei = chumuzhongleiService.selectView(new EntityWrapper<ChumuzhongleiEntity>().eq("id", id));
        return R.ok().put("data", chumuzhonglei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChumuzhongleiEntity chumuzhonglei, HttpServletRequest request){
    	chumuzhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chumuzhonglei);
        chumuzhongleiService.insert(chumuzhonglei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChumuzhongleiEntity chumuzhonglei, HttpServletRequest request){
    	chumuzhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chumuzhonglei);
        chumuzhongleiService.insert(chumuzhonglei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChumuzhongleiEntity chumuzhonglei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chumuzhonglei);
        chumuzhongleiService.updateById(chumuzhonglei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chumuzhongleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
