package jspweb.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.model.dao.MemberDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/member/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. form내 input 태그로 부터 
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 2. 변수2개 --> dto X
		// 3. dao 메소드 호출 [ 싱글톤 ]
		boolean result
			= MemberDao.getInstance().login(mid, mpassword);
		// 4. 결과 제어
		if( result ) { response.sendRedirect("/jspweb/index.jsp"); }
		else { response.sendRedirect("/jspweb/member/login.jsp"); }
	}

}
