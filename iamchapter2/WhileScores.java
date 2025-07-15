import java.util.Scanner;
  public class WhileScores{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Score :");
	int number1 = input.nextInt();
	System.out.print("Enter Score :");

	int number2 = input.nextInt();


	int count = 1;	
	int largest = number1;
	int secondL = number2;
	while(count < 4) {
	count++;
	System.out.print("Enter Score :");
	int number3 = input.nextInt();
	

	
	
	if (number2 > largest && number2 > number3)
	largest = number2;
	else if (number3 > secondL && number3 > largest)
	largest = number3;
	else if (number1 > number3 && number)
	else if ((number3 < largest && number3 > secondL) || (number3 > largest && number3 < secondL))
	number3 = secondL;
	else largest = number1;
	}
	System.out.println("Largest :" + largest);
	System.out.println("SecondL :" + secondL);

}
}