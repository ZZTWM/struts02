package com.how2java.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.how2java.bean.Category;
import com.how2java.bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction{
	private String name;
	
	private Product product;
	
	private List<Category> categories = new ArrayList();
	
	public ProductAction(){
		System.out.println("product action instance: " + this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String show(){
		product = new Product();
		product.setName("iphone7");
		return "show";
	}
	
	public String add(){
		System.out.println("product.name:" + product.getName());
		System.out.println("product.age:" + product.getAge());
		
		Map m = ActionContext.getContext().getSession();
		m.put("name", product.getName());
		
		return "show";
	}
	
	public String listProduct(){
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("一加手机");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("魅族手机");
		
		categories.add(category1);
		categories.add(category2);
		
		List<Product> products1 = new ArrayList();
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("iphoneSE");
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("iphone6");
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setName("iphone7");
		
		products1.add(p1);
		products1.add(p2);
		products1.add(p3);
		
		
        List<Product> products2=new ArrayList();
        Product p4 = new Product();
        p4.setId(4);
        p4.setName("魅族4");
        Product p5 = new Product();
        p5.setId(5);
        p5.setName("魅族16S");
        Product p6 = new Product();
        p6.setId(6);
        p6.setName("魅族5");
         
        products2.add(p4);
        products2.add(p5);
        products2.add(p6);
		
        category1.setProducts(products1);
        category2.setProducts(products2);
        
		return "listProduct";
	}
	
	public String addPage(){
		name = "default name";
		return "addPage";
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
