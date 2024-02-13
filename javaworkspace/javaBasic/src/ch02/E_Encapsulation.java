package ch02;

// 캡슐화 : 맴버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장 할 수 있음
// 무결상 : 정확한 데이터가 들어가있다는걸 증명하는걸 무결성이라고 한다.


class FootballPlayerB {
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerB (String name, String birth, String team, int goal){
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName () {
		return this.name;
	}
	String getBirth () {
		return this.birth;
	}
	String getTeam() {
		return this.team;
	}
	int getGoal() {
		return goal; // this 안 써도 됨
	}
	
	// 위가 가장 강한 캡슐화
	
	void setName(String name) {
		this.name = name;
	}
	
	void setTeam(String team) {
		this.team = team;
	}
	
	void setGoal(int goal) {
		if (goal < 0 ) return;
		this.goal = goal;
	}
}

class FootballPlayerC{
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerC(String name, String birth, String team, int goal){
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getTeam() {
		return team;
	}
	void setTeam(String team) {
		this.team = team;
	}
	int getGoal() {
		return goal;
	}
	void setGoal(int goal) {
		this.goal = goal;
	}
	String getBirth() {
		return birth;
	}
}


public class E_Encapsulation {

	public static void main(String[] args) {

		FootballPlayerB son = new FootballPlayerB("손흥민","920000", "토트넘 홋스퍼", 0);
//		son.name = "손흥민";
//		son.team = "토트넘 홋스퍼";
//		son.goal = 0;
		
		son.setGoal(-1);
		
		System.out.println(son.getName());
		System.out.println(son.getBirth());
		System.out.println(son.getTeam());
		System.out.println(son.getGoal());

	}

}
