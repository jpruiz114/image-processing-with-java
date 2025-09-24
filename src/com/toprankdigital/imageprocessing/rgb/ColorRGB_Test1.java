package com.toprankdigital.imageprocessing.rgb;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;

public class ColorRGB_Test1
{
	public static void main(String argumentos[])
	{
		try
		{
			ColorRGB_Bean color1 = new ColorRGB_Bean("000000", 0, "00", "00", "00", 0, 0, 0);
			ColorRGB_Bean color2 = new ColorRGB_Bean("C86400", 13132800, "C8", "64", "00", 200, 100, 0);
			
			System.out.println("color1" + ":" + "\n" + color1);
			System.out.println("color2" + ":" + "\n" + color2);
			
			double distancia = 0;
			
			distancia = ColorRGB_Processor.calcularDistanciaEntreColores(color1, color2);
				
			System.out.println("distancia" + ":" + " " + distancia);
			
			Vector<ColorRGB_Bean> listaColoresRGB = ColorRGB_Processor.obtenerListaColores();
			
			ColorRGB_Bean colorMasCercano = ColorRGB_Processor.obtenerColorMasCercano(color2, listaColoresRGB);
			
			System.out.println("colorMasCercano" + ":" + "\n" + colorMasCercano);
			
			/* **************************************** */
			
			BufferedImage imagenEntrada = ImageIO.read(new java.io.File("assets/images/Foto-1.jpg"));
			
			int w = imagenEntrada.getWidth();
			int h = imagenEntrada.getHeight();
			
			/* **************************************** */
			
			BufferedImage imagenSalida = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
			
            WritableRaster raster = (WritableRaster)(imagenSalida.getRaster());
            
            int pixelActual = 0;
            
            int numR, numG, numB;
            
            String strR, strG, strB;
            
            String strRGB_Compuesto = "";
            
            int numRGB_Compuesto = 0;
            
            ColorRGB_Bean rgbActual = null;
            
            ColorRGB_Bean rgbMasCercano = null;
            
            for (int i=0; i<w; i++)
    		{
    			for (int j=0; j<h; j++)
    			{
    				pixelActual = imagenEntrada.getRGB(i, j);
    				
    				numR = (pixelActual >> 16) & 0xff;
    				numG = (pixelActual >> 8) & 0xff;
    				numB = (pixelActual) & 0xff;
    				
    				strR = ColorRGB_Processor.enteroEnCadenaHexadecimal(numR);
    				strG = ColorRGB_Processor.enteroEnCadenaHexadecimal(numG);
    				strB = ColorRGB_Processor.enteroEnCadenaHexadecimal(numB);
    				
    				strRGB_Compuesto = strR + strG + strB;
    				//System.out.println("strRGB_Compuesto" + " = " + strRGB_Compuesto);
    				
    				numRGB_Compuesto = Integer.parseInt(strRGB_Compuesto, 16);
    				//System.out.println("numRGB_Compuesto" + " = " + numRGB_Compuesto);
    				
    				rgbActual = new ColorRGB_Bean(strRGB_Compuesto, numRGB_Compuesto, strR, strG, strB, numR, numG, numB);
    				
    				//System.out.println("(r,g,b) en (i,j)" + " = " + "(" + r + "," + g + "," + b + ")");
    				//System.out.println("(r,g,b) en (i,j)" + " = " + "(" + strR + "," + strG + "," + strB + ")");
    				
    				rgbMasCercano = ColorRGB_Processor.obtenerColorMasCercano(rgbActual, listaColoresRGB);
    				
    				raster.setPixel(i, j, new int[]{rgbMasCercano.decR(), rgbMasCercano.decG(), rgbMasCercano.decB()});
    			} // Fin del for.
    		} // Fin del for.
            
            // Se guarda la nueva imagen.
            ImageIO.write(imagenSalida, "jpg", new File("output/processed-foto-1.jpg")); 
		} // Fin del try.
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		} // Fin del catch.
	} // Fin del metodo main.
} // Fin de la clase ColorRGB_Test1.
