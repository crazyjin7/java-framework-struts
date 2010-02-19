package my.bookstore.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import my.bookstore.domain.Category;


public class CategoryDao {

	
	private static CategoryDao instance;
	public static CategoryDao getInstance() {
		if(instance == null) {
			instance = new CategoryDao();
		}
		return instance;
	}
	

	
	private Map<String, Category> db;
	
	private CategoryDao(){
		db = new HashMap<String, Category>();
		initialize();
	}
	


	public List<Category> findTopCategories() {
		List<Category> list = new ArrayList<Category>();
		for(Category category : db.values()){
			if(category.getParentId().equals("0")){
				list.add(category);
			}
		}
		return list;
	}


	public List<Category> findSubCategories(String id) {
		List<Category> list = new ArrayList<Category>();
		for(Category category : db.values()){
			if(category.getParentId().equals(id)){
				list.add(category);
			}
		}
		return list;
	}


	private void initialize() {
		Category category = new Category("AA", "��ǻ��/IT", "0");
		db.put(category.getId(), category);
		
		category = new Category("AAPR", "���α׷���", "AA");
		db.put(category.getId(), category);
		category = new Category("AAGR", "��ǻ�ͱ׷��Ƚ�", "AA");
		db.put(category.getId(), category);
		category = new Category("AADB", "�����ͺ��̽�", "AA");
		db.put(category.getId(), category);
		category = new Category("AANT", "��Ʈ��ŷ", "AA");
		db.put(category.getId(), category);
		
		category = new Category("AB", "����", "0");
		db.put(category.getId(), category);
		category = new Category("ABSS", "����", "AB");
		db.put(category.getId(), category);
		category = new Category("ABDS", "���������", "AB");
		db.put(category.getId(), category);
		category = new Category("ABIN", "�ǳ�������", "AB");
		db.put(category.getId(), category);
		
		category = new Category("BA", "����", "0");
		db.put(category.getId(), category);
		category = new Category("BARM", "�θǽ�", "BA");
		db.put(category.getId(), category);
		category = new Category("BATH", "������", "BA");
		db.put(category.getId(), category);
		category = new Category("BASC", "�������", "BA");
		db.put(category.getId(), category);
		category = new Category("BASH", "����Ҽ�", "BA");
		db.put(category.getId(), category);		
		
		category = new Category("BB", "���/�����", "0");
		db.put(category.getId(), category);
		category = new Category("BBWR", "�۾���/�۹�", "BB");
		db.put(category.getId(), category);
		category = new Category("BBTR", "����/�ؼ�", "BB");
		db.put(category.getId(), category);
		category = new Category("BBCM", "Ŀ�´����̼�", "BB");
		db.put(category.getId(), category);
		
		category = new Category("BC", "�����Ͻ�/����", "0");
		db.put(category.getId(), category);
		category = new Category("BCCM", "�Ϲ�", "BC");
		db.put(category.getId(), category);
		category = new Category("BCAC", "ȸ��", "BC");
		db.put(category.getId(), category);
		category = new Category("BCEC", "������", "BC");
		db.put(category.getId(), category);
	}

	
}
