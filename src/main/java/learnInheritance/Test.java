package learnInheritance;

public class Test {

	public static void main(String[] args) {
		//Create object of Noah Class                   //TOYOTA (Super Class)
	                                                //Camry Extends Toyota
		                                            //Rav4 Extends camry
		                                            //Noah Extends Rav4
		Noah obj=new Noah();
		obj.adasFeature();
		obj.applyHorn();
		obj.applyMirror();
		obj.applyTyre();
		obj.gps();
		obj.addAC();
		obj.staring();
	}

}
