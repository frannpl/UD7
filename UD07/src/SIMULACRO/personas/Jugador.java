package SIMULACRO.personas;

public abstract class Jugador extends Persona{

	public Jugador(String nombre, String apellidos, String dni, int codSocio) {
		super(nombre, apellidos, dni);
	}

	private int codSocio;
	
	
	@Override 
	public boolean equals(Object obj) {
		
		if(obj == null) 
			return false; 
		if(getClass() != obj.getClass())
			return false;
	
		boolean iguales = false;
		Jugador otro = (Jugador) obj;
		
		if(super.equals(obj) && this.codSocio == otro.codSocio) {
			iguales = true;
		}
		
		return iguales;
	}


	public int getCodSocio() {
		return codSocio;
	}


	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}

}
