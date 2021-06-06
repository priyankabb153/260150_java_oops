package activity_2;
import java.util.*;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DeluxeRoom dr;
		DeluxeACRoom dar;
		SuiteACRoom sur;
		
		
		int ch;
		do {
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:dr=new DeluxeRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   dr.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   dr.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String c=sc.nextLine();
			   if(c.equals("yes")) {
				   dr.setHasTV(true);
			   }
			   else {
				   dr.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String d=sc.nextLine();
			   if(d.equals("yes")) {
				   dr.setHasWifi(true);
			   }
			   else {
				   dr.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+dr.calculateTariff());
		       break;
		
		case 2: dar=new DeluxeACRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   dar.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   dar.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String e=sc.nextLine();
			   if(e.equals("yes")) {
				   dar.setHasTV(true);
			   }
			   else {
				   dar.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String f=sc.nextLine();
			   if(f.equals("yes")) {
				   dar.setHasWifi(true);
			   }
			   else {
				   dar.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+dar.calculateTariff());
		       break;
		case 3: sur=new SuiteACRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   sur.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   sur.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String g=sc.nextLine();
			   if(g.equals("yes")) {
				   sur.setHasTV(true);
			   }
			   else {
				   sur.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String h=sc.nextLine();
			   if(h.equals("yes")) {
				   sur.setHasWifi(true);
			   }
			   else {
				   sur.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+sur.calculateTariff());
		       break;
		      
		
		}
		
		}while(ch==1||ch==2||ch==3);
	}

}
