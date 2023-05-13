package com.dao;

import com.entity.XiangmufenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmufenpeiVO;
import com.entity.view.XiangmufenpeiView;


/**
 * 项目分配
 * 
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
public interface XiangmufenpeiDao extends BaseMapper<XiangmufenpeiEntity> {
	
	List<XiangmufenpeiVO> selectListVO(@Param("ew") Wrapper<XiangmufenpeiEntity> wrapper);
	
	XiangmufenpeiVO selectVO(@Param("ew") Wrapper<XiangmufenpeiEntity> wrapper);
	
	List<XiangmufenpeiView> selectListView(@Param("ew") Wrapper<XiangmufenpeiEntity> wrapper);

	List<XiangmufenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmufenpeiEntity> wrapper);
	
	XiangmufenpeiView selectView(@Param("ew") Wrapper<XiangmufenpeiEntity> wrapper);
	

}
