package com.qf.service;

import com.qf.dto.CategoryDto;
import com.qf.dto.CategoryDto2;
import com.qf.vo.CategoryVo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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


    /**
     * 获取想要的版块
     * @param vo
     * @return
     */
    public List<CategoryDto2> getCategoryBys(CategoryVo vo);

    /**
     * 添加版块
     * @param vo
     * @return
     */
    public int addCategory(CategoryVo vo);

    /**
     * 修改版块
     * @param vo
     * @return
     */
    public int upCategory(CategoryVo vo);

    public Object upImg(MultipartFile dropzFile, HttpServletRequest request);
}
