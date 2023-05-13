package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GonggaobanDao;
import com.entity.GonggaobanEntity;
import com.service.GonggaobanService;
import com.entity.vo.GonggaobanVO;
import com.entity.view.GonggaobanView;

@Service("gonggaobanService")
public class GonggaobanServiceImpl extends ServiceImpl<GonggaobanDao, GonggaobanEntity> implements GonggaobanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggaobanEntity> page = this.selectPage(
                new Query<GonggaobanEntity>(params).getPage(),
                new EntityWrapper<GonggaobanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggaobanEntity> wrapper) {
		  Page<GonggaobanView> page =new Query<GonggaobanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggaobanVO> selectListVO(Wrapper<GonggaobanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggaobanVO selectVO(Wrapper<GonggaobanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggaobanView> selectListView(Wrapper<GonggaobanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggaobanView selectView(Wrapper<GonggaobanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
