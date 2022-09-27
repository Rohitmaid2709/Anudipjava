
public class Triangle implements Polygon
{
          public Triangle (int length,int width,int height) {
        	  super();
        	  this.length=length;
        	  this.width=width;
        	  this.height=height;
        	  
        	  
          }
          public Triangle() {
        	  super();
          }
          int length;
          int width;
          int height;
          
	@Override
	public void getArea() {
		System.out.println("Area of Triangle"+(width*height)/2);
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Triangle"+(length+height+width)/2);
	}

}
