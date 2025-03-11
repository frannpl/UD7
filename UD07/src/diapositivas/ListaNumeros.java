package diapositivas;

import java.util.Arrays;

public class ListaNumeros implements Cola,Pila,ColaDoble{
	
	private int numeros[];
	
	public ListaNumeros() {
		this.numeros = new int[0];
	}
	
	public void insertarPrincipio(int n) {
		this.numeros = Arrays.copyOf(this.numeros, this.numeros.length+1);
		System.arraycopy(this.numeros, 0, this.numeros, 1, this.numeros.length-1);
		this.numeros[0] = n;
	}
	
	public void insertarFinal(int n) {
		this.numeros = Arrays.copyOf(this.numeros, this.numeros.length+1);
		this.numeros[this.numeros.length-1] = n;
	}
	
	public void insertar(int i, int n) {
		if(i < 0 || i > this.numeros.length-1) {
			throw new IllegalArgumentException("La posición indicada no se encuentra en el array.");
		}
		// Ensanchamos un hueco
		this.numeros = Arrays.copyOf(this.numeros, this.numeros.length+1);
		// Desplazamos a partir de la posicion i
		System.arraycopy(this.numeros, i, this.numeros, i+1, this.numeros.length-1-i);
		// Insertamos n en la posición i
		this.numeros[i] = n;
	}
	
	public void eliminar(int i) {
		if(i < 0 || i > this.numeros.length-1) {
			throw new IllegalArgumentException("La posición indicada no se encuentra en el array.");
		}
		System.arraycopy(this.numeros, i+1, this.numeros, i, this.numeros.length-(i+1));
		this.numeros = Arrays.copyOf(this.numeros, this.numeros.length-1);		
	}
	
	public int get(int i) {
		if(i < 0 || i > this.numeros.length-1) {
			throw new IllegalArgumentException("La posición indicada no se encuentra en el array.");
		}
		return this.numeros[i];
	}	
	
	public int buscar(int clave) {
		int indice = -1;
		
		for(int i=0; i < this.numeros.length && indice == -1; i++) {
			if(this.numeros[i] == clave) {
				indice = i;
			}
		}
		
		return indice;
	}
	
	public int elementos() {
		return this.numeros.length;
	}
	
	public void mostrar() {
		System.out .println(Arrays.toString(this.numeros));
	}

	
	@Override
	public void encolar(int n) {
		insertarFinal(n);
		
	}

	@Override
	public int desencolar() {
		
		if(this.numeros.length == 0) {
			throw new IllegalArgumentException("La cola esta vacía.");
		}
		
		int primero = this.numeros[0];
		eliminar(0);
		return primero;
	}

	@Override
	public void apilar(int n) {
		insertarPrincipio(n);
	}

	@Override
	public int desapilar() {
		if(this.numeros.length == 0) {
			throw new IllegalArgumentException("La pila esta vacía.");

		}
		
		int ultimo = this.get(0);
		eliminar(0);
		return ultimo;
	}

	@Override
	public void encolarCabeza(int n) {
		insertarPrincipio(n);
	}

	@Override
	public int desencolarFinal() {
		
		int ultimo = this.get(this.numeros.length - 1);
		eliminar(this.numeros.length - 1);
		return ultimo;
	}

	

}