package ch03;

public class IndDeopEx {

	public static void main(String[] args) {
		//p82
		int x=10;
		int y=10;
		int z;
		
		x++;//후위 연산자
		++x;//전위 연산자
		
		System.out.println("x=" +x);
		System.out.println("===========");
		
		y--;
		--y;
		System.out.println("y="+y);
		System.out.println("======");
		
		z=x++;//후위 연산자 대입을 먼저하고 자기 자신을 나중에 증가
		System.out.println("z=" +z+",x="+x);
		
		z=++x;//전위 연산자 자기 자신을 증가 시키고 나중에 대입
		System.out.println("z=" +z+",x="+x);
		
		z= ++x+y++;
		System.out.println("z="+z+",y="+y+",x="+x);
		x=1000;
		y=1000;
		int z2=0;
		//문1)
		for(int i=1;i<10;i++) {
			z=++x;
			z2=x--;//
			y=++x;//x=1000 x=1001 y=1001
			z=--x;
			System.out.println("x="+x+",y="+y+"z="+z+",z2" +z2);
		}
	

	}

}
