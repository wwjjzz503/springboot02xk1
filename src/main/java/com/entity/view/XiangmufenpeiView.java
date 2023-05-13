package com.entity.view;

import com.entity.XiangmufenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
@TableName("xiangmufenpei")
public class XiangmufenpeiView  extends XiangmufenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmufenpeiView(){
	}
 
 	public XiangmufenpeiView(XiangmufenpeiEntity xiangmufenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmufenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
