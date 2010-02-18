package my.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

import my.ajax.domain.Member;
import my.ajax.service.MemberService;

/**
 * Servlet implementation class SearchByIdJsonServlet
 */
public class SearchByIdJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByIdJsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String searchId = request.getParameter("searchId");
		
		MemberService service = new MemberService();
		List<Member> members = service.searchById(searchId);
		
		String jsonResult = convertToJson(members);
		System.out.println(jsonResult);
		
		
		out.println(jsonResult);
	}
	
	private String convertToJson(Object object) {
		XStream xStream = new XStream(new JsonHierarchicalStreamDriver());
		String jsonResult = xStream.toXML(object);
		
		return jsonResult;
	}

}
