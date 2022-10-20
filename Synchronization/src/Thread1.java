
public class Thread1 extends Thread{ 
	private FiboReverse ac;
	public Thread1() {
		super();
	}
	public Thread1(String name) {
		super(name);
		
	}
	public Thread1(FiboReverse ac) { 
		super();
		this.ac = ac;
	}
	
     public void run() { 
	 ac.fibonacci(); 
     }
 }