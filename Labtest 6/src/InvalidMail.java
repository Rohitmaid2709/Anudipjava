import java.util.Scanner;
import java.util.regex.Pattern;

public class InvalidMail {
		public class Main {

			public static void main(String[] args) {
				Scanner s1=new Scanner(System.in);
				String string=s1.next();
				validateEmail_id(string);
				s1.close();
				}
			public static void validateEmail_id(String s) {
				boolean b=Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in)", s);
				System.out.println(b);
				try {
					if (b==false) {
						throw new InvalidMail();
					}
					System.out.println("Email-Id : "+s);
				}catch (InvalidMail ie) {
					System.out.println("Invalid email-id!");
				}finally {
			        System.out.println("Thank You!");
				}
				
				
			}

		}
	}

}
