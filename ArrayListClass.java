package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	
	
		  
		public static void main(String[] args) { //created main method 
			//static is used for memory management
			//void is used to define the return type of the method
			//String[] args is actually an array of java.lang.String type and it's name is args here
							
			 HDTV tv1 = new HDTV(62, "Samsung"); //created three objects for the HDTV  class 
			  HDTV tv2 = new HDTV(38, "Reliance"); //and initializing the values in it 
			  HDTV tv3 = new HDTV(48, "Panasonic");
			  
			  //creating an ArrayList for HDTV class 
			  ArrayList<HDTV> arraylist = new ArrayList<HDTV>(); 
			  arraylist.add(tv1);  //here passing the objects of the hdtv class in the arraylist 
			  arraylist.add(tv2);
			  arraylist.add(tv3);
			 
			  System.out.println("HDTV objects which are sorted in order :");
			  Collections.sort(arraylist, new SizeComparator()); //here it sorts the elements in the arraylist by the size of comparator 
			 // The Java collections framework (JCF) is a set of classes and interfaces that implement commonly reusable collection data structures. 
			  for (HDTV list : arraylist ) {      //here by using for each loop the elements will be sorted by the size and prints the brand names in the 
			   System.out.println(list.getBrand()); //sorted order 
			   //system is final class
			      //out is a static member of system class and type printStream
			      //println is method of printStream class.ln means nextline
			  }
		}}
