package activity_4;
import java.util.*;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ODIMatch odi;
		T20Match t20_match;
		TestMatch test_match;
		int ch;
		do {
		System.out.println("\nEnter the match format\n\n1. ODI\n2. T20\n3. Test");
		ch=sc.nextInt();
		switch(ch) {
		case 1:odi=new ODIMatch();
			   System.out.println("Enter the Current score");
			   odi.setCurrentscore(sc.nextInt());
			   System.out.println("Enter the Current Over");
			   odi.setCurrentover(sc.nextFloat());
			   System.out.println("Enter Target Score");
			   odi.setTarget(sc.nextInt());
			   double rr=odi.calculateRunRate();
			   int balls=odi.calculateBalls();
			   odi.display(rr, balls);
			   break;
		case 2:t20_match=new T20Match();
			   System.out.println("Enter the Current score");
			   t20_match.setCurrentscore(sc.nextInt());
			   System.out.println("Enter the Current Over");
			   t20_match.setCurrentover(sc.nextFloat());
			   System.out.println("Enter Target Score");
			   t20_match.setTarget(sc.nextInt());
			   double runr=t20_match.calculateRunRate();
			   int ball_s=t20_match.calculateBalls();
			   t20_match.display(runr, ball_s);
			   break;
		case 3:test_match=new TestMatch();
			   System.out.println("Enter the Current score");
			   test_match.setCurrentscore(sc.nextInt());
			   System.out.println("Enter the Current Over");
			   test_match.setCurrentover(sc.nextFloat());
			   System.out.println("Enter Target Score");
			   test_match.setTarget(sc.nextInt());
			   double run_r=test_match.calculateRunRate();
			   int bal_s=test_match.calculateBalls();
			   test_match.display(run_r, bal_s);
		       break;	   
		
		
		}
		}while(ch==1||ch==2||ch==3);
	}

}
