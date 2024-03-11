package com.management.category.model.dao;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public interface CategoryDAO {

    // * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.
    List<CategoryDTO> selectCategoryList(Map<String, String> parameter);

    int insertCategory(CategoryDTO category);
}
