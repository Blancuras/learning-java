package com.colecciones.inventario.productos;

import java.util.Comparator;

public class OrdenacionProductosDescendentemente implements Comparator<String> {

	@Override
	public int compare(String primerObjeto, String segundoObjeto) {
		return segundoObjeto.compareTo(primerObjeto);
	}

}
