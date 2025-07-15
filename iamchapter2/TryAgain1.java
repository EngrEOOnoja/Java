import java.util.Scanner;
public class TryAgain1 {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter Interger :");
int digit1 = input.nextInt();
System.out.print("Enter Interger :");
int digit2 = input.nextInt();
System.out.print("Enter Interger :");
int digit3 = input.nextInt();
System.out.print("Enter Interger :");
int digit4 = input.nextInt();
System.out.print("Enter Interger :");
int digit5 = input.nextInt();

int positive = 0;
int negative = 0;
int zero = 0;


if (digit1 > 0 && digit1 < 100000) {
   positive = positive+1;
   }
if (digit1 < 0 && digit1 > -100000){
   negative = negative +1;
   }
if (digit1 == 0){
  zero = zero +1;
   }

if (digit2 > 0 && digit2 < 100000) {
   positive = positive +1;
   }
if (digit2 < 0 && digit2 > -100000){
   negative = negative +1;
   }
if (digit2 == 0){
  zero = zero +1;
   }

if (digit3 > 0 && digit3 < 100000) {
   positive = positive +1;
   }
if (digit3 < 0 && digit3 > -100000){
   negative = negative +1;
   }
if (digit3 == 0){
  zero = zero +1;
   }

if (digit4 > 0 && digit4 < 100000) {
   positive = positive +1;
   }
if (digit4 < 0 && digit4 > -100000){
   negative = negative +1;
   
if (digit4 == 0){
  zero = zero +1;
   }

if (digit5 > 0 && digit5 < 100000) {
   positive = positive +1;
   }
if (digit5 < 0 && digit5 > -100000){
   negative = negative +1;
   }
if (digit5 == 0){wwaa
  zero = zero +1;
   }

System.out.println("Positive Integer = :" + positive );

System.out.println("Negative Integer = :" + negative );
23
System.out.println("Zero Integer = :"   +  zero );
	}
}