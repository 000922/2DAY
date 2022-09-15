package chelsea1.thinking;

import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.Style;

public class penalty {	// class s

	public static void main(String[] args) {	// main s
		
		Scanner scanner = new Scanner(System.in);	// 전체 사용 할 메모리 선서
		int 공격수; int 골키퍼;  int 판수=0; int 승리수 = 0;	// 숫자라서 int 사용
		
		while( true ) {
			System.out.println("왼쪽(0) 가운데(1) 오른쪽(2) 종료(3) : ");			공격수 = scanner.nextInt();
			
			// 랜덤 객체 ? ? 랄까 난수 ? 
			Random random = new Random();
			골키퍼 = random.nextInt( 3 );
			
			// 승리 판단
			// 공격수가 득점 할 경우 	// && || 논리
			if( (공격수==0 && 골키퍼==1) || (공격수==0 && 골키퍼==2) || (공격수==1 && 골키퍼==0) || (공격수==1 && 골키퍼==2) || 
				(공격수==2 && 골키퍼==0) || (공격수==2 && 골키퍼==1) 	) { System.out.println("공격수)득점  " ); }		
			// 골키퍼가 선방 할 경우
			else if( (공격수==0 && 골키퍼==0) || (공격수==1 && 골키퍼==1) || (공격수==2 && 골키퍼==2) )		
			{ System.out.println("골기퍼)선방  "); }
			
			판수 : 판수++;	// 종료(3) 을 클릭하면 몇판을 했는지 뜬다. 
			// 종료 
			if(공격수==3) {
				System.out.println("경기끝) 판수 :" +판수);
				if( 승리수 >= 1 ) { System.out.println("경기끝) 공격수승리"); } // 크거나 같으면 
				else { System.out.println("경기끝) 골기퍼승리"); }
				break;
			}	// if end

		} // while end 
		
	}	// main end
	
}	// class end



/*
 
  번외 ---
 mysql-connector-java-8.0.30  
 경로를 학원PC + 내 PC 경로를 맞춰라
 C 드라이브에 넣어둬라 . C: 
 
 
  
 * 그 다음 내가 해볼거리 
 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
						ㅣ
공격수 = o				ㅣ
골키퍼 = x				ㅣ
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	ㅣ
  [ ] [ ] [ ] [ ] [ ]	ㅣ
스코어) 					ㅣ	
L						ㅣ
 [x] [ ] [ ] [ ] [ ]	ㅣ
스코어) 0:1				ㅣ
L						ㅣ
 [x] [o] [ ] [ ] [ ]	ㅣ
스코어) 1:1				ㅣ
L						ㅣ
 [x] [o] [x] [ ] [ ]	ㅣ
스코어)1:2				ㅣ
L						ㅣ
 [x] [o] [x] [o] [ ]	ㅣ
스코어)2:2				ㅣ
L						ㅣ
 [x] [o] [x] [o] [x]	ㅣ
최종스코어)2:3			ㅣ
						ㅣ
골키퍼승리)				ㅣ
						ㅣ
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 
 공격수 = 플레이어 
 골키퍼 = PC
 
----------
 
 상하좌우 키로 입력 버튼 만들기
 --------- 
 득점 성공 하면 O 가 [ ] 안에 들어가고 ,
 선방 성공 하면 X 가 [ ] 안에 들어가도록 
 --------
 그리고 밑에 스코어) 로 점수 표시 하기
 --------
 [ ] [ ] [ ] [ ] [ ] 가 꽉 차서 끝나면
  O 또는 X 가 더 많은 쪽이 승리 표시 
  -- 5칸 
 --------
 무승부는 없다. 무승부를 만들려면 공격수 , 골키퍼를 
 플레이어 와 COM 이 똑같이 공격을 하고 골키퍼를 해야한다.
 
  예)	플레이어 한번 공격하고 PC가 한번 공격하고
		플레이어 한번 수비하고 PC가 한번 수비하고 		
 --------
 

 
 
   
*/










