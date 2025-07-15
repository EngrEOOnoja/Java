import java.util.Scanner;
  public class RockPaperScisors{
  public static void main(String[] args){
	int comp = (int)(Math.random()*3);
	Scanner input = new Scanner(System.in);
	System.out.print("Enter scissor(0), Enter Rock (1), Enter Paper (2) :");
	int choice = input.nextInt();
	
	if (choice < 0 && choice > 2){
	System.out.println("Invalid input");}
		else if (comp == choice) {
		System.out.println("Scissors");
		}
		else if (comp == choice) {
		 System.out.println("Rock");	
		}
		else if (comp == choice) {
		 System.out.println("paper");	
		}

		else {System.out.println("incorrect Computer was" + "  " + comp);}


	}
}