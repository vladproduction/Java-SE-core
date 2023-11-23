package vladproduction.com.practice_cases.Void_methods;

public class MainReturnVoid {
	
	public static void printString(String valueToPrint){
		System.out.println("<<-"+valueToPrint+"->>");
	}

	public static void main(String[] args) {
		//printString("this is the string that i want to print.");
		printString("Hello world");
	}
}