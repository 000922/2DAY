package java1.ch7_상속;

public class EX2_Student extends EX2_People {
	int studentNo;
	public EX2_Student( String name, String ssn, int studentNo ) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
