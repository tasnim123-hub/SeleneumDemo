package learnAbstractClass;

public class Test {

	public static void main(String[] args) {
		MobileUser mu;//reference variable from super class
mu = new Rahim();
mu.sendMessage();
mu.call();

mu = new Karim();
mu.sendMessage();
mu.call();
	}

}
