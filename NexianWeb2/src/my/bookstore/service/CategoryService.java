package my.bookstore.service;

import java.util.List;

import my.bookstore.dao.CategoryDao;
import my.bookstore.domain.Category;


public class CategoryService {
	private CategoryDao dao;
	
	public CategoryService(){
		 dao = CategoryDao.getInstance();
	}
	
	public List<Category> findSubCategories(String id){
		return dao.findSubCategories(id);
	}
	
	public List<Category> findTopCategories(){
		return dao.findTopCategories();
	}
}
