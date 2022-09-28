package java1.ch7_상속;

// 하위[자식] 클래스로 사용할 목적
public class EX1_DmbCellPhone extends EX1_CellPhone {
	
	// 1. 필드
	int channel;
	// 2. 생성자 : 객체 생성 
	public EX1_DmbCellPhone( String model , String color , int channel ) {
		this.model = model;		// 부모클래스의 필드
		this.color = color;		// 부모클래스의 필드
		this.channel = channel;	// 본인클래스의 필드 
		
	}
	// 3. 메소드 
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	

}
