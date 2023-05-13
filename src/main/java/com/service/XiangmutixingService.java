package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmutixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmutixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmutixingView;


/**
 * 项目提醒
 *
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface XiangmutixingService extends IService<XiangmutixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmutixingVO> selectListVO(Wrapper<XiangmutixingEntity> wrapper);
   	
   	XiangmutixingVO selectVO(@Param("ew") Wrapper<XiangmutixingEntity> wrapper);
   	
   	List<XiangmutixingView> selectListView(Wrapper<XiangmutixingEntity> wrapper);
   	
   	XiangmutixingView selectView(@Param("ew") Wrapper<XiangmutixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmutixingEntity> wrapper);
   	

}

