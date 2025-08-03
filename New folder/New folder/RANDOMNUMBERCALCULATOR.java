import java.util.*;
public class RandomNumberCalculator{
public static void main(String[] args){
Random guess = new Random();
int number1 = guess.nextInt();
int number2 = guess.nextInt();
Scanner input = new Scanner(System.in);
System.out.print("Enter Answer"); 
int answer = input.nextInt();

int correct = 0;
int incorrect = 0;
counter = 0;
while(counter <= 10)
if (number1 + number2 = answer){
	System.out.print(number1 + number2);
	correct++;
	System.out.print("Correct Score :" correct);}
else{ incorrect++;
	System.out.print("Incorrect Score :" incorrect);


}

}