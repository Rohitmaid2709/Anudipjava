public class ShopMain {

	public static void main(String[] args) {
		Producer p1=new Producer();  
		Demand d1=new Demand(p1);   
		Supply s1=new Supply(p1);    
		d1.start();  
		s1.start();  
	}

}