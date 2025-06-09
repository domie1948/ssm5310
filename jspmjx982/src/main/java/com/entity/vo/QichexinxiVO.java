package com.entity.vo;

import com.entity.QichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 汽车信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-15 20:17:46
 */
public class QichexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
