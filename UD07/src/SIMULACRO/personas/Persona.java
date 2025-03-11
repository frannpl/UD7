package SIMULACRO.personas;

import java.util.Objects;

public abstract class Persona implements Comparable<Persona> {

	private String nombre;
	private String apellidos;
	private String dni;

	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		setDni(dni);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {

		if (dni.length() != 9) {
			throw new IllegalArgumentException("El dni tiene que tener 9 caracteres");
		}

		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		boolean iguales = false;
		Persona otro = (Persona) obj;

		if (this.dni.equals(otro.dni)) {

			iguales = true;
		}

		return iguales;
	}

	// METDOOS

	public abstract void saludar();

	@Override
	public int compareTo(Persona p) {
		int result = this.nombre.compareTo(p.nombre);
		if (result == 0) {
			result = this.dni.compareTo(p.dni);
		}
		return result;
	}

}
