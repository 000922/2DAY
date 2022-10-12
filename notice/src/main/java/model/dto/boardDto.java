package model.dto;

import java.util.Objects;

public class boardDto {
	// 
	private int bno;
	private String bid ;
	private String btitle ;
	private String bcontents ;
	private String bwriter ;
	private String bpassword ;
	
	//
	public boardDto() {}
	
	public boardDto(int bno, String bid, String btitle, String bcontents, String bwriter, String bpassword) {
		super();
		this.bno = bno;
		this.bid = bid;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bpassword = bpassword;
	}
	//

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontents() {
		return bcontents;
	}

	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}
	//

	@Override
	public String toString() {
		return "boardDto [bno=" + bno + ", bid=" + bid + ", btitle=" + btitle + ", bcontents=" + bcontents
				+ ", bwriter=" + bwriter + ", bpassword=" + bpassword + "]";
	}
	
	

	

	
	
	
	
	
	
	
	
	
	

}
