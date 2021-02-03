package learnCollections;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Set<Integer> obj = new TreeSet<Integer>();        //Ascending Order
		//Set<Integer> obj = new LinkedHashSet<Integer>();   //Inserting Order
       Set<Integer> obj = new HashSet<Integer>();            //Random Order
       
       //add items in Set use add()
       obj.add(123);
       obj.add(234);
       obj.add(345);
       obj.add(456);
       obj.add(567);
       
       System.out.println(obj);
     //get the count of Set : use size() method
       System.out.println(obj.size());
       System.out.println(".........................");
       
       obj.add(123);  //Duplicate not allow
       System.out.println(obj);
       System.out.println(obj.size());
       System.out.println(".....................");
       
     // get() method is not allow in Set (print any item) 
       
       
     //print all item inside the Set: use for Loop
       for(Integer eachInt:obj) {
    	  System.out.println(eachInt); 
       }
       System.out.println("..........................");
       //Remove any one item
    obj.remove(234);
    //after remove/delete item
    for(Integer eachInt:obj) {
  	  System.out.println(eachInt); 
	}
    //after delete item (size)
    System.out.println(obj.size());
    System.out.println(".......................");
    
    //contains-true/false
    System.out.println(obj.contains(000));
    
    //Remove all item from set
    obj.clear();
    
    //confirm set is Empty or not-use(isEmpty();)
    System.out.println(obj.isEmpty());
	}
}
