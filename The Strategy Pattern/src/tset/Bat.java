package tset;

public class Bat extends Bird {

	@Override
	public void makeSound() {
		System.out.println("Making sound likea bat");

	}
	
	@Override
	public void yieldEgg(){
		System.out.println("I can't Yield Egg");
	}
}
