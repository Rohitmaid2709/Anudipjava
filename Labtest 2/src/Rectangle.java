
public class Rectangle 
{
	int length;
	int breadth;
	
	    Rectangle(int l, int b) 
	    {
		length =l;
		breadth=b;
	    }
	
	    void area() 
	    {
		System.out.println("Area of Rectangle="+length*breadth);
	    } 
	public static void main(String[] args) {
		Rectangle r= new Rectangle(2,2);
		r.area();
		
	}
}




