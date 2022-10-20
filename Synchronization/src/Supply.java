public class Supply extends Thread{ 
	private Producer p1;     
	public Supply(Producer p1) {  
			super();
			this.p1 = p1;
		}

	public Supply() {  
			super();
			}

	public Supply(String name) {   
			super(name);
		}
	public void run(){   
		p1.supply(700);  
  }
}