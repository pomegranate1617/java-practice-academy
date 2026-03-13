package ch04;

public class Q4 {
//함수(메서드) 선언(declaration),정의 (definition)
	//메서드 명은 tt,2개의 실수형 파라미터를 받아서 boolean타입으로 반환
	//기능은 첫번째 파라미터가 두번째 파라미터 값보다 크면 true반환 그렇지 않으면 false반환
	public static boolean tt(float a,float b) {
		if(a>b) return true;
		return false;
	}	
		
	public static	void main(String[]args) {
		float[] arr={11.3f, 12.6f,34.5f, 88.9f,123.7f,99.56f};//실수형 배열에 선언과 동시에 초기화(initialization)
		int[] result=new int[arr.length];//정수를 저장할 수 있는 배열공간 확보(arr배열의 크기 만큼)
		boolean[] resultBoolean=new boolean[arr.length];//boolean타입을 저장할 수 있는 공간확보(arr배열의 크기 만큼)
		float sum0=0.0f;//실수형 변수 선언
		float sumX=0.0f;//실수형 변수 선언
		for(int i=0;i<arr.length;i++) {//i가 증가혀면서 배열의 크기 만큼 반복함
			boolean v=tt(arr[i],67);
			if(v) {//위에서 선언한 tt함수 호출(call)시 배열에서 하나씩 꺼내어 첫번째 인자로 전달하고
				//두번째 인자는 67을 고정하여 전달하고 결국67보다 큰 데이터는 true가 반환되어 돌아올것이고
				//그렇지 못한것은 false가 반환되어 돌아올것이고 조건문(if)을 만족하는 배열에서 데이터가 67보다 클 경우네는
				sum0+=arr[i]*2;//해당 데이터에 2를 곱한  결과를 sum0의 이전 값에 누적
			}else {
				sumX+=arr[i]*2;//그렇지 않을 경우 2를 곱한 결과를 sumㅌ의 이전 값에 누적
			}
			resultBoolean[i]=v;//여기서도tt함수를 호출하여 반환되는 값을 resultBoolean배열의 
			//대응되는 index의 위체에 true또는 false중의 하나를 저자함
			result[i]=(int)(sum0+sumX);//위에서 누전된 값(sum0와sumX)를 더한결과가 실수이므로 정수형 배열에 
			//저장하기 위해 정수로 casting(형변환) 하여 저장함
			//결론적으로 result 배열에는 뒤로 갈수록 더 큰수가 저장됨
			
			//위의 코드를 상세하게 주석을 달고 resultBoolean과 result값을 반복문을 이용하여 출력하세요
			//enhanced for과 일반 반복문 둘다 사용함
		//일
		} 
			 
			for(int i =0;i<arr.length;i++) {
				System.out.println(resultBoolean[i]+","+result[i]);
			}
			for(boolean i:resultBoolean)System.out.println(i);
			for(int i:result)System.out.println(i);
			
		
			
			
		}
		
			
}

