package com.feb9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.Scanner;

public class SimpleTesting {

	private static void imprimirNombreArchivos() {
		File folder = new File("C:\\Users\\Aileen\\Documents\\programacion\\mysql\\curso 4");

		for (File file : folder.listFiles()) {
			if(file.getName().toLowerCase().endsWith(".mp4")) {
				System.out.println(file.getName());
				
			}

		}
	}

	private static void crearArchivos() {
		try {
			String ruta = "C:\\Users\\Aileen\\Documents\\programacion\\mysql\\curso 4\\filename.html";
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

	private static void leerArchivo() {
		File doc = new File("C:\\Users\\Aileen\\Documents\\programacion\\mysql\\curso 4\\filename.txt");
		Scanner obj = null;
		String contenido = "";

		try {
			obj = new Scanner(doc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (obj.hasNextLine()) {
			String linea = obj.nextLine();
			contenido += linea + "\n";
		}
		System.out.println("Lectura archivo");
		System.out.println(contenido);

	}

	private static void replaceJava() {
		System.out.println("String after replacing 'NOMBRE_ARCHIVO' with 'dog': ".replace("NOMBRE_ARCHIVO", "dog.mp4"));
	}

	public static void main(String[] args) throws ParseException {
		imprimirNombreArchivos();
		crearArchivos();
		leerArchivo();
		replaceJava();
	}
}
