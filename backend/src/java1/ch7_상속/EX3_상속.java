package java1.ch7_상속;

public class EX3_상속 {
	
	public static void main(String[] args) {
		
		int r = 10;
		
		// 부모클래스가 객체 직접 선언
		EX3_Calculator calculator = new EX3_Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		// 자식클래스가 객체 선언
		EX3_Computer computer = new EX3_Computer();
		System.out.println("원면적 : " + computer.areaCircle(r) );
		
	}

}
