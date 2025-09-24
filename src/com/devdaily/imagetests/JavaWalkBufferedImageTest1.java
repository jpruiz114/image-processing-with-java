package com.devdaily.imagetests;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JavaWalkBufferedImageTest1 extends Component
{
	private static final long serialVersionUID = 2179534067899124603L;
	
	public static void main(String[] foo)
	{
		new JavaWalkBufferedImageTest1();
	}
	
	public void printPixelARGB(int pixel)
	{
		int alpha = (pixel >> 24) & 0xff;
		int red = (pixel >> 16) & 0xff;
		int green = (pixel >> 8) & 0xff;
		int blue = (pixel) & 0xff;
		
		System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
	}
	
	private void marchThroughImage(BufferedImage image)
	{
		int w = image.getWidth();
		int h = image.getHeight();
		
		System.out.println("width, height: " + w + ", " + h);
		
		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < w; j++)
			{
				System.out.println("x,y: " + j + ", " + i);
				int pixel = image.getRGB(j, i);
				printPixelARGB(pixel);
				System.out.println("");
			}
		}
	}
	
	public JavaWalkBufferedImageTest1()
	{
		try
		{
			BufferedImage image = ImageIO.read(new java.io.File("assets/images/Foto-3.jpg"));
			marchThroughImage(image);
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
}