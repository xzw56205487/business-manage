package com.neuedu.service.impl;

import com.neuedu.dao.CategoryMapper;
import com.neuedu.exception.MyException;
import com.neuedu.pojo.Category;
import com.neuedu.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public int addCategory(Category category) throws MyException {
        int result=categoryMapper.insert(category);
        return result;
    }

    @Override
    public int deleteCategory(int categoryId) throws MyException {
        int result=categoryMapper.deleteByPrimaryKey(categoryId);

        return result;
    }

    @Override
    public int updateCategory(Category category) throws MyException {
        return categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public List<Category> findAll() throws MyException {
        return categoryMapper.selectAll();
    }
    @Override
    public Category findOne(Integer id) throws MyException{


        return categoryMapper.selectByPrimaryKey(id);
    }
}
