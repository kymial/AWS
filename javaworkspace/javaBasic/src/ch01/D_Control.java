package ch01;

import java.util.Scanner;

public class D_Control {

	public static void main(String[] args) {
		
		// 제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		
		Scanner scanner = new Scanner(System.in);
		
		// 조건문 : 특정 조건이 만족하면 코드를 실행하는 것, 만족하지 않으면 실행하지 않음
		
		// if : 주어진 조건이 true면 코드를 실행하도록 하는 것
		// if (조건-논리표현식) { 실행할 코드 }
		
		int age = 15;
		
		
		// age는 17보다 크거나 같으면서 19보다 작거나 같아야 한다.
		// age >= 17 && age <= 19 
		
		// age는 17보다 크거나 같거나 19보다 작거나 같아야 한다.
		// age >= 17 || age <= 19
		
		// 부정연산자 : 논리 표현식을 부정하는 연산
		// !논린 : true면 false, false면 true로 반환
		
		boolean isHighSchool = age >= 17 && age <=19;
		if (!isHighSchool) {
			System.out.println("고등학생이 아닙니다..");
		};
		
		System.out.println("프로그램 종료");
		
		System.out.println("======================================================");
		System.out.println("======================================================");
			
		
		// else : if 문의 조건 - 논리표현식이 false면 코드를 실행하도록 하는 것
		// if(조건-논리표현식) {true이면 실행할 코드}
		// else {false이면 실행할 코드}
		
		// 주의점
		// 1. else문의 반드시 if 문 이후에 와야한다. (else 단독으로 사용이 불가능)
		// 2. else문에는 조건을 작성하지 않는다.
		
		age = 10;
		
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}
		
		System.out.println("프로그램 종료");
		
		// 실행할 구분이 하나면 중괄로 칠 필요가 없다.
		// 중괄로는 한 구역으로 친다. 즉 A-1이라는 중과롤에서 A라는 변수 선언하고 A-2에서도 A라는 변수 선언이 가능하다. 단 매인에서 만든것는 중복안됨
		
		
		//
		
		String fruit = "수박";
		
		if (fruit.equals("사과")) {
			
		} else if(fruit.equals("바나나")) {
		}		else if(fruit.equals("귤")) {
		}				else {
		}
			 
		
		// switch : 특정 변수 또는 값에 따라 실행할 코드 블록의 범위를 결정하는 것
		
//		switch (변수 - 일반표현식) {
//		case 값1 : 
//			변수 - 일반표현식이 값1과 같을때 시작할 코드위치
//		case 값2 :
//			변수 - 일반표현식이 값2와 같을때 시작할 코드위치
//			switch 내부에서 break문을 만나면 switch문을 종료
//			break;
//		case 값3 :
//			변수 - 일반표현식이 값3와 같을때 시작할 코드위치
//		default :
//			변수 - 일반표현식이 case의 값과 일치하는 것이 없거나 바로 위에서 break문을 만나지 않으면 실행될 코드
//		}
		
		int input = 5;
		// input이 0이면 ABC를 출력
		// input이 1이면 BC
		// input이 2이면 C
		// input이 3이면 DEF
		// input이 4이면 EF
		// input이 0~4가 아니면 F
		
//		switch (input) {
//		case 0 :
//			System.out.println("A");
//		case 1 :
//			System.out.println("B");
//		case 2 :	
//			System.out.println("C");
//			break;
//		case 3 :
//			System.out.println("D");
//		case 4 :
//			System.out.println("E");
//		default : 	
//			System.out.println("F");
//		}
		
		
		
		// input이 0이면 ABC를 출력
				// input이 1이면 A
				// input이 2이면 B
				// input이 3이면 C
				// input이 4이면 D
				// input이 5이면 E
				// input이 5이면 F
		
		switch (input) {
		case 0 :
			System.out.println("A");
			break;
		case 1 :
			System.out.println("B");
			break;
		case 2 :	
			System.out.println("C");
			break;
		case 3 :
			System.out.println("D");
			break;
		case 4 :
			System.out.println("E");
			break;
		default : 	
			System.out.println("F");
		}
		
		System.out.println("==============================================================================");
		System.out.println("==============================================================================");
		System.out.println("==============================================================================");
		
				
		// 반복문 : 특정 조건에 부합하면 지정한 코드를 여러 번 실행하도록 하는 것
		
		// for : 일반적으로 반복 횟수가 정해져있을 때 사용되는 반복문
		// for (조건에 사용할 변수 초기화; 조건; 조건에 사용할 변수증감) {반복할 코드}
		
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
		/// ... * 100
		
		
		
		for (int count = 1; count <= 3; count++) {
			System.out.println("안녕하세요.");
		}
					
//		System.out.println("2번 안녕하세요");
//		System.out.println("3번 안녕하세요");
//		System.out.println("4번 안녕하세요");
//		System.out.println("5번 안녕하세요");
		
//		for (int count = 1; count <= 5; count++) {
//			System.out.println(count +"번 안녕하세요");
//		}
		
		for (int count = 1; count <= 5; count ++) {
			System.out.println((3*count-4) +"번 안녕하세요");
		}
		
		System.out.println("==============================================================================");
		System.out.println("==============================================================================");
		System.out.println("==============================================================================");
		
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
		
//		for (int x = 1; x <= 9; x ++) {
//			System.out.println("2 * "+ x + " = " + 2 * x);
//		}
//		
//		for (int x = 1; x <= 9; x++) {
//			System.out.println("3 * "+ x + " = " + 3 * x);
//		}
//		
//		for (int x = 1; x <= 9; x++) {
//			System.out.println("4 * "+ x + " = " + 4 * x);
//		}
		
//		for(int dan = 2; dan <= 9; dan++) {
//			for (int n = 1; n <= 9; n++) {
//				System.out.println(dan + " * " + n + " = " + dan * n);
//			}
//		}
		
		// 이중 반복어는 최악의 경우게만 사용 추천..   
		
		
		int[] numbers = new int[5];
//		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[2] = 3;
//		numbers[3] = 4;
//		numbers[4] = 5;
		
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = index + 1;
		}
		
		// System.out.println(numbers[0]);
		// System.out.println(numbers[1]);
		// System.out.println(numbers[2]);
		// System.out.println(numbers[3]);
		// System.out.println(numbers[4]);
		
//		for (int index = 0; index < numbers.length; index++) {
//			System.out.println(numbers[index]);
//		}
		
		// foreach : 컬렉션(배열)의 각 요소를 하나씩 변수에 '복사' 하여 사용하는 반복문
		
		
		// numbers : { 1, 2, 3, 4, 5 }
		for (int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("==============================================================================");
		
//		for (int number : numbers) {
//			number = 0;
//		}
		
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = 0;
		}
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		// for은 원본을 직접 수정 foreach는 원본을 복사해서 사용하는 반복문
		// 자주 쓰이는건가 foreach 왜냐하면 DB에 연결되면 초기화 보다는 DB에서 들고오기때문에 foreach를 자주 쓰게됨
		
		
		// while : 반복할 횟수가 정해져있지 않을때 사용하는 반복문
		// 조건이 true인 동안 반복, 조건이 false가 되면 반복 종료
		
		input = 1;
		
//		while (input != 0) {
//			System.out.println("while 반복문 실행중..");
//			input = scanner.nextInt();
//		}
//		System.out.println("while 반복문 종료!");
		
		while (input != 0) {			//←
			input = scanner.nextInt();	//↑			
			if(input % 2 != 0) {		//↑				
				// continue : 반복문에서 continue문을 만나면 조건 검사로 넘어감
				continue;							
			}
			if (input == 0 ) {
				// break : 반복문에서 break문을 만나면 반복문을 바로 종료
				break;
			}
				System.out.println("입력 값 : " + input);
				System.out.println("while 반복문 실행중..");
		}
		System.out.println("while 반복문 종료!");
		
		for (int index = 0; index < 10; index ++) {
			if (index % 3 == 0 )
				continue;
			if (index == 8) break;
			System.out.println(index);
		}
		
		
	}

}
