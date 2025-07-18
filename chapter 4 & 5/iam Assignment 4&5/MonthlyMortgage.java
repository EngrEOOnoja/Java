/*PERCENTAGE = 100
MONTH_IN_YEARS = 12
principal = int(input('Enter principal :'))
duration_in_years = int(input("Enter duration in years : "))
rate_in_years = int(input("Enter_annual_intrest_rate_in_years : ")) 
duration_in_month = duration_in_years * MONTH_IN_YEARS
rate_in_month = (rate_in_years / 100) / MONTH_IN_YEARS
monthly_payment_value =  principal * (rate_in_month * ((1 + rate_in_month) ** duration_in_month)) / (((1 + rate_in_month) ** duration_in_month) - 1)
print(monthly_payment_value)*/


import java.util.Scanner;
public class MonthlyMortgage{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Duration in years : ");
int duration = input.nextInt();
System.out.print("Enter intrest rate in years : ");
double rate = input.nextInt();
System.out.print("Enter Principal : ");
int principal = input.nextInt();
double rateinmonths = (rate/100)/12;
double durationinmonths = duration*12;


double monthlypayment = principal* (rateinmonths * ( Math.pow((1 + rateinmonths), durationinmonths)) / (( Math.pow((1 + rateinmonths), durationinmonths))-1));

	System.out.printf("The Monthly Intrest Payment is   : %.6f%n", monthlypayment);
}
}