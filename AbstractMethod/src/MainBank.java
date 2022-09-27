
public class MainBank 
{
	public static void main(String args[])
	{    
		    
		SBI SB=new SBI(); 
		System.out.println("Rate of Interest SBI Bank is: "+SB.RateOfInterest()+" %");
		Axis AX=new Axis(); 
		System.out.println("Rate of Interest Axis Bank is: "+AX.RateOfInterest()+" %");
		
		HDFC HC=new HDFC(); 
		System.out.println("Rate of Interest HDFC Bank is: "+HC.RateOfInterest()+" %");
		}}   

