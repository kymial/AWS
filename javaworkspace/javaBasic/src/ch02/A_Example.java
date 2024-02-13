package ch02;

// GalaxyPhone
// 제조사 : (maker - String)
// 모델면 : (modelName - String)
// 소유자 : (owner - String)
// 전화번호 : (telNumber - String)
// 전원상태 : (power -boolean)

// 전원버튼누름	: onPower -power 상태를 부정
// 전화걸기	: call - power가 true일 때 "(상대 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기	: emergency "112로 전화를 겁니다." 출력
// 휴대전화정보보기 : getInformation - power가 true 일 때

//==== (전화번호) ====
//제조사 : (제조사)
//모델명 : (모델명)
//소유자 : (소유자)

//출력

class GalaxyPhone{
	static String maker;
	String modelName; 
	String owner;
	String telNumber;
	boolean power;
	
	void onPower() {
		power = !power;
	}
	
	void call (String toTelNumber) {
		if(!power) return; { 									// power만 입력해도 트루일때만 작동하게 설정 가능
			System.out.println(toTelNumber +" 로 전화를 겁니다.");
		}	
	}
	
	static void emergnecy() {
		System.out.println("112로 전화를 겁니다.");
	}
	
	void getInformation() {
		if(!power) return; {
		System.out.println("==== " + telNumber + " ====");
		System.out.println("제조사 : " + maker);
		System.out.println("모델명 : " + modelName);
		System.out.println("소유자 : " + owner);
		}
	}

	void phonesys() {
		System.out.println(maker);
		System.out.println(modelName);
		System.out.println(owner);
		System.out.println(telNumber);
		System.out.println(power);
		
	
		
		
	}
	
}

// 드라마
// 방송사	: (boardcastingCompany - String)
// 제목	: (title -String)
// 배우	: (actors - String[]) 
// 장르	: (genre - String)
// 시청율	: (viewerRating - double)
// 부작	: (series - int)

// 정보보기 : getInfomation
// ==== (title) ====
// 방송사 : (boardcastingCompany)
// 장르 : (genre)
// 부작 : (series) 부작
// 시청율	: (viewerRating) %
// 배우 : (actor), (actor), (actor) .... 전지현, 김수현, 박해진, 유인나


class Drama {
	String boardcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRating;
	int series;
	
		void getInfomation() {
			System.out.println("==== "+ title + "====");
			System.out.println("방송사 : "+ boardcastingCompany);
			System.out.println("장르 : " + genre);
			System.out.println("부작 : " + series + " 부작");
			System.out.println("시청률 : " + viewerRating + " %");
			System.out.print("배우 : " );
			for (int index = 0; index < actors.length; index++) {
//				System.out.print(actors[index]);
					// {"A", "B", "C"}
//					if (index < actors.length - 1) System.out.println(", ");
					// index < actors.length - 1
					// true - actors[index] + ", " / false - actors[index]
//					System.out.print(index < actors.length -1 ? actors[index] + "," : actors[index]);
					String actor = index < actors.length -1 ? actors[index] + "," : actors[index];
					System.out.print(actor);
			}
			System.out.println("");
	}
	

}


// TriangleMath
// 빗변 구하기		- getHypotenuse
// 둘레 구하구 	- getCircumference
// sin 구하기		- getSin
// cosin 구하기	- GetCos
// tan 구하기		- GetTan

class TriangleMath {
	
	//static final double Pi =3.14;
	
	static double gethypotenuse (int bottom, int height) {
		if (bottom <=0 || height<=0) return 0; 
//		if (!(botton > 0 && height > 0)) 
		double result = Math.pow(bottom, 2) + Math.pow(height, 2);  
		return Math.sqrt(result);
	}
	
	static double getCircumference(int height, int bottom, int hypotenuse) {
		if (bottom <=0 || height<=0 || hypotenuse<=0 ) return 0;
		return height + bottom + hypotenuse;
	}
	
	static double getSin(int height, int hypotenuse) {
		if (height <=0 || hypotenuse<=0) return 0;
		return height / hypotenuse;
	}
	
	static double getCos(int bottom, int hypotenuse) {
		if (bottom <=0 || hypotenuse<=0) return 0;
		return bottom / hypotenuse;
	}
	
	static double getTan(int height, int bottom) {
		if (bottom <=0 || height<=0) return 0;
		return height / bottom;
	}
	
	
	
}


public class A_Example {

	public static void main(String[] args) {	
		GalaxyPhone s23 = new GalaxyPhone();
		GalaxyPhone s24 = new GalaxyPhone();
		
		
		GalaxyPhone.maker = "SAMSUNG";
		
		
//		s23.maker = "SAMSUNG";
		s23.modelName = "s23";
		s23.owner = "홍길동";
		s23.telNumber = "010-1234-5678";
		s23.power = false;
		
//		s24.maker = "SAMSUNG";
		s24.modelName = "s24";
		s24.owner = "김철수";
		s24.telNumber = "010-5678-1234";
		s24.power = false;
		
		s23.onPower();
		
		s23.getInformation();
		
		GalaxyPhone.emergnecy();
		
		s23.emergnecy();
		s24.emergnecy();
		
		System.out.println("");
		
		Drama star = new Drama();
		
		star.boardcastingCompany = "SBS";
		star.title = "별에서 온 그대";
		star.actors = new String[] {"전지현", "김수현", "박해진", "유인나"};
		star.genre = "로맨스";
		star.viewerRating = 28.1;
		star.series = 21;
		
		star.getInfomation();
		
		
		TriangleMath TriangleMath= new TriangleMath();
		double bit = TriangleMath.gethypotenuse(3, 4);
		System.out.println(bit);
				
		//System.out.println(TriangleMath.Pi);
//		TriangleMath.Pi = 0,0;

	
}
}