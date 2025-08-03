//Write a java program that promts the user to enter a number, the type of operation(+,-,*,/) and a seecond number The program must execute the required operation and display the result.

/*import java.util.Scanner;
public class Operation{
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter operand (+,-,/,*) :");
int operand = input.nextInt();
System.out.print("Enter First Digit : ");
int digit1 = input.nextInt();
System.out.print("Enter Second Digit : ");
int digit2 = input.nextInt();

System.out.print(digit1, operand, digit2);

}

}*/

import java.util.Scanner;
public class OperationArithemetic{
public static void main(String[] args){


}

public static void(){
System.out.print("""
		Operands..!
Enter your prefered Option.	
	1. *
	2. /
	3. +
	4. -



	""")

	
Scanner input = new Scanner(System.in);
System.out.print("Enter digit1 :");
int digit1 = input.nextInt();
System.out.print("Enter digit1 :");
int digit2 = input.nextInt();
int operands = input.nextInt();
switch(operands){
	case 1: 
System.out.print(digit1 * digit2);	
	case 2:
System.out.print(digit1 * digit2);
	case 3:
System.out.print(digit1 * digit2);
	case 4:
System.out.print(digit1 * digit2);
}


}
}