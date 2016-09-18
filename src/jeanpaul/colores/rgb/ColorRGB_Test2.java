package jeanpaul.colores.rgb;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;

public class ColorRGB_Test2
{
	public static void main(String argumentos[])
	{
		try
		{
			ColorRGB_Bean color1 = new ColorRGB_Bean("FFD39B");
			ColorRGB_Bean color2 = new ColorRGB_Bean("CAFF70");
			ColorRGB_Bean color3 = new ColorRGB_Bean("FF3030");
			ColorRGB_Bean color4 = new ColorRGB_Bean("236B8E");

			ColorRGB_Bean colorBlanco = new ColorRGB_Bean("FFFFFF");

			ColorRGB_Bean colorNegro = new ColorRGB_Bean("000000");

			Vector<ColorRGB_Bean> listaColores1 = new Vector<ColorRGB_Bean>();
			listaColores1.add(color1);
			listaColores1.add(colorBlanco);
			listaColores1.add(colorNegro);

			Vector<ColorRGB_Bean> listaColores2 = new Vector<ColorRGB_Bean>();
			listaColores2.add(color2);
			listaColores2.add(colorBlanco);
			listaColores2.add(colorNegro);

			Vector<ColorRGB_Bean> listaColores3 = new Vector<ColorRGB_Bean>();
			listaColores3.add(color3);
			listaColores3.add(colorBlanco);
			listaColores3.add(colorNegro);

			Vector<ColorRGB_Bean> listaColores4 = new Vector<ColorRGB_Bean>();
			listaColores4.add(color4);
			listaColores4.add(colorBlanco);
			listaColores4.add(colorNegro);

			BufferedImage imagenEntrada = ImageIO.read(new java.io.File("assets\\images\\Foto-8.jpg"));

			int wEntrada = imagenEntrada.getWidth();
			System.out.println("wEntrada" + " = " + wEntrada);

			int hEntrada = imagenEntrada.getHeight();
			System.out.println("hEntrada" + " = " + hEntrada);

			BufferedImage imagenSalida = new BufferedImage(wEntrada * 2, hEntrada * 2, BufferedImage.TYPE_INT_RGB);

			WritableRaster raster = (WritableRaster)(imagenSalida.getRaster());

			int pixelActual = 0;

			int numR, numG, numB;

			String strR, strG, strB;

			String strRGB_Compuesto = "";

			int numRGB_Compuesto = 0;

			ColorRGB_Bean rgbActual = null;

			ColorRGB_Bean rgbMasCercano = null;

			BufferedImage img1 = ColorRGB_EJB.deepCopy(imagenEntrada);
			BufferedImage img2 = ColorRGB_EJB.deepCopy(imagenEntrada);
			BufferedImage img3 = ColorRGB_EJB.deepCopy(imagenEntrada);
			BufferedImage img4 = ColorRGB_EJB.deepCopy(imagenEntrada);

			// Análisis para la foto [1, 1]

			for (int i=0; i<wEntrada; i++) {
				for (int j=0; j<hEntrada; j++) {
					pixelActual = img1.getRGB(i, j);

					numR = (pixelActual >> 16) & 0xff;
					numG = (pixelActual >> 8) & 0xff;
					numB = (pixelActual) & 0xff;

					strR = ColorRGB_EJB.enteroEnCadenaHexadecimal(numR);
					strG = ColorRGB_EJB.enteroEnCadenaHexadecimal(numG);
					strB = ColorRGB_EJB.enteroEnCadenaHexadecimal(numB);

					strRGB_Compuesto = strR + strG + strB;

					numRGB_Compuesto = Integer.parseInt(strRGB_Compuesto, 16);

					rgbActual = new ColorRGB_Bean(strRGB_Compuesto, numRGB_Compuesto, strR, strG, strB, numR, numG, numB);

					rgbMasCercano = ColorRGB_EJB.obtenerColorMasCercano(rgbActual, listaColores1);

					raster.setPixel(i, j, new int[]{rgbMasCercano.decR(), rgbMasCercano.decG(), rgbMasCercano.decB()});
				} // Fin del for.
			} // Fin del for.

			// Análisis para la foto [1, 2]

			for (int i=0; i<wEntrada; i++) {
				for (int j=0; j<hEntrada; j++) {
					pixelActual = img2.getRGB(i, j);

					numR = (pixelActual >> 16) & 0xff;
					numG = (pixelActual >> 8) & 0xff;
					numB = (pixelActual) & 0xff;

					strR = ColorRGB_EJB.enteroEnCadenaHexadecimal(numR);
					strG = ColorRGB_EJB.enteroEnCadenaHexadecimal(numG);
					strB = ColorRGB_EJB.enteroEnCadenaHexadecimal(numB);

					strRGB_Compuesto = strR + strG + strB;

					numRGB_Compuesto = Integer.parseInt(strRGB_Compuesto, 16);

					rgbActual = new ColorRGB_Bean(strRGB_Compuesto, numRGB_Compuesto, strR, strG, strB, numR, numG, numB);

					rgbMasCercano = ColorRGB_EJB.obtenerColorMasCercano(rgbActual, listaColores2);

					raster.setPixel(wEntrada + i, j, new int[]{rgbMasCercano.decR(), rgbMasCercano.decG(), rgbMasCercano.decB()});
				} // Fin del for.
			} // Fin del for.

			// Análisis para la foto [2, 1]

			for (int i=0; i<wEntrada; i++) {
				for (int j=0; j<hEntrada; j++) {
					pixelActual = img3.getRGB(i, j);

					numR = (pixelActual >> 16) & 0xff;
					numG = (pixelActual >> 8) & 0xff;
					numB = (pixelActual) & 0xff;

					strR = ColorRGB_EJB.enteroEnCadenaHexadecimal(numR);
					strG = ColorRGB_EJB.enteroEnCadenaHexadecimal(numG);
					strB = ColorRGB_EJB.enteroEnCadenaHexadecimal(numB);

					strRGB_Compuesto = strR + strG + strB;

					numRGB_Compuesto = Integer.parseInt(strRGB_Compuesto, 16);

					rgbActual = new ColorRGB_Bean(strRGB_Compuesto, numRGB_Compuesto, strR, strG, strB, numR, numG, numB);

					rgbMasCercano = ColorRGB_EJB.obtenerColorMasCercano(rgbActual, listaColores3);

					raster.setPixel(i, hEntrada + j, new int[]{rgbMasCercano.decR(), rgbMasCercano.decG(), rgbMasCercano.decB()});
				} // Fin del for.
			} // Fin del for.

			// Análisis para la foto [2, 2]

			for (int i=0; i<wEntrada; i++) {
				for (int j=0; j<hEntrada; j++) {
					pixelActual = img4.getRGB(i, j);

					numR = (pixelActual >> 16) & 0xff;
					numG = (pixelActual >> 8) & 0xff;
					numB = (pixelActual) & 0xff;

					strR = ColorRGB_EJB.enteroEnCadenaHexadecimal(numR);
					strG = ColorRGB_EJB.enteroEnCadenaHexadecimal(numG);
					strB = ColorRGB_EJB.enteroEnCadenaHexadecimal(numB);

					strRGB_Compuesto = strR + strG + strB;

					numRGB_Compuesto = Integer.parseInt(strRGB_Compuesto, 16);

					rgbActual = new ColorRGB_Bean(strRGB_Compuesto, numRGB_Compuesto, strR, strG, strB, numR, numG, numB);

					rgbMasCercano = ColorRGB_EJB.obtenerColorMasCercano(rgbActual, listaColores4);

					raster.setPixel(wEntrada + i, hEntrada + j, new int[]{rgbMasCercano.decR(), rgbMasCercano.decG(), rgbMasCercano.decB()});
				} // Fin del for.
			} // Fin del for.

			ImageIO.write(imagenSalida, "jpg", new File("Salida.jpg"));
		} // Fin del try.
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		} // Fin del catch.
	} // Fin del mï¿½todo main.
} // Fin de la clase ColorRGB_Test2.
