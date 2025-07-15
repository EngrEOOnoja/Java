import java.util.Scanner;
  public class ConditionalStatement{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter age :");
	int age = input.nextInt();

	System.out.println((age >= 16)? "ticket = 20" : "ticket = 10");
	
	}
}