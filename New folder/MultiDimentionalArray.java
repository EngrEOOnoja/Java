import java.util.Arrays;
		
public class MultiDimentionalArray{
public static void main(String [] args){
					
	int [][] high = {{50,10}, {7,9}, {40,10}};
	int result = highestSmallest(high);
	System.out.println(result);
	}	
		
	public static int highestSmallest(int [][] high){
							
	int [][] values = {{50, 10},{7, 9},{40, 10}};
	int highest = values[0][0];
	int lowest = values[0][0];
	for(int row = 0; row  < values.length; row++){
		for(int column = 0; column < values[row].length; column++){
		 if ( values[0][0] > highest){
		 	highest = values[0][0];
		 }
		
		}
		
	System.out.println(Arrays.toString(values[row]));
		
		}
		
		}
	System.out.println(values[0][0]);
	}

		
		
		