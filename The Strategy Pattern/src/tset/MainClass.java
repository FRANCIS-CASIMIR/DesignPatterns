package tset;

public class MainClass {

	public static void main(String[] args) {
		
		Chicken c = new Chicken();
		Dove d = new Dove();
		Duck du = new Duck();
		Bat b = new Bat();
		
		// chicken's behavior
		System.out.println("\n chicken's behavior");
		c.eat();
		c.makeSound();
		c.fly();
		c.walk();
		c.yieldEgg();
		
		
		// Dove's behavior 
		System.out.println("\n Dove's behavior");
		 d.eat();
		 d.makeSound();
		 d.fly();
		 d.walk();
		 d.yieldEgg();
		 
		// Duck's behavior 
		 System.out.println("\n Dove's behavior");
		du.eat();
		du.makeSound();
		du.fly();
	    du.walk();
	    du.yieldEgg();
	    
	    // Duck's behavior 
	    System.out.println("\n  Bat's behavior");
	 	b.eat();
	 	b.makeSound();
	 	b.fly();
	 	b.walk();
	 	b.yieldEgg();

	}

}
