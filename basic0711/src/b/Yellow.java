package b;

public class Yellow {
		private int blue;
		private	float red;
		private String block;
		
		int getBlue() {return this.blue;}
		float getRed() {return this.red;}
		String getBlock() {return this.block;}
		
		void setBlue(int blue) { this.blue=blue;}
		void setRed(float red) {this.red=red;}
		void setBlock(String block) { this.block=block;}
		
		String drive(String a,int b) {
			String result="";
			for(int i=0;i<b;i++) {
				result +=a;
			}
			return result;
		}
}
