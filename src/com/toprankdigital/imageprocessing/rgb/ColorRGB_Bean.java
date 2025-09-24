package com.toprankdigital.imageprocessing.rgb;

public class ColorRGB_Bean
{
	private String _valorRGB;
	
	private int _valorDecimal;
	
	private String _hexR;
	private String _hexG;
	private String _hexB;
	
	private int _decR;
	private int _decG;
	private int _decB;
	
	/* **************************************** */
	
	public ColorRGB_Bean()
	{
		
	} // Fin del constructor de la clase ColorRGB_Bean.
	
	/* **************************************** */
	
	public ColorRGB_Bean(String _valorRGB, int _valorDecimal, String _hexR, String _hexG, String _hexB, int _decR, int _decG, int _decB)
	{
		this._valorRGB = _valorRGB;
		
		this._valorDecimal = _valorDecimal;
		
		this._hexR = _hexR;
		this._hexG = _hexG;
		this._hexB = _hexB;
		
		this._decR = _decR;
		this._decG = _decG;
		this._decB = _decB;
	} // Fin del constructor de la clase ColorRGB_Bean.
	
	/* **************************************** */
	
	public ColorRGB_Bean(String _valorRGB) throws Exception
	{
		if(_valorRGB == null || _valorRGB.equals(""))
		{
			throw new Exception("Debe indicar el valor del color en rgb en formato RRGGBB.");
		} // Fin del if.
		else
		{
			if(_valorRGB.length() != 6)
			{
				throw new Exception("El formato correcto del color debe ser RRGGBB.");
			} // Fin del if.
		} // Fin del else.
		
		this._valorRGB = _valorRGB.toUpperCase();
		
		_valorDecimal = ColorRGB_Processor.cadenaHexadecimalEnEntero(_valorRGB);
		
		_hexR = "" + _valorRGB.charAt(0) + _valorRGB.charAt(1);
		_hexG = "" + _valorRGB.charAt(2) + _valorRGB.charAt(3);
		_hexB = "" + _valorRGB.charAt(4) + _valorRGB.charAt(5);
		
		_decR = ColorRGB_Processor.cadenaHexadecimalEnEntero(_hexR);
		_decG = ColorRGB_Processor.cadenaHexadecimalEnEntero(_hexG);
		_decB = ColorRGB_Processor.cadenaHexadecimalEnEntero(_hexB);
	} // Fin del constructor de la clase ColorRGB_Bean.
	
	/* **************************************** */
	
	public String valorRGB()
	{
		return _valorRGB;
	}
	
	public void valorRGB(String _valorRGB)
	{
		this._valorRGB = _valorRGB;
	}
	
	/* **************************************** */
	
	public int valorDecimal()
	{
		return _valorDecimal;
	}
	
	public void valorDecimal(int _valorDecimal)
	{
		this._valorDecimal = _valorDecimal;
	}
	
	/* **************************************** */
	
	public String hexR()
	{
		return _hexR;
	}
	
	public void hexR(String _hexR)
	{
		this._hexR = _hexR;
	}
	
	/* **************************************** */
	
	public String hexG()
	{
		return _hexG;
	}
	
	public void hexG(String _hexG)
	{
		this._hexG = _hexG;
	}
	
	/* **************************************** */
	
	public String hexB()
	{
		return _hexB;
	}
	
	public void hexB(String _hexB)
	{
		this._hexB = _hexB;
	}
	
	/* **************************************** */
	
	public int decR()
	{
		return _decR;
	}
	
	public void decR(int _decR)
	{
		this._decR = _decR;
	}
	
	/* **************************************** */
	
	public int decG()
	{
		return _decG;
	}
	
	public void decG(int _decG)
	{
		this._decG = _decG;
	}
	
	/* **************************************** */
	
	public int decB()
	{
		return _decB;
	}
	
	public void decB(int _decB)
	{
		this._decB = _decB;
	}
	
	/* **************************************** */
	
	public String toString()
	{
		String representacionObjeto = "";
		
		representacionObjeto += "_valorRGB" + " = " + _valorRGB;
		representacionObjeto += "\n";
		representacionObjeto += "_valorDecimal" + " = " + _valorDecimal;
		representacionObjeto += "\n";
		representacionObjeto += "_hexR" + " = " + _hexR;
		representacionObjeto += "\n";
		representacionObjeto += "_hexG" + " = " + _hexG;
		representacionObjeto += "\n";
		representacionObjeto += "_hexB" + " = " + _hexB;
		representacionObjeto += "\n";
		representacionObjeto += "_decR" + " = " + _decR;
		representacionObjeto += "\n";
		representacionObjeto += "_decG" + " = " + _decG;
		representacionObjeto += "\n";
		representacionObjeto += "_decB" + " = " + _decB;
		representacionObjeto += "\n";
		
		return representacionObjeto;
	} // Fin del metodo toString.
	
	/* **************************************** */
} // Fin de la clase ColorRGB_Bean.
