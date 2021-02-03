package seleniumDemo;

public class Car {    //Method Signature class

	public static void main(String[] args) { 
		//Syntax of object creation
		// Classname obj = new Classname();     //In this Static void /main method,public void will not work.
		Car obj = new Car ();                   // thats why we create a Syntax of object,for execution.
		obj.carDriving();
		obj.carHorn();
		obj.carBreak();
		obj.carAc();

		//a method has 4 things
		//public = access modifier
		//void  =return type / 
		//carDriving = method name
		//{System.out.printIn(I m driving);} = body

	}
	public void carDriving() {
		System.out.println("I am driving");
	}
	void carHorn() {
		System.out.println("My car horns is good");	
	}
	private void carBreak() {
		System.out.println("It is a good break");	
	}
	protected void carAc() {
		System.out.println("It is work fine");
	}
	
	//20+30=50  //argument
	public int addNums(int A, int B) {
		System.out.println(A);
		System.out.println(B);
		return A+B;
	}
	//String = userName + passWord
	public String addTwoname(String uName,String pwd) {
		System.out.println(uName);
		System.out.println(pwd);
		return uName+pwd;
	}

}