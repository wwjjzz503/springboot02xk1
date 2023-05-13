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

import com.entity.GonggaobanEntity;
import com.entity.view.GonggaobanView;

import com.service.GonggaobanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 公告板
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-11 19:59:19
 */
@RestController
@RequestMapping("/gonggaoban")
public class GonggaobanController {
    @Autowired
    private GonggaobanService gonggaobanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GonggaobanEntity gonggaoban,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiangmujingli")) {
			gonggaoban.setJinglizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GonggaobanEntity> ew = new EntityWrapper<GonggaobanEntity>();

		PageUtils page = gonggaobanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaoban), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GonggaobanEntity gonggaoban, 
		HttpServletRequest request){
        EntityWrapper<GonggaobanEntity> ew = new EntityWrapper<GonggaobanEntity>();

		PageUtils page = gonggaobanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaoban), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GonggaobanEntity gonggaoban){
       	EntityWrapper<GonggaobanEntity> ew = new EntityWrapper<GonggaobanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gonggaoban, "gonggaoban")); 
        return R.ok().put("data", gonggaobanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GonggaobanEntity gonggaoban){
        EntityWrapper< GonggaobanEntity> ew = new EntityWrapper< GonggaobanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gonggaoban, "gonggaoban")); 
		GonggaobanView gonggaobanView =  gonggaobanService.selectView(ew);
		return R.ok("查询公告板成功").put("data", gonggaobanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GonggaobanEntity gonggaoban = gonggaobanService.selectById(id);
        return R.ok().put("data", gonggaoban);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GonggaobanEntity gonggaoban = gonggaobanService.selectById(id);
        return R.ok().put("data", gonggaoban);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GonggaobanEntity gonggaoban, HttpServletRequest request){
    	gonggaoban.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaoban);
        gonggaobanService.insert(gonggaoban);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GonggaobanEntity gonggaoban, HttpServletRequest request){
    	gonggaoban.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaoban);
        gonggaobanService.insert(gonggaoban);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GonggaobanEntity gonggaoban, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gonggaoban);
        gonggaobanService.updateById(gonggaoban);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gonggaobanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
