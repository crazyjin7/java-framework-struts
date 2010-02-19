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
		Category category = new Category("AA", "컴퓨터/IT", "0");
		db.put(category.getId(), category);
		
		category = new Category("AAPR", "프로그래밍", "AA");
		db.put(category.getId(), category);
		category = new Category("AAGR", "컴퓨터그래픽스", "AA");
		db.put(category.getId(), category);
		category = new Category("AADB", "데이터베이스", "AA");
		db.put(category.getId(), category);
		category = new Category("AANT", "네트워킹", "AA");
		db.put(category.getId(), category);
		
		category = new Category("AB", "건축", "0");
		db.put(category.getId(), category);
		category = new Category("ABSS", "조경", "AB");
		db.put(category.getId(), category);
		category = new Category("ABDS", "건축디자인", "AB");
		db.put(category.getId(), category);
		category = new Category("ABIN", "실내디자인", "AB");
		db.put(category.getId(), category);
		
		category = new Category("BA", "문학", "0");
		db.put(category.getId(), category);
		category = new Category("BARM", "로맨스", "BA");
		db.put(category.getId(), category);
		category = new Category("BATH", "스릴러", "BA");
		db.put(category.getId(), category);
		category = new Category("BASC", "공상과학", "BA");
		db.put(category.getId(), category);
		category = new Category("BASH", "단편소설", "BA");
		db.put(category.getId(), category);		
		
		category = new Category("BB", "언어/언어학", "0");
		db.put(category.getId(), category);
		category = new Category("BBWR", "글쓰기/작문", "BB");
		db.put(category.getId(), category);
		category = new Category("BBTR", "번역/해석", "BB");
		db.put(category.getId(), category);
		category = new Category("BBCM", "커뮤니케이션", "BB");
		db.put(category.getId(), category);
		
		category = new Category("BC", "비지니스/경제", "0");
		db.put(category.getId(), category);
		category = new Category("BCCM", "일반", "BC");
		db.put(category.getId(), category);
		category = new Category("BCAC", "회계", "BC");
		db.put(category.getId(), category);
		category = new Category("BCEC", "경제학", "BC");
		db.put(category.getId(), category);
	}

	
}
