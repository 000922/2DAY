package java1.ch7_상속;

public class EX3_Computer extends EX3_Calculator {

	@Override
	double areaCircle(double r ) {
		System.out.println("계산기 객체의 원 넓이함수 실행");
		return Math.PI * r * r;
	}
	
}
