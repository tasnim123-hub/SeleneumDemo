package learnInterface;

public class Car implements Vahicle{ //100% Non Abstract method
                                     //In the Car,we have to click (Add unimplemented method)
	public void horn() {
		System.out.println("My car has hydrolic brake");
		
	}

	public void color() {
		System.out.println("My car has red color");
		
	}

	public void turnAC() {
		System.out.println("My car has good horn");
		
	}

	public void mirror() {
		System.out.println("My car has powerful mirror");
		
	}

	public void heatedSeat() {
		System.out.println("My car has heatedseat");
		
	}

}
