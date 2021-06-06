package activity_2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	    TwoWheeler tw;
	    FourWheeler fw;
		//Vehicle[0]=new TwoWheeler();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:fw=new FourWheeler();
				   System.out.println("Vehicle Make:");
				   sc.nextLine();
				   fw.setMake(sc.nextLine());
				   System.out.println("Vehicle  Number:");
				   fw.setVehicleNumber(sc.nextLine());
				   System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				   int c=sc.nextInt();
				   if(c==1) {
					   fw.setFuelType("Petrol");
				   }
				   else {
					   fw.setFuelType("Diesel");
				   }
				   System.out.println("Fuel Capacity:");
				   fw.setFuelCapacity(sc.nextInt());
				   System.out.println("Engine CC:");
				   fw.setCc(sc.nextInt());
				   System.out.println("Audio System:");
				   sc.nextLine();
				   fw.setAudioSystem(sc.nextLine());
				   System.out.println("Number of Doors");
				   fw.setNumOfDoors(sc.nextInt());
				   System.out.println("***"+fw.getMake()+"***");
				   fw.displayBasicInfo();
				   fw.displayDetailInfo();
				   
				   
			      
				  break;
			case 2:tw=new TwoWheeler();
			       System.out.println("Vehicle Make:");
			       sc.nextLine();
			       tw.setMake(sc.nextLine());
			       System.out.println("Vehicle  Number:");
				   tw.setVehicleNumber(sc.nextLine());
			       System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			       int x=sc.nextInt();
			       if(x==1) {
				      tw.setFuelType("Petrol");
			       }
			       else {
				      tw.setFuelType("Diesel");
			       }
			      System.out.println("Fuel Capacity:");
			      tw.setFuelCapacity(sc.nextInt());
			      System.out.println("Engine CC:");
			      tw.setCc(sc.nextInt());
			      System.out.println("kickStartAvailable(yes/no):");
			      sc.nextLine();
			      String y=sc.nextLine();
			      if(y.equals("yes")) {
			    	  tw.setKickStartAvailable(true);
			      }
			      else {
			      tw.setKickStartAvailable(false);
			      }
			      System.out.println("***"+tw.getMake()+"***");
			      tw.displayBasicInfo();
			      tw.displayDetailInfo();

				  break;
				  
			
			 
			}
			
			
		}while(ch==1||ch==2);

	}

}
