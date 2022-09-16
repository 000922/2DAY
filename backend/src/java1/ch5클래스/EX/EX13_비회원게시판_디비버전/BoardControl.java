package java1.ch5클래스.EX.EX13_비회원게시판_디비버전;

public class BoardControl {

	BoradDao boardDao = new BoradDao(); 
	
	// 1. 
	boolean regist( String b_title , String b_content ,
			String b_writer , String b_password ) {
		
		// 1. 4개의 매개변수 받는다.
		// 2. 변수 많을때 이동하면 매개변수 코드가 많으니까 객체화 하자
		BoardDto boardDto = new BoardDto( 0 , b_title, b_content, b_writer, b_password, 0); 
		// 3. 유호성 검사 [ 추후에 ]
		// 4. DB 처리 저장
		boolean result = boardDao.regist(boardDto);	// dao.regist 메소드 호출후 결과값을 result 에 저장 
		// 5. DB 결과 반환 
		return false;
	}
	// 2.
	BoardDto[] getBoardlist() {
		BoardDto[] boardlist = null;
		boardlist = boardDao.getBoardlist();
		return boardlist;
	}
	// 3. 
	BoardDto getBoard( int b_no ) {
		BoardDto board = null;
		board = boardDao.getBoard(b_no);
		return board;
	}
	// 4.
	boolean update( int b_no , String b_password , 
			String new_title , String new_content) {
		// 로직 or DAO 호출 작성 예정 
		return false;
	}
	// 5.
	boolean delete( int b_no , String b_password ) {
		// 로직 or DAO 호출 작성 예정 
		return false;
	}
}
