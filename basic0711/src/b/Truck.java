package b;

public class Truck {

		private int color;
		private int data;
		private String driver;	
		
		int getColor(){return this.color;}
		int getData() {return this.data;}
		String getDriver() {return this.driver;}
		
		void setColor(int color) {this.color=color;}
		void setData(int data) {this.data=data;}
		void setDriver(String driver) {this.driver=driver;}
		
		int pow(int a,int b) {
			int result=1;
			for(int i=0;i<b;i++) {
				result *=a;
			}
			return result;
		}
		
		
}
		
		
