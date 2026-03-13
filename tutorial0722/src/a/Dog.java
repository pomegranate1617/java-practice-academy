package a;

import java.util.List;

public class Dog {
	
	public boolean contains(int [] a, int data) {
		boolean r = false;
		for(int i : a) {
			if(i==data) {
				r = true;
				break;
			} 
		}
		return r;
	}

	public boolean contains(List<Integer> a, int data) {
		boolean r = false;
		for(int i:a) {
			if(i==data) {
				r = true;
				break;
			}
		}
		return r;
	}
	
	public int containsCount(List<Integer> a, int data) {
		int cnt = 0;
		for(int i:a) { 
			if(i==data) {
				cnt++;
			}
		}
		return cnt;
	}

}
