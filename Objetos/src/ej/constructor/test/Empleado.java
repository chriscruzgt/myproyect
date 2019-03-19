package ej.constructor.test;

import java.util.Scanner;

public class Empleado {

	private String SNombreEmpleado;
	private float fSueldoEmpleado;
	private Scanner teclas;
	
	public Empleado() {
		teclas = new Scanner(System.in);
		System.out.println("************DATOS DEL EMPLEADO***********");
		System.out.println("Ingrese Nombre");
		SNombreEmpleado = teclas.next();
		System.out.println("ingrese Sueldo");
		fSueldoEmpleado = teclas.nextFloat();
		
		
	}
	
	public void Imprimir(){
		EspacioLinea();
		System.out.println("Nombre: " + SNombreEmpleado);
		System.out.println("Sueldo: " + fSueldoEmpleado);
		
	}
	
	private void CalcularImpuestos() {
		EspacioLinea();
		if (fSueldoEmpleado > 3000) {
			System.out.println("El empleado: " + SNombreEmpleado + " SI Debe pagar impuestos.");
		} else {
			System.out.println("El empleado: " + SNombreEmpleado + " NO Debe pagar impuestos.");
		}

	}
	
	public void EspacioLinea(){
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Empleado E = new Empleado();
		E.Imprimir();
		E.CalcularImpuestos();

	}

}
