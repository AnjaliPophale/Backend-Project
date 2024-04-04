package findAreaCircle;
import java.util.*;
public class CalculateCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner xyz = new Scanner(System.in);
      float r,area,pi=3.14f;
   
      System.out.println("Enter the Area of Circle");
      r=xyz.nextFloat();
      area=pi *r*r;
      System.out.printf("Area of circle is :%f\t",area);
      
	}

}
