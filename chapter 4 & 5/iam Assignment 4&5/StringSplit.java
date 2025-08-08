import java.util.Arrays;
public class StringSplit{
public static void main(String[] args){

	String message = "I LOVE PROGRAMMING";
	String [] result = message.split(" \\s*");

	System.out.println(Arrays.toString(result));

}


}

