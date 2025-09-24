package com.toprankdigital.imageprocessing.rgb;

public class ColorRGB_ComparativoBean implements Comparable<ColorRGB_ComparativoBean>
{
	private ColorRGB_Bean _color1;
	private ColorRGB_Bean _color2;
	
	private double _distancia;
	
	public ColorRGB_ComparativoBean()
	{
		
	} // Fin del constructor de la clase ColorRGB_ComparativoBean.
	
	public ColorRGB_Bean color1()
	{
		return _color1;
	}
	
	public void color1(ColorRGB_Bean _color1)
	{
		this._color1 = _color1;
	}
	
	public ColorRGB_Bean color2()
	{
		return _color2;
	}
	
	public void color2(ColorRGB_Bean _color2)
	{
		this._color2 = _color2;
	}
	
	public double distancia()
	{
		return _distancia;
	}
	
	public void distancia(double _distancia)
	{
		this._distancia = _distancia;
	}

	@Override
	public int compareTo(ColorRGB_ComparativoBean elementoComparacion)
	{
		int resultadoComparacion = 0;
		
		if(elementoComparacion.distancia() < distancia())
		{
			resultadoComparacion = -1;
		} // Fin del if.
		
		if(elementoComparacion.distancia() == distancia())
		{
			resultadoComparacion = 0;
		} // Fin del if.
		
		if(elementoComparacion.distancia() > distancia())
		{
			resultadoComparacion = 1;
		} // Fin del if.
		
		return resultadoComparacion;
	} // Fin del metodo compareTo.
	
	public String toString()
	{
		String representacionObjeto = "";
		
		representacionObjeto += "Distancia entre " + "#" + _color1.valorRGB() + " y " + "#" + _color2.valorRGB() + " = " + _distancia;
		
		return representacionObjeto;
	} // Fin del metodo toString.
} // Fin de la clase ColorRGB_ComparativoBean.
