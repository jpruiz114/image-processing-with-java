package jeanpaul.colores.rgb;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Collections;
import java.util.Vector;

public class ColorRGB_EJB
{
	private static Vector<ColorRGB_Bean> listaColoresRGB;
	
	static
	{
		listaColoresRGB = new Vector<ColorRGB_Bean>();
		
		listaColoresRGB.add(new ColorRGB_Bean("000000", 0, "00", "00", "00", 0, 0, 0));
		listaColoresRGB.add(new ColorRGB_Bean("000080", 128, "00", "00", "80", 0, 0, 128));
		listaColoresRGB.add(new ColorRGB_Bean("00008B", 139, "00", "00", "8B", 0, 0, 139));
		listaColoresRGB.add(new ColorRGB_Bean("0000CD", 205, "00", "00", "CD", 0, 0, 205));
		listaColoresRGB.add(new ColorRGB_Bean("0000FF", 255, "00", "00", "FF", 0, 0, 255));
		listaColoresRGB.add(new ColorRGB_Bean("006400", 25600, "00", "64", "00", 0, 100, 0));
		listaColoresRGB.add(new ColorRGB_Bean("008000", 32768, "00", "80", "00", 0, 128, 0));
		listaColoresRGB.add(new ColorRGB_Bean("008080", 32896, "00", "80", "80", 0, 128, 128));
		listaColoresRGB.add(new ColorRGB_Bean("008B8B", 35723, "00", "8B", "8B", 0, 139, 139));
		listaColoresRGB.add(new ColorRGB_Bean("00BFFF", 49151, "00", "BF", "FF", 0, 191, 255));
		listaColoresRGB.add(new ColorRGB_Bean("00CED1", 52945, "00", "CE", "D1", 0, 206, 209));
		listaColoresRGB.add(new ColorRGB_Bean("00FA9A", 64154, "00", "FA", "9A", 0, 250, 154));
		listaColoresRGB.add(new ColorRGB_Bean("00FF00", 65280, "00", "FF", "00", 0, 255, 0));
		listaColoresRGB.add(new ColorRGB_Bean("00FF7F", 65407, "00", "FF", "7F", 0, 255, 127));
		listaColoresRGB.add(new ColorRGB_Bean("00FFFF", 65535, "00", "FF", "FF", 0, 255, 255));
		listaColoresRGB.add(new ColorRGB_Bean("191970", 1644912, "19", "19", "70", 25, 25, 112));
		listaColoresRGB.add(new ColorRGB_Bean("1E90FF", 2003199, "1E", "90", "FF", 30, 144, 255));
		listaColoresRGB.add(new ColorRGB_Bean("20B2AA", 2142890, "20", "B2", "AA", 32, 178, 170));
		listaColoresRGB.add(new ColorRGB_Bean("228B22", 2263842, "22", "8B", "22", 34, 139, 34));
		listaColoresRGB.add(new ColorRGB_Bean("2E8B57", 3050327, "2E", "8B", "57", 46, 139, 87));
		listaColoresRGB.add(new ColorRGB_Bean("2F4F4F", 3100495, "2F", "4F", "4F", 47, 79, 79));
		listaColoresRGB.add(new ColorRGB_Bean("32CD32", 3329330, "32", "CD", "32", 50, 205, 50));
		listaColoresRGB.add(new ColorRGB_Bean("3CB371", 3978097, "3C", "B3", "71", 60, 179, 113));
		listaColoresRGB.add(new ColorRGB_Bean("40E0D0", 4251856, "40", "E0", "D0", 64, 224, 208));
		listaColoresRGB.add(new ColorRGB_Bean("4169E1", 4286945, "41", "69", "E1", 65, 105, 225));
		listaColoresRGB.add(new ColorRGB_Bean("4682B4", 4620980, "46", "82", "B4", 70, 130, 180));
		listaColoresRGB.add(new ColorRGB_Bean("483D8B", 4734347, "48", "3D", "8B", 72, 61, 139));
		listaColoresRGB.add(new ColorRGB_Bean("48D1CC", 4772300, "48", "D1", "CC", 72, 209, 204));
		listaColoresRGB.add(new ColorRGB_Bean("4B0082", 4915330, "4B", "00", "82", 75, 0, 130));
		listaColoresRGB.add(new ColorRGB_Bean("556B2F", 5597999, "55", "6B", "2F", 85, 107, 47));
		listaColoresRGB.add(new ColorRGB_Bean("5F9EA0", 6266528, "5F", "9E", "A0", 95, 158, 160));
		listaColoresRGB.add(new ColorRGB_Bean("6495ED", 6591981, "64", "95", "ED", 100, 149, 237));
		listaColoresRGB.add(new ColorRGB_Bean("66CDAA", 6737322, "66", "CD", "AA", 102, 205, 170));
		listaColoresRGB.add(new ColorRGB_Bean("696969", 6908265, "69", "69", "69", 105, 105, 105));
		listaColoresRGB.add(new ColorRGB_Bean("6A5ACD", 6970061, "6A", "5A", "CD", 106, 90, 205));
		listaColoresRGB.add(new ColorRGB_Bean("6B8E23", 7048739, "6B", "8E", "23", 107, 142, 35));
		listaColoresRGB.add(new ColorRGB_Bean("708090", 7372944, "70", "80", "90", 112, 128, 144));
		listaColoresRGB.add(new ColorRGB_Bean("778899", 7833753, "77", "88", "99", 119, 136, 153));
		listaColoresRGB.add(new ColorRGB_Bean("7B68EE", 8087790, "7B", "68", "EE", 123, 104, 238));
		listaColoresRGB.add(new ColorRGB_Bean("7CFC00", 8190976, "7C", "FC", "00", 124, 252, 0));
		listaColoresRGB.add(new ColorRGB_Bean("7FFF00", 8388352, "7F", "FF", "00", 127, 255, 0));
		listaColoresRGB.add(new ColorRGB_Bean("7FFFD4", 8388564, "7F", "FF", "D4", 127, 255, 212));
		listaColoresRGB.add(new ColorRGB_Bean("800000", 8388608, "80", "00", "00", 128, 0, 0));
		listaColoresRGB.add(new ColorRGB_Bean("800080", 8388736, "80", "00", "80", 128, 0, 128));
		listaColoresRGB.add(new ColorRGB_Bean("808000", 8421376, "80", "80", "00", 128, 128, 0));
		listaColoresRGB.add(new ColorRGB_Bean("808080", 8421504, "80", "80", "80", 128, 128, 128));
		listaColoresRGB.add(new ColorRGB_Bean("87CEEB", 8900331, "87", "CE", "EB", 135, 206, 235));
		listaColoresRGB.add(new ColorRGB_Bean("87CEFA", 8900346, "87", "CE", "FA", 135, 206, 250));
		listaColoresRGB.add(new ColorRGB_Bean("8A2BE2", 9055202, "8A", "2B", "E2", 138, 43, 226));
		listaColoresRGB.add(new ColorRGB_Bean("8B0000", 9109504, "8B", "00", "00", 139, 0, 0));
		listaColoresRGB.add(new ColorRGB_Bean("8B008B", 9109643, "8B", "00", "8B", 139, 0, 139));
		listaColoresRGB.add(new ColorRGB_Bean("8B4513", 9127187, "8B", "45", "13", 139, 69, 19));
		listaColoresRGB.add(new ColorRGB_Bean("8FBC8F", 9419919, "8F", "BC", "8F", 143, 188, 143));
		listaColoresRGB.add(new ColorRGB_Bean("90EE90", 9498256, "90", "EE", "90", 144, 238, 144));
		listaColoresRGB.add(new ColorRGB_Bean("9370D8", 9662680, "93", "70", "D8", 147, 112, 216));
		listaColoresRGB.add(new ColorRGB_Bean("9400D3", 9699539, "94", "00", "D3", 148, 0, 211));
		listaColoresRGB.add(new ColorRGB_Bean("98FB98", 10025880, "98", "FB", "98", 152, 251, 152));
		listaColoresRGB.add(new ColorRGB_Bean("9932CC", 10040012, "99", "32", "CC", 153, 50, 204));
		listaColoresRGB.add(new ColorRGB_Bean("9ACD32", 10145074, "9A", "CD", "32", 154, 205, 50));
		listaColoresRGB.add(new ColorRGB_Bean("A0522D", 10506797, "A0", "52", "2D", 160, 82, 45));
		listaColoresRGB.add(new ColorRGB_Bean("A52A2A", 10824234, "A5", "2A", "2A", 165, 42, 42));
		listaColoresRGB.add(new ColorRGB_Bean("A9A9A9", 11119017, "A9", "A9", "A9", 169, 169, 169));
		listaColoresRGB.add(new ColorRGB_Bean("ADD8E6", 11393254, "AD", "D8", "E6", 173, 216, 230));
		listaColoresRGB.add(new ColorRGB_Bean("ADFF2F", 11403055, "AD", "FF", "2F", 173, 255, 47));
		listaColoresRGB.add(new ColorRGB_Bean("AFEEEE", 11529966, "AF", "EE", "EE", 175, 238, 238));
		listaColoresRGB.add(new ColorRGB_Bean("B0C4DE", 11584734, "B0", "C4", "DE", 176, 196, 222));
		listaColoresRGB.add(new ColorRGB_Bean("B0E0E6", 11591910, "B0", "E0", "E6", 176, 224, 230));
		listaColoresRGB.add(new ColorRGB_Bean("B22222", 11674146, "B2", "22", "22", 178, 34, 34));
		listaColoresRGB.add(new ColorRGB_Bean("B8860B", 12092939, "B8", "86", "0B", 184, 134, 11));
		listaColoresRGB.add(new ColorRGB_Bean("BA55D3", 12211667, "BA", "55", "D3", 186, 85, 211));
		listaColoresRGB.add(new ColorRGB_Bean("BC8F8F", 12357519, "BC", "8F", "8F", 188, 143, 143));
		listaColoresRGB.add(new ColorRGB_Bean("BDB76B", 12433259, "BD", "B7", "6B", 189, 183, 107));
		listaColoresRGB.add(new ColorRGB_Bean("C0C0C0", 12632256, "C0", "C0", "C0", 192, 192, 192));
		listaColoresRGB.add(new ColorRGB_Bean("C71585", 13047173, "C7", "15", "85", 199, 21, 133));
		listaColoresRGB.add(new ColorRGB_Bean("CD5C5C", 13458524, "CD", "5C", "5C", 205, 92, 92));
		listaColoresRGB.add(new ColorRGB_Bean("CD853F", 13468991, "CD", "85", "3F", 205, 133, 63));
		listaColoresRGB.add(new ColorRGB_Bean("D2691E", 13789470, "D2", "69", "1E", 210, 105, 30));
		listaColoresRGB.add(new ColorRGB_Bean("D2B48C", 13808780, "D2", "B4", "8C", 210, 180, 140));
		listaColoresRGB.add(new ColorRGB_Bean("D3D3D3", 13882323, "D3", "D3", "D3", 211, 211, 211));
		listaColoresRGB.add(new ColorRGB_Bean("D87093", 14184595, "D8", "70", "93", 216, 112, 147));
		listaColoresRGB.add(new ColorRGB_Bean("D8BFD8", 14204888, "D8", "BF", "D8", 216, 191, 216));
		listaColoresRGB.add(new ColorRGB_Bean("DA70D6", 14315734, "DA", "70", "D6", 218, 112, 214));
		listaColoresRGB.add(new ColorRGB_Bean("DAA520", 14329120, "DA", "A5", "20", 218, 165, 32));
		listaColoresRGB.add(new ColorRGB_Bean("DC143C", 14423100, "DC", "14", "3C", 220, 20, 60));
		listaColoresRGB.add(new ColorRGB_Bean("DCDCDC", 14474460, "DC", "DC", "DC", 220, 220, 220));
		listaColoresRGB.add(new ColorRGB_Bean("DDA0DD", 14524637, "DD", "A0", "DD", 221, 160, 221));
		listaColoresRGB.add(new ColorRGB_Bean("DEB887", 14596231, "DE", "B8", "87", 222, 184, 135));
		listaColoresRGB.add(new ColorRGB_Bean("E0FFFF", 14745599, "E0", "FF", "FF", 224, 255, 255));
		listaColoresRGB.add(new ColorRGB_Bean("E6E6FA", 15132410, "E6", "E6", "FA", 230, 230, 250));
		listaColoresRGB.add(new ColorRGB_Bean("E9967A", 15308410, "E9", "96", "7A", 233, 150, 122));
		listaColoresRGB.add(new ColorRGB_Bean("EE82EE", 15631086, "EE", "82", "EE", 238, 130, 238));
		listaColoresRGB.add(new ColorRGB_Bean("EEE8AA", 15657130, "EE", "E8", "AA", 238, 232, 170));
		listaColoresRGB.add(new ColorRGB_Bean("F08080", 15761536, "F0", "80", "80", 240, 128, 128));
		listaColoresRGB.add(new ColorRGB_Bean("F0E68C", 15787660, "F0", "E6", "8C", 240, 230, 140));
		listaColoresRGB.add(new ColorRGB_Bean("F0F8FF", 15792383, "F0", "F8", "FF", 240, 248, 255));
		listaColoresRGB.add(new ColorRGB_Bean("F0FFF0", 15794160, "F0", "FF", "F0", 240, 255, 240));
		listaColoresRGB.add(new ColorRGB_Bean("F0FFFF", 15794175, "F0", "FF", "FF", 240, 255, 255));
		listaColoresRGB.add(new ColorRGB_Bean("F4A460", 16032864, "F4", "A4", "60", 244, 164, 96));
		listaColoresRGB.add(new ColorRGB_Bean("F5DEB3", 16113331, "F5", "DE", "B3", 245, 222, 179));
		listaColoresRGB.add(new ColorRGB_Bean("F5F5DC", 16119260, "F5", "F5", "DC", 245, 245, 220));
		listaColoresRGB.add(new ColorRGB_Bean("F5F5F5", 16119285, "F5", "F5", "F5", 245, 245, 245));
		listaColoresRGB.add(new ColorRGB_Bean("F5FFFA", 16121850, "F5", "FF", "FA", 245, 255, 250));
		listaColoresRGB.add(new ColorRGB_Bean("F8F8FF", 16316671, "F8", "F8", "FF", 248, 248, 255));
		listaColoresRGB.add(new ColorRGB_Bean("FA8072", 16416882, "FA", "80", "72", 250, 128, 114));
		listaColoresRGB.add(new ColorRGB_Bean("FAEBD7", 16444375, "FA", "EB", "D7", 250, 235, 215));
		listaColoresRGB.add(new ColorRGB_Bean("FAF0E6", 16445670, "FA", "F0", "E6", 250, 240, 230));
		listaColoresRGB.add(new ColorRGB_Bean("FAFAD2", 16448210, "FA", "FA", "D2", 250, 250, 210));
		listaColoresRGB.add(new ColorRGB_Bean("FDF5E6", 16643558, "FD", "F5", "E6", 253, 245, 230));
		listaColoresRGB.add(new ColorRGB_Bean("FF0000", 16711680, "FF", "00", "00", 255, 0, 0));
		listaColoresRGB.add(new ColorRGB_Bean("FF00FF", 16711935, "FF", "00", "FF", 255, 0, 255));
		listaColoresRGB.add(new ColorRGB_Bean("FF1493", 16716947, "FF", "14", "93", 255, 20, 147));
		listaColoresRGB.add(new ColorRGB_Bean("FF4500", 16729344, "FF", "45", "00", 255, 69, 0));
		listaColoresRGB.add(new ColorRGB_Bean("FF6347", 16737095, "FF", "63", "47", 255, 99, 71));
		listaColoresRGB.add(new ColorRGB_Bean("FF69B4", 16738740, "FF", "69", "B4", 255, 105, 180));
		listaColoresRGB.add(new ColorRGB_Bean("FF7F50", 16744272, "FF", "7F", "50", 255, 127, 80));
		listaColoresRGB.add(new ColorRGB_Bean("FF8C00", 16747520, "FF", "8C", "00", 255, 140, 0));
		listaColoresRGB.add(new ColorRGB_Bean("FFA07A", 16752762, "FF", "A0", "7A", 255, 160, 122));
		listaColoresRGB.add(new ColorRGB_Bean("FFA500", 16753920, "FF", "A5", "00", 255, 165, 0));
		listaColoresRGB.add(new ColorRGB_Bean("FFB6C1", 16758465, "FF", "B6", "C1", 255, 182, 193));
		listaColoresRGB.add(new ColorRGB_Bean("FFC0CB", 16761035, "FF", "C0", "CB", 255, 192, 203));
		listaColoresRGB.add(new ColorRGB_Bean("FFD700", 16766720, "FF", "D7", "00", 255, 215, 0));
		listaColoresRGB.add(new ColorRGB_Bean("FFDAB9", 16767673, "FF", "DA", "B9", 255, 218, 185));
		listaColoresRGB.add(new ColorRGB_Bean("FFDEAD", 16768685, "FF", "DE", "AD", 255, 222, 173));
		listaColoresRGB.add(new ColorRGB_Bean("FFE4B5", 16770229, "FF", "E4", "B5", 255, 228, 181));
		listaColoresRGB.add(new ColorRGB_Bean("FFE4C4", 16770244, "FF", "E4", "C4", 255, 228, 196));
		listaColoresRGB.add(new ColorRGB_Bean("FFE4E1", 16770273, "FF", "E4", "E1", 255, 228, 225));
		listaColoresRGB.add(new ColorRGB_Bean("FFEBCD", 16772045, "FF", "EB", "CD", 255, 235, 205));
		listaColoresRGB.add(new ColorRGB_Bean("FFEFD5", 16773077, "FF", "EF", "D5", 255, 239, 213));
		listaColoresRGB.add(new ColorRGB_Bean("FFF0F5", 16773365, "FF", "F0", "F5", 255, 240, 245));
		listaColoresRGB.add(new ColorRGB_Bean("FFF5EE", 16774638, "FF", "F5", "EE", 255, 245, 238));
		listaColoresRGB.add(new ColorRGB_Bean("FFF8DC", 16775388, "FF", "F8", "DC", 255, 248, 220));
		listaColoresRGB.add(new ColorRGB_Bean("FFFACD", 16775885, "FF", "FA", "CD", 255, 250, 205));
		listaColoresRGB.add(new ColorRGB_Bean("FFFAF0", 16775920, "FF", "FA", "F0", 255, 250, 240));
		listaColoresRGB.add(new ColorRGB_Bean("FFFAFA", 16775930, "FF", "FA", "FA", 255, 250, 250));
		listaColoresRGB.add(new ColorRGB_Bean("FFFF00", 16776960, "FF", "FF", "00", 255, 255, 0));
		listaColoresRGB.add(new ColorRGB_Bean("FFFFE0", 16777184, "FF", "FF", "E0", 255, 255, 224));
		listaColoresRGB.add(new ColorRGB_Bean("FFFFF0", 16777200, "FF", "FF", "F0", 255, 255, 240));
		listaColoresRGB.add(new ColorRGB_Bean("FFFFFF", 16777215, "FF", "FF", "FF", 255, 255, 255));
	} // Fin del bloque estático.
	
	public static Vector<ColorRGB_Bean> obtenerListaColores()
	{
		return listaColoresRGB;
	} // Fin del método obtenerListaColores.
	
	public static double calcularDistanciaEntreColores(ColorRGB_Bean color1, ColorRGB_Bean color2) throws Exception
	{
		if(color1 == null)
		{
			throw new Exception("Debe indicar el color 1.");
		} // Fin del if.
		
		if(color2 == null)
		{
			throw new Exception("Debe indicar el color 2.");
		} // Fin del if.
		
		double distancia = 0;
		
		int r1, g1, b1;
		int r2, g2, b2;
		
		r1 = color1.decR();
		g1 = color1.decG();
		b1 = color1.decB();
		
		r2 = color2.decR();
		g2 = color2.decG();
		b2 = color2.decB();
		
		distancia = Math.sqrt(Math.pow(r1 - r2, 2) + Math.pow(g1 - g2, 2) + Math.pow(b1 - b2, 2));
		
		return distancia;
	} // Fin del método calcularDistanciaEntreColores.
	
	public static ColorRGB_Bean obtenerColorMasCercano(ColorRGB_Bean color, Vector<ColorRGB_Bean> listaColores) throws Exception
	{
		if(color == null)
		{
			throw new Exception("Debe indicar el color.");
		} // Fin del if.
		
		if(listaColores == null)
		{
			throw new Exception("Debe indicar la lista de colores.");
		} // Fin del if.
		else if(listaColores.size() == 0)
		{
			throw new Exception("La lista de colores debe contener al menos un elemento.");
		} // Fin del else if.
		
		ColorRGB_Bean colorMasCercano = null;
		
		ColorRGB_Bean colorActual = null;
		
		double distanciaIteracionActual = 0;
		
		/* **************************************** */
		
		Vector<ColorRGB_ComparativoBean> listaComparaciones = new Vector<ColorRGB_ComparativoBean>();
		
		ColorRGB_ComparativoBean comparativoActual = null;
		
		/* **************************************** */
		
		for(int i=0; i<listaColores.size(); i++)
		{
			colorActual = listaColores.get(i);
			
			distanciaIteracionActual = calcularDistanciaEntreColores(color, colorActual);
			
			comparativoActual = new ColorRGB_ComparativoBean();
			comparativoActual.color1(color);
			comparativoActual.color2(colorActual);
			comparativoActual.distancia(distanciaIteracionActual);
			
			listaComparaciones.add(comparativoActual);
		} // Fin del for.
		
		/* **************************************** */
		
		//int numeroElementos = listaComparaciones.size();
		//System.out.println("numeroElementos" + " = " + numeroElementos);
		
		Collections.sort(listaComparaciones);
		
		/* **************************************** */
		
		/*for(int i=0; i<listaComparaciones.size(); i++)
		{
			//System.out.println(listaComparaciones.get(i).distancia());
			
			System.out.println(listaComparaciones.get(i));
		} // Fin del for.*/
		
		ColorRGB_ComparativoBean minimo = listaComparaciones.get(listaComparaciones.size() - 1);
		//System.out.println("minimo" + " = " + minimo);
		
		//double distanciaMinimo = minimo.distancia();
		//System.out.println("distanciaMinimo" + " = " + distanciaMinimo);
		
		colorMasCercano = minimo.color2();
		//System.out.println("colorMasCercano" + ":" + "\n" + colorMasCercano);
		
		return colorMasCercano;
	} // Fin del método obtenerColorMasCercano.
	
	public static String enteroEnCadenaHexadecimal(int valorEntrada)
	{
		String valorSalida = Integer.toHexString(valorEntrada);
		
		if(valorSalida.length() == 1)
		{
			valorSalida = "0" + valorSalida;
		} // Fin del if.
		
		return valorSalida;
	} // Fin del método enteroEnCadenaHexadecimal.
	
	public static int cadenaHexadecimalEnEntero(String valorEntrada) throws Exception
	{
		if(valorEntrada == null || valorEntrada == "")
		{
			throw new Exception("Debe indicar el valor de entrada");
		} // Fin del if.
		
		int valorSalida = 0;
		
		valorSalida = Integer.parseInt(valorEntrada, 16);  
		
		return valorSalida;
	} // Fin del método cadenaHexadecimalEnEntero.
	
	public static BufferedImage deepCopy(BufferedImage bi)
	{
		ColorModel cm = bi.getColorModel();
		
		boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
		
		WritableRaster raster = bi.copyData(null);
		
		return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
	} // Fin del método deepCopy.
} // Fin de la clase ColorRGB_Bean_EJB.