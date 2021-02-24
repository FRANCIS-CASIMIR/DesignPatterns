package behaviors;

public class NoEggYielding implements EggYieldingBehavior {

	@Override
	public void yieldEgg() {
		System.out.println("I cant Yield Eggs");

	}

}
