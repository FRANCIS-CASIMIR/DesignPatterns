package consumer;

import behaviors.FlyNormally;
import behaviors.YieldEgg;

public class Hen extends Bird{

	public Hen() {
		eggYielding = new YieldEgg();
		flying = new FlyNormally();
	}
	
	
}
