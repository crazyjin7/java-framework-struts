package my.bookstore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.bookstore.domain.Category;
import my.bookstore.service.CategoryService;

public class GoSearchPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoSearchPageServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CategoryService service = new CategoryService();
		
		List<Category> list = service.findTopCategories(); 
		
		request.setAttribute("topCategories", list);
		
		request.getRequestDispatcher("search_page_form.jsp").forward(request, response);
		
	}
}
