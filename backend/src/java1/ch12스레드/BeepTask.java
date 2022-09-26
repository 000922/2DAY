package java1.ch12스레드;

import java.awt.Toolkit;

public class BeepTask implements Runnable  {
					// implements : 구현 [ 인테페이스 ( 추상 -> ) 구현할때 ]
					// Runnable : 스레드 인터페이스 
	// 1.필드
	
	// 2. 생성자
	
	// 3. 메소드 [ 스레드 제공하는 함수 = run ]
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	// Toolkit : java ui 제공
		for( int i = 0 ; i<10 ; i++ ) {
			toolkit.beep(); // 비프음 소리 함수 [ 소리 속도보다 반복문이 더 빠르다. ]
			try {
				Thread.sleep(500); 	// Thread.sleep(밀리초) : 밀리초 만큼 현재 스레드 일시정지
				// 밀리초 : 1000 / 1초
				// Thread : 현재 스레드
			}catch (Exception e) { }
		}
	}	// run end

} // class end
