package ch02_sub;

class Interfacesub implements G_Message {
	
	int method3 (int number) {
		System.out.println(GREETING_MESSAGE);
		
		System.out.println(GOODBYE_MESSAGE);
		return 3 + number;
	}
	
}

public class G_Interfacesub implements G_Message, G_Method {

	public void method1 () {
		System.out.println(GREETING_MESSAGE);
		
		System.out.println(GOODBYE_MESSAGE);
	}
	
	public void method2 () {
		System.out.println(GREETING_MESSAGE);
		
		System.out.println(GOODBYE_MESSAGE);
	}
	
}
