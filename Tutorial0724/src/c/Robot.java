package c;

import java.util.ArrayList;
import java.util.List;

public class Robot {
	private List<String> list=new ArrayList<>();//8개의 문자열추가
	
	Robot(List<String> list){
		this.list=list;
	}

	void setList(List<String> list) {this.list=list;}
	
	List<String> getList(){return this.list;}

}
	
	
			

