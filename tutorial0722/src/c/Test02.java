package c;

public class Test02 {

	public static void main(String[] args) {
		
		int [] weight = {11,170,56,78};
		
		for(int i=0; i<weight.length; i++) {
			for(int j=0; j<weight.length; i++) {
				int temp = 0;
				if(weight[j]<weight[j+1])
					temp = weight[j+1];
					weight[j+1] = weight[j];
					weight[j] = temp;
			}
		}
		for(int i:weight) System.out.println(i);
	}
}
