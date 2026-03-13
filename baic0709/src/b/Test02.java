package b;

public class Test02 {

	public static void main(String[] args) {
		int [] arr= {11,23,45,67,78};//배열 선언과 동시에 값을 저장
		
		
		arr[0] +=7;//배열arr의0번째값 11을 읽어서 7을 더한 결과를 다시 0번째에 누적한다.
		arr[1] +=7;//배열arr의1번째값 23을 읽어서 7을 더한 결과를 다시 1번째에 누적한다.
		arr[2] +=7;//배열 arr의 2번째값 45을 읽어서 7을 더한 결과를 다시 2번째에 누적한다.
		arr[3] +=7;//배열 arr의 3번째값 67을 읽어서 7을 더한 결과를 다시 3번째에 누적한다.
		arr[4] +=7;//배열 arr의 4번째값 78을 읽어서 7을 더한 결과를 다시 4번째에 누적한다.
		
		System.out.println(arr[0]);//arr[0]에 누적된 결과를 18을 프린트한다.
		System.out.println(arr[1]);//arr[1]에 누적된결과 30을 출력한다.
		System.out.println(arr[2]);//arr[2]에 누적된 결과 52를 출력한다.
		System.out.println(arr[3]);//arr[3]에 누적된 결과 74를 출력한다.
		System.out.println(arr[4]);//arr[4]에 누적된 결과 85를 출력한다.

	}

}
