import java.util.*;
 
 public class LargestSecond {
  public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);
    
	System.out.print("Enter Integer :");
	 double Number1 = input.nextDouble();
	System.out.print("Enter Integer :");
	 double Number2 = input.nextDouble();
	System.out.print("Enter Integer :");
	 double Number3 = input.nextDouble();
	System.out.print("Enter Integer :");
	 double Number4 = input.nextDouble();
	System.out.print("Enter Integer :");
	 double Number5 = input.nextDouble();

	
       double Largest = Number1;
       double Secondlargest = -2147483648;
	
	if (Number2 > Largest ) Largest = Number2;
	 
	if (Number3 > Largest ) Largest = Number3; 
	 
	if (Number4 > Largest ) Largest = Number4;
	
	if (Number5 > Largest ) Largest = Number5;

	 System.out.printf("Largest  is %1.2f%n", Largest);

             

	if(Number1 < Largest && Number1 > Secondlargest) Secondlargest = Number1;
	
	if(Number2 < Largest && Number2 > Secondlargest) Secondlargest = Number2;
	
	if(Number3 < Largest && Number3 > Secondlargest) Secondlargest = Number3;
	 
	if(Number4 < Largest && Number4 > Secondlargest) Secondlargest = Number4;
	
	if(Number5 < Largest && Number5 > Secondlargest) Secondlargest = Number5;

        System.out.printf("Secondlargest is %1.2f%n", Secondlargest);
	
	}
}