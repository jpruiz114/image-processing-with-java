package com.toprankdigital.imageprocessing.rgb;

public class ColorComparison implements Comparable<ColorComparison>
{
	private RGBColor color1;
	private RGBColor color2;
	
	private double distance;
	
	public ColorComparison()
	{
		
	} // End of ColorComparison constructor.
	
	public RGBColor getColor1()
	{
		return color1;
	}
	
	public void setColor1(RGBColor color1)
	{
		this.color1 = color1;
	}
	
	public RGBColor getColor2()
	{
		return color2;
	}
	
	public void setColor2(RGBColor color2)
	{
		this.color2 = color2;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void setDistance(double distance)
	{
		this.distance = distance;
	}

	@Override
	public int compareTo(ColorComparison otherComparison)
	{
		int comparisonResult = 0;
		
		if(otherComparison.getDistance() < getDistance())
		{
			comparisonResult = -1;
		} // End of if.
		
		if(otherComparison.getDistance() == getDistance())
		{
			comparisonResult = 0;
		} // End of if.
		
		if(otherComparison.getDistance() > getDistance())
		{
			comparisonResult = 1;
		} // End of if.
		
		return comparisonResult;
	} // End of compareTo method.
	
	public String toString()
	{
		String objectRepresentation = "";
		
		objectRepresentation += "Distance between " + "#" + color1.getRgbValue() + " and " + "#" + color2.getRgbValue() + " = " + distance;
		
		return objectRepresentation;
	} // End of toString method.
} // End of ColorComparison class.
