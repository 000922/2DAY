package model.dao;

import model.dto.boardDto;

public class boardDao {
	
	private static boardDao bdao = new boardDao();
	public static boardDao getInstance() { return bdao;}

	private Object ps;
	
	// 1.
	public boolean board( boardDto dto ) {
		String sql = "insert into"
				+ "board(bid ,btitle,"
				+"bcontents,"
				+ "bwriter,"
				+ "bpassword," 
				+" values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getBid() );
			ps.setString( 2 , dto.getBtitle() );
			ps.setString( 3 , dto.getBcontents() );
			ps.setString( 4 , dto.getBwriter() );
			ps.setString( 5 , dto.getBpassword() );
		}catch (Exception e) {System.out.println(e);}
		return false;
				
	}
	

}
