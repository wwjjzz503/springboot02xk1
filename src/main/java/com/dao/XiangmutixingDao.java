package com.dao;

import com.entity.XiangmutixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmutixingVO;
import com.entity.view.XiangmutixingView;


/**
 * 项目提醒
 * 
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface XiangmutixingDao extends BaseMapper<XiangmutixingEntity> {
	
	List<XiangmutixingVO> selectListVO(@Param("ew") Wrapper<XiangmutixingEntity> wrapper);
	
	XiangmutixingVO selectVO(@Param("ew") Wrapper<XiangmutixingEntity> wrapper);
	
	List<XiangmutixingView> selectListView(@Param("ew") Wrapper<XiangmutixingEntity> wrapper);

	List<XiangmutixingView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmutixingEntity> wrapper);
	
	XiangmutixingView selectView(@Param("ew") Wrapper<XiangmutixingEntity> wrapper);
	

}
