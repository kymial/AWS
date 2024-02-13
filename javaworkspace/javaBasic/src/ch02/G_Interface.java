package ch02;

// 인터페이스 : 클래스가 구현해야하는 매서드들을 선언하는 참조 타입
// 인터페이스의 모든 변수는 public static final 형태가 와야함
// 인터페이스의 모든 메서드는 public abstract 형태가 와야함(default 나 static 메서드가 올 수도 있음)
// 인터페이스는 다중 구현이 가능

// 접근제어자 interface 인터페이스명 {...}

// 넓이 공식 
// 삼각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 삼각형 넓이 
// 정사각형 넓이 구하기 - Double 변 -> Double 정사각형넓이
// 직사각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 직사각형 넓이
// 원 넓이 구하기 - Double 반지름 -> Double 원의 넓이

interface AreaCalculation {
	
	public static final double PI = 3.14;
	
	public abstract double getTriangleArea(double bottom, double height);
	public abstract double getSqiareArea(double side);
	public abstract double getRectangleArea(double bottom, double height);
	public abstract double getCircleArea(double radius);
}


// 인터페이스는 implements 키워드를 이용해서 클래스에 구현해야함
class MyMath implements AreaCalculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getSqiareArea(double side) {
		return side * side;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius * radius * PI;
	}
	
	
	
}

class MyMathV2 implements AreaCalculation{
	
	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getSqiareArea(double side) {
		return Math.pow(side, 2);
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius * radius * PI;
	}
	
}


public class G_Interface {

	public static void main(String[] args) {
		
		AreaCalculation instance = new MyMathV2(); // 정상적으로 잘 작동하는지 테스트하고 그리고 V2를 넣어서 다시 테스트 들어가서 잘 돌아가면 그대로 놔둠 이러면 코드의 안전성이 올라간다.
		
		
	}

}
