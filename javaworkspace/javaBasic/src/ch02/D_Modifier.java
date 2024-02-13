package ch02;

// 기타 제어자 (비접근 제어자) : 접근 제어와 무관하게 동작을 제어하는 것
// final 제어자 : 
// - 클래스 : final 제어자가 붙은 클래스는 확장(상속) 할 수 없음
// - 메서드 : final 제어자가 붙은 메서드는 오버라이드 할 수 없음
// - 변수 : final 제어자가 붙은 변수는 재할당할 수 없음


final class FinalModifier1 {
	
	int variable;
}

//class SubModifier1 extends FinalModifier1{
//	
//}

class FinalModifier2{
	
	final void method() {}
	
}

class SubModifier2 extends FinalModifier2 {
	
//	void method () {}
	
}

class FinalModifier3 {
	
	final int variable = 10;
	
	void method() {
//		variable = 20;
	}
}

// static 제어자 : 
// - 메서드 : static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// - 변수 : static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 접근 가능

class StaticModifier {
	
	static int variable;
	
	static void method() {}
	
	
}

// 제어자의 조합
class Combination{
	
	// public + static + final (주로 사용하는 조합)
	public static final int NUMBER = 10;
	
	// 메서드에서 private + final (사용 안함)
	private final void method() {} // <- 노랑줄 해석하면 뭔가가 뭔가임 이라는 뜻
	
	// 메서드에서 private + adstract (private : 외부에서 접근이 불가능, adstract : 반드시 오버라이드를 하라 서로 상층)
	
	// 클레스와 메서드에서 final + adstract (final : 오버라이드 할 수 없다. , adstract : 반드시 오버라이드를 하라 서로 상층)
	
}



public class D_Modifier {

	public static void main(String[] args) {
			StaticModifier.variable = 0;
			StaticModifier.method();

	}

}
