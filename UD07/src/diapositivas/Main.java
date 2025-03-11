package diapositivas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ListaNumeros cola = new ListaNumeros();
		
		int num;
		
		do {
			System.out.println("dime un numero: ");
			num = sc.nextInt();
			
			if(num >= 0) {
				cola.encolarCabeza(num);
			}
			
		}
		while(num >= 0);
		
		
		while(cola.elementos() > 0) {
			System.out.println(cola.desencolarFinal());
		}
		
	}

}
