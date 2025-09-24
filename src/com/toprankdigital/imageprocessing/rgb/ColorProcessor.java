package com.toprankdigital.imageprocessing.rgb;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Collections;
import java.util.Vector;

public class ColorProcessor
{
	private static Vector<RGBColor> colorList;
	
	static
	{
		colorList = new Vector<RGBColor>();
		
		colorList.add(new RGBColor("000000", 0, "00", "00", "00", 0, 0, 0));
		colorList.add(new RGBColor("000080", 128, "00", "00", "80", 0, 0, 128));
		colorList.add(new RGBColor("00008B", 139, "00", "00", "8B", 0, 0, 139));
		colorList.add(new RGBColor("0000CD", 205, "00", "00", "CD", 0, 0, 205));
		colorList.add(new RGBColor("0000FF", 255, "00", "00", "FF", 0, 0, 255));
		colorList.add(new RGBColor("006400", 25600, "00", "64", "00", 0, 100, 0));
		colorList.add(new RGBColor("008000", 32768, "00", "80", "00", 0, 128, 0));
		colorList.add(new RGBColor("008080", 32896, "00", "80", "80", 0, 128, 128));
		colorList.add(new RGBColor("008B8B", 35723, "00", "8B", "8B", 0, 139, 139));
		colorList.add(new RGBColor("00BFFF", 49151, "00", "BF", "FF", 0, 191, 255));
		colorList.add(new RGBColor("00CED1", 52945, "00", "CE", "D1", 0, 206, 209));
		colorList.add(new RGBColor("00FA9A", 64154, "00", "FA", "9A", 0, 250, 154));
		colorList.add(new RGBColor("00FF00", 65280, "00", "FF", "00", 0, 255, 0));
		colorList.add(new RGBColor("00FF7F", 65407, "00", "FF", "7F", 0, 255, 127));
		colorList.add(new RGBColor("00FFFF", 65535, "00", "FF", "FF", 0, 255, 255));
		colorList.add(new RGBColor("191970", 1644912, "19", "19", "70", 25, 25, 112));
		colorList.add(new RGBColor("1E90FF", 2003199, "1E", "90", "FF", 30, 144, 255));
		colorList.add(new RGBColor("20B2AA", 2142890, "20", "B2", "AA", 32, 178, 170));
		colorList.add(new RGBColor("228B22", 2263842, "22", "8B", "22", 34, 139, 34));
		colorList.add(new RGBColor("2E8B57", 3050327, "2E", "8B", "57", 46, 139, 87));
		colorList.add(new RGBColor("2F4F4F", 3100495, "2F", "4F", "4F", 47, 79, 79));
		colorList.add(new RGBColor("32CD32", 3329330, "32", "CD", "32", 50, 205, 50));
		colorList.add(new RGBColor("3CB371", 3978097, "3C", "B3", "71", 60, 179, 113));
		colorList.add(new RGBColor("40E0D0", 4251856, "40", "E0", "D0", 64, 224, 208));
		colorList.add(new RGBColor("4169E1", 4286945, "41", "69", "E1", 65, 105, 225));
		colorList.add(new RGBColor("4682B4", 4620980, "46", "82", "B4", 70, 130, 180));
		colorList.add(new RGBColor("483D8B", 4734347, "48", "3D", "8B", 72, 61, 139));
		colorList.add(new RGBColor("48D1CC", 4772300, "48", "D1", "CC", 72, 209, 204));
		colorList.add(new RGBColor("4B0082", 4915330, "4B", "00", "82", 75, 0, 130));
		colorList.add(new RGBColor("556B2F", 5597999, "55", "6B", "2F", 85, 107, 47));
		colorList.add(new RGBColor("5F9EA0", 6266528, "5F", "9E", "A0", 95, 158, 160));
		colorList.add(new RGBColor("6495ED", 6591981, "64", "95", "ED", 100, 149, 237));
		colorList.add(new RGBColor("66CDAA", 6737322, "66", "CD", "AA", 102, 205, 170));
		colorList.add(new RGBColor("696969", 6908265, "69", "69", "69", 105, 105, 105));
		colorList.add(new RGBColor("6A5ACD", 6970061, "6A", "5A", "CD", 106, 90, 205));
		colorList.add(new RGBColor("6B8E23", 7048739, "6B", "8E", "23", 107, 142, 35));
		colorList.add(new RGBColor("708090", 7372944, "70", "80", "90", 112, 128, 144));
		colorList.add(new RGBColor("778899", 7833753, "77", "88", "99", 119, 136, 153));
		colorList.add(new RGBColor("7B68EE", 8087790, "7B", "68", "EE", 123, 104, 238));
		colorList.add(new RGBColor("7CFC00", 8190976, "7C", "FC", "00", 124, 252, 0));
		colorList.add(new RGBColor("7FFF00", 8388352, "7F", "FF", "00", 127, 255, 0));
		colorList.add(new RGBColor("7FFFD4", 8388564, "7F", "FF", "D4", 127, 255, 212));
		colorList.add(new RGBColor("800000", 8388608, "80", "00", "00", 128, 0, 0));
		colorList.add(new RGBColor("800080", 8388736, "80", "00", "80", 128, 0, 128));
		colorList.add(new RGBColor("808000", 8421376, "80", "80", "00", 128, 128, 0));
		colorList.add(new RGBColor("808080", 8421504, "80", "80", "80", 128, 128, 128));
		colorList.add(new RGBColor("87CEEB", 8900331, "87", "CE", "EB", 135, 206, 235));
		colorList.add(new RGBColor("87CEFA", 8900346, "87", "CE", "FA", 135, 206, 250));
		colorList.add(new RGBColor("8A2BE2", 9055202, "8A", "2B", "E2", 138, 43, 226));
		colorList.add(new RGBColor("8B0000", 9109504, "8B", "00", "00", 139, 0, 0));
		colorList.add(new RGBColor("8B008B", 9109643, "8B", "00", "8B", 139, 0, 139));
		colorList.add(new RGBColor("8B4513", 9127187, "8B", "45", "13", 139, 69, 19));
		colorList.add(new RGBColor("8FBC8F", 9419919, "8F", "BC", "8F", 143, 188, 143));
		colorList.add(new RGBColor("90EE90", 9498256, "90", "EE", "90", 144, 238, 144));
		colorList.add(new RGBColor("9370D8", 9662680, "93", "70", "D8", 147, 112, 216));
		colorList.add(new RGBColor("9400D3", 9699539, "94", "00", "D3", 148, 0, 211));
		colorList.add(new RGBColor("98FB98", 10025880, "98", "FB", "98", 152, 251, 152));
		colorList.add(new RGBColor("9932CC", 10040012, "99", "32", "CC", 153, 50, 204));
		colorList.add(new RGBColor("9ACD32", 10145074, "9A", "CD", "32", 154, 205, 50));
		colorList.add(new RGBColor("A0522D", 10506797, "A0", "52", "2D", 160, 82, 45));
		colorList.add(new RGBColor("A52A2A", 10824234, "A5", "2A", "2A", 165, 42, 42));
		colorList.add(new RGBColor("A9A9A9", 11119017, "A9", "A9", "A9", 169, 169, 169));
		colorList.add(new RGBColor("ADD8E6", 11393254, "AD", "D8", "E6", 173, 216, 230));
		colorList.add(new RGBColor("ADFF2F", 11403055, "AD", "FF", "2F", 173, 255, 47));
		colorList.add(new RGBColor("AFEEEE", 11529966, "AF", "EE", "EE", 175, 238, 238));
		colorList.add(new RGBColor("B0C4DE", 11584734, "B0", "C4", "DE", 176, 196, 222));
		colorList.add(new RGBColor("B0E0E6", 11591910, "B0", "E0", "E6", 176, 224, 230));
		colorList.add(new RGBColor("B22222", 11674146, "B2", "22", "22", 178, 34, 34));
		colorList.add(new RGBColor("B8860B", 12092939, "B8", "86", "0B", 184, 134, 11));
		colorList.add(new RGBColor("BA55D3", 12211667, "BA", "55", "D3", 186, 85, 211));
		colorList.add(new RGBColor("BC8F8F", 12357519, "BC", "8F", "8F", 188, 143, 143));
		colorList.add(new RGBColor("BDB76B", 12433259, "BD", "B7", "6B", 189, 183, 107));
		colorList.add(new RGBColor("C0C0C0", 12632256, "C0", "C0", "C0", 192, 192, 192));
		colorList.add(new RGBColor("C71585", 13047173, "C7", "15", "85", 199, 21, 133));
		colorList.add(new RGBColor("CD5C5C", 13458524, "CD", "5C", "5C", 205, 92, 92));
		colorList.add(new RGBColor("CD853F", 13468991, "CD", "85", "3F", 205, 133, 63));
		colorList.add(new RGBColor("D2691E", 13789470, "D2", "69", "1E", 210, 105, 30));
		colorList.add(new RGBColor("D2B48C", 13808780, "D2", "B4", "8C", 210, 180, 140));
		colorList.add(new RGBColor("D3D3D3", 13882323, "D3", "D3", "D3", 211, 211, 211));
		colorList.add(new RGBColor("D87093", 14184595, "D8", "70", "93", 216, 112, 147));
		colorList.add(new RGBColor("D8BFD8", 14204888, "D8", "BF", "D8", 216, 191, 216));
		colorList.add(new RGBColor("DA70D6", 14315734, "DA", "70", "D6", 218, 112, 214));
		colorList.add(new RGBColor("DAA520", 14329120, "DA", "A5", "20", 218, 165, 32));
		colorList.add(new RGBColor("DC143C", 14423100, "DC", "14", "3C", 220, 20, 60));
		colorList.add(new RGBColor("DCDCDC", 14474460, "DC", "DC", "DC", 220, 220, 220));
		colorList.add(new RGBColor("DDA0DD", 14524637, "DD", "A0", "DD", 221, 160, 221));
		colorList.add(new RGBColor("DEB887", 14596231, "DE", "B8", "87", 222, 184, 135));
		colorList.add(new RGBColor("E0FFFF", 14745599, "E0", "FF", "FF", 224, 255, 255));
		colorList.add(new RGBColor("E6E6FA", 15132410, "E6", "E6", "FA", 230, 230, 250));
		colorList.add(new RGBColor("E9967A", 15308410, "E9", "96", "7A", 233, 150, 122));
		colorList.add(new RGBColor("EE82EE", 15631086, "EE", "82", "EE", 238, 130, 238));
		colorList.add(new RGBColor("EEE8AA", 15657130, "EE", "E8", "AA", 238, 232, 170));
		colorList.add(new RGBColor("F08080", 15761536, "F0", "80", "80", 240, 128, 128));
		colorList.add(new RGBColor("F0E68C", 15787660, "F0", "E6", "8C", 240, 230, 140));
		colorList.add(new RGBColor("F0F8FF", 15792383, "F0", "F8", "FF", 240, 248, 255));
		colorList.add(new RGBColor("F0FFF0", 15794160, "F0", "FF", "F0", 240, 255, 240));
		colorList.add(new RGBColor("F0FFFF", 15794175, "F0", "FF", "FF", 240, 255, 255));
		colorList.add(new RGBColor("F4A460", 16032864, "F4", "A4", "60", 244, 164, 96));
		colorList.add(new RGBColor("F5DEB3", 16113331, "F5", "DE", "B3", 245, 222, 179));
		colorList.add(new RGBColor("F5F5DC", 16119260, "F5", "F5", "DC", 245, 245, 220));
		colorList.add(new RGBColor("F5F5F5", 16119285, "F5", "F5", "F5", 245, 245, 245));
		colorList.add(new RGBColor("F5FFFA", 16121850, "F5", "FF", "FA", 245, 255, 250));
		colorList.add(new RGBColor("F8F8FF", 16316671, "F8", "F8", "FF", 248, 248, 255));
		colorList.add(new RGBColor("FA8072", 16416882, "FA", "80", "72", 250, 128, 114));
		colorList.add(new RGBColor("FAEBD7", 16444375, "FA", "EB", "D7", 250, 235, 215));
		colorList.add(new RGBColor("FAF0E6", 16445670, "FA", "F0", "E6", 250, 240, 230));
		colorList.add(new RGBColor("FAFAD2", 16448210, "FA", "FA", "D2", 250, 250, 210));
		colorList.add(new RGBColor("FDF5E6", 16643558, "FD", "F5", "E6", 253, 245, 230));
		colorList.add(new RGBColor("FF0000", 16711680, "FF", "00", "00", 255, 0, 0));
		colorList.add(new RGBColor("FF00FF", 16711935, "FF", "00", "FF", 255, 0, 255));
		colorList.add(new RGBColor("FF1493", 16716947, "FF", "14", "93", 255, 20, 147));
		colorList.add(new RGBColor("FF4500", 16729344, "FF", "45", "00", 255, 69, 0));
		colorList.add(new RGBColor("FF6347", 16737095, "FF", "63", "47", 255, 99, 71));
		colorList.add(new RGBColor("FF69B4", 16738740, "FF", "69", "B4", 255, 105, 180));
		colorList.add(new RGBColor("FF7F50", 16744272, "FF", "7F", "50", 255, 127, 80));
		colorList.add(new RGBColor("FF8C00", 16747520, "FF", "8C", "00", 255, 140, 0));
		colorList.add(new RGBColor("FFA07A", 16752762, "FF", "A0", "7A", 255, 160, 122));
		colorList.add(new RGBColor("FFA500", 16753920, "FF", "A5", "00", 255, 165, 0));
		colorList.add(new RGBColor("FFB6C1", 16758465, "FF", "B6", "C1", 255, 182, 193));
		colorList.add(new RGBColor("FFC0CB", 16761035, "FF", "C0", "CB", 255, 192, 203));
		colorList.add(new RGBColor("FFD700", 16766720, "FF", "D7", "00", 255, 215, 0));
		colorList.add(new RGBColor("FFDAB9", 16767673, "FF", "DA", "B9", 255, 218, 185));
		colorList.add(new RGBColor("FFDEAD", 16768685, "FF", "DE", "AD", 255, 222, 173));
		colorList.add(new RGBColor("FFE4B5", 16770229, "FF", "E4", "B5", 255, 228, 181));
		colorList.add(new RGBColor("FFE4C4", 16770244, "FF", "E4", "C4", 255, 228, 196));
		colorList.add(new RGBColor("FFE4E1", 16770273, "FF", "E4", "E1", 255, 228, 225));
		colorList.add(new RGBColor("FFEBCD", 16772045, "FF", "EB", "CD", 255, 235, 205));
		colorList.add(new RGBColor("FFEFD5", 16773077, "FF", "EF", "D5", 255, 239, 213));
		colorList.add(new RGBColor("FFF0F5", 16773365, "FF", "F0", "F5", 255, 240, 245));
		colorList.add(new RGBColor("FFF5EE", 16774638, "FF", "F5", "EE", 255, 245, 238));
		colorList.add(new RGBColor("FFF8DC", 16775388, "FF", "F8", "DC", 255, 248, 220));
		colorList.add(new RGBColor("FFFACD", 16775885, "FF", "FA", "CD", 255, 250, 205));
		colorList.add(new RGBColor("FFFAF0", 16775920, "FF", "FA", "F0", 255, 250, 240));
		colorList.add(new RGBColor("FFFAFA", 16775930, "FF", "FA", "FA", 255, 250, 250));
		colorList.add(new RGBColor("FFFF00", 16776960, "FF", "FF", "00", 255, 255, 0));
		colorList.add(new RGBColor("FFFFE0", 16777184, "FF", "FF", "E0", 255, 255, 224));
		colorList.add(new RGBColor("FFFFF0", 16777200, "FF", "FF", "F0", 255, 255, 240));
		colorList.add(new RGBColor("FFFFFF", 16777215, "FF", "FF", "FF", 255, 255, 255));
	} // End of static block.
	
	public static Vector<RGBColor> getColorList()
	{
		return colorList;
	} // End of getColorList method.
	
	public static double calculateColorDistance(RGBColor color1, RGBColor color2) throws Exception
	{
		if(color1 == null)
		{
			throw new Exception("Must provide color 1.");
		} // End of if.
		
		if(color2 == null)
		{
			throw new Exception("Must provide color 2.");
		} // End of if.
		
		double distance = 0;
		
		int r1, g1, b1;
		int r2, g2, b2;
		
		r1 = color1.getDecR();
		g1 = color1.getDecG();
		b1 = color1.getDecB();
		
		r2 = color2.getDecR();
		g2 = color2.getDecG();
		b2 = color2.getDecB();
		
		distance = Math.sqrt(Math.pow(r1 - r2, 2) + Math.pow(g1 - g2, 2) + Math.pow(b1 - b2, 2));
		
		return distance;
	} // End of calculateColorDistance method.
	
	public static RGBColor findClosestColor(RGBColor color, Vector<RGBColor> colorList) throws Exception
	{
		if(color == null)
		{
			throw new Exception("Must provide the color.");
		} // End of if.
		
		if(colorList == null)
		{
			throw new Exception("Must provide the color list.");
		} // End of if.
		else if(colorList.size() == 0)
		{
			throw new Exception("The color list must contain at least one element.");
		} // End of else if.
		
		RGBColor closestColor = null;
		
		RGBColor currentColor = null;
		
		double currentIterationDistance = 0;
		
		/* **************************************** */
		
		Vector<ColorComparison> comparisonList = new Vector<ColorComparison>();
		
		ColorComparison currentComparison = null;
		
		/* **************************************** */
		
		for(int i=0; i<colorList.size(); i++)
		{
			currentColor = colorList.get(i);
			
			currentIterationDistance = calculateColorDistance(color, currentColor);
			
			currentComparison = new ColorComparison();
			currentComparison.setColor1(color);
			currentComparison.setColor2(currentColor);
			currentComparison.setDistance(currentIterationDistance);
			
			comparisonList.add(currentComparison);
		} // End of for.
		
		/* **************************************** */
		
		//int numberOfElements = comparisonList.size();
		//System.out.println("numberOfElements" + " = " + numberOfElements);
		
		Collections.sort(comparisonList);
		
		/* **************************************** */
		
		/*for(int i=0; i<comparisonList.size(); i++)
		{
			//System.out.println(comparisonList.get(i).getDistance());
			
			System.out.println(comparisonList.get(i));
		} // End of for.*/
		
		ColorComparison minimum = comparisonList.get(comparisonList.size() - 1);
		//System.out.println("minimum" + " = " + minimum);
		
		//double minimumDistance = minimum.getDistance();
		//System.out.println("minimumDistance" + " = " + minimumDistance);
		
		closestColor = minimum.getColor2();
		//System.out.println("closestColor" + ":" + "\n" + closestColor);
		
		return closestColor;
	} // End of findClosestColor method.
	
	public static String integerToHexString(int inputValue)
	{
		String outputValue = Integer.toHexString(inputValue);
		
		if(outputValue.length() == 1)
		{
			outputValue = "0" + outputValue;
		} // End of if.
		
		return outputValue;
	} // End of integerToHexString method.
	
	public static int hexStringToInteger(String inputValue) throws Exception
	{
		if(inputValue == null || inputValue.equals(""))
		{
			throw new Exception("Must provide the input value");
		} // End of if.
		
		int outputValue = 0;
		
		outputValue = Integer.parseInt(inputValue, 16);  
		
		return outputValue;
	} // End of hexStringToInteger method.
	
	public static BufferedImage deepCopy(BufferedImage bi)
	{
		ColorModel cm = bi.getColorModel();
		
		boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
		
		WritableRaster raster = bi.copyData(null);
		
		return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
	} // End of deepCopy method.
} // End of ColorProcessor class.
