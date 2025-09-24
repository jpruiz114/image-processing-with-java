package com.toprankdigital.imageprocessing.rgb;

public class RGBColor
{
	private String rgbValue;
	
	private int decimalValue;
	
	private String hexR;
	private String hexG;
	private String hexB;
	
	private int decR;
	private int decG;
	private int decB;
	
	/* **************************************** */
	
	public RGBColor()
	{
		
	} // End of RGBColor constructor.
	
	/* **************************************** */
	
	public RGBColor(String rgbValue, int decimalValue, String hexR, String hexG, String hexB, int decR, int decG, int decB)
	{
		this.rgbValue = rgbValue;
		
		this.decimalValue = decimalValue;
		
		this.hexR = hexR;
		this.hexG = hexG;
		this.hexB = hexB;
		
		this.decR = decR;
		this.decG = decG;
		this.decB = decB;
	} // End of RGBColor constructor.
	
	/* **************************************** */
	
	public RGBColor(String rgbValue) throws Exception
	{
		if(rgbValue == null || rgbValue.equals(""))
		{
			throw new Exception("Must provide the RGB color value in RRGGBB format.");
		} // End of if.
		else
		{
			if(rgbValue.length() != 6)
			{
				throw new Exception("The correct color format must be RRGGBB.");
			} // End of if.
		} // End of else.
		
		this.rgbValue = rgbValue.toUpperCase();
		
		decimalValue = ColorProcessor.hexStringToInteger(rgbValue);
		
		hexR = "" + rgbValue.charAt(0) + rgbValue.charAt(1);
		hexG = "" + rgbValue.charAt(2) + rgbValue.charAt(3);
		hexB = "" + rgbValue.charAt(4) + rgbValue.charAt(5);
		
		decR = ColorProcessor.hexStringToInteger(hexR);
		decG = ColorProcessor.hexStringToInteger(hexG);
		decB = ColorProcessor.hexStringToInteger(hexB);
	} // End of RGBColor constructor.
	
	/* **************************************** */
	
	public String getRgbValue()
	{
		return rgbValue;
	}
	
	public void setRgbValue(String rgbValue)
	{
		this.rgbValue = rgbValue;
	}
	
	/* **************************************** */
	
	public int getDecimalValue()
	{
		return decimalValue;
	}
	
	public void setDecimalValue(int decimalValue)
	{
		this.decimalValue = decimalValue;
	}
	
	/* **************************************** */
	
	public String getHexR()
	{
		return hexR;
	}
	
	public void setHexR(String hexR)
	{
		this.hexR = hexR;
	}
	
	/* **************************************** */
	
	public String getHexG()
	{
		return hexG;
	}
	
	public void setHexG(String hexG)
	{
		this.hexG = hexG;
	}
	
	/* **************************************** */
	
	public String getHexB()
	{
		return hexB;
	}
	
	public void setHexB(String hexB)
	{
		this.hexB = hexB;
	}
	
	/* **************************************** */
	
	public int getDecR()
	{
		return decR;
	}
	
	public void setDecR(int decR)
	{
		this.decR = decR;
	}
	
	/* **************************************** */
	
	public int getDecG()
	{
		return decG;
	}
	
	public void setDecG(int decG)
	{
		this.decG = decG;
	}
	
	/* **************************************** */
	
	public int getDecB()
	{
		return decB;
	}
	
	public void setDecB(int decB)
	{
		this.decB = decB;
	}
	
	/* **************************************** */
	
	public String toString()
	{
		String objectRepresentation = "";
		
		objectRepresentation += "rgbValue" + " = " + rgbValue;
		objectRepresentation += "\n";
		objectRepresentation += "decimalValue" + " = " + decimalValue;
		objectRepresentation += "\n";
		objectRepresentation += "hexR" + " = " + hexR;
		objectRepresentation += "\n";
		objectRepresentation += "hexG" + " = " + hexG;
		objectRepresentation += "\n";
		objectRepresentation += "hexB" + " = " + hexB;
		objectRepresentation += "\n";
		objectRepresentation += "decR" + " = " + decR;
		objectRepresentation += "\n";
		objectRepresentation += "decG" + " = " + decG;
		objectRepresentation += "\n";
		objectRepresentation += "decB" + " = " + decB;
		objectRepresentation += "\n";
		
		return objectRepresentation;
	} // End of toString method.
	
	/* **************************************** */
} // End of RGBColor class.
