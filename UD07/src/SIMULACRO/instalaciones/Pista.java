package SIMULACRO.instalaciones;

public class Pista implements Reservable {

	private int numPista;
	private TipoPista tipoPista;
	private Ubicacion ubicacion;
	private boolean reservada;

	public Pista(int numPista, String tipoPista, String ubicacion) {

		setNumPista(numPista);
		setTipoPista(tipoPista);
		setUbicacion(ubicacion);
		this.reservada = false;

	}

	public int getNumPista() {
		return numPista;
	}

	public void setNumPista(int numPista) {

		if (numPista <= 0) {
			throw new IllegalArgumentException("El numero debe ser positivo");
		}
		this.numPista = numPista;
	}

	public String getTipoPista() {
		return this.tipoPista.toString();
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = TipoPista.valueOf(tipoPista);
	}

	public String getUbicacion() {
		return this.ubicacion.toString();
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = Ubicacion.valueOf(ubicacion);
	}

	@Override
	public void reservar() {

		if (this.reservada) {
			throw new IllegalArgumentException("La pista ya esta reservada");
		}
		this.reservada = true;

	}

	@Override
	public void anular() {

		this.reservada = false;

	}
}
