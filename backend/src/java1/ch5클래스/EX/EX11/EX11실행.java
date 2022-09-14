package java1.ch5클래스.EX.EX11;

public class EX11실행 {	// 클래스
	
	public static void main(String[] args) {	// 코드를 읽어주는[스레드] 포함된 함수
		
		// run 메소드 호출 = 동일한 클래스에 존재
		// 1. 메소드 선언시 main 함수가 해당 메소드 먼저 읽기 static 사용
		run();
		// 2. 객체 만들자
		EX11실행 ex11실행 = new EX11실행();
		ex11실행.run2();
		
	} // main end
	
	// 1. 함수 선언 [ 반환 x 매개변수 x ]
	static void run() {	
		while(true) {
			System.out.println("1.회원가입 2.로그인 : ");
		}
	}
	void run2() {
		
		run3();
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 : ");
			}
		}
	void run3() {
		
	}

} // class end

/*
  	static : 정적
  			[ 메소드영역 ]
  			1. 프로그램 시작시 메모리 할당
  			2. 프로그램 종료시 메모리 초기화
  			* 모든 클래스에서 사용되는 [ 공통 메모리]
  			
  	프로젝트 패키지 관리 방법 -> 디자인 패턴
  	
  		1.MVC
  				M : 모델 	[JAVA]
  				V : 뷰 		[HTML,CSS,JS]
  				C : 컨트롤러	[JAVA]
  				
  	VIEW --> m --> contorller
  
  
  
 
 */