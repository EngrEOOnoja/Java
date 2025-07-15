import java.util.Scanner;

public class AreaOfTriangle {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter x1, y1 : ");
double Number1 = input.nextDouble();
double Number2 = input.nextDouble();
System.out.print("Enter x2, y2 : ");
double Number3 = input.nextDouble();
double Number4 = input.nextDouble();
System.out.print("Enter x3, y3 : ");
double Number5 = input.nextDouble();
double Number6 = input.nextDouble();

double side1 = Math.sqrt(((Number3 - Number1)*(Number3 - Number1)) + ((Number4 - Number2)*(Number4 - Number2)));
double side2 = Math.sqrt(((Number5 - Number3)*(Number5 - Number3)) + ((Number6 - Number4)*(Number6 - Number4)));
double side3 = Math.sqrt(((Number5 - Number1)*(Number5 - Number1)) + ((Number6 - Number2)*(Number6 - Number2)));

double S = (side1 + side2 + side3)/2;

double area = Math.sqrt(S*((S-side1)*(S-side2)*(S-side3)));


System.out.printf("The Area is = : %.3f%n", area);   
  }
}