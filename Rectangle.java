package net.codejava;

public class Rectangle {
	private double m_length;
	private double m_width;
	private String m_color;
	
	public Rectangle() {}
	
	public Rectangle(double length, double width, String color)
    {
        m_length=length;
        m_width=width;
        m_color=color;
    }
	
	// "this" is a reference to the current object - you can use "this" to reference the data members or not.
	// I used "this" using both ways.
	
	// getters
	double getLength()
	{
		return this.m_length;
	}
	
	double getWidth()
	{
		return this.m_width;
	}
	
	String getColor()
	{
		return this.m_color;
	}
	
	//setters
	void setLength(double length)
	{
		m_length = length;
	}
	
	void setWidth(double width)
	{
		m_width = width;
	}
	
	void setColor(String color)
	{
		m_color = color;
	}
	
	
	// calculate area method - returns only the double, no string
	public double calculateArea()
	{
		return this.m_length*this.m_width;
	}
	
	// returns a String displaying the contents of the object data members
	public String Display()
	{
		
		return "length: " + Double.toString(this.m_length) +
				"\nwidth: " + Double.toString(this.m_width) +
				"\ncolor: " + this.m_color + "\n";		
	}
}
