import java.util.Scanner;
public class EvenNumberFunction{
public static void main (String[] args ){
/*Scanner input = new Scanner(System.in);
System.out.print("Enter Integer :");
int digit1 = input.nextInt();
System.out.print("Enter Integer :");
int digit2 = input.nextInt();*/
	squareNumber();
}
	public static void evenNumber(){
	Scanner input = new Scanner(System.in);
	int digit = input.nextInt();
	if (digit % 2 == 0)
	System.out.println("True");
	else System.out.println("Flase");
	}
	
	public static void primeNumber(){
	Scanner input = new Scanner(System.in);
	int digit = input.nextInt();
	if(digit % 2 = 0;|| digit % 3 = 0;digit % 4 = 0;digit % 2 = 0;digit % 2 = 0;digit % 2 = 0;digit % 2 = 0;}


	public static int subtractNumber(int a, int b){
	return Math.abs(a - b);
	}

	public static double divideNumber(int a, int b){
	if (b == 0)
	return(0);
	else
	return (a / b);
		}

	public static int factorNumber(int a){
	int factor = 0;
	for( int i = 1; i <= a ; i++){
	if(a % i == 0)
	factor++;} 
	return (factor);}



	public static void squarertNumber(){
	Scanner input = new Scanner(System.in);
	double digit = input.nextInt();
	double square = Math.sqrt(digit);
	if(digit % square == 0)
	System.out.print("True");
	else System.out.print("False");
	}


	
	public static void palindromeNumber(){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Digit : ");
        int number1 = input.nextInt();

	
	int digit1 = (number1 / 10000);
	int digit2 = (number1 % 10000)/1000;
	int digit3 = (number1 % 1000) / 100;
	int digit4 = (number1 % 100) / 10 ;
	int digit5 = (number1 % 10)/1;

	int parliduome = ((digit5 * 10000) + (digit4 * 1000) + (digit3 * 100) + (digit2 * 10) + (digit1 * 1)); 
	
	
	if (number1 < 10000 || number1 > 99999) {
	System.out.print("Invalid Input");
	}

	else if (number1 - parliduome == 0) {
	System.out.print("True");
	}

	
	else {
	System.out.printf("False");
	}
	}
	
	public static void factorialNumber(){
	Scanner input = new Scanner(System.in);
	long digit = input.nextInt();
	long factor = 1;
	for(long i = digit ;  i >= 1;  i--)
	factor = factor * i;
	System.out.print(factor);
	}
	
	public static void squareNumber(){
	Scanner input = new Scanner(System.in);
	int digit = input.nextInt();
	int square = digit * digit ;
	System.out.print(square);
	}

}