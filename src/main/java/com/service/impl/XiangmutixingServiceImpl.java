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


import com.dao.XiangmutixingDao;
import com.entity.XiangmutixingEntity;
import com.service.XiangmutixingService;
import com.entity.vo.XiangmutixingVO;
import com.entity.view.XiangmutixingView;

@Service("xiangmutixingService")
public class XiangmutixingServiceImpl extends ServiceImpl<XiangmutixingDao, XiangmutixingEntity> implements XiangmutixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmutixingEntity> page = this.selectPage(
                new Query<XiangmutixingEntity>(params).getPage(),
                new EntityWrapper<XiangmutixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmutixingEntity> wrapper) {
		  Page<XiangmutixingView> page =new Query<XiangmutixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmutixingVO> selectListVO(Wrapper<XiangmutixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmutixingVO selectVO(Wrapper<XiangmutixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmutixingView> selectListView(Wrapper<XiangmutixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmutixingView selectView(Wrapper<XiangmutixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
