package tset01;

class Test_01{
	
	
	public int soloution(int[] num_list) { 
	int x = 0;
		
	for (int i = 0; i < num_list.length; i++) {
		if(num_list[i] < 0) {
			x = i;
			break;
		} else {
			x = -1;
		}
		
	}
	
	return x;	
		}
	
}


public class T_test {

	public static void main(String[] args) {
				
	
		
		
		
		}
		
	}
