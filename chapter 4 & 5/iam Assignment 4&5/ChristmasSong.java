import java.util.Scanner;
public class ChristmasSong{
public static void main(String[] args){
boolean merry = true;
while (merry){

System.out.print("""
		Christmas Carol Songs....!
		1* on the first day of christmas...!
		2* on the first day of christmas...!
		3* on the first day of christmas...!
		4* on the first day of christmas...!
		5* on the first day of christmas...!
		6* on the first day of christmas...!
		7* on the first day of christmas...!
		8* on the first day of christmas...!
		9* on the first day of christmas...!
		10* on the first day of christmas...!
		11* on the first day of christmas...!
		12* on the first day of christmas...!
		13* EXIt ............!


""");

Scanner input = new Scanner(System.in);
System.out.print("Enter an Option :");
int song = input.nextInt();
switch(song){
				case 1:
			System.out.print("""
				My true love gave to me
				A partridge in a pear tree.
				""");break;
		case 2:
			System.out.print("""
				My true love gave to me
				Two turtle doves
				And a partridge in a pear tree.
				""");break;
		case 3:
			System.out.print("""
				My true love gave to me
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.
				""");break;
		case 4:
			System.out.print("""
				My true love gave to me
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.
				""");break;
		case 5:
			System.out.print("""
				My true love gave to me
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.

				""");break;
		case 6:
			System.out.print("""
				My true love gave to me
				Six geese a-laying,
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.
				""");break;
		case 7:
			System.out.print("""
				My true love gave to me
				Six geese a-laying,
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.
				""");break;
		case 8:
			System.out.print("""
				My true love gave to me
				Eight maids a-milking,
				Seven swans a-swimming,
				Six geese a-laying,
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.

				""");break;	
		case 9:	
			System.out.print("""
				My true love gave to me
				Nine ladies dancing,
				Eight maids a-milking,
				Seven swans a-swimming,
				Six geese a-laying,
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.
				""");break;
		case 10:
			System.out.print("""
				My true love gave to me
				Ten lords a-leaping,
				Nine ladies dancing,
				Eight maids a-milking,
				Seven swans a-swimming,
				Six geese a-laying,
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.

				""");break;
		case 11:	
			System.out.print("""
				My true love gave to me
				Eleven pipers piping,
				Ten lords a-leaping,
				Nine ladies dancing,
				Eight maids a-milking,
				Seven swans a-swimming,
				Six geese a-laying,
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.

				""");break;
		case 12:
			System.out.print("""
				My true love gave to me
				Twelve drummers drumming,
				Eleven pipers piping,
				Ten lords a-leaping,
				Nine ladies dancing,
				Eight maids a-milking,
				Seven swans a-swimming,
				Six geese a-laying,
				Five golden rings,
				Four calling birds,
				Three French hens,
				Two turtle doves
				And a partridge in a pear tree.

				""");break;
		case 13:
			if (song < 0 && song > 13)
			System.out.print("Thank you for listening bye ....!");break;

			default :System.out.print("Enter a correct option to sing sweet song");
	
		
		}

}
}
}