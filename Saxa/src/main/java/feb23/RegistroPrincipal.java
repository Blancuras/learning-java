package feb23;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RegistroPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int opcion; 
		int telefono; 
		String nombre; 
		Contacto contacto;  
		int tamañoAgenda; 
		
		tamañoAgenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de contactos para su agenda")); 
		Agenda agendaTelefonica = new Agenda(tamañoAgenda); 
		
		do {
			System.out.println("\n\tBIENVENIDO A LA TELEFONICA"); 
			System.out.println("1.- Añadir un contacto");
			System.out.println("2.- Listar contactos"); 
			System.out.println("3.- Buscar un contacto"); 
			System.out.println("4.- Comprobar si existe un contacto"); 
			System.out.println("5.- Eliminar contacto"); 
			System.out.println("6.- Comrpbar contactos disponibles"); 
			System.out.println("7.- Comprobar si la agenda esta llena"); 
			System.out.println("8.- Salir"); 
			System.out.print("Digite una opcion por favor"); 
			opcion = entrada.nextInt();  
			
			switch(opcion) { 
		
			//Añadimos un contacto
			case 1:  
				System.out.println("\nDigite su nombre: "); 
				nombre = entrada.next(); 
				
				System.out.println("Digite su telefono"); 
				telefono = entrada.nextInt(); 
				
				contacto = new Contacto(nombre, telefono); 
				agendaTelefonica.añadirContacto(contacto); 
				System.out.println("");
				break;  
				
				//Listamos los contactos
			case 2:  
				agendaTelefonica.listarContactos();
				System.out.println("");
				break; 
				
				//Buscamos un contacto
			case 3:  
				System.out.println("\nDigite un nombre : "); 
				nombre = entrada.next(); 
				
				agendaTelefonica.buscarContacto(nombre);
				System.out.println("");
				break; 
				
				// Comprobamos si un contacto existe
			case 4:  
				System.out.print("\nDigite su nombre: "); 
				nombre = entrada.next();  
				
				contacto = new Contacto(nombre);  
				if(agendaTelefonica.comprobarSiExisteContacto(contacto)) {
					System.out.println("\nEl contacto existe");
				} else {
					System.out.println("El contacto no existe");
				} 
				System.out.println("");
				break;  
				
				//Eliminamos un contacto
			case 5:  
				System.out.println("Digite su nombre "); 
				nombre = entrada.next(); 
				
				contacto = new Contacto(nombre); 
				agendaTelefonica.eliminarContacto(contacto);
			break;  
				
				//Comprobamos s hay contactos disponibles
			case 6:  
				System.out.println("\nHay " + agendaTelefonica.comprobarSiHayHuecosLibres() + " contactos"); 
				System.out.println("");
				break; 
				
				//Comprobamos si la agenda esta llena
			case 7:  
				if(agendaTelefonica.comprobarSiLaAgendaEstaLlena()) {
					System.out.println("\nLa agenda esta llena");
				} else {
					System.out.println("\nAun puedes registrar contactos");
				} 
				System.out.println("");
				break; 
			
			case 8: 
				System.out.println("Gracias por participar!!");
				break; 
			default:  
				System.out.println("\nOpcion no valida, por favor vurlva a digitar");
				System.out.println("");
				break; 
			}
			
		}while(opcion != 8);
	}

}
