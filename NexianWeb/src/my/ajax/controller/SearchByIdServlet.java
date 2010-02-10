package my.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;

import my.ajax.domain.Member;
import my.ajax.service.MemberService;

/**
 * Servlet implementation class SearchByIdServlet
 */
public class SearchByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/xml");
		
		PrintWriter out = response.getWriter();
		
		String searchId = request.getParameter("searchId");
		
		MemberService service = new MemberService();
		List<Member> members = service.searchById(searchId);
		
		String xmlResult = convertToXml(members);
		System.out.println(xmlResult);
		
		
		out.println(xmlResult);
		
	}
	
	private String convertToXml(Object obj) {
		XStream xStream = new XStream();
		xStream.alias("member", Member.class);
		String result = xStream.toXML(obj);
		
		return result;
	}

}
