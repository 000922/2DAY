package jsptset.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsptset.model.dao.BoardDao;
import jsptset.model.dto.BoardDto;

/**
 * Servlet implementation class write
 */
@WebServlet("/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public write() {
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
		request.setCharacterEncoding("UTF-8");
		String btitle =  request.getParameter("btitle");		System.out.println( btitle );
		String bcontent =  request.getParameter("bcontent");	System.out.println( bcontent );
		String bwrite =  request.getParameter("bwrite");		System.out.println( bwrite );
		String bpassword =  request.getParameter("bpassword");	System.out.println( bpassword );
		
		BoardDto boardDto = new BoardDto(
				0, btitle, bcontent, bwrite, bpassword, null , 0 );
		
		BoardDao boardDao = new BoardDao();
		boolean result =  boardDao.bwrite(boardDto);
		
		response.getWriter().print(result);
	}

}
