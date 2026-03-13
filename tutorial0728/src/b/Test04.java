package b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test04 {
	

	public static void main(String[] args) {
		Peach[] peaches= {
				new Peach(23,"홍길동",3.4f,45.6),
				new Peach(123,"변길동",13.4f,145.6),
				new Peach(223,"강감찬",32.4f,475.6),
				new Peach(243,"홍말자",34.4f,455.62),
				new Peach(273,"최수종",39.4f,45.63),
				new Peach(231,"하희라",399.4f,45.67)
		};
		Arrays.asList(peaches).stream().map(i->i.getName()).forEach(i->System.out.println(i));
		
		//문1)stream을 사용하지말고 우리가 모른다고 가정할때 peaches에서 이름만 가져와라
//		Peaches(int a,String b,float c,double d);<<틀린문법;;
//		String b="";
//		for(int i=0;i<6;i++) {
//		System.out.println(b);}
		
		//방법1)for(Peach i:peaches)System.out.println(i.getName());
		List<String>strList=new ArrayList<>();//<방법2
		for(Peach i:peaches) {
			strList.add(i.getName());
		}
		//1)이름과  nana를 결합하고 결합한 문자열의 길이가 짝수인것과 홀수 인것을 구분하고
		List<String> even =Arrays.asList(peaches).stream().map(i->i.getName()+i.getNana())
						.filter(i->i.length()%2==0).collect(Collectors.toList());
						
		List<String> odd =Arrays.asList(peaches).stream().map(i->i.getName()+i.getNana())
		.filter(i->i.length()%2==1).collect(Collectors.toList());				
		
		
		//입력되는 데이터의 갯수와 출력되는 데이터의 갯수가 동일한 것을 만들어내기 위해 사용한다
		//[1,2,3,4].map(i->i*3)//이면 결과가 [3,6,9,12]가 만들어진다
		
		//1)이름과 nana를 결합하고 결합한 문자열의 길이가 짝수 인것과 홀수 인것을 구분하고
		//1)stream +map사용
		Map<String,List<String>> mapOfList=new HashMap<>();
		mapOfList.put("짝수",even);
		mapOfList.put("홀수",odd);
		System.out.println(mapOfList);
		
		Map<String,List<String>> mapOfListGeneral=new HashMap<>();
		mapOfListGeneral.put("짝수",new ArrayList<String>());
		mapOfListGeneral.put("홀수",new ArrayList<String>());
		
		
		for(Peach i: peaches) {
			if((i.getName()+i.getNana()).length()%2==0) {
				mapOfListGeneral.get("짝수").add(i.getName()+i.getNana());
				
			}else {
				mapOfListGeneral.get("홀수").add(i.getName()+i.getNana());//빈리스트부터 데이터 하나씩 추가
			}
		}System.out.println(mapOfListGeneral);
		
		//{"짝수":["홍길동3.4f","하희라399.4f"],"홀수":["변길동13,4","강감찬32.4"]}형식으로 만들기
//		Array.asList(peaches).stream().map(i->i.getName(+i.getNana()
//					.filter(i->i.length()%2==1).collect(collectors.toList());
		
//		for(Peach i:peaches) {
//			String name="";
//			if(peaches.getName%2==0) return 짝수;
//			else return 홀수;
//		}
//		if(peaches.getName=="짝수")System.out.println("짝수:[,"+peaches.getName+","+peaches.getv);
//		Array.asList(peaches).stream().map(i->i.getname()).
//		strList.forEach(i->System.out.println(i));
		
	}

}
