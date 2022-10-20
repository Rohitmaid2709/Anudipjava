public class ThreadMain {

	public static void main(String[] args) { 
     FiboReverse ac=new FiboReverse();   
		Thread1 th1=new Thread1 (ac);   
		Thread2 th2=new Thread2(ac);   
		th1.start();    
		th2.start();   
	}

}