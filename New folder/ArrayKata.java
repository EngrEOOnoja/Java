import java.util.Arrays;
public class ArrayKata{
public static int maximumIn(int digit[]){
	int index = 0;
	int highest = digit[index];
	for(index = 0; index < digit.length; index++){
	if(digit[index] > highest){
	highest = digit[index];
	}	
	}

return highest;

		}

public static int minimumIn(int digit[]){
	int index = 0;
	int lowest = digit[index];
	for(index = 0; index < digit.length; index++){
	if(digit[index] < lowest){
	lowest = digit[index];
	}	
	}
return lowest;

		}


public static int sumOf(int digit[]){
	int index = 0;
	int sum = 0;
	for(index = 0; index < digit.length; index++){
	sum += digit[index];	
	}	
	
	return sum ;

		}

public static int sumOfEvenNumbersIn(int digit[]){
	int index = 0;
	int sum = 0;
	for(index = 0; index < digit.length; index++){
	if (digit[index] % 2 == 0){
	sum += digit[index];	
	}
	}	
	
	return sum ;

		}



public static int sumOfOddNumbersIn(int digit[]){
	int index = 0;
	int sum = 0;
	for(index = 0; index < digit.length; index++){
	if (digit[index] % 2 != 0){
	sum += digit[index];	
	}
	}	
	
	return sum ;

		}
		
		
		
		
public static int [] maximumAndMinimum(int digit[]){
	int index = 0;
	int highest = digit[index];
	int lowest = digit[index];
	for(index = 0; index < digit.length; index++){
	if(digit[index] > highest){
	highest = digit[index];
	}
	else if (digit[index] < lowest){
	lowest = digit[index];
		}
	}	
	return new int [] {highest, lowest};

		}



public static int evenNumbersIn(int digit[]){
	int index = 0;
	int even = 0;
	for(index = 0; index < digit.length; index++){
	if (digit[index] % 2 == 0){
	even++;	
	}
	}	
	
	return even ;

		}
		
		
public static int oddNumbersIn(int digit[]){
	int index = 0;
	int odd = 0;
	for(index = 0; index < digit.length; index++){
	if (digit[index] % 2 != 0){
	odd++;	
	}
	}	
	
	return odd ;

		}

public static int [] evenNumbersPrint(int [] digit){
	int even = 0;
	for (int index = 0; index < digit.length; index++){
	if (digit[index] % 2 == 0){
	even++;	
	}
		}
	int count = 0;	
	int evenNumber [] = new int [even];
	for(int index = 0; index < digit.length ; index++){
	if (digit[index] % 2 == 0){
	evenNumber[count++] = digit[index];
			}
	}	
	return evenNumber;	
				}
				
				
	public static int [] oddNumbersPrint(int [] digit){
	int odd = 0;
	for (int index = 0; index < digit.length; index++){
	if (digit[index] % 2 != 0){
	odd++;	
	}
		}
	int count = 0;	
	int oddNumber [] = new int [odd];
	for(int index = 0; index < digit.length ; index++){
	if (digit[index] % 2 != 0){
	oddNumber[count++] = digit[index];
			}
	}	
	return oddNumber;	}
	
	
	public static int [] squareNumbersPrint(int [] digit){
	int count = 0;	
	int square [] = new int [digit.length];
	for(int index = 0; index < digit.length ; index++){
	square[count++] = digit[index] * digit[index];
		}	
	return square;	
				}


	
	
	
					
public static void main(String[] args){
	 int [] digit = {7,4,6,6,9,7,4,66,8,7,1,6};
	 int result = maximumIn(digit);
	 System.out.println(result);
	 int result2 = minimumIn(digit);
	 System.out.println(result2);
	 int result3 = sumOf(digit);
	 System.out.println(result3);
	 int result4 = sumOfEvenNumbersIn(digit);
	 System.out.println(result4);
	 int result5 = sumOfOddNumbersIn(digit);
	 System.out.println(result5);
	 int [] result6 = maximumAndMinimum(digit);
	 System.out.println(Arrays.toString(result6));
	 int  result7 = evenNumbersIn(digit);
	 System.out.println(result7);
	 int result8 = oddNumbersIn(digit);
	 System.out.println(result8);
	 int [] result9 = evenNumbersPrint(digit);
	 System.out.println(java.util.Arrays.toString(result9));
	 int [] result10 = oddNumbersPrint(digit);
	 System.out.println(java.util.Arrays.toString(result10));
	 int [] result11 = squareNumbersPrint(digit);
	 System.out.println(java.util.Arrays.toString(result11));



}
				}

