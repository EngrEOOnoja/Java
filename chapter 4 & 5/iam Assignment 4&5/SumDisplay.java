import java.util.Scanner;
public class SumDisplay{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int digit1;
int digit2;
int digit3;

do{
	System.out.print("Enter Integer1 :");
	digit1 = input.nextInt();
	System.out.print("Enter Integer2 :");
	digit2 = input.nextInt();
	int sum = digit1 + digit2;

	System.out.println("The Sum is : " + sum);
	System.out.print("Enter 1 to continue :");
	digit3 = input.nextInt();	
	} while (digit3 == 1);
	int sum = digit1 + digit2;
	System.out.print("The Sum is : " + sum + " Thank you");

}
}