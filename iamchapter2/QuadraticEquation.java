import java.util.Scanner;

public class QuadraticEquation {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Number1(a): ");
double a = input.nextDouble();
System.out.print("Enter Number2(b): ");
double b = input.nextDouble();
System.out.print("Enter Number3(c): ");
double c = input.nextDouble();

double determinant = b * b - 4 * a * c;


double X1 = (-b + ( Math.sqrt( determinant )))/2*a;
double X2 = (-b - ( Math.sqrt( determinant )))/2*a;

if (determinant < 0){
System.out.print("No Real root it");
}
else {
    if (determinant == 0) {
   System.out.print("X1 = X2 = : " + X1);
}
else {
System.out.printf("The X1 is = : %.2f%n", X1);
System.out.printf("The X2 is = : %.2f%n", X2);}
}   
  }
}