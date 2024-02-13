package ch02;

class ExampleClass2{
	
	static int number = 3;
	double doubleNumber;
	
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;
	}
	
	static void staticMethod() {
		
	}
}

class Sample1{
	int data;
	
	Sample1 () {}
	
	Sample1 (Sample1 sample){
		this.data = sample.data;
	}
}


public class A_JVM {

	public static void main(String[] args) {
	
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		sample = instance1.method();
		
		System.out.println("methood out : " + sample.data);
		
		System.out.println("");
		
		int number2 = number; // 스택 영역에 넘버2라는 공간이 생성
		number2++; // 넘버2에 데이터에 1이 추가
		System.out.println(number);
		System.out.println(number2);
		
		System.out.println("");
		
		Sample1 sample2 = sample;
		sample2.data++;
		System.out.println(sample.data);
		System.out.println(sample2.data);
		
		Sample1 sample3  = new Sample1(sample); // new 명령어로 힙영역에 공간 생성
		System.out.println(sample.data);
		System.out.println(sample3.data);
		sample3.data++;
		System.out.println(sample.data);
		System.out.println(sample3.data);
		
	}

}
