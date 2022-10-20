package jsptset.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import jsptset.model.dao.BoardDao;
import jsptset.model.dto.BoardDto;

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		if( type.equals("load") ) {
			int bno = Integer.parseInt( request.getParameter("bno" ) );
			request.getSession().setAttribute("bno" , bno );
			return;
		}else if( type.equals("get") ) {
			int bno = (Integer)request.getSession().getAttribute("bno");
			BoardDao boardDao = new BoardDao();
			BoardDto d =  boardDao.getboard( bno );
				if( d == null ) {  return; }
			JSONObject object = new JSONObject();
			object.put( "bno" , d.getBno() ); 			
			object.put( "btitle", d.getBtitle() ); 
			object.put( "bcontent", d.getBcontent() ); 	
			object.put( "bwrite", d.getBwrite() ); 
			object.put( "bpassword", d.getBpassword() );
			object.put( "bdate", d.getBdate() ); 
			object.put( "bview", d.getBview() );
			response.getWriter().print( object );
		}
	}
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
