package ej.constructor.test;

import java.util.Scanner;

public class Persona {
	private String sNombre;
	private int iEdad;
	protected Scanner teclado; 
	public Persona() {
		teclado = new Scanner(System.in);
	}
	
	public void  CargarDatos (){
		System.out.println("Ingrese Nombre");
		sNombre = teclado.next();
		System.out.println("Ingrese Edad");
		iEdad = teclado.nextInt();
	}
	public void ImprimirDatos(){
		saltodelinea();
		System.out.println("*******Dastos Personales*********");
		System.out.println("Nombre: " + sNombre);
		System.out.println("Edad: " + iEdad);
		saltodelinea();
	}
	
	public void saltodelinea(){
		System.out.println("\n");
	}
}
