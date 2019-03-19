package ej.constructor.test;

public class Informacion {
	
	static Empleado2 Emp =  new Empleado2();
	public Informacion() {
		
	}
		
	public static void main(String[] args) {
		
		
		
		Emp.CargarDatos();
		Emp.solicitarSueldo();
		Emp.ImprimirDatos();
		Emp.imprimirSueldo();

	}

}
