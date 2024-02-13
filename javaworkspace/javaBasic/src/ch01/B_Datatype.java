package ch01;

public class B_Datatype {

	public static void main(String[] args) {
		
		// 기본형 데이터 타입
		
		
		// 정수형 데이터 타입 (실수부(소수점)가(이) 없는 정수를 저장)
		
		// byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// 최소 -128 최대 127까지 가능
		byte bytel = 127;
		// byte byte2 = 128; <- 바이트는 최대 127이기 때문에 오류 발생 오류 해결법은 int로 바꿔라고 함 왜냐하면 int에 저장되기 때문에
		
		
		// short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// 최소 -32768 최대 32767까지 가능
		short short1 = 32767;
		// short short2 = 32768; <- 쇼트는 최대 32767이기 때문에 오류 발생 오류 해결법은 int로 바꿔라고 함 왜냐하면 int에 저장되기 때문에
		
		
		// int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// 최소 -2147483648 최대 2147483647까지 가능
		int int1 = 2_147_483_647;
		// int int2 = 2_147_483_648; <- 인트 최대값을 넘었기 때문에 오류 발생 쇼츠와 바이트와 다르게 여기는 인트값을 넘었기 때문에 int로 바꾸라는 애러가 안뜸
		
		
		// long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		// 최소 최대값은 너무 길어서 생략
		long long1 = 2_147_483_648L; //<- L(대문사와 소문자 상관없음)을 붙여서 롱에 저장하라고 지시해야함)
		
		
		// 실수형 데이터 타입 : 실수부(소수점)를 가지는 데이터 타입
		
		// float : 4byes(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 6 ~ 7 자리에서 오차가 발생
		float float1 = 3.1415926535F; //<- F(대문사와 소문자 상관없음)을 붙여서 플롯에 저장하라고 지시해야함)
		
		System.out.println(float1);
		// 8번째자리에서 반올림 해버림
		
		
		// double : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 15 ~ 17 자리에서 오차가 발생
		double double1 = 3.1415926535897939;
		
		System.out.println(double1);
		// 18자리에서 반올림 해버림
		
		
		// 문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
		
		// char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
		// 0 ~ 65535
		
		char char1 = 'a'; // <- a는 아스키코드 
		
		char char2 = 97; // <- 97은 유니코드
		
		System.out.println(char1);
		System.out.println(char2);
		
		
		// 논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		
		// boolean : 1byte(8bit)의 크기를 가지는 논리형 데이터 타입
		// true, false 만 가질 수 있다.
		
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		
		// 형변환 : 데이터 타입이 서로 다른 변수를 옮겨 닮는 거
		
		// 자동 형변환 (묵시적 형변환) : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수를 옮겨 닮을 때 발생
		// ex) int -> long , flot -> double
		
		int number = 10;
		long longNumber = number;
		
		
		// 강제 형변환 (명시적 형변환) : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 닮을 때 발생
		// 할당하고자 하는 큰 데이터 타입 변수 앞에 (작은 데이터타입)을 붙여줌
		// ex) long -> int, double -> flot
		
		number = (int) longNumber;
		
		number = 256;
		byte byteNumber = (byte) number;
		
		System.out.println(byteNumber);
		
		
		short shortNumber = 97;
		char charcter = 97;
		
		//shortNumber = charcter; // <- 전혀 다른 타입이라서 안됨
		
		
		
		int intNumber = 100;
		float floatNumber = 100; // <- float에 정수부가 있기 때문에 가능하다. 
		// intNumber = floatNumber; // <- int에 실수부가 없어서 오류가 발생
		
		
		// 배열 : 동일한 타입의 변수를 묶어 저장하는 컨테이너
		// new 연산자를 이용하여 생성을 해야함
		// 한번 생성된 배열의 크기는 변경 할 수 없다.
		// 데이터 타입 [] 변수명(배열명)
		
		// 생성
		// 변수명 = new 데이터타입[크기];
		
		int [] numbers;
		numbers = new int [5];
		System.out.println(numbers);
		
		int[] numbers2 = {1, 2, 3, 4, 5};
		int[] numbers3 = new int[] {1, 2, 3, 4, 5};
		
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		// new 를 사용해서 생성하는 변수는 주소가 만들어진다. 
		
		
		// 배열의 요소에 접근 할 때는 '인덱스' 사용
		// 인덱스는 0번 부터 시작하고 마지막 인덱스는 길이 빼기 -1번 (즉 9를 지정하면 8이 끝)
		
		int item = numbers2[0];
		System.out.println(item);
		item = numbers[0];
		System.out.println(item);
		numbers[0] = 99; 
		System.out.println(item); // <= 재활당을 안해서 item 값은 0이다.
		item = numbers[0];
		System.out.println(item); // ↑ 방금 위에서 재활당을 했기 때문에 item 값은 99가 나온다.
		
		// 즉 재활당을 하지 않으면 값은 업데이트가 되지 않는다.
		
		
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		
		// ↓ 인덱스 범위를 초과하는 인덱스에 접근할 시 예외발생
		// System.out.println(numbers[5]);
		
		
		// new 를 사용하는 모든 타입은 참조형 데이터 타입이다.
		// 대문자를 사용하면 참조형 데이터 타입이다.
		// 그리고 참조형 데이터 타입은 모두 주소가 들어간다.
		
		// numbers : {99, 0, 0, 0, 0) [I@36aa7bc2 0
		
		System.out.println(numbers);	
		
		numbers2 = numbers;
		// numbers2 : {99, 0, 0, 0, 0) [I@36aa7bc2 0
		System.out.println(numbers2);
		
		numbers[4] = -99;
		// numbers : {99, 0, 0, 0, -99)
		// numbers2 : {99, 0, 0, 0, -99)
		
		//참조형 변수는 주소를 불러오기 대문에 자동으로 업데이트가 된다.
		
		// System.out.println(numbers2[4]);
		
		
		// int number1 = 0;
		// int number2 = number1;
		// number1 = -99;
		
		// System.out.println(number1); // <- 위에서 넘버1을 -99넣었지만
		// System.out.println(number2); // <- 넘버2에는 재활당이 되지 않기 대문에 0이다.
		
		char[] chars1 = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(chars1);
		
		
		// String : 문자열을 표현하는데 사용되는 참조형 데이터 타입
		// 문자열을 다루는데 유용한 여러가지 기능을 제공해주고 있음
		
		String string1 ="apple";
		
		
		// String의 주요 기능
		
		String statement = "My name is ironman";
		String statement2 = "  My name is ironman  ";
		
		// 1. 문자열 결합
		// + 혹은 .concat(문자열)으로 두 문자열을 연결 할 수 있다.
		
		System.out.println(statement + "!!!");
		System.out.println(statement.concat("???"));
		
		
		// 2. 문자열 비교
		// equals(문자열) :  두 문자열이 동등한지 비교 (글자가 똑같은지 비교한다)
		// compareTo(문자열) : 두 문자열이 사전순으로 비교 (비교해서 사전적으로 먼저오면 양수 늦게오면 음수)
		// compareToIgnoreCase(문자열) : 대소문자 구분없이 사전순으로 비교 
		
		System.out.println(statement.equals("My name is Hulk"));
		System.out.println(statement.equals("My name is ironman"));
		System.out.println(statement.compareTo("Apple"));
		System.out.println(statement.compareTo("apple"));
		System.out.println(statement.compareToIgnoreCase("apple"));
		
		
		// 3. 문자열 길이
		// length() : 문자열의 길이를 반환
		
		System.out.println(statement.length());
		
		
		// 4. 문자열 변환
		// toUpperCase() : 모든 문자를 대문자로 변경
		// toLowerCase() : 모든 문자를 소문자로 변경
		// trim() : 문자열의 앞뒤 공백을 모두 제거
		
		System.out.println(statement.toUpperCase());
		System.out.println(statement.toLowerCase());
		System.out.println(statement.trim());
		System.out.println(statement2);
		System.out.println(statement2.trim());
		
		
		// 5. 문자열 찾기
		// indexOF(문자열) : 찾고자하는 문자열의 첫번째 인덱스 번호를 반환 (존재하면 번호가 나오지만 없으면 -1이 나옴)
		// lastIndexOF(문자열) : 찾고자하는 문자열의 마지막으로 찾은 위치의 인덱스 번호를 반환 (존재하면 번호가 나오지만 없으면 -1이 나옴)
		
		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘못 그린 기린 그림이다.";
		
		System.out.println(statement.indexOf("그림"));
		System.out.println(statement.indexOf("하마"));
		System.out.println(statement.lastIndexOf("그림"));
		System.out.println(statement.lastIndexOf("하마"));
		
		
		// 6. 부분 문자열
		// substring(시작인덱스), substring(시작인덱스, 종료인덱스) : 문자열을 원하는 크기만큼 추출한다.
		
		System.out.println(statement.substring(48));
		System.out.println(statement.substring(3,10));
		
		
		// null : 아직 어떠한 값도 지정되지 않은 상태
		
		String string2 = null;
		System.out.println(string2);
		// System.out.println(string2.substring(48)); // <- null 값이라서 안됨
		
		
		
	}

}
