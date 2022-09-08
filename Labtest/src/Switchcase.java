
public class Switchcase 
{
	  public static void main(String[] args) 
      {
        int n1=2;
        int n2=3;
        char Op='+';
        switch(Op)
         {
          case '+': System.out.println("Add of two Number :"+(n1+n2));
                              break;
          case  '-': System.out.println("Sub of two Number :"+(n1-n2));
                               break;
          case '*': System.out.println("Mul of two Number :"+(n1*n2));
                               break;
           case '%': System.out.println("per of two Number :"+(n1%n2));
                               break;
           case '/': System.out.println("div of two Number :"+(n1/n2));
                               break;
             default:System.out.println("error");
          }
          }
}

