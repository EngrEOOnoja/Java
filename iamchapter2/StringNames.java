import java.util.Scanner;
  public class StringNames{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter name :");
	String name1 = input.next();
	System.out.print("Enter Score :");
	int number1 = input.nextInt();
	System.out.print("Enter name :");
	String name2 = input.next();
	System.out.print("Enter Score :");
	int number2 = input.nextInt();
	System.out.print("Enter name :");
	String name3 = input.next();
	System.out.print("Enter Score :");
	int number3 = input.nextInt();	
	
		
	if(number1 > number2 && number1 > number3){
	System.out.printf("My name is %s My score is %d%n", name1, number1);}
	else if (number2 > number1 && number2 > number3){
	System.out.printf("My name is %s My score is %d%n", name2, number2);}
	else {System.out.printf("My name is %s My score is %d%n", name3, number3);}
	
	if (number1 < number2 && number1 > number3) {
	System.out.println("My name is" + name1 + "My score is " + number1);}
	else if (number1 > number2 && number1 < number3)  {
	System.out.printf("My name is %s My score is %d%n", name1, number1);}

	else if (number2 < number1 && number2 > number3){
	System.out.printf("My name is %s My score is %d%n", name2, number2);}
	else if (number2 > number1 && number2 < number3){
	System.out.printf("My name is %s My score is %d%n", name2, number2);}
	
	else if (number3 < number2 && number3 > number1) {
        System.out.printf("My name is %s My score is %d%n", name3, number3);}
	else if (number3 > number2 && number3 < number1) {
        System.out.printf("My name is %s My score is %d%n", name3, number3);}
	
	if (number1 < number2 && number1 < number3) {
	System.out.printf("My name is %s My score is %d%n", name1, number1);}
	else if (number2 < number1 && number2 < number3){
	System.out.printf("My name is %s My score is %d%n", name2, number2);}
	else {System.out.printf("My name is %s My score is %d%n", name3, number3);}
}
}