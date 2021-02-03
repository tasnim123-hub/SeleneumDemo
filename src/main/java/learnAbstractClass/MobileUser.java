package learnAbstractClass;
//super class

public abstract class MobileUser { //its a fully Abstract Class ,
	
	void call(){  //after adding call() method, it is not fully abstract method,
		System.out.println("This is a call method");
	}

	abstract void sendMessage();//this is fully abstract method
	// it has abstract and non abstract method.
}
