package com.qf.service.impl;

import com.qf.dto.CategoryDto;
import com.qf.dto.CategoryDto2;
import com.qf.mapper.CategoryMapper;
import com.qf.service.CategoryService;
import com.qf.tools.upImgUtils;
import com.qf.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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

    public List<CategoryDto2> getCategoryBys(CategoryVo vo) {
        return mapper.getCategoryBys(vo);
    }

    public int addCategory(CategoryVo vo) {
        return mapper.addCategory(vo);
    }

    public int upCategory(CategoryVo vo) {
        return mapper.upCategory(vo);
    }

    public Object upImg(MultipartFile dropzFile, HttpServletRequest request) {
        upImgUtils upImgUtils = new upImgUtils();
        return upImgUtils.upImg(dropzFile,request);
    }
}
