public class ForloopTriangletry {
public static void main (String[] args) {
	firstIteration();	
	secondStatement();
	
	
	/*System.out.print("*");
	System.out.print("*");
	System.out.print("*");
	System.out.print("*");
	System.out.println();

	System.out.print("*");
	System.out.print("*");
	System.out.print("*");
	System.out.println();

	
	System.out.print("*");
	System.out.print("*");
	System.out.println();

	System.out.print("*");
	System.out.println();*/
	
}
	public static void firstIteration(){
	for(int i = 1; i <= 5; i++){
		for(int j = i; j >= 1; j--)
		System.out.print("*");
		System.out.println();}
	}

	public static void secondStatement(){
	for(int i = 4; i >= 1; i--){
		for(int j = i; j >= 1; j--)
		System.out.print("*");
		System.out.println();}
	}
}