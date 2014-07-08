import java.util.Scanner;

public class helloJasmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the new folks!");
		System.out.println("Where's the wine?");
		// whatever I type here is ignored by the computer
		//we are going to make a Scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter our name --> ");
		//make a variable, call it name, it hold words
		//then take what use types in, and store in name
		//strongly typed language
		//means you have to declare your variables
		String name = scan.next();
		System.out.println("Welcome to Tuesday " + name + "!");
		if (name.equals("Georgetta"))
			System.out.println("Love your earrings!");
		else if (name.equals("Ria"))
			System.out.println("Happy bleated birthday!");
		else
			System.out.println("Introduce your self!");
				
	}

}
