package java1.ch12스레드;

public class 스레드A extends Thread {
	
	// 생성자
	public 스레드A() {
		setName("스레드A");
	}
	
	// 메소드
	@Override	// @Override : 재정의
	public void run() { 
		for( int i = 0 ; i<2; i++ ) {
			System.out.println( getName() + "가 출력한 내용" );
		}
		
	}

}
/*
 	오버로딩 : 동일한 이름의 메소드명을 매개변수로 식별
 	오버라이딩 : 부모클래ㅡ의 메소드를 자식클래스가 재정의
  

*/