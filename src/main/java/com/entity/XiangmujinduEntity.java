package com.entity;

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
 * 项目进度
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
@TableName("xiangmujindu")
public class XiangmujinduEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmujinduEntity() {
		
	}
	
	public XiangmujinduEntity(T t) {
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
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 项目分类
	 */
					
	private String xiangmufenlei;
	
	/**
	 * 项目进度
	 */
					
	private String xiangmujindu;
	
	/**
	 * 投入时间
	 */
					
	private Integer tourushijian;
	
	/**
	 * 成本金额
	 */
					
	private Float chengbenjine;
	
	/**
	 * 剩余天数
	 */
					
	private String shengyutianshu;
	
	/**
	 * 预期目标
	 */
					
	private String yuqimubiao;
	
	/**
	 * 进展情况
	 */
					
	private String jinzhanqingkuang;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 经理账号
	 */
					
	private String jinglizhanghao;
	
	/**
	 * 经理姓名
	 */
					
	private String jinglixingming;
	
	
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
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
	/**
	 * 设置：项目分类
	 */
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
	/**
	 * 设置：项目进度
	 */
	public void setXiangmujindu(String xiangmujindu) {
		this.xiangmujindu = xiangmujindu;
	}
	/**
	 * 获取：项目进度
	 */
	public String getXiangmujindu() {
		return xiangmujindu;
	}
	/**
	 * 设置：投入时间
	 */
	public void setTourushijian(Integer tourushijian) {
		this.tourushijian = tourushijian;
	}
	/**
	 * 获取：投入时间
	 */
	public Integer getTourushijian() {
		return tourushijian;
	}
	/**
	 * 设置：成本金额
	 */
	public void setChengbenjine(Float chengbenjine) {
		this.chengbenjine = chengbenjine;
	}
	/**
	 * 获取：成本金额
	 */
	public Float getChengbenjine() {
		return chengbenjine;
	}
	/**
	 * 设置：剩余天数
	 */
	public void setShengyutianshu(String shengyutianshu) {
		this.shengyutianshu = shengyutianshu;
	}
	/**
	 * 获取：剩余天数
	 */
	public String getShengyutianshu() {
		return shengyutianshu;
	}
	/**
	 * 设置：预期目标
	 */
	public void setYuqimubiao(String yuqimubiao) {
		this.yuqimubiao = yuqimubiao;
	}
	/**
	 * 获取：预期目标
	 */
	public String getYuqimubiao() {
		return yuqimubiao;
	}
	/**
	 * 设置：进展情况
	 */
	public void setJinzhanqingkuang(String jinzhanqingkuang) {
		this.jinzhanqingkuang = jinzhanqingkuang;
	}
	/**
	 * 获取：进展情况
	 */
	public String getJinzhanqingkuang() {
		return jinzhanqingkuang;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：经理账号
	 */
	public void setJinglizhanghao(String jinglizhanghao) {
		this.jinglizhanghao = jinglizhanghao;
	}
	/**
	 * 获取：经理账号
	 */
	public String getJinglizhanghao() {
		return jinglizhanghao;
	}
	/**
	 * 设置：经理姓名
	 */
	public void setJinglixingming(String jinglixingming) {
		this.jinglixingming = jinglixingming;
	}
	/**
	 * 获取：经理姓名
	 */
	public String getJinglixingming() {
		return jinglixingming;
	}

}
