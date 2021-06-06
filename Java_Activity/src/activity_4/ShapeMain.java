package activity_4;
import java.util.*;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq;
		Scanner sc=new Scanner(System.in);
		Circle c;
		String s;
		do {
			System.out.println("Circle\nSquare\nEnter the Shape");
			s=sc.nextLine();
			switch(s) {
				case "Circle":c=new Circle();
				              System.out.println("Enter the radius");
			                  c.calculateArea(sc.nextInt());
			                  break;
				case "Square":sq=new Square();
							  System.out.println("Enter the radius");
							  sq.calculateArea(sc.nextInt());
							  break;
							  
			}
			sc.nextLine();  
		}while(s.equals("Square")||s.equals("Circle"));

	}

}
