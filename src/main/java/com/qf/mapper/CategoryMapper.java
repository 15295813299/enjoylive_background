package com.qf.mapper;

import com.qf.dto.CategoryDto;
import com.qf.vo.CategoryVo;

import java.util.List;

/**
 * 板块mapper
 */
public interface CategoryMapper {
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
    int updateCategoryFlag(CategoryVo vo);
}
