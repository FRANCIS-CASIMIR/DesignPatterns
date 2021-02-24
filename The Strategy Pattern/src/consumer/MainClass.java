package consumer;

public class MainClass {

	public static void main(String[] args) {
		
		Bird hen = new Hen();
		Bird cock = new Cock();
		
		hen.fly();
		cock.fly();
		
		hen.yieldEgg();
		cock.yieldEgg();

	}

}
