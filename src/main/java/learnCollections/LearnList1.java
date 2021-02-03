package learnCollections;

import java.util.LinkedList;
import java.util.List;

public class LearnList1 {

	public static void main(String[] args) {
		//create a list of all  id number employees 10,11,12,13,14,15,16,
   	 List<Integer> id = new LinkedList<Integer>();  //Ascending order  1,2,3,4,5
		id.add(123);
		id.add(234);
		id.add(345);
		id.add(456);
		id.add(567);
System.out.println(id);
System.out.println(id.size());
	}

}
