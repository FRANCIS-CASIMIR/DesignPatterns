package tset;

public class Duck extends Bird{

	@Override
	public void makeSound() {
		System.out.println("Making sound like Duck");
		
	}
	
	@Override
	public void fly(){
		System.out.println("I can't fly");
	}
}
