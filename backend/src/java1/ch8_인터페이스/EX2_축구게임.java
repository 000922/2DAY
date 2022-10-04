package java1.ch8_인터페이스;

public class EX2_축구게임 implements EX2_게임패드 {

	@Override
	public void A버튼() {System.out.println("슛");}
	@Override
	public void B버튼() {System.out.println("패스");}
	@Override
	public void C버튼() {System.out.println("태클");}

} // class end
