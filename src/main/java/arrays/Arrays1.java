package arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		//int x=1;           (Data Type)
		//String name="Mamun";(Data Type)
		
		
		//Array  ( []/number,title,ch,id-all are arrays )
		int[] number = {10,20,30,40,50,60,};
		
		String[] title = {"tas","tam","Daw","Mar","Mom"};
		
		char[] ch= {'D','A','B','C'};   //0,1,2,3,4,
		short[] id= {1,2,3,4,5,6,}; 
		
		//we want particular number
		System.out.println(ch[3]);
		System.out.println("...............................");
		//for Loops 
		for(int j=0; j<6;j=j+1) {
			System.out.println(id[j]);
		}
		System.out.println(".............................");
        //for each Loops
		for(int eachCollection:number) {
		System.out.println(eachCollection);	
		}
		System.out.println(title[0]);
	}

}
