
package ch01;

import java.util.Scanner;

public class C_Operator {

	public static void main(String[] args) {
		
		
		// 연산자 
		int a = 15;
		int b = 7;
		double c = 15.0;
		double d = 7.0;
		
		int intResult;
		double doubleResult;
		
		
		// 산술 연산자 : 사칙연산 작업 숫자 데이터에 대해서 연산을 수행
		
		// 더하기 : +
		// 좌항에 우항을 더한 값을 반환 ( → )
		
		intResult = a + b;
			System.out.println(intResult);
		
		doubleResult = c + d;
			System.out.println(doubleResult);
		
		doubleResult = a + b;
			System.out.println(doubleResult);
			
		intResult =(int) (c + d); // <- 들어가는 곳이 int 라서 계산시에 int에 넣어라고 표시해줘야함
			System.out.println(intResult); 
			
		// 정수 + 실수 = 실수	
		doubleResult = a + d;
		
		
		// 빼기 : -
		// 좌항에서 우항을 뺀 결과물 원함
		
		intResult = a - b;
			System.out.println(intResult);
			
		doubleResult = c - d;
			System.out.println(doubleResult);
			
		// 정수 - 실수 = 실수
		
		doubleResult= a - d;
			System.out.println(doubleResult);
			
		
		// 곱하기 *
		// 좌항에 우항을 고반 겨롹를 반환
		
		intResult = a * b ;
			System.out.println(intResult);
		
		doubleResult = c * d;
			System.out.println(doubleResult);
			
		
		// 정수 * 실수 = 실수
		doubleResult = a * d;
			System.out.println(doubleResult);
		
		
		// 나누기 /
		// 좌항에 우왛응ㄹ 나눈 결과를 반환
		// 정수 나누기 정수의 경과는 실수부가 버려진다.
		
		intResult = a / b ;
			System.out.println(intResult);
		
		doubleResult = c/ d ;
			System.out.println(doubleResult);
		
		// 정수 * 실수 = 실수
		doubleResult = a / d;
			System.out.println(doubleResult);
		
		
		// 나머지 %
		// 좌향에 우향을 나눈 나머지를 반환
		intResult = a % b;
			System.out.println(intResult);
		
		doubleResult = c % d;
			System.out.println(doubleResult);
		
		// 정수 * 실수 = 실수
		doubleResult = a % d;
			System.out.println(doubleResult);
			
		
		// 증강 연산
		// 피연산자의 값을 1 증가 혹은 감소
		// 증강 연산자 : ++
		// 감소 연산자 : --
		
		int number = 5;
		
		// number++;
			// System.out.println(number);
		
		// intResult = number++ + 5; //10
			// System.out.println(intResult);
		// intResult = ++number +5; // 11
			// System.out.println(intResult);
		
		intResult = ++number +5; // 11 <- 앞에 ++가 있기 때문에 먼저 증가시켜서 6+5 가되어서 11이 나온다. (선처리)
		intResult = number++ +5; // 10 <- 뒤에 ++가 달려있었서 5+5로 계산이 된다. 그래서 10이 나오고 이미 5는 사라져있기 때문에 뒤에 ++는 증가는 무효가 된다. (후처리)
			System.out.println(intResult);
		
	
		// 대입(활당) 연산자 : 좌항에 우항을 할당
			
		// 일반 대입 연산자 : =
		// 상수에 초기화를 할 때를 제외하고 좌항이 반드시 변수이어야한다. (참고로 리퍼럴도 상수다. 즉 안된다 원래 안되겠지만..)
		// 좌항에 우항을 활당
			
		number = 10;
		
		
		// 복합 대입 연산자 : 산술연산 =
		// 좌항에 사용되는 변수는 반드시 초기화가 되어 있어야 함
		// 좌항에는 변경이 가능한 일반 변수가 와야함 (상수, 리퍼럴 불가능)
		// 좌항에 우항을 연산한 결과를 좌항에 할당
		
		number += 10;
			System.out.println(number);
		
		number -= 7;
			System.out.println(number);
			
		number *= (7 - 5); // <- 우항쪽 (7 - 5) 를 먼저 계산하고 그리고 좌항과 연산하고 좌항에 할당한다.
			System.out.println(number);
			
		// int number1;
		// number1 += 10;
		
		
		// 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리값으로 변환
		boolean booleanResult;
			
		// 같다, 다르다 연산
		// == : 좌항과 우항이 같으면 true, 다르면 false
		// != : 좌항과 우화이 다르면 true, 같으면 false
		
		booleanResult = a == b;
			System.out.println(booleanResult);
		
		booleanResult = a != b;
			System.out.println(booleanResult);
			
		String string = "Hello";
		booleanResult = string == "Hello";
			System.out.println(booleanResult);
			
		
		String string1 = "Hello";
		String string2 = "Hello";
		booleanResult = string1 == string2;
			System.out.println(booleanResult);
			
		
		// 작다, 작거나 같다 연산
		// < : 좌항이 우항보다 작으면 true, 같거나 크면 false
		// <= : 좌항이 우항보다 작거나 같으면 true 크면 false
		
		booleanResult = a < b;	
			System.out.println(booleanResult);
		
		booleanResult = a <= c;
			System.out.println(booleanResult);
			
		
		// 크다, 크거나 같다.
		// > : 좌항이 우항보다 크면 true, 같거나 작으면 false
		// >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
		
		booleanResult = a > c;
			System.out.println(booleanResult);
		
		booleanResult = a >= c;
			System.out.println(booleanResult);
		
		 
		// 논리 연산자 : 피연산자가 모두 논리 형태로 논리 값을 조합하는 것
		// && = AND 연산 - 좌항과 우항이 모두 true이면 true, 하나라도 false면 false
		
		booleanResult = true && true;
			System.out.println(booleanResult);
			
		booleanResult = false && false; // 뒤에 펄스는 뻔한 내용이라서 컴퓨터가 읽지를 않음 그래서 노랑 밑줄이 쳐짐
			System.out.println(booleanResult);
			
		booleanResult =  a > b && c > d;
			System.out.println(booleanResult);
		
		booleanResult = a < b && c > d;
			System.out.println(booleanResult);
			
			
		// || : OR 연산 - 좌항과 우항 중 하나라도 true 면 true, false 면 false
			
		booleanResult = true || true; // 뒤에 트루도 뻔한 내용이라서 컴퓨터가 읽지를 않음 그래서 노랑 밑줄이 쳐짐
			System.out.println(booleanResult);
		
		booleanResult = a < b || c > d;
			System.out.println(booleanResult);
		
			
		// a: 15 b: 7
			// booleanResult = (a < b) && (a < ++b);
			booleanResult = (a > b) && (a < ++b);
				System.out.println(booleanResult);
				System.out.println(b);
			
			booleanResult = (a < b) || (a > ++b);
				System.out.println(booleanResult);
				System.out.println(b);
		
				
		// and 연산자는 앞에가 트루면 뒷 부분을 실행하지만 펄스면 실행 안함
		// or 연산자는 앞에가 펄스이면 뒷 부분을 실행하지면 트루면 실행 안함 
				
				
		// 삼항 연산자 : 간단한 조건에 따라 결과를 반환하는 연산자.
		// 조건 (논리식) ? 참일때 결과 : 거짓일때 결과
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("나이 : ");
		
		int age = scanner.nextInt();
		
		String stringResult = age > 19 ? "성인" : "미성년자";
		System.out.println(stringResult);
		
		// 위와 같은 경우 String올 만들었기 때문에 결과도 같은 String 데이터 타입으로 만들어야 한다.
	
				
				
	}

}

