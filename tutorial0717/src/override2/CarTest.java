package override2;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car(5);
		Car c2 = new Car(5, "사랑");
		Car c3 = new Car(5, "믿음", "증오");
		Car c4 = new Car(5, 11.2f, 34.6);
		//생성자(constructor)
		//객체 생성시 자동으로 호출되는 클래스명과 동일한 함수
		//내가 클래스 내에 기본생성자(default constructor) => 파라미터가 없는 생성자
		//자동으로 자바가 생성해주는데
		//내가 필요에 의해서 하나라도 만들면 만들어주지 않는다
		//생성자는 반환이 없으나 함수 이름 왼쪽에 void를 붙이지 않는다
		
		int[][] arr = new int[3][3];
		arr[0][0] = 5;
		arr[0][1] = 10;
		arr[0][2] = 15;
		
		arr[1][0] = 20;
		arr[1][1] = 25;
		arr[1][2] = 30;
		
		arr[2][0] = 35;
		arr[2][1] = 40;
		arr[2][2] = 45;
		
		int [] result2 = {0,0,0};
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = 5*(i+1)*(j+1);
				result2[i]+=arr[i][j];
				System.out.println(arr[i][j]);
				
			}
		}
		System.out.println("=======일반 반복문=========");
		
		for(int[] i : arr) {
			for(int j:i) {
				System.out.println(j);
			}
		}
		System.out.println("=======enhanced for=========");
		
		//문제1) 가로의 각각의 합
		int [] result = {0,0,0};
		int cnt = 0;
		for(int[] i : arr) {
			for(int j:i) {
				result[cnt]+=j;
			}
			cnt++;
		}
		System.out.println("총합");
		for(int i:result) System.out.println(i);
		
		//문제2) 세로의 각각의 합
		int [] result1 = {0,0,0};
		cnt = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				result1[i] = arr[i][j];
			}
		}
		

	}
	
}
