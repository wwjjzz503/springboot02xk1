package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.baomidou.mybatisplus.plugins.Page;
import com.entity.GonggaobanEntity;
import com.entity.Project;
import com.entity.XiangmujinduEntity;
import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiangmuxinxiEntity;
import com.entity.view.XiangmuxinxiView;

import com.service.XiangmuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 项目信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
@RestController
@RequestMapping("/xiangmuxinxi")
public class XiangmuxinxiController {
    @Autowired
    private XiangmuxinxiService xiangmuxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiangmuxinxiEntity xiangmuxinxi,
		HttpServletRequest request){

        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("xiangmujingli")) {
            xiangmuxinxi.setJinglizhanghao((String)request.getSession().getAttribute("username"));
        }
        EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();
        if(xiangmuxinxi.getJinglizhanghao()!=null) {
            ew.eq("Jinglizhanghao",xiangmuxinxi.getJinglizhanghao());
        }
        PageUtils page = xiangmuxinxiService.queryPage(params, ew);

        return R.ok().put("data", page);


    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiangmuxinxiEntity xiangmuxinxi, 
		HttpServletRequest request){
        EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();

		PageUtils page = xiangmuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiangmuxinxiEntity xiangmuxinxi){
       	EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangmuxinxi, "xiangmuxinxi")); 
        return R.ok().put("data", xiangmuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiangmuxinxiEntity xiangmuxinxi){
        EntityWrapper< XiangmuxinxiEntity> ew = new EntityWrapper< XiangmuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangmuxinxi, "xiangmuxinxi")); 
		XiangmuxinxiView xiangmuxinxiView =  xiangmuxinxiService.selectView(ew);
		return R.ok("查询项目信息成功").put("data", xiangmuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiangmuxinxiEntity xiangmuxinxi = xiangmuxinxiService.selectById(id);
        return R.ok().put("data", xiangmuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiangmuxinxiEntity xiangmuxinxi = xiangmuxinxiService.selectById(id);
        return R.ok().put("data", xiangmuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request){
    	xiangmuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmuxinxi);
        xiangmuxinxiService.insert(xiangmuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request){
    	xiangmuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmuxinxi);
        xiangmuxinxiService.insert(xiangmuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangmuxinxi);
        xiangmuxinxiService.updateById(xiangmuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiangmuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    @RequestMapping("chart-progress")
    public R progress(){
        List<Project> projects = new ArrayList<>();
        List<XiangmuxinxiEntity> xiangmuxinxiEntities = xiangmuxinxiService.selectList(null);
        for(XiangmuxinxiEntity xiangmujindu:xiangmuxinxiEntities){
            Project project = new Project();
            project.setName(xiangmujindu.getXiangmumingcheng());
            project.setValue(xiangmujindu.getProgress());
            projects.add(project);
        }
        return R.ok().put("data",projects);
    }
    @RequestMapping("chart-histogram")
    public R histogram(){
        List<Project> projects = new ArrayList<>();
        List<XiangmuxinxiEntity> xiangmuxinxiEntities = xiangmuxinxiService.selectList(null);
        for(XiangmuxinxiEntity xiangmujindu:xiangmuxinxiEntities){
            Project project = new Project();
            project.setName(xiangmujindu.getXiangmumingcheng());
            project.setValue(xiangmujindu.getTourushijian());
            projects.add(project);
        }
        return R.ok().put("data",projects);
    }
    @RequestMapping("chart-interleaved")
    public R interleaved(){
        List<Project> projects = new ArrayList<>();
        List<XiangmuxinxiEntity> xiangmuxinxiEntities = xiangmuxinxiService.selectList(null);
        for(XiangmuxinxiEntity xiangmujindu:xiangmuxinxiEntities){
            Project project = new Project();
            project.setName(xiangmujindu.getXiangmumingcheng());
            project.setValue(xiangmujindu.getProgressTime());
            projects.add(project);
        }
        return R.ok().put("data",projects);
    }
    @RequestMapping("chart-pie")
    public R pie(){
        List<Project> projects = new ArrayList<>();
        List<XiangmuxinxiEntity> xiangmuxinxiEntities = xiangmuxinxiService.selectList(null);
        for(XiangmuxinxiEntity xiangmujindu:xiangmuxinxiEntities){
            Project project = new Project();
            project.setName(xiangmujindu.getXiangmumingcheng());
            project.setValue(xiangmujindu.getChengbenjine());
            projects.add(project);
        }
        return R.ok().put("data",projects);
    }
	









}
