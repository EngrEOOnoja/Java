import java.util.Scanner;
public class PowerNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter 1st Digit  : ");
int digit1 = input.nextInt();
System.out.print("Enter 2nd DIgit : ");
int digit2 = input.nextInt();
int power =1;

while (digit2 != 0){
 power = digit1 * digit2;
power = power * digit2;
digit2--;
}
System.out.println("Power is :" + power);
	

	}
}





