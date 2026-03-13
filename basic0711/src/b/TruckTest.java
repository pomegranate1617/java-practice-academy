package b;

public class TruckTest {

	public static void main(String[] args) {
		Truck truck=new Truck();
		truck.setColor(3);
		truck.setData(23);
		truck.setDriver("신소리");
		
		String v=truck.getDriver()+":"+truck.getData()+",색상"+truck.getColor();
		
		System.out.println(v);
		
		int u= truck.pow(4, 2);
		System.out.println(u);
		
		

	}

}
