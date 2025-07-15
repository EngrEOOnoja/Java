import java.util.Scanner;
public class TwoIntegers {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter 1st Integer : ");
int Number1 = input.nextInt();
System.out.print("Enter 2nd Integer : ");
int Number2 = input.nextInt();

    Number1 = Number1 * Number2;
    Number2 = Number1 / Number2;
    Number1 = Number1 / Number2;

System.out.printf("1st Integer = : %d%n",  Number1);
System.out.printf("2nd Integer = : %d%n",  Number2);

}
}