package my.bookstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.bookstore.domain.Category;
import my.bookstore.service.CategoryService;
import my.bookstore.util.JsonConverter;

public class FindFirstLevelCategoryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FindFirstLevelCategoryListServlet() {
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
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		
		CategoryService service = new CategoryService();
		List<Category> list = service.findTopCategories();
		
		String jsonResult = JsonConverter.convertToJson(list);
		
		System.out.println(jsonResult);
		out.println(jsonResult);
	}

}
