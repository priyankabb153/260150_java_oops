package activity_1;

import java.util.Scanner;

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e=new Employe();
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
		int ch;
		do {

		System.out.println("Verify and Update the details:");
		System.out.println("Menu\n1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All the information correct/Exit");
		ch=sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Current name is: "+e.getname());
		        System.out.println("Enter the name:");
		        sc.nextLine();
		        e.setname(sc.nextLine());
		        break;
		case 2: System.out.println("Current address is: "+e.getaddress());
                System.out.println("Enter the address:");
                sc.nextLine();
                e.setaddress(sc.nextLine());
                break;
		case 3: System.out.println("Current mobile no is: "+e.getmobile());
		        System.out.println("Enter the mobile:");
		        sc.nextLine();
		        e.setmobile(sc.nextLine());
		        break;
		case 4:	 System.out.println("The Details are:");
		         System.out.println("Name: "+e.getname());
		         System.out.println("Address: "+e.getaddress());
		         System.out.println("Mobile: "+e.getmobile());
		        
		}
		
		}while(ch!=4);
	}

}
