package learnInterface;

public class Test {

	public static void main(String[] args) {
		Car mu= new Car(); //Car Super class
		mu.color();
		mu.turnAC();
		mu.horn();
		mu.heatedSeat();
		mu.mirror();
		
		//Same
		Car ab;  //Car=Super class
		ab=new Car();
		ab.color();
		ab.turnAC();
		ab.horn();
		ab.heatedSeat();
		ab.mirror();
	}

}
