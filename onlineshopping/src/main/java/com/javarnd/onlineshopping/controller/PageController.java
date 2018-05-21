package com.javarnd.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javarnd.shoppingbackend.dao.CategoryDAO;
import com.javarnd.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDao;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tittle", "Home");
		mv.addObject("categories", categoryDao.getCategoryList());
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tittle", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tittle", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("tittle", "All Products");
		mv.addObject("categories", categoryDao.getCategoryList());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showProductsByCategoryId(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = null;
		category =categoryDao.getCategoryById(id);
		mv.addObject("tittle", category.getName());
		mv.addObject("category", category);
		mv.addObject("categories", categoryDao.getCategoryList());
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
	
	
	//Only for learning purpose
	
/*	@RequestMapping(value ="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		if(greeting==null) {
			greeting = "Hello World";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
	
/*	@RequestMapping(value ="/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting") String greeting) {
		if(greeting==null) {
			greeting = "Hello World";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
}
