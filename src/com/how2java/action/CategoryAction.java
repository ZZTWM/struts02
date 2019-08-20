package com.how2java.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.how2java.bean.Category;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport{
	private Date date;
	
	private Category category;
	
	private List<Category> categories;
	private List<Integer> selectedCategories;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Integer> getSelectedCategories() {
		return selectedCategories;
	}

	public void setSelectedCategories(List<Integer> selectedCategories) {
		this.selectedCategories = selectedCategories;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String showCategory(){
		category = new Category();
		category.setName("华为手机");
		return "showCategory";
	}
	
	public String addCategory(){
		System.out.println("category.name:" + category.getName());
		return "showCategory";
	}
	
	public String listCategory(){
		categories = new ArrayList();
		selectedCategories = new ArrayList();
		
		Category c1 = new Category();
		Category c2 = new Category();
		Category c3 = new Category();
		
		c1.setId(1);
		c1.setName("华为");
		
		c2.setId(2);
		c2.setName("小米");
		
		c3.setId(3);
		c3.setName("三星");
		
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		
		selectedCategories.add(2);
		selectedCategories.add(3);
		
		return "listCategory";
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
