import java.util.Scanner;

 public class IntergerOddEven {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter interger: ");	
   double Number1 = input.nextInt();
   double Number2 = input.nextInt();
   double Number3 = input.nextInt();
   double Number4 = input.nextInt();
   double Number5 = input.nextInt();
   double Number6 = input.nextInt();
   double Number7 = input.nextInt();
   double Number8 = input.nextInt();
   double Number9 = input.nextInt();
   double Number10 = input.nextInt();

    double Even = 0;
    double Odd = 0;

  
    if (Number1 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number1 % 2 != 0) {
     Odd = Odd +1; 
    }   

    if (Number2 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number2 % 2 != 0) {
     Odd = Odd +1;
    }   

    
    if (Number3 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number3 % 2 != 0) {
     Odd = Odd +1;
    }   

    if (Number4 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number4 % 2 != 0) {
     Odd = Odd +1;
    }   

    if (Number5 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number5 % 2 != 0) {
     Odd = Odd +1;
    }   

    if (Number6 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number6 % 2 != 0) {
     Odd = Odd +1;
    }   

    if (Number7 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number7 % 2 != 0) {
     Odd = Odd +1;
    } 
  
    if (Number8 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number8 % 2 != 0) {
     Odd = Odd +1;
    }   

    if (Number9 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number9 % 2 != 0) {
     Odd = Odd +1;
    }   
    if (Number10 % 2 == 0) { 
     Even = Even +1;
    }

    if (Number10 % 2 != 0) {
     Odd = Odd +1;
    }   

   
    System.out.printf("Sum of Odd Numbers = %.2f%n",  Odd);
    System.out.printf("Sum of Even Numbers = %.2f%n", Even);

	}
}