package SIMULACRO.personas;

public class Empleado extends Persona{

	private int codigoEmpleado;
	
	public Empleado(String nombre, String apellidos, String dni, int codigo_empleado) {
		super(nombre, apellidos, dni);
		// TODO Auto-generated constructor stub
	
		this.codigoEmpleado = codigo_empleado;
	}

	
	@Override
	public void saludar() {
		System.out.println("Hola, me llamo " + this.getNombre() + "soy Empleado");
	}
	
	
	@Override
	public String toString() {
		
		return "Empleado [ nombre =" + this.getNombre() + 
				"apellidos = " + this.getApellidos() +
				"dni = " + this.getDni() + 
				"codEmpleado = " + this.codigoEmpleado;
	}

}
