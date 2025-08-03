import java.util.Scanner;
public class DaysWeek{

	public static void main(String... args) {
		//String name = demo("Sadiq", "Samuel");
		displayMenu();
		//System.out.print(name);
	}

	/*public static void infinity() {
		System.out.println("1");
		infinity();
	}*/

	/*public static String demo(String firstName, String secondName) {
		return (firstName + "  " + secondName);
	} */

	public static void displayMenu() {
		Scanner input = new Scanner(System.in);
		String menu = """
			1. Monday
			2. Tuesday
			3. Wednesday
			4. Thursday
			5. Friday
			6. Saturday
			7. Sunday
		""";
		System.out.println(menu);
		System.out.print("> ");
		int answer = input.nextInt();
		switch (answer) {
			case 1: getDay("Monday"); break;

			case 2: getDay("Tuesday"); break;

			case 3: getDay("Wednesday"); break;

			case 4: getDay("Thursday"); break;

			case 5: getDay("Friday"); break;

			case 6: getDay("Saturday"); break;

			case 7: getDay("Sunday"); break;
		}
	}

	
	public static void getDay(String day) {
		Scanner input = new Scanner(System.in);
		System.out.println(day + "\n0. back");
		int answer = input.nextInt();
		if (answer == 0) {
			displayMenu();
		}
	}
}
		
	
}