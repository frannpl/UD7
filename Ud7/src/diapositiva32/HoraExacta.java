package diapositiva32;

import java.util.Objects;

import diapositiva25.Hora;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;
	}

	public int getSegundo() {
		return segundo;
	}

	public boolean setSegundo(int segundo) {

		boolean cambio = false;

		if (segundo >= 0 && segundo <= 59) {
			cambio = true;
			this.segundo = segundo;
		}

		return cambio;
	}

	@Override
	public void inc() {
		this.segundo++;

		if (this.segundo == 60) {
			this.segundo = 0;
			super.inc();

		}
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(":%02d",this.segundo);
	}

   
	
}
