package b;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		int[][][] arr= {
				{{1,2,3,4},{11,22,33,44}},
				{{11,12,13,14},{111,122,133,144}},
				{{21,22,23,24},{211,222,233,244}},
				{{3331,332,333,334},{411,422,343,444}},
				{{166,288,388,499},{1001,2002,3003,4004}}
	
		};
		
		//int cnt = 0;
		List<List<List<Integer>>> listMany = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			List<List<Integer>> listOfList = new ArrayList<>();
			for(int j=0; j<arr[0].length; j++) {
				List<Integer> list = new ArrayList<>();
				for(int k=0; k<arr[0][0].length; k++) {
					list.add(arr[i][j][k]);
					//cnt++;
				}
				listOfList.add(list);
			}
			listMany.add(listOfList);
		}
		
		for(int [][] i : arr) {
			for(int [] j :i) {
				for(int k:j) {
					System.out.println(k);
					//System.out.println(cnt);
				}
			}
		}
		int cnt = 0;
		int cnt_r=0;
		for(List<List<Integer>> r : listMany) { //여기 r에는 3차원 리스트가 있고
			int cnt_rr = 0;
			for(List<Integer> rr:r) { //여기 r에는 2차원 리스트가 있고 2차원 리스트에 1차원 리스트의 개수만큼 반복하고
				//3차원에 2차원 리스트의 갯수만큼 반복하니까 =>1)
				int cnt_rrr = 0;
				for(int rrr : rr) { 
					System.out.println(cnt+"번째 값은 : "+rrr);
					cnt_rrr++;
					cnt++; //총 데이터의 개수
				}
				cnt_rr++; //2차원 리스트에 몇 개의 1차원 리스트가 있는가? =>여기에서 1씩 증가시키면 ==>2
				System.out.println("==="+cnt_rr+"===");
				//System.out.println(cnt);
			}
			cnt_r++; //3차원 리스트에 몇 개의 2차원 리스트가 있는가?
			System.out.println("==="+cnt_r+"===");
		}
		System.out.println();
		//3차원 배열의 데이터의 개수를 확인하는 방법 => cnt로 출력
		
		
	}

}
