public class Rectangle {

	int length,breadth;
	
	public Rectangle(int l, int b) {
		length = l;
		breadth=b;
	}
	
	void printarea() {
		System.out.println(length*breadth);
	}
	
	void printperimeter() {
		System.out.println(2*(length+breadth));
	}
public class LabTest{
	public static void main(String[] args) {
		Rectangle r= new Rectangle(2,2);
		r.printarea();
		r.printperimeter();
	}}}