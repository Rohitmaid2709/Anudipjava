public class Producer {
 private int availableProduct=70;
 synchronized public void demand(int d) 
 {
	if (availableProduct<d) 
	{
		System.out.println("Available products are "+availableProduct);
		System.out.println("Your demand is : "+d+"\nSo wait for some time!");
		try
		{
			wait();  

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	availableProduct-=d;
	System.out.println("Your order has been placed!");
}
 synchronized public void supply(int s) {   

		availableProduct+=s;
		System.out.println("Now available products are : "+availableProduct);
		notify();  

}
}