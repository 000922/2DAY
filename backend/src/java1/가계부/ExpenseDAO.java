package java1.가계부;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ExpenseDAO {
	
	// 1.필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static ExpenseDAO dao = new ExpenseDAO(); // 싱글톤
	
	// 2. 생성자
	public  ExpenseDAO() {
		try {
		con =DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/account_book" , "root" , "1234");
		
		}
		catch (Exception e) {System.out.println("경고) db연동 실패 : " + e); }
	} // public end
	
	// 3. 메소드
	public static ExpenseDAO getInstance() { return dao; }
	// ------
	// 1. 내용추가 SQL 메소드
	 boolean create(ExpenseDTO dto) {
		String sql = "insert into expense values( null , ? , ? , ? );";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getEdate() );
			ps.setInt( 2 , dto.getE_money() );
			ps.setString( 3 , dto.getE_comment() );
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println("DB오류: "+e);}
		return false;
		}
	
	// 2. 내용출력 SQL 메소드
	 ArrayList< ExpenseDTO > read( ){
		ArrayList< ExpenseDTO >list = new ArrayList<>();
		String sql = "select * from expense";
		 
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ) { // rs.next() : 다음레코드
				// 레코드 --> 객체화[포장]
				ExpenseDTO dto = new ExpenseDTO( rs.getInt(1) , rs.getString(2),
						rs.getInt(3), rs.getString(4) );
						
				// 객체 -> 리스트 담기
				list.add( dto );
			} // while end
			return list; // 반환 
		}catch (Exception e) { }
		return list;
		
	 }
		
		
		
		// 4. 내용삭제 SQL 메소드
		boolean delete( int e_no ) {
			String sql ="delete from expense where e_no = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt( 1 , e_no );
				ps.executeUpdate(); return true;
			}catch (Exception e) { }
			return false;
		}
		
		// 3. 
		boolean update( ExpenseDTO dto ) {
			String sql= "update expense set "
					+ "e_date = ? , "
					+ "e_money = ? , "
					+ "e_comment = ?  "
					+ "where e_no = ? ";
			try {
				ps = con.prepareStatement(sql);
				ps.setString( 1 , dto.getE_comment() );
				ps.setInt( 2 , dto.getE_money() );
				ps.setString( 3 , dto.getEdate() );
				ps.setInt( 4 , dto.getE_no() );
				ps.executeUpdate(); return true;
			}catch (Exception e) {}
			return false;
			
		}
	
	
	
	
	
	
	
	
}
