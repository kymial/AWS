package ch02_sub;

// ch02에 선언된 AccessModifier 클레스는 접근 제어자가 defaul이기 때문에 외부 패키지에서 import가 불가능
//import cho2.AccessModifier;


// ch02에 선언된 AccessModifier 클래스는 접근제어자가 puiblic이기 때문에 외부 패키지에서 import 가능

import ch02.C_AccessModifier;

class SubClass extends C_AccessModifier{

public class C_AccessMpdofoer {

	public static void main(String[] args) {
		
		
		

		C_AccessModifier instance = new C_AccessModifier();
		
		
//		instance.privateVariable = 0;
		
		// C_AccessModifier 클래스의 defaultVariable 필드는
		// 접근 제어자가 default이기 때문에 외부 패키지에서는 접근이 불가능
//		instance.dfaultVariable = 0;
		
		// C_AccessModifier 클래스의 defaultVariable 필드는
		// 접근제어자가 protected이기 때문에 외부 패키지에서는 접근이 불가능
		// 단, // C_AccessModifier 클래스를 확정한 클래스에서는 접근이 가능
		// 상단의 Sub Class 잠조
		// instance.protectedVariable = 0;
		
		instance.publicVariable = 0;
		
		// instance.a=0;
	}

}
}