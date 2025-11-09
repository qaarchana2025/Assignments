package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_ArraysAndCollection {

	public static void main(String[] args) {
	
		//1. Create Lists with area of top 5 largest cities.Print the total area of the 3rd and 4th cities combined.
		
		List<Double> cityarea=new ArrayList<Double>();
		
		cityarea.add(1484.00);
		cityarea.add(741.00);
		cityarea.add(681.96);
		cityarea.add(650.85);
		cityarea.add(631.00);
		
		double totalarea;
		
		totalarea=cityarea.get(2) + cityarea.get(3);
		
		System.out.println("******************ArrayList*******************");
		
		System.out.println("1. Total area of 3rd and 4th cities are: "+ totalarea);
		
		
		//2. Create a set of top 10 most visited tourist attractions in the world and print out all of them and its size.
		
		Set<String> touristPlaceHashSet= new HashSet<String>();
		
		touristPlaceHashSet.add("Eiffel Tower");
		touristPlaceHashSet.add("Colosseum");
		touristPlaceHashSet.add("Tah Mahal");
		touristPlaceHashSet.add("Las Vegas");
		touristPlaceHashSet.add("Louvre Museum");
		touristPlaceHashSet.add("Sagrda Familia");
		touristPlaceHashSet.add("Forbidden City");
		touristPlaceHashSet.add("Niagra Falls");
		touristPlaceHashSet.add("Canyon National park");
		touristPlaceHashSet.add("Machu Picchu");
		
		
		System.out.println("******************HashSet*******************");
		
		System.out.println("2. Most visited tourist attractions are: " + touristPlaceHashSet);
		System.out.println("2. The size of tourist attraction in the world is: " + touristPlaceHashSet.size());
		
		//3. Create an array of 10 numbers(any 10 numbers) and print out the Average of 5th and 6th value.
		
		
		int[] number =new int[10];
		
		number[0]=123;
		number[1]=745;
		number[2]=852;
		number[3]=753;
		number[4]=952;
		number[5]=852;
		number[6]=456;
		number[7]=741;
		number[8]=525;
		number[9]=1000;
		
		float average = (number[4] + number[5])/2;
		
		System.out.println("******************Array*******************");
		
		System.out.println("3.The average of 5th and 6th value is: "+ average);
		
		
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		
		List<String> movie=new ArrayList<String>();
		movie.add("AAA");
		movie.add("BBB");
		movie.add("CCC");
		movie.add("DDD");
		movie.add("EEE");
		
		String thirdmovie= movie.get(3);
		
		
		System.out.println("******************List*******************");
		
		System.out.println("4.The third movie is: "+ thirdmovie);
}
}
