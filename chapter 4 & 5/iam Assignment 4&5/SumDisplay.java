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
int rate = input.nextInt();
System.out.print("Enter Principal : ");
int principal = input.nextInt();
int rate in months = (rate/100)/12;
int durationinmonths = duration/12;


int monthlypayment = principal*( rate in months * ((1 + rate in months) Math.pow( durationinmonths)) / (((1 + rate in months) Math.pow(durationinmonths))-1);

	System.out.print("The Monthly Intrest Payment is  : " + monthlypayment);
}
}