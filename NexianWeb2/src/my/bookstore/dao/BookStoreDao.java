package my.bookstore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import my.bookstore.domain.Book;

public class BookStoreDao {
	private static BookStoreDao instance;
	public static BookStoreDao getInstance(){
		if(instance == null) instance = new BookStoreDao();
		return instance;
	}

	

	private Map<String, Book> db;
	
	private BookStoreDao(){
		db = new HashMap<String, Book>();
		initialize();
	}
	
	public void regist(Book book){
		db.put(book.getId(), book);
	}
	
	public Book find(String id){
		Book book = db.get(id);
		return book;
	}
	
	public List<Book> findAll(){
		Collection<Book> books = db.values();
		
		List<Book> bookList = new ArrayList<Book>();
		for(Book book : books){
			bookList.add(book);
		}
			
		Collections.sort(bookList, new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				return Integer.parseInt(o1.getId()) - Integer.parseInt(o2.getId());
			}
		});
		
		return bookList;
	}
	
	public List<Book> findByCategory(String categoryId) {
		List<Book> list = new ArrayList<Book>();
		for(Book book : db.values()){
			if(categoryId.equals(book.getCategoryId())){
				list.add(book);
			}
		}
		
		return list;
	}

	
	
	public void update(Book book){
		Book update = db.get(book.getId());
		
		update.setName(book.getName());
		update.setPrice(book.getPrice());
		update.setAuthor(book.getAuthor());
		update.setImage(book.getImage());

		db.put(update.getId(), update);
	}
	
	public void delete(String id){
		db.remove(id);
	}
	
	
	
	
	
	
	private void initialize(){
		Book book = new Book();
		book.setId("8010");
		book.setName("예제로 쉽게 배우는 JavaFX");
		book.setAuthor("Eric Bruno");
		book.setPrice(25000);
		book.setImage("img/javafx.jpg");
		book.setCategoryId("AAPR");
		db.put(book.getId(), book);
		
		book = new Book();
		book.setId("8011");
		book.setName("Flex/AIR Bible");
		book.setAuthor("윤훈남");
		book.setPrice(37000);
		book.setImage("img/flex.jpg");
		book.setCategoryId("AAPR");
		db.put(book.getId(), book);
		
		
		book = new Book();
		book.setId("8014");
		book.setName("Self Training 오라클 관리 (9i, 10g, 11g) ");
		book.setAuthor("문성기");
		book.setPrice(26000);
		book.setImage("img/oracle.jpg");
		book.setCategoryId("AADB");
		db.put(book.getId(), book);
		
		book = new Book();
		book.setId("8015");
		book.setName("오라클 성능 고도화 원리와 해법I");
		book.setAuthor("조시형");
		book.setPrice(39000);
		book.setCategoryId("AADB");
		book.setImage("img/oracle2.jpg");
		db.put(book.getId(), book);
		
		book = new Book();
		book.setId("8016");
		book.setName("뇌를 자극하는 오라클 프로그래밍");
		book.setAuthor("홍형경");
		book.setPrice(27000);
		book.setCategoryId("AADB");
		book.setImage("img/oracle3.jpg");
		db.put(book.getId(), book);
		
		
		book = new Book();
		book.setId("8312");
		book.setName("DW2.0 클라우드컴퓨팅의 시작, 다음 세대를 위한 데이터웨어하우스 설계");
		book.setAuthor("빌 인먼");
		book.setPrice(29000);
		book.setImage("img/dw2.jpg");
		book.setCategoryId("AANT");
		db.put(book.getId(), book);
	}

}
