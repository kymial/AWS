package tset01;

public class T_test03 {
	
	public int solution(String number){
		int x =0;
		int num = Integer.parseInt(number);
		
		if(num > 0) {
			for (int i = 0; i< number.length(); i++) {
				int a = Integer.parseInt(number.substring(i, i+1));
				
				x += a;
				}
			}
		else {
			x= 0;
			}
		return x;
}
			
	

	public static void main(String[] args, int x) {
		// TODO Auto-generated method stub

		
	}

}
