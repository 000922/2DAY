package java1.ch5클래스.EX.EX4;

public class EX4실행 {
	
	public static void main(String[] args) {
		
		// 1. 객체 선언 [ 오류 발생 : 생성자에 매개변수 생략 ]
		 Car myCar = new Car();	
		 // 기본생성자가 없기 때문에 
		 // 문제해결 : 클래스 내부에 빈생성자 생성
		 myCar.color = "검정";
		 myCar.cc = 3000;
		 
		// 2. 객체 선언
		Car myCar2 = new Car("검정" , 3000);
	}

}
