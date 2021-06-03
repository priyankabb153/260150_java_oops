package activity_1;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		e.setname(sc.nextLine());
		System.out.println("Enter Address:");
		e.setaddress(sc.nextLine());
		System.out.println("Enter Mobile:");
		e.setmobile(sc.nextLine());
		
		System.out.println("Employee Details");
		System.out.println("Name: "+e.getname());
		System.out.println("Address: "+e.getaddress());
		System.out.println("Mobile: "+e.getmobile());
		

	}

}
