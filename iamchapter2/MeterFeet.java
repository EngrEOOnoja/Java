import java.util.Scanner;

public class MeterFeet {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Lenght in feets : ");
double Number1 = input.nextDouble();

double constant = 0.305;

double meters = constant * Number1;


System.out.printf("Feets in Meters = : %.4f%n", meters);
  }
}