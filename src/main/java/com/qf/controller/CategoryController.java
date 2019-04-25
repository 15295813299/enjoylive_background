package com.qf.controller;

import com.qf.dto.CategoryDto;
import com.qf.dto.CategoryDto2;
import com.qf.service.CategoryService;
import com.qf.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 板块
 */
@RestController
public class CategoryController {

    @Autowired
    CategoryService service;

    @RequestMapping(value = "getCategoryBy",method = RequestMethod.POST)
    public List<CategoryDto> getCategory(@RequestBody(required = false) CategoryVo vo) {
        return service.getCategory(vo);
    }

    /**
     * 获取所有板块（不是树形结构）
     * @param vo
     * @return
     */
    @RequestMapping(value = "getCategoryByFlag",method = RequestMethod.POST)
    List<CategoryDto> getCategoryBy(@RequestBody(required = false) CategoryVo vo){
        return service.getCategoryBy(vo);
    }

    /**
     * 修改状态
     * @param vo
     * @return
     */
    @RequestMapping(value = "updateCategoryFlag",method = RequestMethod.POST)
    public Boolean updateCategoryFlag(@RequestBody CategoryVo vo) {
        return service.updateCategoryFlag(vo);

    }


    /**
     * 获取类型
     * @param vo
     * @return
     */
    @RequestMapping(value = "getCategoryBys",method = RequestMethod.POST)
    public Object getCategoryBys(@RequestBody(required = false) CategoryVo vo) {
        List<CategoryDto2> categoryBys = service.getCategoryBys(vo);
        return categoryBys;
    }


    /**
     * 添加类型
     * @param vo
     * @return
     */
    @RequestMapping(value = "addCategory",method = RequestMethod.POST)
    public Object addCategory(@RequestBody CategoryVo vo) {
        return  service.addCategory(vo);
    }


    /**
     * 修改
     * @param vo
     * @return
     */
    @RequestMapping(value = "upCategory",method = RequestMethod.POST)
    public Object upCategory(@RequestBody CategoryVo vo) {
        return service.upCategory(vo);
    }




    /**
     * 上传图片到服务器
     * @param dropzFile
     * @param request
     * @return
     */
    @RequestMapping(value = "upImg",method = RequestMethod.POST)
    public Object upImg( MultipartFile dropzFile, HttpServletRequest request) {
        System.out.println(dropzFile);
        return service.upImg(dropzFile,request);
    }










}
