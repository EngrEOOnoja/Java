import java.util.Scanner;

public class TempretureWater {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Initial Temperture 'C : ");
double Number1 = input.nextDouble();
System.out.print("Enter Final Temperture 'C : ");
double Number2 = input.nextDouble();
System.out.print("Enter Weight of water in KG : ");
double Number3 = input.nextDouble();

double constant = Number3 * (Number2 - Number1) constant;
double meter = 0.0254 * Number1;

double bodymassindex = kilo / (meter * meter) ;

System.out.printf("BMI is = : %1.4f%n", bodymassindex); 
  }
}