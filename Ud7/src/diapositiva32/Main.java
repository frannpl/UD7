package diapositiva32;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HoraExacta h1 = new HoraExacta(1, 9, 59);
		System.out.println(h1);
		h1.inc();
		System.out.println(h1);
		
		HoraExacta h2 = new HoraExacta(0, 59, 59);
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		
		HoraExacta h3 = new HoraExacta(23, 9, 59);
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
	}

}
