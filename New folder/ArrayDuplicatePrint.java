import java.util.Arrays ;

public class UniqueArrayValue{

public static int [] returnUniquelnArray(int [] values){

	int [] request = {1,2,2,3,4,5};
	System.out.print(Arrays.toString(returnUniqueInArray(request)));

}



public static int[] returnUniqueInArray(int [] value){

int [] uniqueValue = new int[value.length];
int count = 0;

for(int i = 0; i < value.length; i++){
int counter = 0;

int number = value[i];
if(counter < i){

uniqueValue[count] = number;
count++;
}

}
return uniqueValue;

}


}