package tset01;

public class T_test02 {
	
	public int[] solution(int[] array, int[][] queries) {
		
		
			for(int[] query : queries) {
				int s = query[0];
				int e = query[1];
				
				for (int i = s; i <= e; i++) {
					array[i] +=1;
				}
		}
		
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
