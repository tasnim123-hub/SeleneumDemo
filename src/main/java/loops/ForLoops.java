package loops;

public class ForLoops {

	public static void main(String[] args) {
		for(int i=1; i<30; i=i+1) {
			System.out.println(i);
		}
       System.out.println(".............................");
		//Arrays
		String[] names = {"tas","das","mom","dad","sister"};
		
		//for each loops
		for(String eachNames: names) {
			System.out.println(eachNames);
		}
	
		/*for(DataType eachCollection/iteration; collection/array) {
			Statement(eachCollection);
		}*/
		
 	}

}
