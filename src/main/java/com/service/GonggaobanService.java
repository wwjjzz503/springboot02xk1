package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggaobanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggaobanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggaobanView;


/**
 * 公告板
 *
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface GonggaobanService extends IService<GonggaobanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaobanVO> selectListVO(Wrapper<GonggaobanEntity> wrapper);
   	
   	GonggaobanVO selectVO(@Param("ew") Wrapper<GonggaobanEntity> wrapper);
   	
   	List<GonggaobanView> selectListView(Wrapper<GonggaobanEntity> wrapper);
   	
   	GonggaobanView selectView(@Param("ew") Wrapper<GonggaobanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaobanEntity> wrapper);
   	

}

