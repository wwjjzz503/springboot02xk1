package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmufenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmufenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmufenpeiView;


/**
 * 项目分配
 *
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface XiangmufenpeiService extends IService<XiangmufenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmufenpeiVO> selectListVO(Wrapper<XiangmufenpeiEntity> wrapper);
   	
   	XiangmufenpeiVO selectVO(@Param("ew") Wrapper<XiangmufenpeiEntity> wrapper);
   	
   	List<XiangmufenpeiView> selectListView(Wrapper<XiangmufenpeiEntity> wrapper);
   	
   	XiangmufenpeiView selectView(@Param("ew") Wrapper<XiangmufenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmufenpeiEntity> wrapper);
   	

}

