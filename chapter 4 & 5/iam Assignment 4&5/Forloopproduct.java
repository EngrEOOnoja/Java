import java.util.Scanner;
public class Forloopproduct{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a Number :");
long number = input.nextLong(); 
long total =1;
for( int i = 1; i <= number  ; i++ ){
	
	if (i % 2 == 0)
	total *= i;
}	
	
	if(number == 0) total = 0;
	System.out.println(total);
}

}