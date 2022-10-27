package jspweb.controller.admin;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jspweb.model.dao.productDao;
import jspweb.model.dto.productDto;

/**
 * Servlet implementation class regist
 */
@WebServlet("/admin/regist")
public class regist extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // 2. 제품 출력 메소드 [ get ]	list.jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// * 타입 : 1 [ 모든 제품 출력 ]  2 [ 개별 제품 출력 ] 

				// 공통 변수
				String type = request.getParameter("type");
				response.setCharacterEncoding("UTF-8");
				if( type.equals("1") ) {
					//////////////////////////////////////////// 모든 제품 출력 //////////////////////////
					ArrayList<productDto> list  = new productDao().getProductlist();// DAO 처리 
					JSONArray array = new JSONArray(); 	// LIST -> JSON
					for( int i = 0 ; i<list.size() ; i++ ) {
						JSONObject object  = new JSONObject();
						object.put("pno", list.get(i).getPno() );				
						object.put("pname", list.get(i).getPname() );
						object.put("pcomment", list.get(i).getPcomment() );		
						object.put("pprice", list.get(i).getPprice() );
						object.put("pdiscount", list.get(i).getPdiscount() );	
						object.put("pactive", list.get(i).getPactive() );
						object.put("pimg", list.get(i).getPimg() );				
						object.put("pdate", list.get(i).getPdate() );
						object.put("pcno", list.get(i).getPcno() );			
						array.add(object);
					}
					response.getWriter().print(array);
					///////////////////////////////////////////////////////////////////////////////////

				}else if( type.equals("2") ) {
					////////////////////////////////////////////  개별 제품 출력 //////////////////////////
					// 1. 호출할 제품번호 요청 
					int pno = Integer.parseInt( request.getParameter("pno") ) ;
					// 2. db처리 
					productDto dto = new productDao().getpProduct( pno );
					// 3. dto -> json 형변환 [ 로직 ] 
						JSONObject object  = new JSONObject();
						object.put("pno", dto.getPno() );				
						object.put("pname", dto.getPname() );
						object.put("pcomment", dto.getPcomment() );		
						object.put("pprice", dto.getPprice() );
						object.put("pdiscount", dto.getPdiscount() );	
						object.put("pactive",dto.getPactive() );
						object.put("pimg", dto.getPimg() );				
						object.put("pdate", dto.getPdate() );
						object.put("pcno", dto.getPcno() );	
					// 4. 응답 
					response.getWriter().print(object);
					///////////////////////////////////////////////////////////////////////////////////
				}
	}
	// 3. 제품 수정 메소드 [ put ]
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpServletRequest request = null;
		MultipartRequest multi = new MultipartRequest(
				request, 
				request.getSession().getServletContext().getRealPath("/admin/pimg") ,
				1024*1024*10,
				"UTF-8",
				new DefaultFileRenamePolicy() );
		
		int pcno = Integer.parseInt( multi.getParameter("pcno") );
		byte pactive = Byte.parseByte(multi.getParameter("pactive") ); 
		
		String pname = multi.getParameter("pname");			
		String pcomment = multi.getParameter("pcomment");	
		int pprice = Integer.parseInt( multi.getParameter("pprice") ) ;		
		float pdiscount = Float.parseFloat( multi.getParameter("pdiscount") );
		String pimg = multi.getFilesystemName("pimg"); 
		// 카테고리안드로 트로사르 잘하더라 
		int pcategorybox = Integer.parseInt( multi.getParameter("pcategorybox") );	// 이게 맞나 ? 당연 틀리지 ㅋㅋ
		productDto dto = new productDto( 0 , pname, pcomment, pprice, pdiscount, (byte) 0 , pimg, null, pcno );
		
		
		System.out.println("수정할 dto : "+ dto.toString() );
		
		// 카테고리 포함 수정처리 과제 나는 아무것도 모르겠다 아아아아아 ~~~ 와르륵 무너지는 내 멘탈 아 .. 나는 멘탈이 없지 ; 
		// 오늘의 교훈 뇌에서 멘탈을 꺼내고 살아라 ~ 그게 되겠냐 ~ !! 
		// 22-10-27 교훈 일기 안되면 될때까지 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 이건 바보같은 소리야 안되면 안돼 ! 
		// 한순간도 놓치면 다 끝나는거야 ~ 아아아아 ~~ 
		// 나는 누구 여기는 504 나는 지금 뭐 하고 있는지 잘 생각해봐 근데 생각 할 뇌 조차 믹서기에 갈려 버렸어 ㅋㅋㅋㅋㅋ
		
	}
	
	
	
	
	
	// 4. 제품 삭제 메소드 [ delete ]
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	ServletRequest request = null;
			// 1.  삭제할 제품번호 요청 
			int pno = Integer.parseInt( request.getParameter("pno") );
			// 2. dao 
			boolean result =  new productDao().deleteprodcut( pno );
			// 3. 응답 
			response.getWriter().print(result);
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// 1. 제품 등록 메소그 [ post ]
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 첨부파일이 있을경우 */
		MultipartRequest multi = new MultipartRequest(
				request, 
				request.getSession().getServletContext().getRealPath("/admin/pimg") ,
				1024*1024*10,
				"UTF-8",
				new DefaultFileRenamePolicy() );
		
		String pname = multi.getParameter("pname");			
		String pcomment = multi.getParameter("pcomment");	
		int pprice = Integer.parseInt( multi.getParameter("pprice") ) ;		
		float pdiscount = Float.parseFloat( multi.getParameter("pdiscount") );
		String pimg = multi.getFilesystemName("pimg"); 
		
		int pcno = Integer.parseInt( multi.getParameter("pcno") );
		
		productDto dto = new productDto( 0 , pname, pcomment, pprice, pdiscount, (byte) 0 , pimg, null, pcno );
		
		boolean result = new productDao().setProduct(dto);
		response.getWriter().print(result);
		
	}

}
