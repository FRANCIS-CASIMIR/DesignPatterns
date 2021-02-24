package consumer;

import behaviors.EggYieldingBehavior;
import behaviors.FlyingBehavior;

public class Bird {
	
	 EggYieldingBehavior eggYielding;
	 FlyingBehavior flying;
	
	public void fly(){
		flying.fly();
	}
	
	public void yieldEgg(){
		eggYielding.yieldEgg();
	}
	
	public void makeSound(){
		System.out.println("Some sound");
	}
	
	public void walk(){
		System.out.println("Walking");
	}
	
}
