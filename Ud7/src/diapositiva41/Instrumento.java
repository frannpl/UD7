package diapositiva41;

import java.util.ArrayList;
import java.util.List;

public abstract class Instrumento {

	//Atributos
	private List<NotasMusicales> melodia;
	
	//Constructor
	public Instrumento() {
		
		this.melodia = new ArrayList<NotasMusicales>();
	}

	
	// getter setter
	
	public List<NotasMusicales> getMelodia() {
		return melodia;
	}



	public void setMelodia(List<NotasMusicales> melodia) {
		this.melodia = melodia;
	}


	// metodos

	public void add(NotasMusicales nota) {
		this.melodia.add(nota);
	}
	
	public abstract void interpretar();
	
}
