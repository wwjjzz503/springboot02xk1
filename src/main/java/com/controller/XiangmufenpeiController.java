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

import com.entity.XiangmufenpeiEntity;
import com.entity.view.XiangmufenpeiView;

import com.service.XiangmufenpeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 项目分配
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
@RestController
@RequestMapping("/xiangmufenpei")
public class XiangmufenpeiController {
    @Autowired
    private XiangmufenpeiService xiangmufenpeiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiangmufenpeiEntity xiangmufenpei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			xiangmufenpei.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xiangmujingli")) {
			xiangmufenpei.setJinglizhanghao((String)request.getSession().getAttribute("username"));
            System.out.println(xiangmufenpei.getJinglizhanghao());
		}
        EntityWrapper<XiangmufenpeiEntity> ew = new EntityWrapper<XiangmufenpeiEntity>();
        if(xiangmufenpei.getJinglizhanghao()!=null) {
            ew.eq("Jinglizhanghao", xiangmufenpei.getJinglizhanghao());
        }
        if(xiangmufenpei.getZhanghao()!=null) {
            ew.eq("zhanghao", xiangmufenpei.getZhanghao());
        }



        PageUtils page = xiangmufenpeiService.queryPage(params,ew);

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiangmufenpeiEntity xiangmufenpei, 
		HttpServletRequest request){
        EntityWrapper<XiangmufenpeiEntity> ew = new EntityWrapper<XiangmufenpeiEntity>();

		PageUtils page = xiangmufenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmufenpei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiangmufenpeiEntity xiangmufenpei){
       	EntityWrapper<XiangmufenpeiEntity> ew = new EntityWrapper<XiangmufenpeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangmufenpei, "xiangmufenpei")); 
        return R.ok().put("data", xiangmufenpeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiangmufenpeiEntity xiangmufenpei){
        EntityWrapper< XiangmufenpeiEntity> ew = new EntityWrapper< XiangmufenpeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangmufenpei, "xiangmufenpei")); 
		XiangmufenpeiView xiangmufenpeiView =  xiangmufenpeiService.selectView(ew);
		return R.ok("查询项目分配成功").put("data", xiangmufenpeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiangmufenpeiEntity xiangmufenpei = xiangmufenpeiService.selectById(id);
        return R.ok().put("data", xiangmufenpei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiangmufenpeiEntity xiangmufenpei = xiangmufenpeiService.selectById(id);
        return R.ok().put("data", xiangmufenpei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmufenpeiEntity xiangmufenpei, HttpServletRequest request){
    	xiangmufenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmufenpei);
        xiangmufenpeiService.insert(xiangmufenpei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiangmufenpeiEntity xiangmufenpei, HttpServletRequest request){
    	xiangmufenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmufenpei);
        xiangmufenpeiService.insert(xiangmufenpei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiangmufenpeiEntity xiangmufenpei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangmufenpei);
        xiangmufenpeiService.updateById(xiangmufenpei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiangmufenpeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
