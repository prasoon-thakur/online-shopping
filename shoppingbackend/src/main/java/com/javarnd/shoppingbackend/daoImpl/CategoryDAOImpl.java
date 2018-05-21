package com.javarnd.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javarnd.shoppingbackend.dao.CategoryDAO;
import com.javarnd.shoppingbackend.dto.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("This is the Description of Mobile.");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Television");
		category.setDescription("This is the Description of Television.");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is the Description of Laptop.");
		
		categories.add(category);
	}

	@Override
	public List<Category> getCategoryList() {
		
		return categories;
	}

	@Override
	public Category getCategoryById(int id) {
		
		//enhanced for loop
		for(Category category:categories) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}
