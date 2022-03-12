package com.feb9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CrearArchivosHtml {
	

	public static void main(String[] args) {

		File folder = new File("C:\\Users\\Aileen\\Documents\\programacion\\mysql\\curso 4");

		for (File file : folder.listFiles()) {
			if (file.getName().toLowerCase().endsWith(".mp4")) {
				System.out.println(file.getName()); //obtengo el nombre del archivo

				crearArchivo(file.getName());
			} 
		}
	}

	private static void crearArchivo(String nombreArchivo) {
		try {
			String ruta = "C:\\Users\\Aileen\\Documents\\programacion\\mysql\\curso 4\\nombreArchivo.html";
			String contenido = "Contenido de ejemplo";
			File file = new File(ruta);
			// Si el archivo no existe es creado
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
