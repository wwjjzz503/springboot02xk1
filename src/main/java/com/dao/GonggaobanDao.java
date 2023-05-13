package com.dao;

import com.entity.GonggaobanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaobanVO;
import com.entity.view.GonggaobanView;


/**
 * 公告板
 * 
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface GonggaobanDao extends BaseMapper<GonggaobanEntity> {
	
	List<GonggaobanVO> selectListVO(@Param("ew") Wrapper<GonggaobanEntity> wrapper);
	
	GonggaobanVO selectVO(@Param("ew") Wrapper<GonggaobanEntity> wrapper);
	
	List<GonggaobanView> selectListView(@Param("ew") Wrapper<GonggaobanEntity> wrapper);

	List<GonggaobanView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaobanEntity> wrapper);
	
	GonggaobanView selectView(@Param("ew") Wrapper<GonggaobanEntity> wrapper);
	

}
