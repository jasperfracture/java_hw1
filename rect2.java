package net.codejava;
import java.util.ArrayList;

public class rect2 {

	public static void main(String[] args) {
		
		
		// Declaring new class object of type Rectangle
		Rectangle myRect=new Rectangle(10,10,"red");
		
		// Using Display method to output data member contents of class Rectangle 
		System.out.println(myRect.Display());

		
		// Declaring an ArrayList with a capacity of 4 of type Rectangle 
		ArrayList<Rectangle> arr_list = new ArrayList<Rectangle>(4);
		
		// Using add method of the ArrayList to construct 4 rectangles
		arr_list.add(new Rectangle(10,10,"Red"));
		arr_list.add(new Rectangle(10.1,100.1,"White"));
		arr_list.add(new Rectangle(-10.1,100.1,"Blue"));
		arr_list.add(new Rectangle(15,10.3,"Gold"));
		
		
		// Looping through the ArrayList to display object member data and calculate area
		for(int i=0; i<4;i++)
		{
			System.out.println("\nRectangle at index #"+i);
			System.out.print(arr_list.get(i).Display());
			System.out.println("Area: "+ arr_list.get(i).calculateArea());
		
		}
		
		// Using the get method of ArrayList access the get and set methods of the Rectangle objects
		// Note the use of "\n" to output a new line to keep the text output neat. 
		// Note that print() outputs text with no newline at the end of the text
		// and that println() add a newline to the text.
		
		arr_list.get(0).getLength();
		System.out.println("\nOld length at index #0 is: " + arr_list.get(0).getLength());
		
		arr_list.get(0).setLength(1);
		System.out.println("New length at index #0 is: " + arr_list.get(0).getLength());
		


	}

}
