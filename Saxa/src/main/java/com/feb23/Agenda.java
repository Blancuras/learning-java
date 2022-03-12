package com.feb23;

public class Agenda {

	private Contacto contactos[];

	// Le establecemos un tamaño por defecto de 10 contactos
	public Agenda() {
		contactos = new Contacto[10]; //constructor
	}

	public Agenda(int tamaño) {
		contactos = new Contacto[tamaño];
	}

	// Creamos el metodo para añadir contactos a la agenda
	public void añadirContacto(Contacto contacto) {
		if(comprobarSiExisteContacto(contacto)) {
			System.out.println("\nYa existe un contacto con ese nombre, por favor digite otro nombre");
		} else if(comprobarSiLaAgendaEstaLlena()) {
			System.out.println("\nLa agenda esta llena");
		} else {
			boolean registrado = false; 
			for(int indice = 0; indice < contactos.length && !registrado; indice++) {
				if(contactos[indice] == null) {
					contactos[indice] = contacto; 
					registrado = true; 
				}
			} 
			if(registrado) { //registrado == true
				System.out.println("\nEl contacto se ha registrado con exito ");
			} else {
				System.out.println("\nNo se ha podido registrar el contacto");
			}
		}
	}

	// Creamos el metodo para comprobar si existe un contacto con el mismo nombre
	public boolean comprobarSiExisteContacto(Contacto contacto) {
		for (int indice = 0; indice < contactos.length; indice++) {
			if (contactos[indice] != null && contactos[indice].equals(contacto)) {
				return true;
			}
		}
		return false;
	}

	// Creamos el metodo para comprobar si la agenda esta llena
	public boolean comprobarSiLaAgendaEstaLlena() {
		for (int indice = 0; indice < contactos.length; indice++) {
			if (contactos[indice] == null) {
				return false;
			}
		}
		return true;
	} 
	
	//Creamos el metodo para listar contactos
	public void listarContactos() {
		if(comprobarSiHayHuecosLibres() == contactos.length) {
			System.out.println("\nNo hay contactos para listar");
		} else {
			for(int indice = 0; indice <contactos.length; indice++) {
				if(contactos[indice] != null) {
					System.out.println("Nombre: " + contactos[indice].getNombre());
					System.out.println("Telefono : " + contactos[indice].getTelefono());
				}
			}
		}
	}
	
	//Creamos el metodo para comprobar si hayHuecosLibres
	public int comprobarSiHayHuecosLibres() {
		int contadorVacios = 0; 
		for(int indice = 0; indice < contactos.length; indice++) {
			if(contactos[indice] == null) {
				contadorVacios ++; 
			}
		} 
		return contadorVacios; 
	} 
	
	//Creamos metodo para buscar un contacto por nombre 
	public void buscarContacto(String nombre) {
		boolean encontrado = false; 
		for(int indice = 0; indice < contactos.length && !encontrado; indice++) {
			if(contactos[indice] != null && contactos[indice].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				System.out.println("\nContacto encontrado, su telefono es: " + contactos[indice].getTelefono()); 
				encontrado = true; 
			}
		} 
		if(!encontrado) {
			System.out.println("\nNo se ha encontado el contacto");
		}
	} 
	
	//Creamos el metodo para eliminar contacto 
	public void eliminarContacto(Contacto contacto) {
		boolean eliminado = false; 
		for(int indice = 0; indice < contactos.length && !eliminado; indice++) {
			if(contactos[indice] != null && contactos[indice].equals(contacto)){
				contactos[indice] = null; 
				eliminado = true; 
			}
		} 
		if(eliminado == true) {
			System.out.println("\nEl contacto se ha eliminado"); 
				
			}else {
				System.out.println("\nEl contacto no se ha eliminado"); 
			}
		}
	}
