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


import com.dao.LiuyanbanDao;
import com.entity.LiuyanbanEntity;
import com.service.LiuyanbanService;
import com.entity.vo.LiuyanbanVO;
import com.entity.view.LiuyanbanView;

@Service("liuyanbanService")
public class LiuyanbanServiceImpl extends ServiceImpl<LiuyanbanDao, LiuyanbanEntity> implements LiuyanbanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuyanbanEntity> page = this.selectPage(
                new Query<LiuyanbanEntity>(params).getPage(),
                new EntityWrapper<LiuyanbanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuyanbanEntity> wrapper) {
		  Page<LiuyanbanView> page =new Query<LiuyanbanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuyanbanVO> selectListVO(Wrapper<LiuyanbanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuyanbanVO selectVO(Wrapper<LiuyanbanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuyanbanView> selectListView(Wrapper<LiuyanbanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuyanbanView selectView(Wrapper<LiuyanbanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
