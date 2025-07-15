import java.util.Scanner;

public class RunWayLength {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Acceleration m/s^2 : ");
double Number1 = input.nextDouble();
System.out.print("Enter Speed m/s : ");
double Number2 = input.nextDouble();

double speed = Number2 * Number2;
double lenght =  speed/(2*Number1);

System.out.printf("Run Way Length = : %.3f%n", lenght);
  }
}


