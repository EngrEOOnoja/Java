import java.util.Scanner;
public class NokiaFunction{
 public static void main(String[] args){  
	mainMenu();
	phoneBook();

}

	public static int mainMenu(){
   System.out.println( """
	

	Welcome 
			to 
				your 
					Nokia 
						Phone.
	

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
	


	0. Exit.
	""");  

}

	public static void phoneBook(){

		//case 1 :
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
	""");
	Scanner input = new Scanner(System.in);
	int search = input.nextInt();
	switch(search) {
	case 1 : 
	System.out.println("Search");break;

	case 2 :
	System.out.println("Service Number");
	 break;
	
	case 3 :
	System.out.println("Add Name");
	 break;

	case 4 :
	System.out.println("Erase");
	 break;

	case 5 :
	System.out.println("Edit");
	 break;

	case 6 :
	System.out.println("Assign tone");
	 break;
	
	case 7 :
	System.out.println("Send Bcard");
	 break;

	case 8 :
	System.out.println("""
	case 1:Type of view
	case 2: Memory status
	""");
	int type = input.nextInt();
	switch(type){
		case 1:
	System.out.println("Type of view");break;
		case 2:
	System.out.println("Memory status");break;
	default : System.out.println("Enter Correct Input");
	} break;
	

	case 9 :
	System.out.println("Speed Dial");
	 break;
	case 10 :
	System.out.println("Voice tags");
	 break;
	default : System.out.println("Enter Correct Input");break;


}}