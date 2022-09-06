package chelsea1.a변수;	// 패키지명

public class HW1_변수3 {	// class s

	public static void main(String[] args) {	// main s
		// 1
		int value;
		value = 10;
		System.out.println(value);
		
		// 2
		int hour = 3;
		int minute = 5;
		System.out.println( hour + "시간" + minute +"분");
		
		// 3
		int totalMinte = ( hour*60) + minute;
		System.out.println("총" +totalMinte + "분");
		
		// 4
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + " , y :" + y);
		
		// 5
		int temp = x;
		x = y ;
		y = temp;
		System.out.println("x : " + x + " , y :" + y);
		
	}	// main e
		
}	// class e
