import java.util.Scanner;
public class Nokia3310v3ForwardPrac {
public static void main (String... args){
	mainMenu();
	 }

public static void mainMenu(){
	Scanner input = new Scanner(System.in);
	System.out.print ("""

	Welcome to your Nokia Phone.
	

	List of menu Functions.
	
	1. PhoneBook.
	2. Messages.
	3. Chat.
	4. Call Register.
	5. Tones.
	6. Settings.
`	7. Call Dirvert.
	8. Games.
	9. Calculator.
	10. Reminder.
	11. Clock.
	12. Profiles.
	13. Sim Service.

	"""); 
	int menup = input.nextInt();
	switch (menup){
	case 1 : phoneBook();subphoneBook(); break;
	case 2 : getMenu ("Messages."); break;
	case 3 : getMenu ("Chat."); break;
	case 4 : getMenu ("Call Register."); break;
	case 5: getMenu ("Tones."); break;
	case 6: getMenu ("Settings."); break;
	case 7: getMenu ("Call Dirvert"); break;
	case 8: getMenu ("Games."); break;
	case 9: getMenu ("Calculator."); break;
	case 10: getMenu ("Reminder."); break;
	case 11: getMenu ("Clock."); break;
	case 12: getMenu ("Profiles."); break;
	case 13: getMenu ( "Sim Service."); break;
	default: System.out.print("ENTER VALID INPUT");
	}
}

	public static void getMenu(String mainMenu){
	Scanner input = new Scanner(System.in);
	System.out.println(mainMenu + "\n16. back");
	int menu = input.nextInt();
	if (menu == 16){
	mainMenu();
	}
	}
	
	public static void phoneBook(){
	
	System.out.println("""
	1 : Search 
	2 : Service Number
	3 : Add Name
	4 : Erase
	5 : Edit
	6 : Assign tone
	7 : Send Bcard
        8 : Options
	9 : Speed dails
	10 : Voice tags
	0 : Go back to menu 
	""");
	Scanner input = new Scanner(System.in);	
	int phone = input.nextInt();
	switch(phone){
	case 1: getPhone("Search"); break;
	case 2: getPhone("Service Number"); break;
	case 3: getPhone("Add Name"); break;
	case 4: getPhone("Erase"); break;
	case 5: getPhone("Edit"); break;
	case 6: getPhone("Assign tone"); break;
	case 7: getPhone("Send Bcard"); break;
	case 8: getPhone("Options"); break;
	case 9: getPhone("Speed dails"); break;
	case 10: getPhone("Voice tags"); break;
	case 0: mainMenu();break;
	
}
	}
	public static void getPhone(String subMenu){
	Scanner input = new Scanner(System.in);
	System.out.println(subMenu + "\n16. back");
	int menu = input.nextInt();
	if (menu == 16){
	mainMenu();
	}
	}
	
	
	public static void subphoneBook(){
	System.out.println("""
		1:Type of view
		2:Memory status
	""");
	Scanner input = new Scanner(System.in);
	int subphone = input.nextInt();
	switch (subphone){
		case 1: getOption("Type of view");break;
		case 2: getOption("Memory status");
		default: System.out.print("enter valid input");
		}
	}
	public static void getOption(String subphoneBook){
	Scanner input = new Scanner(System.in);
	System.out.println(subphoneBook + "\n12. back" + "\n16. MainMenu.");
	int phone = input.nextInt();
	if (phone == 16){
	mainMenu();
	}
	if (phone == 12){
	 phoneBook();
	}


	}


}


