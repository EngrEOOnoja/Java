import java.util.*;
public class GuessNumber{
public static void main (String[] args){
Random guess = new Random();
Scanner input = new Scanner(System.in);
System.out.print("Enter Lucky Guess : ");
int random = guess.nextInt();
int number = input.nextInt();


	while(random != number){
	if (random == number){
	System.out.println("Correct Guess");
	}else 
	if (random < number) {
	System.out.println("Incorrect guess too low Try again");
	System.out.print("Enter Lucky Guess : ");
	number = input.nextInt();
	}else
	if (random > number) {
	System.out.println("Incorrect guess too high Try again");
	System.out.print("Enter Lucky Guess : ");
	number = input.nextInt();
	}

  

}

}

}