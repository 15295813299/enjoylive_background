package com.qf.service.impl;

import com.qf.dto.CategoryDto;
import com.qf.mapper.CategoryMapper;
import com.qf.service.CategoryService;
import com.qf.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper mapper;

    public List<CategoryDto> getCategory(CategoryVo vo) {
        return mapper.getCategory(vo);
    }

    public List<CategoryDto> getCategoryBy(CategoryVo vo) {
        return mapper.getCategoryBy(vo);
    }

    public Boolean updateCategoryFlag(CategoryVo vo) {
        int i = mapper.updateCategoryFlag(vo);
        if (i>0){
            return true;
        }
        return false;
    }
}
