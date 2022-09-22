package java1.가계부;

public class ExpenseDTO {
	
	// 1. 필드 <---> DB 테이블
	private int e_no ;
	private String edate ;
	private int e_money ;
	private String  e_comment ;
	// 2. 생성자
	public ExpenseDTO(int e_no, String edate, int e_money, String e_comment) {
		super();
		this.e_no = e_no;
		this.edate = edate;
		this.e_money = e_money;
		this.e_comment = e_comment;
	}
	// 3. 메소드
	public int getE_no() {
		return e_no;
	}
	public void setE_no(int e_no) {
		this.e_no = e_no;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public int getE_money() {
		return e_money;
	}
	public void setE_money(int e_money) {
		this.e_money = e_money;
	}
	public String getE_comment() {
		return e_comment;
	}
	public void setE_comment(String e_comment) {
		this.e_comment = e_comment;
	}
	
	
	
	
	

}	// class end
