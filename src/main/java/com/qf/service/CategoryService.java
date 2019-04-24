package com.qf.service;

import com.qf.dto.CategoryDto;
import com.qf.vo.CategoryVo;

import java.util.List;

public interface CategoryService {
    /**
     * 获取所有板块及小板块
     * @param vo
     * @return
     */
    List<CategoryDto> getCategory(CategoryVo vo);

    /**
     * 获取所有板块（不是树形结构）
     * @param vo
     * @return
     */
    List<CategoryDto> getCategoryBy(CategoryVo vo);

    /**
     * 更新信息
     * @param vo
     * @return
     */
    Boolean updateCategoryFlag(CategoryVo vo);
}
