import java.util.Scanner;
public class GradeCounter {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter 1st Number");
int Number1 = input.nextInt();
System.out.print("Enter 2nd Number");
int Number2 = input.nextInt();
System.out.print("Enter 3rd Number");
int Number3 = input.nextInt();
System.out.print("Enter 4th Number");
int Number4 = input.nextInt();
System.out.print("Enter 5th Number");
int Number5 = input.nextInt();

int highest = Number1;
if (Number2 > highest) highest = Number2;
if (Number3 > highest) highest = Number2;
if (Number4 > highest) highest = Number2;
if (Number5 > highest) highest = Number2;

int smallest = Number1;
if (Number2 < smallest ) smallest = Number5;
if (Number3 < smallest ) smallest = Number5;
if (Number4 < smallest ) smallest = Number5; 
if (Number5 < smallest ) smallest = Number5; 

System.out.printf("Largest is = : %d%n", highest);
System.out.printf("Smallest is = : %d%n", smallest);

}
}