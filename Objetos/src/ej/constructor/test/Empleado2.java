package ej.constructor.test;

import java.util.Scanner;

public class Empleado2 extends Persona {
	private int iSueldo;
	protected Scanner tec;
	public Empleado2() {
		iSueldo = 0;
		tec = new Scanner(System.in);
	}
	
	public void solicitarSueldo() {
		System.out.println("Ingrese Sueldo");
		iSueldo = tec.nextInt();
	}
	
	public void imprimirSueldo(){
		System.out.println("sueldo es de: " + iSueldo);
	}

	

}
