package Pizza_hub;

import java.util.Scanner;

public class PizzaSystem {
	
	// declaring instance variable , and assign some values to it
	double price;
	
	 double extraToppingsAdded=100;
	 boolean isExtraToppingsAdded;

 boolean isExtraCheesAdded;
	 double extraCheesePrice=80;
	 int choise1;

	 double basePizzaPrice;
	//----------------------------------------------------------------------
	Scanner scanner = new Scanner(System.in);
	//-----------------------------------------------------------------
	public void cornPiza() { // corn pizza for 1 
	
		this.price=250; // declare price of the pizza
			System.out.println(price); // print the prize 
			
			basePizzaPrice=price; // storing price into variable  
			
			addExtraCheese(); // calling method line no.84
			
			addExtraToppings(); // calling method line no.106
			
			getBill(); // calling method line no.124
	       }
	//-----------------------------
	public void cheesePizza() {
		this.price=350;
		System.out.println(price);
		basePizzaPrice=price;
		addExtraCheese();
		addExtraToppings();
		getBill();
	}
	//------------------------------
	public void pannerPizza() {
		this.price=400;
		System.out.println(price);
		basePizzaPrice=price;
		addExtraCheese();
		addExtraToppings();
		getBill();
	}
	//-----------------------------
	
	public void chikenPizza() {
		this.price=380;
		System.out.println(price);
		basePizzaPrice=price;
		addExtraCheese();
		addExtraToppings();
		getBill();
		
	}
	
	//------------------------------
	
	public void cheeseChikenPizza() {
		this.price=490;
		System.out.println(price);
		basePizzaPrice=price;
		addExtraCheese();
		addExtraToppings();
		getBill();
		
	}
	//---------------------------------------------------
	
	public void chikenExtralargPizza() {
		this.price=650;
		System.out.println(price);
		basePizzaPrice=price;
		addExtraCheese();
		addExtraToppings();
		getBill();
		
	}
	
	//**********************************************************
	public void addExtraCheese() { // method to want extra cheese
		
		System.out.println("Want some Extra Cheese?"); // options
		System.out.println("1. For Yes");
		System.out.println("2. For No");
		choise1=scanner.nextInt();
		
		 switch(choise1) { // int choice1 for boolean true or false 
		 case 1 -> isExtraCheesAdded=true; // if user select 1 for yes its become true 
		 case 2 ->  isExtraCheesAdded=false; // if user select 2 its become false 
		 
		 }
		 if(isExtraCheesAdded==true) { // if its true execute the block 
		 this.price += extraCheesePrice; // pizza price + extra cheese price 
		 }
	 }
	 
	 //**************************************************************
	 public void addExtraToppings() { // method to add some toppings 
		 
		 System.out.println("Want some Extra Toppings?");// options
			System.out.println("1. For Yes");
			System.out.println("2. For No");
			choise1=scanner.nextInt();
			
			switch(choise1) {// int choice1 for boolean true or false
			 case 1 -> isExtraToppingsAdded=true; // if user select 1 for yes its become true 
			 case 2 ->  isExtraToppingsAdded=false; // if user select 2 its become false 
			 
			 }
			if(isExtraToppingsAdded==true) {  // if its true execute the block 
		 this.price=this.price+extraToppingsAdded;  // pizza price + extra toppings price 
			}
	 }
	
	 //************************************************************************
		 public void getBill() { // bill method to print bill
			 
			 String bill=" "; // declare String type variable
			 
			 System.out.println("Pizza:- "+basePizzaPrice+"\n"); // pizza price
			 
			 if(isExtraCheesAdded) { // if cheese added execute block
			  bill=bill+"Extra Cheese Added: "+ extraCheesePrice+"\n "; // cheese price
			 }
			 
			 if(isExtraToppingsAdded) { // if toppings added execute block
				 bill=bill+"Extra Tppings Added: "+ extraToppingsAdded+"\n "; // toppings price 
				 System.out.println();}
			 
			
			 
			 bill= bill+ "Total Bill: "+this.price+"\n"; // print bill
			 System.out.println(bill);
				  
	}

}
