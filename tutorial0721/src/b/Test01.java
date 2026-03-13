package b;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3,4},
				{11,34,67,89},
				{111,341,671,891},
				{1101,341,6711,8911}
		};
		List<List<Integer>> listOfList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			List<Integer> list = new ArrayList<>();
			for(int j=0; j<arr[0].length; j++) {
				list.add(arr[i][j]);
			}
			listOfList.add(list);
		}
		
		for(int [] i:arr) {
			for(int j:i) {
				System.out.println(j);
			}
			System.out.println("=========================");
		}
		System.out.println("=====listOfList 출력=====");
		for(List<Integer> r : listOfList) {
			for(int j:r) System.out.println(j);
				System.out.println("=========================");
			}
		}
}
