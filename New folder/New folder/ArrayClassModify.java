import java.util.Scanner;
public class ArrayClassModify{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int[] scores = new int[5];
		
		/**scores[0]=50;
		scores[1]=43;
		scores[2]=23;
		scores[3]=73;
		scores[4]=26;*/

		
	int i = 0;
	for(;i < 5;i++){
	System.out.println("Enter digit");
	scores[i] = input.nextInt();
			
	}
	System.out.println(scores[1]);
	
	
	}

}