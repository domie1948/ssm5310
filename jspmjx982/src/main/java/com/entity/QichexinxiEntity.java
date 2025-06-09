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
 * 汽车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-15 20:17:46
 */
@TableName("qichexinxi")
public class QichexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QichexinxiEntity() {
		
	}
	
	public QichexinxiEntity(T t) {
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
	 * 汽车型号
	 */
					
	private String qichexinghao;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 车型
	 */
					
	private String chexing;
	
	/**
	 * 排量
	 */
					
	private String pailiang;
	
	/**
	 * 市场指导价
	 */
					
	private String shichangzhidaojia;
	
	/**
	 * 汽车详情
	 */
					
	private String qichexiangqing;
	
	/**
	 * 门店地址
	 */
					
	private String mendiandizhi;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	
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
	 * 设置：汽车型号
	 */
	public void setQichexinghao(String qichexinghao) {
		this.qichexinghao = qichexinghao;
	}
	/**
	 * 获取：汽车型号
	 */
	public String getQichexinghao() {
		return qichexinghao;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：车型
	 */
	public void setChexing(String chexing) {
		this.chexing = chexing;
	}
	/**
	 * 获取：车型
	 */
	public String getChexing() {
		return chexing;
	}
	/**
	 * 设置：排量
	 */
	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}
	/**
	 * 获取：排量
	 */
	public String getPailiang() {
		return pailiang;
	}
	/**
	 * 设置：市场指导价
	 */
	public void setShichangzhidaojia(String shichangzhidaojia) {
		this.shichangzhidaojia = shichangzhidaojia;
	}
	/**
	 * 获取：市场指导价
	 */
	public String getShichangzhidaojia() {
		return shichangzhidaojia;
	}
	/**
	 * 设置：汽车详情
	 */
	public void setQichexiangqing(String qichexiangqing) {
		this.qichexiangqing = qichexiangqing;
	}
	/**
	 * 获取：汽车详情
	 */
	public String getQichexiangqing() {
		return qichexiangqing;
	}
	/**
	 * 设置：门店地址
	 */
	public void setMendiandizhi(String mendiandizhi) {
		this.mendiandizhi = mendiandizhi;
	}
	/**
	 * 获取：门店地址
	 */
	public String getMendiandizhi() {
		return mendiandizhi;
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

}
