package java1.ch8_인터페이스;

public class EX2_비행기게임 implements EX2_게임패드 {

	@Override
	public void A버튼() {System.out.println("미사일발사");}
	@Override
	public void B버튼() {System.out.println("비행기 교체");}
	@Override
	public void C버튼() {System.out.println("폭탄 던지기");}
	
	
}
