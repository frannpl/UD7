package diapositiva41;

public class Piano extends Instrumento{

	@Override
	public void interpretar() {
		
		System.out.println("Interpretación en piano: ");
		for(NotasMusicales n : this.getMelodia()) {
			System.out.println(n);
		}
	}

}
