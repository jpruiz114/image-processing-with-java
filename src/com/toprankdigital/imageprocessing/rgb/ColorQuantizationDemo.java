package com.toprankdigital.imageprocessing.rgb;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;

public class ColorQuantizationDemo
{
	public static void main(String args[])
	{
		try
		{
			RGBColor color1 = new RGBColor("000000", 0, "00", "00", "00", 0, 0, 0);
			RGBColor color2 = new RGBColor("C86400", 13132800, "C8", "64", "00", 200, 100, 0);
			
			System.out.println("color1" + ":" + "\n" + color1);
			System.out.println("color2" + ":" + "\n" + color2);
			
			double distance = 0;
			
			distance = ColorProcessor.calculateColorDistance(color1, color2);
				
			System.out.println("distance" + ":" + " " + distance);
			
			Vector<RGBColor> rgbColorList = ColorProcessor.getColorList();
			
			RGBColor closestColor = ColorProcessor.findClosestColor(color2, rgbColorList);
			
			System.out.println("closestColor" + ":" + "\n" + closestColor);
			
			/* **************************************** */
			
			BufferedImage inputImage = ImageIO.read(new java.io.File("assets/images/Foto-1.jpg"));
			
			int width = inputImage.getWidth();
			int height = inputImage.getHeight();
			
			/* **************************************** */
			
			BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			
            WritableRaster raster = (WritableRaster)(outputImage.getRaster());
            
            int currentPixel = 0;
            
            int numR, numG, numB;
            
            String strR, strG, strB;
            
            String compositeRGB = "";
            
            int compositeRGBNumber = 0;
            
            RGBColor currentRGB = null;
            
            RGBColor closestRGB = null;
            
            for (int i=0; i<width; i++)
    		{
    			for (int j=0; j<height; j++)
    			{
    				currentPixel = inputImage.getRGB(i, j);
    				
    				numR = (currentPixel >> 16) & 0xff;
    				numG = (currentPixel >> 8) & 0xff;
    				numB = (currentPixel) & 0xff;
    				
    				strR = ColorProcessor.integerToHexString(numR);
    				strG = ColorProcessor.integerToHexString(numG);
    				strB = ColorProcessor.integerToHexString(numB);
    				
    				compositeRGB = strR + strG + strB;
    				//System.out.println("compositeRGB" + " = " + compositeRGB);
    				
    				compositeRGBNumber = Integer.parseInt(compositeRGB, 16);
    				//System.out.println("compositeRGBNumber" + " = " + compositeRGBNumber);
    				
    				currentRGB = new RGBColor(compositeRGB, compositeRGBNumber, strR, strG, strB, numR, numG, numB);
    				
    				//System.out.println("(r,g,b) at (i,j)" + " = " + "(" + r + "," + g + "," + b + ")");
    				//System.out.println("(r,g,b) at (i,j)" + " = " + "(" + strR + "," + strG + "," + strB + ")");
    				
    				closestRGB = ColorProcessor.findClosestColor(currentRGB, rgbColorList);
    				
    				raster.setPixel(i, j, new int[]{closestRGB.getDecR(), closestRGB.getDecG(), closestRGB.getDecB()});
    			} // End of for.
    		} // End of for.
            
            // Save the new image.
            ImageIO.write(outputImage, "jpg", new File("output/processed-foto-1.jpg")); 
		} // End of try.
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		} // End of catch.
	} // End of main method.
} // End of ColorQuantizationDemo class.
