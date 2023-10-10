package Collection_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist_methods {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// Arraylist is a class // default size 10 
		// best choice -retrive // worse choice- insertion 

		// declaration of Arraylist

		ArrayList AL1 = new ArrayList();
		// dyanamic arry = hetro and homo type data means you can add any type of data
		// like string char intetc

		ArrayList<String> AL2 = new ArrayList<String>(); // static array only store string value 

		ArrayList<Integer> AL3 = new ArrayList<Integer>(); // only store string value 
		
		ArrayList<Object> AL4 = new ArrayList(); // only store string value 
AL4.add(30);
System.out.println(AL4);


		// 1. Add - to add the element in arraylist

		AL1.add("Java");
		AL1.add(true);
		AL1.add(20);
		AL1.add(30.8);
		AL1.add('A');
		AL1.add(null); // any no of null value accept
		AL1.add("Java"); // duplicates are allowes
		System.out.println(AL1);// [Java, true, 20, 30.8, A, null, Java]
		
		System.out.println(AL1.add(20)); 

        System.out.println(AL1); //[Java, true, 20, 30.8, A, null, Java, 300]

		System.out.println("@@@ size @@@");

		// 2. size - returns the no of ele present in the list
		System.out.println(AL1.size());
		
		//System.out.println(AL1.get(3));

		System.out.println("@@@ is empty @@@");

		// 3.is empty -return true if list contain no ele
		System.out.println(AL1.isEmpty()); // false
		System.out.println(AL2.isEmpty()); // true
		System.out.println();

		System.out.println("@@@ retrive . get @@@");

		// 4 .get --> Retrieve Specific element - to get the specific value from the
		// array

		// get-returns the element at the specific position in this
		
		// list-->syso(RefVariable.get(index))

		System.out.println(AL1.get(3));
		System.out.println(AL1.get(4));
		
		// System.out.println(AL.get(30)); Index 30 out of bounds for length 11
		
		// error--> IndexOutOfBoundsException
		
		System.out.println();
		
		System.out.println("@@@ remove @@@");
		System.out.println();

		// 5. Remove -SYNTAX--> RefVariable.remove(element);
		
		AL1.remove(30.8);
		System.out.println(AL1);
		System.out.println();

		System.out.println("@@@ insert / add ele @@@");
		System.out.println();

		// 6. Insert new element
		AL2.add("python");
		AL2.add(0, "java"); // 0 is the index /position
		AL2.add(2, "200");
		System.out.println(AL2);
		System.out.println();
		
		System.out.println("@@@ contains @@@");
		System.out.println();
		
// 7. contains - return true if the list contain specfic ele 
		
		System.out.println(AL1.contains("Java"));
		System.out.println(AL1.contains(1000000));
		
		System.out.println();
		System.out.println("@@@ replace @@@");
		System.out.println();
		
		
		//6.Replace/change method-->RefVariable.set(int index, element)
		
				AL1.set(3, "automation");
				System.out.println(AL1);
				
				AL1.set(1, 2000);
				System.out.println(AL1);
				
				AL1.set(1, 'A');
				System.out.println(AL1);

				System.out.println();
				System.out.println("@@@ addAll @@@");
				System.out.println();
				
				//7. addALL- duplicate arrylist created with duplicate element
				ArrayList  duplicate_AL1 = new ArrayList();
				
				duplicate_AL1.addAll(AL1);
				
				System.out.println(duplicate_AL1);

				System.out.println();
				System.out.println("@@@ removeAll @@@");
				System.out.println();
				
				//8.  removeALL - remove all the duplicate element
				
				duplicate_AL1.remove(AL1);
				System.out.println(duplicate_AL1);
				
				System.out.println();
				System.out.println("@@@ collections class methods @@@");
				System.out.println();
				
				//collections class methods -  this works only on homogeneous type of data
				AL3.add(10); 		AL3.add(900);	AL3.add(510);		AL3.add(0);
				System.out.println(AL3);   //[10, 900, 510, 0]
				
				//sort()- sort all ele in arrylist 
				Collections.sort(AL3);
				System.out.println(AL3);
				
				//sort() ele in reverse order / desending order 
//				Collections.sort(AL1, Collections.reverseOrder());
//				System.out.println(AL1); //jvm throw ClassCastException
				
				Collections.sort(AL3, Collections.reverseOrder());
           System.out.println(AL3);
           
           //shuffle - to shuffle the ele in arraylist
           Collections.shuffle(AL3);
           
           // print ele in array list
         
           System.out.println("Reading data using for loop");
           for(int i = 0  ; i < AL1.size() ; i++ ) {
        	   
        	   System.out.println(AL1.get(i));
           }
 
           System.out.println("Reading data using for each loop");
           for(Object obj : AL1) { //  (datatype ref variable : element )
        	   
        	   System.out.println(obj);
           }
           
           System.out.println("Reading data using iterator");
          
           Iterator itr = AL1.iterator();
        
           while( itr.hasNext()){
        	   
        	   System.out.println(itr.next());
           }
           
           
				
				

	}

}
