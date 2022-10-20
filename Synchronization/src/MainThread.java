
public class MainThread {  //main class

	public static void main(String[] args) {  
		MyThread th1=new MyThread();  
		MyThread th2=new MyThread(); 
		MyThread th3=new MyThread(); 
		th1.start();      
		th2.start();      
		th3.start();      
	}

}