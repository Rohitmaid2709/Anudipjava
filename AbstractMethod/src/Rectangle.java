
public class Rectangle implements Polygon
{
   public Rectangle (int length,int breadth) {
	   super();
	   this.length=length;
	   this.breadth=breadth;
	   
   }
   int length;
   int breadth;
   
   public Rectangle()
   {
	   super();
	   
   }
	@Override
	public void getArea() {
		int Area=length*breadth;
		System.out.println("Area of Rectangle"+Area);
		
	}

	@Override
	public void getPerimeter() {
		int para=(length+breadth)*2;
		System.out.println("Area of Triangle"+para);
		
	}    
	
}