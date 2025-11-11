package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment6_ArraysDataypesOperator {

	public static void main(String[] args) {
		
	
		List <String> studentnames=new ArrayList<String>();
		studentnames.add("Suresh");
		studentnames.add("Mahesh");
		studentnames.add("Naresh");
		
		List <Integer> marks=new ArrayList<Integer>();
		marks.add(75);
		marks.add(80);
		marks.add(82);
		
		int updatedmarks1,updatedmarks2,updatedmarks3;
	
		updatedmarks1=marks.get(0) + 10;
		updatedmarks2=marks.get(1) + 10;
		updatedmarks3=marks.get(2) + 10;
		
		double averagemarks= (updatedmarks1 +updatedmarks2 + updatedmarks3)/3;
		
		
		System.out.println("*****Updated Marks*****");
		System.out.println("Suresh: "+ updatedmarks1 );
		System.out.println("Mahesh: "+ updatedmarks2 );
		System.out.println("Naresh: "+ updatedmarks3 );
		System.out.println("Average Marks: "+ averagemarks);
 
	}

}
