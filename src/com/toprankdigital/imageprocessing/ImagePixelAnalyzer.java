package com.toprankdigital.imageprocessing;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagePixelAnalyzer extends Component
{
	private static final long serialVersionUID = 2179534067899124603L;
	
	public static void main(String[] args)
	{
		new ImagePixelAnalyzer();
	}
	
	public void printPixelARGB(int pixel)
	{
		int alpha = (pixel >> 24) & 0xff;
		int red = (pixel >> 16) & 0xff;
		int green = (pixel >> 8) & 0xff;
		int blue = (pixel) & 0xff;
		
		System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
	}
	
	private void walkThroughImage(BufferedImage image)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		
		System.out.println("width, height: " + width + ", " + height);
		
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				System.out.println("x,y: " + j + ", " + i);
				int pixel = image.getRGB(j, i);
				printPixelARGB(pixel);
				System.out.println("");
			}
		}
	}
	
	public ImagePixelAnalyzer()
	{
		try
		{
			BufferedImage image = ImageIO.read(new java.io.File("assets/images/Foto-3.jpg"));
			walkThroughImage(image);
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
