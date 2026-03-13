package c;

public class Red {
	
	
	private int dodo;
	private int popo;
	private String yudo;
	private float tongtong;
	
	boolean turi(int u)  {
		String a="";
		for(int i=0;i<u;i++) {
			a+="홍길동";
			
			
		}
		if(a.length()%4==0) return true;
		else return false;
				

	}
	int getDodo(){return this.dodo;}
	int getPopo(){return this.popo;}
	String getYudo(){return this.yudo;}
	float getTongtong(){return this.tongtong;}
       
  void setDodo(int dodo) {
	  this.dodo=dodo;
  }
  void setPopo(int popo) {
	  this.popo=popo;
  }
  void setYudo(String yudo){
	  this.yudo=yudo;
  }
  void setTongtong(float tongtong) {
	  this.tongtong=tongtong;
  }
  
  


}
