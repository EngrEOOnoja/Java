import java.util.Arrays;

public class ArrayDuplicate{
public static void main(String[] args){
	   int[] pull = {1, 2, 2, 3, 4, 5, 6, 2, 2, 2};
        int number = 2;
        int result = returnArray(pull, number);
        System.out.println(result);

}



public static int returnArray(int [] pull, int number){

	int counter = 0;
for(int i = 0; i < pull.length; i++){
if (number == pull[i]){
counter++;}

}
return counter;
}
}













