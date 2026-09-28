package Pizza_hub;

import java.util.Scanner;

public class Pizza {
	// Declaring instance variables
	double price;
	boolean pizza;
	int choise;
	int choise2;
	int choise3;
	
	public void pizzas() { // method
		
		PizzaSystem pizzaSystem = new PizzaSystem(); // object of PizzaSystem class
		
		Scanner scanner = new Scanner(System.in); // scanner class
		
		System.out.println("*****HELLO WELCOME TO THE PIZZA HUB*****"); // options for user
		System.out.println("------------------------------------------");
		System.out.println("1. press 1 for veg pizza");
		System.out.println("2. press 2 for non-veg pizza");
		System.out.println("*************************");
		
		choise=scanner.nextInt();
		
		switch (choise) { 
		case 1 -> pizza=true; // 1 for yes 
		case 2 -> pizza=false;// 2 for no
		
		}
		if(pizza==true) { // 1 for yes
			
		System.out.println("*********************"); // options
		System.out.println("1. Corn Pizza");
		System.out.println("2.Cheese Pizza");
		System.out.println("3.Panner Pizza");
		System.out.println("************************");
		
		choise2=scanner.nextInt();
		switch(choise2) { // declaring int choice on instance variable for switch case option 
		
		// calling methods
		case 1 ->pizzaSystem.cornPiza(); // 1 for corn pizza 
		case 2 ->pizzaSystem.cheesePizza();// 2 for cheese pizza
		case 3 ->pizzaSystem.pannerPizza();// 3 for panner Pizza
		}
		
		
			
		}
		if(pizza==false) { //2 false
			
			System.out.println("*********************"); // options
			System.out.println("1. chiken Pizza");
			System.out.println("2.Cheese chiken Pizza");
			System.out.println("3.Chiken Extra larg Pizza");
			System.out.println("************************");
			
			choise3=scanner.nextInt();
			
			switch(choise3) {// variable for switch case // calling methods
			
			case 1 -> pizzaSystem.chikenPizza(); // 1 for chicken Pizza 
			case 2 ->pizzaSystem.cheeseChikenPizza(); // 2 for cheese Chicken pizza 
			case 3 ->pizzaSystem.chikenExtralargPizza(); // 3 for Chicken Extra Large Pizza
			}
		
		
		
		}
		
	}
		}
		
	
	
	
	


