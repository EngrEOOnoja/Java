import java.util.Scanner;

public class TimeCount {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Time in (sminutes) : ");
int Number1 = input.nextInt();


int hour = Number1/60;
int days = hour/24;
int year = days/365;

System.out.printf("The year is = : %d%n", year);
  }
}


