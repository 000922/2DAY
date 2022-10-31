package jspweb.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import jspweb.model.dao.productDao;
import jspweb.model.dto.StockDto;

/**
 * Servlet implementation class stock
 */
@WebServlet("/admin/stock")
public class stock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stock() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //재고 출력
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청
		int pno = Integer.parseInt(request.getParameter("pno") );		// 제품번호 
		// 2. db처리
		ArrayList<StockDto>list = new productDao().getstock( pno );
		// 3. 형변환
		JSONArray array = new JSONArray();
		for( StockDto dto : list ) {
			JSONObject object = new JSONObject();
			object.put("psno",dto.getPsno() );			object.put("psize",dto.getPsize() );
			object.put("pstno",dto.getPstno() );		object.put("pcolor",dto.getPcolor() );
			object.put("pstock",dto.getPstock() );		array.add(object);
		}
		// 4 .반환
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// 재고 등록
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청
		request.setCharacterEncoding("UTF-8");
		String psize = request.getParameter("psize");
		int pno = Integer.parseInt(request.getParameter("pno") );
		String pcolor = request.getParameter("pcolor");
		int pstock = Integer.parseInt( request.getParameter("pstock") );
		
		
		// 2. db처리
		boolean result = new productDao().setstock( psize , pno , pcolor , pstock );
		// 3. 결과
		response.getWriter().print(result);
		
	}

}
