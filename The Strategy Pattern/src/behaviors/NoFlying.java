package behaviors;

public class NoFlying implements FlyingBehavior {

	@Override
	public void fly() {
		System.out.println("I can't Fly");

	}

}
