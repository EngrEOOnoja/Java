import java.util.Arrays;
public class ArrayTry{
	public static void main (String[] args){
	int [] find = {2,3,4,5,6,4,2,3,2,2,2,2,89,2};
	int fluk = 2;
	int result = arrayFinders(find, fluk);
	System.out.println(result);
}



	public static int arrayFinders(int[] find, int fluk ){
		int counter = 0;
		for(int i = 0; i < find.length; i++){
			if(fluk == find[i]){
				counter++;		
			}	
		}
			return counter;	

		}

 }