package com.toprankdigital.imageprocessing.rgb;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;

public class MultiPaletteProcessor
{
	public static void main(String args[])
	{
		try
		{
			RGBColor color1 = new RGBColor("FFD39B");
			RGBColor color2 = new RGBColor("CAFF70");
			RGBColor color3 = new RGBColor("FF3030");
			RGBColor color4 = new RGBColor("236B8E");

			RGBColor whiteColor = new RGBColor("FFFFFF");

			RGBColor blackColor = new RGBColor("000000");

			Vector<RGBColor> colorList1 = new Vector<RGBColor>();
			colorList1.add(color1);
			colorList1.add(whiteColor);
			colorList1.add(blackColor);

			Vector<RGBColor> colorList2 = new Vector<RGBColor>();
			colorList2.add(color2);
			colorList2.add(whiteColor);
			colorList2.add(blackColor);

			Vector<RGBColor> colorList3 = new Vector<RGBColor>();
			colorList3.add(color3);
			colorList3.add(whiteColor);
			colorList3.add(blackColor);

			Vector<RGBColor> colorList4 = new Vector<RGBColor>();
			colorList4.add(color4);
			colorList4.add(whiteColor);
			colorList4.add(blackColor);

			BufferedImage inputImage = ImageIO.read(new java.io.File("assets/images/Foto-8.jpg"));

			int inputWidth = inputImage.getWidth();
			System.out.println("inputWidth" + " = " + inputWidth);

			int inputHeight = inputImage.getHeight();
			System.out.println("inputHeight" + " = " + inputHeight);

			BufferedImage outputImage = new BufferedImage(inputWidth * 2, inputHeight * 2, BufferedImage.TYPE_INT_RGB);

			WritableRaster raster = (WritableRaster)(outputImage.getRaster());

			int currentPixel = 0;

			int numR, numG, numB;

			String strR, strG, strB;

			String compositeRGB = "";

			int compositeRGBNumber = 0;

			RGBColor currentRGB = null;

			RGBColor closestRGB = null;

			BufferedImage img1 = ColorProcessor.deepCopy(inputImage);
			BufferedImage img2 = ColorProcessor.deepCopy(inputImage);
			BufferedImage img3 = ColorProcessor.deepCopy(inputImage);
			BufferedImage img4 = ColorProcessor.deepCopy(inputImage);

			// Processing for quadrant [1, 1]

			for (int i=0; i<inputWidth; i++) {
				for (int j=0; j<inputHeight; j++) {
					currentPixel = img1.getRGB(i, j);

					numR = (currentPixel >> 16) & 0xff;
					numG = (currentPixel >> 8) & 0xff;
					numB = (currentPixel) & 0xff;

				strR = ColorProcessor.integerToHexString(numR);
				strG = ColorProcessor.integerToHexString(numG);
				strB = ColorProcessor.integerToHexString(numB);

					compositeRGB = strR + strG + strB;

					compositeRGBNumber = Integer.parseInt(compositeRGB, 16);

					currentRGB = new RGBColor(compositeRGB, compositeRGBNumber, strR, strG, strB, numR, numG, numB);

					closestRGB = ColorProcessor.findClosestColor(currentRGB, colorList1);

					raster.setPixel(i, j, new int[]{closestRGB.getDecR(), closestRGB.getDecG(), closestRGB.getDecB()});
				} // End of for.
			} // End of for.

			// Processing for quadrant [1, 2]

			for (int i=0; i<inputWidth; i++) {
				for (int j=0; j<inputHeight; j++) {
					currentPixel = img2.getRGB(i, j);

					numR = (currentPixel >> 16) & 0xff;
					numG = (currentPixel >> 8) & 0xff;
					numB = (currentPixel) & 0xff;

				strR = ColorProcessor.integerToHexString(numR);
				strG = ColorProcessor.integerToHexString(numG);
				strB = ColorProcessor.integerToHexString(numB);

					compositeRGB = strR + strG + strB;

					compositeRGBNumber = Integer.parseInt(compositeRGB, 16);

					currentRGB = new RGBColor(compositeRGB, compositeRGBNumber, strR, strG, strB, numR, numG, numB);

					closestRGB = ColorProcessor.findClosestColor(currentRGB, colorList2);

					raster.setPixel(inputWidth + i, j, new int[]{closestRGB.getDecR(), closestRGB.getDecG(), closestRGB.getDecB()});
				} // End of for.
			} // End of for.

			// Processing for quadrant [2, 1]

			for (int i=0; i<inputWidth; i++) {
				for (int j=0; j<inputHeight; j++) {
					currentPixel = img3.getRGB(i, j);

					numR = (currentPixel >> 16) & 0xff;
					numG = (currentPixel >> 8) & 0xff;
					numB = (currentPixel) & 0xff;

				strR = ColorProcessor.integerToHexString(numR);
				strG = ColorProcessor.integerToHexString(numG);
				strB = ColorProcessor.integerToHexString(numB);

					compositeRGB = strR + strG + strB;

					compositeRGBNumber = Integer.parseInt(compositeRGB, 16);

					currentRGB = new RGBColor(compositeRGB, compositeRGBNumber, strR, strG, strB, numR, numG, numB);

					closestRGB = ColorProcessor.findClosestColor(currentRGB, colorList3);

					raster.setPixel(i, inputHeight + j, new int[]{closestRGB.getDecR(), closestRGB.getDecG(), closestRGB.getDecB()});
				} // End of for.
			} // End of for.

			// Processing for quadrant [2, 2]

			for (int i=0; i<inputWidth; i++) {
				for (int j=0; j<inputHeight; j++) {
					currentPixel = img4.getRGB(i, j);

					numR = (currentPixel >> 16) & 0xff;
					numG = (currentPixel >> 8) & 0xff;
					numB = (currentPixel) & 0xff;

				strR = ColorProcessor.integerToHexString(numR);
				strG = ColorProcessor.integerToHexString(numG);
				strB = ColorProcessor.integerToHexString(numB);

					compositeRGB = strR + strG + strB;

					compositeRGBNumber = Integer.parseInt(compositeRGB, 16);

					currentRGB = new RGBColor(compositeRGB, compositeRGBNumber, strR, strG, strB, numR, numG, numB);

					closestRGB = ColorProcessor.findClosestColor(currentRGB, colorList4);

					raster.setPixel(inputWidth + i, inputHeight + j, new int[]{closestRGB.getDecR(), closestRGB.getDecG(), closestRGB.getDecB()});
				} // End of for.
			} // End of for.

			ImageIO.write(outputImage, "jpg", new File("output/processed-foto-8-grid.jpg"));
		} // End of try.
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		} // End of catch.
	} // End of main method.
} // End of MultiPaletteProcessor class.
