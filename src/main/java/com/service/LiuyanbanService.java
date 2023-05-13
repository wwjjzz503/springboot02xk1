package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuyanbanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuyanbanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuyanbanView;


/**
 * 留言板
 *
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface LiuyanbanService extends IService<LiuyanbanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuyanbanVO> selectListVO(Wrapper<LiuyanbanEntity> wrapper);
   	
   	LiuyanbanVO selectVO(@Param("ew") Wrapper<LiuyanbanEntity> wrapper);
   	
   	List<LiuyanbanView> selectListView(Wrapper<LiuyanbanEntity> wrapper);
   	
   	LiuyanbanView selectView(@Param("ew") Wrapper<LiuyanbanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuyanbanEntity> wrapper);
   	

}

