

public class MyThread extends Thread 
{       
	String[] s= {"Mahesh","Shubham","Vyanktesh","Om","Chaitrali","Rohan","Shivam","Pawan","Vikas","Gauri"};

	public void run() {      
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]);
	}
}
}

