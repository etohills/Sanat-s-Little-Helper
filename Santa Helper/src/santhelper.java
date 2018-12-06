import java.text.*;
import java.util.*;
public class santhelper {
	static String iString; //generic input string
	static String iFirstName, iLastName, iFirstToy, iSecondToy; //First and lastName 
	static double cToy1; //Toy 1 
	static String oToy1; // toy 1 for format
	
	static double cToy2; //toy 2 after conversion
	static String oToy2;
	
	static double cSub; //calculated pay
	static String oSub; //pay after formatting for currency display
	static double cTAX;
	static String oTAX;
	static double Total;
	static String oTotal;
	static Scanner myScanner; //input devices
	static NumberFormat nf; //used to format Currency: use a number class called NumberFormat...can rename it to anything
	
	public static void main (String[] args) {
		//call INIT() 
		init();
		
		//call input
		input();
		
		//call calculations()
		calcs();
	
		//call output
		output();
		
	
	System.out.println("Program ending, have a Merry Christmas!");
	}
	
	public static void init () {
		//set scanner to the console 
		myScanner = new Scanner(System.in);
		//change delimiter from the blank space to enter key
		//To allow spaces in strings
		myScanner.useDelimiter(System.getProperty("line.separator"));
		
		//set formatter to use U.S currency format
		nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);
		
		//THIS WILL STAY THE SAME WITH BASICALLY ALL PROJECTS!!
	}

	public static void input () {
		//prompt for first Name 
		System.out.print("Enter First Name: ");
		iFirstName = myScanner.next();
		
		//prompt for Last Name 
		System.out.print("Enter Last Name: ");
		iLastName = myScanner.next();
		
	
		//prompt for first toy
		System.out.print("Enter Name of First Toy: ");
		iFirstToy = myScanner.next();
				
			

	
	try {	
		//prompt, input and convert Toy1
		System.out.print("Enter First Toy Price:");
		iString = myScanner.next();
		cToy1 = Double.parseDouble (iString);
			}
		
		
		
	catch (Exception e) { 
		System.out.println("Toy Price must be a any decimal or integer values!!");
		cToy1 = 0;
	};
	

		//prompt for first toy
	   System.out.print("Enter Name of Second Toy: ");
	   iSecondToy = myScanner.next();
	 		
	
	
	
	
	
	try {	//prompt, input and convert Toy1
		System.out.print("Enter Second Toy Price:");
		iString = myScanner.next();
		cToy2 = Double.parseDouble (iString);
			}
		
		
		
	catch (Exception e) { 
		System.out.println("Toy Price must be a any decimal or integer values!!");
		cToy2 = 0;
	};
	
	}
	public static void calcs () {
		//calculates
		cSub = cToy1 + cToy2;
		cTAX = cSub * 0.07;
		Total = cSub + cTAX;
		
	}
	public static void output () {
		//display name as last, first
		System.out.println("Name: " + iFirstName + " " + iLastName);
		
		
		oToy1 = nf.format(cToy1);
		System.out.println("Toy 1"+" " + "(" + iFirstToy + ")" + "is :" + " " +  " "+  oToy1 );
		
		
		oToy2 = nf.format(cToy2);
		System.out.println("Toy 2"+" " + "(" + iSecondToy + ")" + "is :" + " " +  " "+  oToy2 );
		
		//format ad out pay
		
		oSub = nf.format(cSub);
		System.out.println("Subtotal is:" + oSub);
		
		//format TAx
		//oTAX = nf.format(cTAX);
		String numberAsString = String.format ("%,.2f", cTAX);
		System.out.println("Tax is:" + "$" + numberAsString);
		
				
		//format Total  Bill
		//oSub = nf.format(cSub);
		String OutPutString = String.format ("%,.2f", Total);
		System.out.println("Total Bill is:" + "$" +  OutPutString   );
	}
}



