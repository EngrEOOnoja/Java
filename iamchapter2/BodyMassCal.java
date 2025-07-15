import java.util.Scanner;

public class BodyMassCal {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter height in inches : ");
double Number1 = input.nextDouble();
System.out.print("Enter weight in pounds : ");
double Number2 = input.nextDouble();

double kilo = 0.45359237 * Number2;
double meter = 0.0254 * Number1;

double bodymassindex = kilo / (meter * meter) ;

System.out.printf("BMI is = : %1.4f%n", bodymassindex); 
  }
}