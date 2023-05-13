package com.entity.view;

import com.entity.XiangmujinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目进度
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
@TableName("xiangmujindu")
public class XiangmujinduView  extends XiangmujinduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmujinduView(){
	}
 
 	public XiangmujinduView(XiangmujinduEntity xiangmujinduEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmujinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
