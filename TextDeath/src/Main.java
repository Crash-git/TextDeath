import java.util.*;

public class Main {
	static String name = null;
	static int choice = 0;

	//The main method. Finds your name.
	public static void main(String[] args) {
    System.out.println("Welcome to TextDeath, prepare to die!");
    System.out.println("There is only one way through this game that won't kill you! Can you find it?");
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter your name:");
    name = reader.nextLine();
    System.out.println("You entered: " + name);
    reader.nextLine();
    
    System.out.println("You spawn in a large city. There are many shops that will be added in version 2.0. The weather is clear, and there are many hanging lanterns above you. You can smell - wait, you can't smell. You're just staring at white text.");
    System.out.println("1 = Go out the gravel path");
    System.out.println("2 = Go towards the volcano");
    choice = reader.nextInt();
    reader.nextLine();
    if (choice == 1) {
    	System.out.println("Travelling to the gravel path.");
    	choice = 0;
    	gravel();
    }
    else {
    	System.out.println("Travelling to the volcano.");
    	choice = 0;
    	volcano();
    }
    

	}
//The volcano choice.
	private static void volcano() {
	Scanner reader = new Scanner(System.in);
	System.out.println("You arrive at the volcano. You see birds slowly circling the top. You also see a cave with some straw in front.");
	
	System.out.println("1 = Go to the cave.");
	System.out.println("2 = Continue climbing.");
	System.out.println("3 = Dig in the dirt.");
	choice = reader.nextInt();
	reader.nextLine();
	
	if (choice == 1) {
		System.out.println("To the cave!");
		choice = 0;
		cave();
	}
	else if (choice == 2) {
		System.out.println("You keep climbing.");
		choice = 0;
		climb();
	}
	else {
		System.out.println("You dig in the dirt for a bit, but unearth nothing.");
		choice = 0;
		volcano();
	}
	
}
//The climb choice, from volcano.
	private static void climb() {
    System.out.println("You climb to the top of the volcano. You can finally see what the birds were circling. It's a dead dragon, half buried in the lava. The birds are picking at it. When they see you, they funnel into a cloud and attack. They strip you to the bone.");
    System.out.println("DEAD!!!");
    dead();
		
	}
//The cave choice, from volcano.
	private static void cave() {
    System.out.println("When you enter the cave, you find an old man. He sits beside a fire and a small bed made out of straw. There is a pile of clothes in the corner.");
    System.out.println("The old man tells you to sit, so you sit(respect your elders, kids). He then asks why you have came. You reply, 'It was monday, and I was bored.'");
    System.out.println("1 = Ask old man where to find great treasure.");
    System.out.println("2 = Steal old man's food.");
    Scanner reader = new Scanner(System.in);
    choice = reader.nextInt();
    reader.nextLine();
    if (choice == 1) {
    	System.out.println("You ask the old man where you can get treasure. He responds, 'You must journey to the heart of the forest! LeftRightRightLeftLeft!'");
    	System.out.println("You leave the volcano, and head back to the gravel path that leads into the forest.");
    	choice = 0;
    	gravel();
    }
    else {
    	System.out.println("You attempt to steal the old man's food. However, when you reach for the food, the old man whips out a samurai sword and dices you into pieces. THIEF.");
    	name = "Theif";
    	choice = 0;
    	System.out.println("DEAD!");
        dead();
    }
		
	}
//The gravel path choice.
	private static void gravel() {
    System.out.println("You approach the gravel path. The path splits into two directions, both leading into the forest.");
    System.out.println("1 = Take the path on the right.");
    System.out.println("2 = Take the path on the left.");
    Scanner reader = new Scanner(System.in);
    choice = reader.nextInt();
    reader.nextLine();
    
    if (choice == 1) {
    	System.out.println("You begin to walk down that path, and promptly fall of a cliff.");
    	System.out.println("DEAD!");
    	choice = 0;
    	dead();

    }
    else {
    	System.out.println("You come to another crossroads.");
    	roads2();
    }
		
}
	//The second crossroads.
	private static void roads2() {
	System.out.println("You come to another crossroads.");
	System.out.println("1 = Take the path on the right.");
	System.out.println("2 = Take the path on the left.");
	Scanner reader = new Scanner(System.in);
	choice = reader.nextInt();
	reader.nextLine();
	if (choice == 1) {
		System.out.println("You walk deeper into the forest. It also starts to get foggy.");
		choice = 0;
		roads3();
	}
	else {
		System.out.println("DEAD!");
		choice = 0;
		dead();
	}
}
	//3rd crossroads.
	private static void roads3() {
    		
}
	
	
	
	
	
	
	//Method for quicker calling of death.
	private static void dead() {
		Scanner reader = new Scanner(System.in);
    	System.out.println("Try again? y/n");
    	String y;
    	y = reader.nextLine();
    	reader.nextLine();
    	if (y == "y") {
    		main(null);
    	}
	}

}
