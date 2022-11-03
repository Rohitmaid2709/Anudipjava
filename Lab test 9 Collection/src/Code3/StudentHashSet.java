package Code3;

import java.util.HashSet;

import Code1.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet<>();
		Student s1=new Student(1,"Rohit", "9326270270");
		Student s2=new Student(2,"Mahesh","7365453311");
		Student s3=new Student(3,"Balu","1234567890");
		Student s4=new Student(4,"Shubham","0987654321");
		Student s5=new Student(5,"Om","9898765432");
		Student s6=new Student(6,"veer","0987654567");
		hset.add(s1);
		hset.add(s3);
		hset.add(s6);
		hset.add(s5);
		hset.add(s4);
		hset.add(s2);
		for (Student student : hset) {
			if (student.getSid()>3) {
				System.out.println(student);
			}
		}  
  }
}