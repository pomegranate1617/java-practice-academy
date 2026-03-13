package b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//p660
		Map<String, Integer> map = new HashMap<>();
		int [] data = {85,90,80,95};
		String [] str = {"신용권", "홍길동", "동장군", "홍길동"};
		//객체 저장
		for(int i=0; i<4; i++) {
			map.put(str[i], data[i]);
		}
		//만약에 key가 같으면 기존데이터가 삭제되고 새로 추가된다.
		System.out.println(map);
		String k1 = "홍길동";
		System.out.println(map.get(k1)); //홍길동 => 95
		Set<String> keys = map.keySet();
		Iterator<String> keyIterator = keys.iterator(); //키를 반복하기 위한 반복자(Iterator)를 얻음
		while(keyIterator.hasNext()) { //다음 요소가 없으면 null이 되고 null이 아닌 동안 반복
			String k = keyIterator.next(); //다음 요소로 이동(포인터(주소)가 다음 주소로 이동)
			int v = map.get(k);
			System.out.println("{k:"+k+"=value:"+v+"}");
		}
		keys = map.keySet();
		for(String i : keys) {
			System.out.println(map.get(i));
		}

	}

}
