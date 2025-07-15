import java.util.Scanner;

public class Energy {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Initial Temperture 'C : ");
double Number1 = input.nextDouble();
System.out.print("Enter Final Temperture 'C : ");
double Number2 = input.nextDouble();
System.out.print("Enter Weight of water in KG : ");
double Number3 = input.nextDouble();

double constant = 4184;
double Energy = Number3 * (Number2 - Number1) * constant;

System.out.printf("Energy in joules is = : %.1f%n", Energy);
  }
}