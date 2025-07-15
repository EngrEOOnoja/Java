import java.util.Scanner;

public class ConvertPounds {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter pounds : ");
double Number1 = input.nextDouble();

double kilograms = Number1 * 0.454;


System.out.printf("The kilograms is = : %1.3f%n", kilograms); 
  }
}