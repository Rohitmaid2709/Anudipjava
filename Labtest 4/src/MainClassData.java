

public class MainClassData
{
	public class Main {
		public static void main(String[] args) {
			System.out.println("Employee Details : ");
			Employee e=new Employee();
			
			//setting details of employee
			e.setName("Mahesh Dahele");
			e.setAge(21);
			e.setPhoneNumber("7767876617");
			e.setAddress("Aurangabad,PIN code-431001");
			e.setSalary(30000);
			e.setSpecialization("Machanical Eng");
			
			//getting details of employee
			System.out.println("Name : "+e.getName());
			System.out.println("Age : "+e.getAge());
			System.out.println("Phone No. : "+e.getPhoneNumber());
			System.out.println("Address : "+e.getAddress());
			System.out.println("Specialization : "+e.getSpecialization());
			e.printSalary();
			
			System.out.println("\nManager Details : ");
			Manager m=new Manager();
			
			//setting details of manager
			m.setName("Shubham Dahale");
			m.setAge(21);
			m.setPhoneNumber("7385751222");
			m.setAddress("Ambad, jalna, PIN code-431204");
			m.setSalary(80000);
			m.setDepartment("Technical");
			
			//getting details of manager
			System.out.println("Name : "+m.getName());
			System.out.println("Age : "+m.getAge());
			System.out.println("Phone No. : "+m.getPhoneNumber());
			System.out.println("Address : "+m.getAddress());
			System.out.println("Specialization : "+m.getDepartment());
			m.printSalary();
		}

	}}
