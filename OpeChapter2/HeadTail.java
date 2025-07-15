import java.util*;
public class Guess0001 {
public static void main (String[] args) {
 	Random guess = new Randon(2);
	int coin = guess.nextInt();
	Scanner input = new Scanner(System.in);
	int toss = input.nextint();

	if (coin == toss ){
	 System.out.println("Correct");
}
	else {System.out.print("Incorrect")}

}
}