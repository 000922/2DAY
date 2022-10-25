package jspweb.model.dao;

import java.util.ArrayList;

import jspweb.model.dto.pcategoryDto;
import jspweb.model.dto.productDto;

public class productDao extends Dao {

	// 1. 카테고리 등록 [ C ]
		public boolean setPcategory( String pcname ) {
			String sql = "insert into pcategory(pcname) values(?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, pcname);
				ps.executeUpdate();	return true;
			}catch (Exception e) { }
			return false;
		}
		// 2. 카테고리 출력 [ R ]
		public ArrayList< pcategoryDto > getPcategory(){
			ArrayList<pcategoryDto> list = new ArrayList<>();
			String sql = "select * from pcategory";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while( rs.next() ) {
					pcategoryDto dto = new pcategoryDto( rs.getInt(1) , rs.getString(2) );
					list.add(dto);
				}
			}catch (Exception e) {}
			return list;
		}
		// 3. 제품 등록  [ C ]
		public boolean setProduct (pcategoryDto dto ) {
			return false;
		}
		// 4. 제품 출력  [ R ]
		public ArrayList< productDto > getProductlist(){
			return null;
		}
	
}
