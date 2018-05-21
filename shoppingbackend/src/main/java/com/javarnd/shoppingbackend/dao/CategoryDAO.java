package com.javarnd.shoppingbackend.dao;

import java.util.List;

import com.javarnd.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> getCategoryList();

	Category getCategoryById(int id);
}
