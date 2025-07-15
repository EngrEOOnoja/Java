import java.util.Scanner;
   public class GuessOne{
	public static void main(String[]args){
	
 	int number = (int) (Math.random() * 1001);	
	Scanner input = new Scanner(System.in);
	
	int guess = -1;
	while (guess != number) {
	System.out.print(Enter Number from 0 - 1000);
	guess = input.next.Int;

	if (guess == number) {
	System.out.print("Yes Correct Guess");
	}
	else if (guess > number) {
	System.out.print("Guess too high");
	}
	else System.out.print("guess is too low");
}
	


	}
}