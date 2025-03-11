package SIMULACRO.personas;

import java.util.Comparator;

public class ComparaJugadores implements Comparator<Jugador>{

	
	@Override
	public int compare(Jugador j1, Jugador j2) {

		int result = j1.getNombre().compareTo(j2.getNombre());
		
		if(result == 0) {
			result = j1.getCodSocio() - j2.getCodSocio();
		}
		return result ;
	}

	
}
