
public class Nestedwhileloo 
{
	 public static void main(String[] args)
     {
     int table = 1;
     int x = table;
     while (x <= 10)
        {
        int y = table; 
        while (y <= 5) 
        {
        System.out.print(x*y + "\t\t");
        y+=1;
        }
        System.out.println();
        x+=1; 
        }
        }
}
