public class Demand extends Thread{
private Producer p1;
public Demand(Producer p1) { 
		super();
		this.p1 = p1;
	}

public Demand() {   
		super();
		}

public Demand(String name) {   
		super(name);
	}
public void run(){  
	p1.demand(500);  
}

}