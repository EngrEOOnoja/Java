import java.util.Scanner;
public class Nokia3310v3Forward {
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
	7. Call Dirvert.
	8. Games.
	9. Calculator.
	10. Reminder.
	11. Clock.
	12. Profiles.
	13. Sim Service.

	"""); 
	int menup = input.nextInt();
	switch (menup){
	case 1 : phoneBook(); break;
	case 2 : messagesMenu(); break;
	case 3 : getMenu("Chat."); break;
	case 4 : callRegister(); break;
	case 5:  tones(); break;
	case 6:  settings(); break;
	case 7:  getMenu("Call Dirvert"); break;
	case 8: getMenu("Games."); break;
	case 9:  getMenu("Calculator."); break;
	case 10: getMenu("Reminder."); break;
	case 11: clock(); break;
	case 12: getMenu("Profiles."); break;
	case 13:  getMenu( "Sim Service."); break;
	default: System.out.print("Enter Valid Option");
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
	0: Main Menu. 
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
	case 8: subphoneBook(); break;
	case 9: getPhone("Speed dails"); break;
	case 10: getPhone("Voice tags"); break;
	case 0: mainMenu();break;
	default: System.out.print("Enter valid input :");	
	}
	}

	public static void getPhone(String subMenu){
	Scanner input = new Scanner(System.in);
	System.out.print(subMenu);
	int menu = input.nextInt();
	}
	
	
	
	public static void subphoneBook(){
	System.out.println("""
		1:Type of view
		2:Memory status
		4 : Main Menu.
		5: PhoneBook.
	""");
	Scanner input = new Scanner(System.in);
	int subphone = input.nextInt();
	switch (subphone){
		case 1: System.out.print("Type of view");break;
		case 2: System.out.print("Memory status");break;
		case 4: mainMenu();
		case 5: phoneBook();
		default: System.out.print("enter valid input");
		}
	}
	
	
	public static void messagesMenu(){

	System.out.println("""
	1.write messages
	2. inbox.
	3. outbox.
	4. picture messages
	5. Templates.
	6. Smileys.
	7. Message Settings
	8. info service
	9. Voice mailbox number
	10. Service command editor	
	""");
	Scanner input = new Scanner(System.in);
	int messageDrop = input.nextInt();
	switch (messageDrop){
	case 1: subMessageMenu("write messages");break;
	case 2: subMessageMenu("inbox.");break;
	case 3: subMessageMenu("outbox");break;
	case 4: subMessageMenu("picture messages");break;
	case 5: subMessageMenu("Templates.");break;
	case 6: subMessageMenu("Smileys.");break;
	case 7: messageSettings();break;
	case 8: subMessageMenu("info service");break;
	case 9: subMessageMenu("Voice mailbox number");break;
	case 10: subMessageMenu("Service command editor");break;
	case 0: mainMenu();
	default: System.out.print("enter valid input");
		}
}
	public static void subMessageMenu(String message){
	Scanner input = new Scanner(System.in);
	System.out.print(message);
	int messageMenu = input.nextInt();
 
	}
		

	public static void messageSettings(){
	System.out.println(""" 
	   1 : set1
	   2 : common
	   4: Main menu
	   5: Previous	
			 """); 

	Scanner input = new Scanner(System.in);
	int getSet = input.nextInt();
	switch(getSet){
	case 1: set();break;
	case 2: common();break;
	case 4: mainMenu();break;
	case 5: messagesMenu();break;
	default: System.out.print("enter valid input");}
	}
	
	public static void getsetting(String set){
	Scanner input = new Scanner(System.in);
	System.out.print(set);
	int setting = input.nextInt();
	}

	public static void set(){
	System.out.println(""" 
		1 : Message centre number
		2 : Message sent as
		3 : Message validity
		4: Main Menu.
		5: Previous.
		""");
	Scanner input = new Scanner(System.in);
	int set = input.nextInt();
	switch(set){
	case 1: subSetting("Message centre number");break;
	case 2: subSetting("Message sent as");break;
	case 3: subSetting("Message validity");break;
	case 4: mainMenu();break;
	case 5: messagesMenu();break;
	default: System.out.print("enter valid input");
	}
	}
	
	public static void subSetting(String outputSet){
	Scanner input = new Scanner(System.in);
	System.out.print(outputSet);
	int setMessage = input.nextInt();
	}
	
	public static void common(){
	System.out.println(""" 
		 1 : Delivery reports
		 2 : Reply via same centre
		 3 : Character support
		4: Main Menu.
		5: Previous.
		"""); 
	Scanner input = new Scanner(System.in);	
	int commonMenu = input.nextInt();
	switch(commonMenu){
	case 1: setCommon("Delivery reports");
	case 2: setCommon("Reply via same centre");
	case 3: setCommon("Character support");
	case 4: mainMenu();break;
	case 5: messagesMenu();
	default: System.out.print("enter valid input");
	}
	}

	public static void setCommon(String common){
	Scanner input = new Scanner(System.in);
	System.out.print(common);
	int commoninput = input.nextInt();
	}

	public static void callRegister(){
	System.out.println("""
		1. Missed calls
		2. Receicved calls
		3. Dialled numbers
		4. Erased recent call lists
		5. Show call duration
		6. Show call cost
		7. Call cost settings
		8. Prepaid credit
		00. Main Menu.
		44. Previous.
		""");

		Scanner input = new Scanner(System.in);
		int call = input.nextInt();
		switch(call){
		case 1: getcallRegister("Missed calls");break;
		case 2: getcallRegister("Receicved calls");break;
		case 3: getcallRegister("Dialled numbers");break;
		case 4: getcallRegister("Erased recent call lists");break;
		case 5: showCallDuration();break;
		case 6: showCallCost();break;
		case 7: callCostSetting();break;
		case 8: getcallRegister("Prepaid credit");break;
		case 00: mainMenu();break;
		case 44: callRegister();break;
		default: System.out.print("enter valid input");
		
		}
		}
		
		public static void getcallRegister(String callReg){
		Scanner input = new Scanner(System.in);
		System.out.print(callReg);
		int display = input.nextInt();
		}	
		
		public static void showCallDuration(){
		System.out.println("""
		  1. Last call duration
		  2. All calls duration
		  3. Received calls duration
		  4. Dialled calls duration
		  5. Clear timers
		  00. Main Menu.
		  99. Previous.
		
		"""); 
		Scanner input = new Scanner(System.in);
		int showCall = input.nextInt();
		switch(showCall){
		case 1: displayshowCall("Last call duration");break;
		case 2: displayshowCall(" All calls duration");break;
		case 3: displayshowCall("Received calls duration");break;
		case 4: displayshowCall("Dialled calls duration");break;
		case 5: displayshowCall("Clear timers");break;
		case 00: mainMenu();break;
		case 99: callRegister();break;
		default: System.out.print("enter valid input");
		}		
	}

		public static void displayshowCall(String showDuration){
		Scanner input = new Scanner(System.in);
		System.out.print(showDuration);
		int duration = input.nextInt();
		}
		
		public static void showCallCost(){
		System.out.println("""
		  1. Last call costs
		  2. All calls duration
		  3. Clear counters
		  4. MainMenu
		  5. Previous
			""");
		Scanner input = new Scanner(System.in);
		int showcost = input.nextInt();
		switch(showcost){
		case 1: displayCost("Last call costs");
		case 2: displayCost("All calls duration");
		case 3: displayCost("Clear counters");
		case 4: mainMenu();break;
		case 5: callRegister();break;
		default: System.out.print("enter valid input");
	}
	}
		public static void displayCost(String callCost){
		Scanner input = new Scanner(System.in);
		System.out.print(callCost);
		int cost = input.nextInt();
		}
		public static void callCostSetting(){
		System.out.println("""
		  1. Call cost limit
		  2. Show costs in
		  3. Main Menu
		  4. Previous
		""");	
		Scanner input = new Scanner(System.in);
		int callSetting = input.nextInt();
		switch(callSetting){
		case 1: displaycallSetting("Call cost limit");break;
		case 2: displaycallSetting("Show costs in");break;
		case 3: mainMenu();break;
		case 4: callRegister();break;
		default: System.out.print("enter valid input");
			}
	}

		public static void displaycallSetting(String callset){
		Scanner input = new Scanner(System.in);
		System.out.print(callset);
		int call = input.nextInt();
		}
		
		public static void tones(){
		System.out.println("""
		1. Ringing tone
		2. Ringing volume
		3. Incoming call alert
		4. Composer
		5. Message alert tone
		6. Keypad tones
		7. Warning and game tones
		8. Vibrating alert
		9. Screen saver 
		00. Main Menu.
		"""); 	
		Scanner input = new Scanner(System.in);
		int  toneSet = input.nextInt();
		switch(toneSet){
		case 1: disPlaytone("Ringing tone");break;
		case 2: disPlaytone("Ringing volume");break;
		case 3: disPlaytone("Incoming call alert");break;
		case 4: disPlaytone("Composer");break;
		case 5: disPlaytone("Message alert tone");break;
		case 6: disPlaytone("Keypad tones");break;
		case 7: disPlaytone("Warning and game tones");break;
		case 8: disPlaytone("Vibrating alert");break;
		case 9: disPlaytone("Screen saver");break;
		case 00: mainMenu();break;
		default: System.out.print("enter valid input");
		}

		}
		
		public static void disPlaytone(String sound){
		Scanner input = new Scanner(System.in);
		System.out.print(sound);
		int callTunes = input.nextInt();
		}


		public static void settings(){
		System.out.println("""
		1. Call settings
		2. Phone settings
		3. Security settings 
		4. Restory factory
		00. Main Menu. 
		default: System.out.print("enter valid input");
		""");
		Scanner input = new Scanner(System.in);
		int theSettings = input.nextInt();
		switch(theSettings){
		case 1: callSetting();break;
		case 2: phoneSetting();break;
		case 3: securitySetting();break;
		case 4: displaySetting("Restory factory");break;
		case 00: mainMenu();break;
		default: System.out.print("enter valid input");
		}	
			}
		public static void displaySetting(String set){
		Scanner input = new Scanner(System.in);
		System.out.print(set);
		int sett = input.nextInt();
		}
		
		public static void callSetting(){
		System.out.println("""
		1. Automatic redial
		2. Speed dialing
		3. Call waiting options
		4. Own number sending
		5. Phone line in use
		6. Automatic answer
		00. mainMenu();break;
		99. Previous.
		 default: System.out.print("enter valid input");
		"""); 
		Scanner input = new Scanner(System.in);
		int setting = input.nextInt();
		switch (setting){
		case 1: displayCallSetting("Automatic redial");break;
		case 2: displayCallSetting("Speed dialing");break;
		case 3: displayCallSetting("Call waiting options");break;
		case 4: displayCallSetting("Own number sending");break;
		case 5: displayCallSetting("Phone line in use");break;
		case 6: displayCallSetting("Automatic answer");break;
		case 00: mainMenu();break;
		case 99: callSetting();break;
		default: System.out.print("enter valid input");
			}
		}
		public static void displayCallSetting(String callSettings){
		Scanner input = new Scanner(System.in);
		System.out.print(callSettings);
		int displayCall = input.nextInt();
		}
		
		public static void phoneSetting(){
		System.out.println("""
		1. Language 
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Lights
		6. Confirm SIM service actions
		00. Main Menu.
		44. Previous.
		default: System.out.print("enter valid input");
		""");
		Scanner input = new Scanner(System.in);
		int phone = input.nextInt();
		switch (phone){
		case 1: displayPhoneSetting("Language ");break;
		case 2: displayPhoneSetting(" Cell info display");break;
		case 3: displayPhoneSetting("Welcome note");break;
		case 4: displayPhoneSetting("Network selection");break;
		case 5: displayPhoneSetting("Network selection");break;
		case 6: displayPhoneSetting("Confirm SIM service actions");break;
		case 00: mainMenu();break;
		case 44: callSetting();break;
		default: System.out.print("enter valid input");
	}
		}
		public static void displayPhoneSetting(String phone){
		Scanner input = new Scanner(System.in);
		System.out.print(phone);
		int setPhone = input.nextInt();
		}
		
		public static void  securitySetting(){
		System.out.println("""
		1. PIN code request 
		2. Call barring service	
		3. Fixed dialling
		4. Closed user group
		5. Phone security
		6. Change access codes
		00. Main Menu.
		99. Previous.
		""");	
		Scanner input = new Scanner(System.in);
		int security = input.nextInt();
		switch(security) {	
		case 1: displaySecuritySetting("PIN code request");break;
		case 2: displaySecuritySetting("Call barring service	");break;
		case 3: displaySecuritySetting("Fixed dialling");break;
		case 4: displaySecuritySetting("Closed user group");break;
		case 5: displaySecuritySetting("Phone security");break;
		case 6: displaySecuritySetting("Change access codes");break;
		case 00: mainMenu();break;
		case 99: callSetting();break;
		default: System.out.print("enter valid input");
		}
	}
		public static void displaySecuritySetting(String security){
		Scanner input = new Scanner(System.in);
		System.out.print(security);
		int phonesecurity = input.nextInt();
	}
		public static void clock(){
		System.out.println("""
		1. Alarm clock
		2. Clock settings
		3. Date setting
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and times
		00. Main Menu.
		""");
		Scanner input = new Scanner(System.in);
		int clock = input.nextInt();
		switch(clock){
		case 1: displayClock("Alarm clock");break;
		case 2: displayClock("Clock settings");break;
		case 3: displayClock("Date setting");break;
		case 4: displayClock("Stopwatch");break;
		case 5: displayClock("Countdown timer");break;
		case 6: displayClock(" Auto update of date and times");break;
		case 00: mainMenu();break;
		default: System.out.print("enter valid input");
		}
		}
		public static void displayClock(String clock){
		Scanner input = new Scanner(System.in);
		System.out.print(clock);
		int clockSet = input.nextInt();
		}
}

