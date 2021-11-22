package oop;

public class zookeeper {
	public void feed(Predator predator) {
		System.out.println("feed "+predator.getFood());
	}
//	public void feed(Lion lion) {
//		System.out.println("feed banana");
//	}

	public static void main(String[] args) {
		zookeeper ZooKeeper = new zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		ZooKeeper.feed(tiger);
		ZooKeeper.feed(lion);

	}

}
