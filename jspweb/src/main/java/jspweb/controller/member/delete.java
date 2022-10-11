package jspweb.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.model.dao.MemberDao;


@WebServlet("/member/delete")
public class delete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 변수 요청
		String mpassword = request.getParameter("mpassword");
		// 2. 세션 호출
		String mid = 
				(String)request.getSession().getAttribute("mid");
		
		System.out.println( mpassword );
		System.out.println( mid );
		
		
		// 3. DAO
		boolean result =
					MemberDao.getInstance().delete(mid, mpassword);
		// 4. 반환
		response.getWriter().print(result);
	}
	
	private static final long serialVersionUID = 1L;  
	
	 public delete() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
