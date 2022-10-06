package jspweb.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.model.dao.MemberDao;
import jspweb.model.dto.MemberDto;

// @WebServlet("URL정의") : 해당 클래스 호출하는 정의
@WebServlet("/member/signup")	// 해당 클래스로 매핑 (연결) URL 설정 [ 패키지 경로 상관없다 ]
public class signup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. 한들 인코딩 [ UTF-8 , EUC-KR ]
		request.setCharacterEncoding("UTF-8");
		
		 //  1. JSP(HTML) from입력받은 데이터 요청 !!! 
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		String mpasswordconfirm = request.getParameter("mpasswordconfirm");
		String mname = request.getParameter("mname");
		String mphone = request.getParameter("mphone");
		String memail = request.getParameter("memail");
		
		// 주소4개 요청
		String maddress1 = request.getParameter("maddress1");
		String maddress2 = request.getParameter("maddress2");
		String maddress3 = request.getParameter("maddress3");
		String maddress4 = request.getParameter("maddress4");
		// 주소 4개 --> 하나의 변수 
		String maddress = maddress1+","+maddress2+","+maddress3+","+maddress4;
		// 2. 변수6개 -- > Dto 객체화
		MemberDto dto = new MemberDto( 
				0, mid,
				mpassword, mname,
				mphone, memail, 
				maddress, null , 0);
		
		// 3. 통신 확인 [HTML --> JAVA ]
		System.out.println( dto.toString() );
		
		// 4. DAO 메소드 호출용 객체 선언 [ 1. 객체생성 2. 객체명.메소드명() ]
			// 1. 싱글톤객체가 아닐경우	
		// MemberDao dao = new MemberDao();
		// boolean result = dao.signup(dto);
		
		// 2. 싱글톤객체가 있을경우 [ 클래스명.getInstance().메소드명() ]
		boolean result = MemberDao.getInstance().signup(dto);
		// 5. 결과제어
		if( result ) { response.sendRedirect("/jspweb/member/login.jsp");}
		else { }
		// 5. 결과 제어 
		//if( result ) { System.out.println("회원가입 성공");}
		//else { System.out.println("회원가입 실패"); }
		
		doGet(request, response);
	}
	
	private static final long serialVersionUID = 1L;
       
    
    public signup() { super(); }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	

}
