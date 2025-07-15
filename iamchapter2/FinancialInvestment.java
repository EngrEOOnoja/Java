import java.util.Scanner;

public class FinancialInvestment {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Investment Amount  : ");
double Number1 = input.nextDouble();
System.out.print("Enter Monthly intrest rate : ");
double Number2 = input.nextDouble();
System.out.print("Enter number of years : ");
double Number3 = input.nextDouble();


double result2 = (double)Math.pow((1 + (Number2/12)), (Number3*12));

double FutureInvestmentPlan = Number1 * (result2);


System.out.printf("Future Investment Plan is = : %.2f%n", FutureInvestmentPlan);
  }
}


