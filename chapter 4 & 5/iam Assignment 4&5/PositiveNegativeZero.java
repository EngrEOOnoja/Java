import java.util.Scanner;
public class PositiveNegativeZero{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Interger or -1 to exit");
int integer = input.nextInt();

int positive = 0;
int negative = 0;
int zero =0;

while (integer != -1){
	System.out.println("Enter Interger or -1 to exit");
	integer = input.nextInt();
	if (integer < 0)
	negative++;
	if (integer == 0)
	zero++;
	if (integer < 0)
	positive++;

	}
System.out.println("Positive Integer are : " + positive);
System.out.printf("Negative Integer are : %d%n ", negative);
System.out.println("Zero Integer are : " + zero);
}
}