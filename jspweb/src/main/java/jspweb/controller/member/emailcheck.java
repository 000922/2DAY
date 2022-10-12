package jspweb.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.model.dao.MemberDao;

/**
 * Servlet implementation class emailcheck
 */
@WebServlet("/member/emailcheck")
public class emailcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public emailcheck() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String memail = request.getParameter("memail");
		boolean result = MemberDao.getInstance().emailcheck(memail);
		response.getWriter().print(result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
