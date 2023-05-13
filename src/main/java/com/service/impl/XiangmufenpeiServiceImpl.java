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


import com.dao.XiangmufenpeiDao;
import com.entity.XiangmufenpeiEntity;
import com.service.XiangmufenpeiService;
import com.entity.vo.XiangmufenpeiVO;
import com.entity.view.XiangmufenpeiView;

@Service("xiangmufenpeiService")
public class XiangmufenpeiServiceImpl extends ServiceImpl<XiangmufenpeiDao, XiangmufenpeiEntity> implements XiangmufenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmufenpeiEntity> page = this.selectPage(
                new Query<XiangmufenpeiEntity>(params).getPage(),
                new EntityWrapper<XiangmufenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmufenpeiEntity> wrapper) {
		  Page<XiangmufenpeiView> page =new Query<XiangmufenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmufenpeiVO> selectListVO(Wrapper<XiangmufenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmufenpeiVO selectVO(Wrapper<XiangmufenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmufenpeiView> selectListView(Wrapper<XiangmufenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmufenpeiView selectView(Wrapper<XiangmufenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
