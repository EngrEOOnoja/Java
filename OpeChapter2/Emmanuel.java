import java.util.Scanner;
 public class Emmanuel {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter 5 Digit :");
   int number = input.nextInt();
//using the tenth-thousand, thousand, hundred, tens, unit to pick out the digit.

    int digit1 = (number / 10000);
    int digit2 = (number % 10000)/1000;
    int digit3 = (number % 1000)/100;
    int digit4 = (number %100)/10;
    int digit5 = (number %10)/1;

if (number > 99999 && number < 10000) {
  System.out.println("Wrong, please enter a Five digit");
}

  else { 
       System.out.printf("The Digit are = %d%n%d%n%d%n%d%n%d%n" digit1, digit2, digit3, digit4, digit5); 
	}

	}
}