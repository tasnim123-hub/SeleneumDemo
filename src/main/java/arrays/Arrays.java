package arrays;

public class Arrays {

	public static void main(String[] args) {
	
		String[] obj=new String[5];

		obj[0] ="Tasnim";
		obj[1] ="Tamim";
		obj[2]="Darimee";
		obj[3] ="Dawsi";
		obj[4] ="Marnia";
		
	//for Loops
	for(int i=0; i<=4; i=i+1) {             
		System.out.println(obj[i]);
	}
	//for each Loop
		for(String each:obj) {
			System.out.println(each);
			}
		
	//while Loops
	int i=0;
	while(i<=5) {
		System.out.println(obj[3]);
		i++;
	}
	/*//Do while Loops    //it will not work here, Syntax is right.
	int i=0;
	do {
	System.out.println(obj[i]);	
	i++;	
	}while(i<=4);*/
	
	//How to get count of array (array.length)
	System.out.println(obj.length);
	
	//How to pickup value from Array(array[indexNumber])
	System.out.println(obj[3]);
	
	//using for iterator,while loops and for loops
	for(int j=0; j<obj.length; j=j+1) {
		System.out.println(obj.length);
	}
	}
}