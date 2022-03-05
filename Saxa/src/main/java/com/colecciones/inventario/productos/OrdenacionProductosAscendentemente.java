package com.colecciones.inventario.productos;

import java.util.Comparator;

public class OrdenacionProductosAscendentemente implements Comparator<String> {

	@Override
	public int compare(String primerObjeto, String segundoObjeto) {
		return primerObjeto.compareTo(segundoObjeto);
	}

}
