package com.management.category.model.dao;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;

public interface CategoryDAO {

    // * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.
    List<CategoryDTO> selectCategoryList();



}
