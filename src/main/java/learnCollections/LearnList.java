package learnCollections;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Step 1:Create  Object for ArrayList
		List<String> lst = new ArrayList<String>();
	
		
		//Add items in list-use add() method
      lst.add("Tasnim");
      lst.add("Tania");

      lst.add("Fahim");
      lst.add("Tamim");
      lst.add("Dawsi");
      lst.add("Darimee");
      lst.add("Maria");
      
      System.out.println(lst);
     
     //get the count of list : use size() method
      System.out.println(lst.size());
      System.out.println(".............................");
      
      lst.add("Fahim");
     System.out.println(lst.size()); 
     System.out.println(lst);
      System.out.println("............................");
     //print any item from list: get() method
     System.out.println(lst.get(3));
      
     //print all item inside the List: use for Loops
     for (int i=0; i<lst.size(); i++) {
    	 System.out.println(lst.get(i));
     }
    	 System.out.println("..............................");
    	 
    	//delete or remove the item from list: use 
    	 lst.remove(0);
    	 
    	 System.out.println(lst);
    	 for(int j=0; j<lst.size(); j++) {
    		 System.out.println(lst.get(j));
    	 }
    	 System.out.println("....................");
    	 System.out.println(lst.contains("Tayef"));
    	 System.out.println(lst.contains("Maria"));
    	 
    	 //clear the list: use clear() method 
    	 lst.clear();
    	 //is Empty()-> confirm the list is Empty- True/False
    	 System.out.println(lst.isEmpty());
    	 
    	
	}

}
