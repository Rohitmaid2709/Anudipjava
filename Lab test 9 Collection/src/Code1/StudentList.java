package Code1;


import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	public static ArrayList<Student> l1;
	public static ArrayList<Student> l2;
	public static void main(String[] args) {
		fillLists();
		printList();
	}
	
	public static void fillLists() {
		l1=new ArrayList<>();
		l2=new ArrayList<>();
		Student s1=new Student(1, "Rohit", "9326270270");
		Student s2=new Student(2,"Mahesh","7365453311");
		Student s3=new Student(3,"Balu","1234567890");
		Student s4=new Student(4,"Shubham","0987654321");
		Student s5=new Student(5,"Om","9898765432");
		Student s6=new Student(6,"veer","0987654567");
		l1.add(s1);
		l1.add(s3);
		l1.add(s2);
		l2.add(s4);
		l2.add(s6);
		l2.add(s5);
		
	}

	public static void printList() {
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println("Sorting by Student Id\n");
		System.out.println(l1);
		System.out.println(l2);
		Collections.sort(l1, new NameComparator());
		Collections.sort(l2, new NameComparator());
		System.out.println("\nSorting by Student name\n");
		System.out.println(l1);
		System.out.println(l2);
		
	}

}