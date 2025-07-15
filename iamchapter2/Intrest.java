import java.util.Scanner;

public class Intrest {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter balance : ");
double Number1 = input.nextDouble();
System.out.print("Enter annual intrest rate : ");
double Number2 = input.nextDouble();
long constant = 1200; 

double intrest = Number1 * (Number2 / constant);


System.out.printf("Next month intrest is = : %1.5f%n", intrest); 
  }
}