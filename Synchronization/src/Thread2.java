
public class Thread2 extends Thread{ //Th2 thread
	private FiboReverse ac;
	public Thread2() {
		super();
		
	}
	public Thread2(String name) {
		super(name);
		
	}
	public Thread2(FiboReverse ac) {  //Th2 parameterized constructor setting object of activity
		super();
		this.ac = ac;
	}
	
  public void run() {  //run method
  ac.reverseNos();   //calling reverse no
    }
public FiboReverse getAc() {
	return ac;
}
public void setAc(FiboReverse ac) {
	this.ac = ac;
}
}
