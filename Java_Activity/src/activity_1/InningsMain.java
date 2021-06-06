package activity_1;
import java.util.*;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Innings in=new Innings();
		System.out.println("Enter the team name:");
        in.setteamname(sc.nextLine());
        System.out.println("Enter session");
        in.setinningsname(sc.nextLine());
        System.out.println("Enter runs:");
        int x=sc.nextInt();
        if(x>0) {
        	 in.setruns(x);
        	 in.displayInningsDetails();
        }
        else {
        	System.out.println("Invalid output");
        }

       sc.close();
        
        
        

	}

}
