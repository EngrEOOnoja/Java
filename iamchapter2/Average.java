import java.util.Scanner;

public class Average {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Vo : ");
double Number1 = input.nextDouble();
System.out.print("Enter V1 : ");
double Number2 = input.nextDouble();
System.out.print("Enter t : ");
double Number3 = input.nextDouble();

double average = (Number2 - Number1)/Number3;

System.out.printf("Average is = : %1.5f%n", average); 
  }
}