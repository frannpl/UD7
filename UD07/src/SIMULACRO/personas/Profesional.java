package SIMULACRO.personas;

public class Profesional extends Jugador{

	public Profesional(String nombre, String apellidos, String dni, int codSocio) {
		super(nombre, apellidos, dni, codSocio);
		// TODO Auto-generated constructor stub
	}

	private String puntoFuerte;

	
	
	@Override
	public void saludar() {

		System.out.println("Hola, me llamo " + this.getNombre() + "y soy Profesional");
	}
	
	@Override
	public String toString() {
		return "Amateur [nombre = " + this.getNombre() + 
				"apellidos = " + this.getApellidos() +
				"dni = " + this.getDni() +
				"codSocio = " + this.getCodSocio() + 
				"puntoDebil = " + this.getpuntoFuerte();
	}

	private String getpuntoFuerte() {
		// TODO Auto-generated method stub
		return puntoFuerte;
	}

}
