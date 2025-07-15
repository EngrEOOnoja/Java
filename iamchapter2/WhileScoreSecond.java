import java.util.Scanner;
 public class WhileScoreSecond{
 public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Score");
	int score1 = input.nextInt();
	
	int largest = score1;
	int count = 0;
	int  secondlargest = -2147483648;
	
	
	while(count < 5){
	System.out.print("Enter Score");
	score1 = input.nextInt();
	if (score1 > largest) {
	largest = score1;}
	if (score1 < largest && score1 > secondlargest)
	secondlargest = score1;
	count++;
	}

	System.out.println("Largest is = : " + largest);
	System.out.println("SecondLargest is = : " + secondlargest);



	}

}