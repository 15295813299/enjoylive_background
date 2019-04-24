package com.qf.controller;

import com.qf.dto.CategoryDto;
import com.qf.service.CategoryService;
import com.qf.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
