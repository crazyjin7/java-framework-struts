package my.bookstore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.bookstore.domain.Book;
import my.bookstore.domain.Category;
import my.bookstore.service.BookStoreService;
import my.bookstore.service.CategoryService;

public class SearchBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchBooksServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		process(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String topCategoryId = request.getParameter("topCategoryId");
		String subCategoryId = request.getParameter("subCategoryId");
		
		CategoryService categoryService = new CategoryService();
		BookStoreService bookStoreService = new BookStoreService();
		
		List<Category> topCategories = null;
		List<Category> subCategories = null;
		List<Book> books = null;
		
		if("-1".equals(topCategoryId) == false && "-1".equals(subCategoryId) == false){
			books = bookStoreService.findByCategory(subCategoryId);
			System.out.println(books);
			request.setAttribute("books", books);
			request.setAttribute("topCategoryId", topCategoryId);
			request.setAttribute("subCategoryId", subCategoryId);
			
			subCategories =  categoryService.findSubCategories(topCategoryId);
			System.out.println(subCategories);
			request.setAttribute("subCategories", subCategories);
			
		} else if("-1".equals(topCategoryId) == false){
			subCategories =  categoryService.findSubCategories(topCategoryId);
			System.out.println(subCategories);
			request.setAttribute("subCategories", subCategories);
			request.setAttribute("topCategoryId", topCategoryId);
			
		}
		
		topCategories = categoryService.findTopCategories();
		request.setAttribute("topCategories", topCategories);
			
		
		request.getRequestDispatcher("search_page_form.jsp").forward(request, response);
		
	}

	
	
}
