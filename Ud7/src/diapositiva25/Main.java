package diapositiva25;

public class Main {

	public static void main(String[] args) {

		System.out.println("PRIMER CASO 23:59 + 1");
		Hora h1 = new Hora(23, 59);
		System.out.println(h1);
		h1.inc();
		System.out.println(h1);

		System.out.println("SEGUNDO CASO 15:59 + 1");
		Hora h2 = new Hora(15, 59);
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);

		System.out.println("TERCER CASO 14:30 + 1");
		Hora h3 = new Hora(14, 30);
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
	}

}
