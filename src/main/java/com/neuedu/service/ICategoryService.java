package com.neuedu.service;

import com.neuedu.exception.MyException;
import com.neuedu.pojo.Category;

import java.util.List;

public interface ICategoryService {

    int addCategory(Category category) throws MyException;

    int deleteCategory(int categoryId)throws MyException;

    int updateCategory(Category category)throws MyException;

    public List<Category> findAll()throws MyException;
    public Category findOne(Integer id) throws MyException;
}
