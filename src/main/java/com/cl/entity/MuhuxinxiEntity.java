package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 牧户信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-20 17:42:38
 */
@TableName("muhuxinxi")
public class MuhuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MuhuxinxiEntity() {
		
	}
	
	public MuhuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 教育程度
	 */
					
	private String jiaoyuchengdu;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 土地面积
	 */
					
	private String tudimianji;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 养殖规模
	 */
					
	private String yangzhiguimo;
	
	/**
	 * 农产品名称
	 */
					
	private String nongchanpinmingcheng;
	
	/**
	 * 农产品产量
	 */
					
	private Integer nongchanpinchanliang;
	
	/**
	 * 销售量
	 */
					
	private Integer xiaoshouliang;
	
	/**
	 * 牲畜种类
	 */
					
	private String shengchuzhonglei;
	
	/**
	 * 牲畜数量
	 */
					
	private Integer shengchushuliang;
	
	/**
	 * 饲养方式
	 */
					
	private String siyangfangshi;
	
	/**
	 * 繁殖率
	 */
					
	private Double fanzhilv;
	
	/**
	 * 出生率
	 */
					
	private Double chushenglv;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：教育程度
	 */
	public void setJiaoyuchengdu(String jiaoyuchengdu) {
		this.jiaoyuchengdu = jiaoyuchengdu;
	}
	/**
	 * 获取：教育程度
	 */
	public String getJiaoyuchengdu() {
		return jiaoyuchengdu;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：土地面积
	 */
	public void setTudimianji(String tudimianji) {
		this.tudimianji = tudimianji;
	}
	/**
	 * 获取：土地面积
	 */
	public String getTudimianji() {
		return tudimianji;
	}
	/**
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：养殖规模
	 */
	public void setYangzhiguimo(String yangzhiguimo) {
		this.yangzhiguimo = yangzhiguimo;
	}
	/**
	 * 获取：养殖规模
	 */
	public String getYangzhiguimo() {
		return yangzhiguimo;
	}
	/**
	 * 设置：农产品名称
	 */
	public void setNongchanpinmingcheng(String nongchanpinmingcheng) {
		this.nongchanpinmingcheng = nongchanpinmingcheng;
	}
	/**
	 * 获取：农产品名称
	 */
	public String getNongchanpinmingcheng() {
		return nongchanpinmingcheng;
	}
	/**
	 * 设置：农产品产量
	 */
	public void setNongchanpinchanliang(Integer nongchanpinchanliang) {
		this.nongchanpinchanliang = nongchanpinchanliang;
	}
	/**
	 * 获取：农产品产量
	 */
	public Integer getNongchanpinchanliang() {
		return nongchanpinchanliang;
	}
	/**
	 * 设置：销售量
	 */
	public void setXiaoshouliang(Integer xiaoshouliang) {
		this.xiaoshouliang = xiaoshouliang;
	}
	/**
	 * 获取：销售量
	 */
	public Integer getXiaoshouliang() {
		return xiaoshouliang;
	}
	/**
	 * 设置：牲畜种类
	 */
	public void setShengchuzhonglei(String shengchuzhonglei) {
		this.shengchuzhonglei = shengchuzhonglei;
	}
	/**
	 * 获取：牲畜种类
	 */
	public String getShengchuzhonglei() {
		return shengchuzhonglei;
	}
	/**
	 * 设置：牲畜数量
	 */
	public void setShengchushuliang(Integer shengchushuliang) {
		this.shengchushuliang = shengchushuliang;
	}
	/**
	 * 获取：牲畜数量
	 */
	public Integer getShengchushuliang() {
		return shengchushuliang;
	}
	/**
	 * 设置：饲养方式
	 */
	public void setSiyangfangshi(String siyangfangshi) {
		this.siyangfangshi = siyangfangshi;
	}
	/**
	 * 获取：饲养方式
	 */
	public String getSiyangfangshi() {
		return siyangfangshi;
	}
	/**
	 * 设置：繁殖率
	 */
	public void setFanzhilv(Double fanzhilv) {
		this.fanzhilv = fanzhilv;
	}
	/**
	 * 获取：繁殖率
	 */
	public Double getFanzhilv() {
		return fanzhilv;
	}
	/**
	 * 设置：出生率
	 */
	public void setChushenglv(Double chushenglv) {
		this.chushenglv = chushenglv;
	}
	/**
	 * 获取：出生率
	 */
	public Double getChushenglv() {
		return chushenglv;
	}

}
