package tset;

public abstract class Bird {
	
	public void fly(){
		System.out.println("Flying like a bird");
	}
	
	public void eat(){
		System.out.println("Eating lika a bird");
	}
	
	public void yieldEgg(){
		System.out.println("Yielding Egg");
	}
	
	public void walk(){
		System.out.println("Walking like a bird");
	}
	
	// Every bird will make sound differently
	public abstract void makeSound();
}
