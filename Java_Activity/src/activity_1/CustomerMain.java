package activity_1;
import java.util.*;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details:");
		String[] arrofStr=sc.nextLine().split(",");
		//for(String a:arrofStr)
			//System.out.println(a);
		c.setname(arrofStr[0]);
		c.setaddress(arrofStr[1]);
		c.setmobile(arrofStr[2]);
		
		System.out.println("Name: "+c.getname());
		System.out.println("Address: "+c.getaddress());
		System.out.println("Mobile: "+c.getmobile());

	}

}
