package my.ajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.ajax.domain.Member;
import my.ajax.service.MemberService;

public class RegistFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistFormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		
		Member member = new Member(id, name, nick, password, email);
		
		MemberService service = new MemberService();
		
		if (service.checkDuplicateId(id)) {
			request.setAttribute("errorMessage", "아이디가 중복되었습니다.");
			request.getRequestDispatcher("regist_fail.jsp").forward(request, response);
			
		} else if (service.checkDuplicateNick(nick)){
			request.setAttribute("errorMessage", "별명이 중복되었습니다.");
			request.getRequestDispatcher("regist_fail.jsp").forward(request, response);
			
		} else {
			service.regist(member);
	
			request.setAttribute("name", member.getName());
			request.getRequestDispatcher("regist_success.jsp").forward(request, response);
		}
	}

}
