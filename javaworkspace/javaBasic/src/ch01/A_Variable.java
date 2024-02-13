package ch01;

public class A_Variable {

	public static void main(String[] args) {
			
		// 변수 (Variable) 
		// 데이터를 저장하는 공간, 변수는 지정한 타입의 데이터만 활당할 수 있다.
		
		// 선언 : 변수를 생성
		// 데이터타입(int) 변수명(number);
			
		int number;
		
		// 초기화 : 변수에 초기값을 활당하는 것
		// 변수명(number) 활당하겠다(=) 데이터(10); 
		// => 데이터를 변수에 활당하겠다.
		// 초기화는 처음에 한것만 2번째부터는 활당이라고 함
		
		
		number = 10; //<- 이건 초기화
		number = 50; //<- 이건 활당
		
		
		// 변수 선언과 동시에 초기화
		// double = 실수를 받을 수 있는 타입
		
		
		double pie = 3.14;
		
		
		// 변수에 지정한 타입의 데이터가 아니면 활당이 불가능
		// number = 3.14; <- 정수타입을 선언했는데 실수를 넣어서 불은 밑줄 뜸
		
		// 변수를 선언한 후 반듯이 초기화 이후에 사용 할 수 잇다.
		// ex)
		// int age;
		// system.out.println(age); // <- 초기화를 하지 않아으니 오류가 발생
		// ↑ sysout 입력하고 ctrl + 스페이스 하면 바로 나옴 system.out.println가 바로 나옴
		
		
		// 변수 명명 규칙
		
		// 1. 중복된 변수명을 사용할 수 없음 (단 중괄로 밖에서는 중복이 가능 예를들면 a{boolean flag;} b{int flag;} 이런식으로 가능)
		// ex)
		boolean flag;
		// int flag;
		
		
		// 2. 숫자로 시작 할 수 없음
		// ex)
		// int 1age; <- 시작을 숫자로 하니깐 오류 발생
		int age1; 
		
		
		// 3. 연산자로 사용되는 특수문자(띄어쓰기(공백)포함)를 포함할 수 없음
		// ex)
		// int age+; <- +는 연산자로 사용되는 특수문자이기 때문에 오류가 발샐 
		int age$_; //<- 달러나 언더바는 연산자로 사용되는 특수문자가 아니기 때문에 사용 가능 (참고로 이름에 달러만 있으면 그건 이름을 미지정인 상태)
		
		
		// 4. 키워드 단어만으로는 사용할 수 없음
		// ex)
		// int int; <- int는 키워드 이기때문에 int int로 알아먹음
		int int1; //<- int1은 키워드가 아니기 때문에 사용가능
		
		
		// 암묵적 룰
		// 띄워쓰기 표현
		// - Camel Case : 띄워쓰기를 표현할 때 띄워쓰기를 제거하고 바로 뒤 문자를 대문자로 표현
		// ex) String smart phone; => String smartPhone;
		
		// - Snake Case : 띄워쓰기를 표현할 때 띄워쓰기 자리에 _로 표현
		// ex) String smart phone; => String smart_phone;
		
		String smartPhone;
		String smart_phone;
		
		// - Upper ~ : 대문자 표현 
		// - Lower ~ : 소문자 표현
		
		// - UpperCamelCase : 첫 문자를 대문자로 시작 (클래스, 인터페이스)
		// - LowerCamelCase : 첫 문자를 소문자로 시작 (변수, 메서드) -> java 같은 컴파일러 할때 사용함
		// - UPPER_SNAKE_CASE : 모든 문자를 대문자로 작성 (상수)
		// - lower_snake_case : 모든 문자를 소문자로 작성 (변수, 메서드) -> java 스크립트 같이 인터프리터 할때 사용함
		// => 안 지켜도 작동은 잘 됨 하지만 팀에 혼란을 줌
		
		
		// 상수 (Constant)
		// 초기화가 이루어지면 그 값을 변경할 수 없는 변수(즉 활당이 불가능)
		// 변수 선언 시 데이터 타입 final 키워드를 붙여서 선언할 수 있음
		// final 데이터타입(int) 변수명(상수명)(MAX);
				
		final int MAX;
		MAX = 100;
		
		final int MIN = -100;
		
		// 상수는 초기화 후 재활당 불가능
		// MAX = 200; <- 초기화를 한 상수이기 때문에 활당이 불가능함 그러니 오류발생
		
		double size1 = 146.6 * 70.6; // <- 변수명을 확실히 하지 않으면 다른 팀원이 못 알아듣는다.
		
		// 상수를 사용하는 이유 : '리터럴'에 이름을 붙여주기 위한 용도로 가장 많이 사용한다.
		final double IPHONE_15_PRO_HEIGHT = 146.6;
		final double IPHONE_15_PRO_WIDHT = 70.6;
		
		double size2 = IPHONE_15_PRO_HEIGHT * IPHONE_15_PRO_WIDHT; 
		
		// 리터럴 : 값 그 자체
		// int number = 10; 이라는 구문에서 '10'이 리터럴
		// 10 = 12;
			
		
	}

}
