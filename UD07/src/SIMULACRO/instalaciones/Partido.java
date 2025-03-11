package SIMULACRO.instalaciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import SIMULACRO.personas.Empleado;
import SIMULACRO.personas.Jugador;

public class Partido {

	private int cod;
	private Pista pista;
	private String descripcion;
	private int numJugadores;
	private List<Jugador> jugadores;
	private LocalDate firmaEmpleado;
	private LocalDate firmaJugadores;
	private Empleado empleado;
	
	private static int contador = 1;
	
	public Partido(Pista pista, String descripcion, int numJugadores ) {
		
		this.cod = contador++;
		this.pista = pista;
		setNumJugadores(numJugadores);
		this.descripcion = descripcion;
		this.jugadores = new ArrayList<Jugador>();
		this.firmaEmpleado = null;
		this.firmaJugadores = null;
		this.empleado = null;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		
		if(numJugadores < 2) {
			throw new IllegalArgumentException("No pue juga");
		}
		this.numJugadores = numJugadores;
	}
	
	
	//METODOS
	
	public void asociarJugador(Jugador j) {
		
		if(jugadores.size()== numJugadores) {
			
			throw new IllegalArgumentException("El equipo esta lleno");
		}
		this.jugadores.add(j);
	}
	
	public void eliminarJugador(Jugador j) {
		this.jugadores.remove(j);
	}
	
	public boolean completo() {
		return (jugadores.size()== numJugadores);
	}
	
	public void reservar() {
		if(!completo()) {
			throw new IllegalArgumentException("");
		}
		if(firmaJugadores != null) {
			throw new IllegalArgumentException("");
		}
		this.firmaJugadores = LocalDate.now();
	}
	
	public void reservar(Empleado e) {
		if(firmaJugadores == null) {
			
		}
		if(firmaEmpleado != null) {
			
		}
		this.firmaEmpleado = LocalDate.now();
		this.empleado = empleado;
	}
}
	
	