package consumer;

import behaviors.FlyNormally;
import behaviors.NoEggYielding;

public class Cock extends Bird {
	
	public Cock(){
		flying = new FlyNormally();
		eggYielding = new NoEggYielding();
	}
	
}
