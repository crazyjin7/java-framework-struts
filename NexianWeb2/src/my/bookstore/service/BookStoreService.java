package my.bookstore.service;

import java.util.List;

import my.bookstore.dao.BookStoreDao;
import my.bookstore.domain.Book;

public class BookStoreService {
	
	private BookStoreDao dao;;
	public BookStoreService(){
		dao = BookStoreDao.getInstance();
	}

	public void regist(Book book){
		dao.regist(book);
	}
	
	public Book find(String id){
		Book book = dao.find(id);
		return book;
	}
	
	public List<Book> findAll(){
		return dao.findAll();
	}
	
	public List<Book> findByCategory(String categoryId){
		return dao.findByCategory(categoryId);
	}
	
	
	
	public void update(Book book){
		dao.update(book);
	}
	
	public void delete(String id){
		dao.delete(id);
	}
	
	
}




