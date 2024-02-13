package ch01;

import java.util.Scanner;

public class ConsoleIO {

	public static void main(String[] args) {
		
		// 콘솔 출력
		// System 클레스의 out 객체의 print(), println()

		// print() : 출력이 끝나고 줄바꿈을 하지 않음
		// ex) System.out.print("abc");
		//	   System.out.print("def");
		//	   abcdef 로 출력

		// println() : 출력이 끝나고 줄바꿈을 진행 함
		// ex) System.out.println("abc");
		//	   System.out.println("def");
		//		abc
		//		def
		//			로 출력
		
		
		String name = "John Doe";
		System.out.println(name);
		System.out.println(name);
		
		
		// 콘솔 입력
		// java.util.Scanner 클래스의 객체를 생성해서 nextXXX()(nextInt) 메서드로 입력을 받음
		
		Scanner scanner = new Scanner(System.in); //<- Scanner에서 ctrl + 스페이스 바하면 자바 유틸 추가 가능
		System.out.print("나이를 입력하세요 : ");
		
		int age = scanner.nextInt();
		
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		scanner.close();
		

	}

}
