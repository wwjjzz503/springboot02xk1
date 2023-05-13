package com.dao;

import com.entity.LiuyanbanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuyanbanVO;
import com.entity.view.LiuyanbanView;


/**
 * 留言板
 * 
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface LiuyanbanDao extends BaseMapper<LiuyanbanEntity> {
	
	List<LiuyanbanVO> selectListVO(@Param("ew") Wrapper<LiuyanbanEntity> wrapper);
	
	LiuyanbanVO selectVO(@Param("ew") Wrapper<LiuyanbanEntity> wrapper);
	
	List<LiuyanbanView> selectListView(@Param("ew") Wrapper<LiuyanbanEntity> wrapper);

	List<LiuyanbanView> selectListView(Pagination page,@Param("ew") Wrapper<LiuyanbanEntity> wrapper);
	
	LiuyanbanView selectView(@Param("ew") Wrapper<LiuyanbanEntity> wrapper);
	

}