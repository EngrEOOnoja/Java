import java.util.Scanner;
public class SumInteger {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Integer : ");
int Number1 = input.nextInt();

int sum1 = (Number1/1000);
int sum2 = (Number1%1000)/100;
int sum3 = (Number1%100)/10;
int sum4 = (Number1%10)/1;

int sum = (sum1 + sum2 + sum3 + sum4 );

if (Number1 < 1001 && Number1 > -1) {
    System.out.println("Sum of Integer is = " + sum );
    }

if (Number1 > 1000 || Number1 <  0) {
    System.out.println("Number Not within range = "+ Number1);
    }    

  }
}