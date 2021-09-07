package persona;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		String G;
		Scanner sc = new Scanner(System.in);
		Scanner qd = new Scanner(System.in);

		String vector[] = new String[5];
		int x = 0;

		do {
			System.out.println("*****************************");
			System.out.println("1)_Ingresar cedula Estudiante");
			System.out.println("2)_Buscar Estudiante");
			System.out.println("3)_Salir");
			System.out.println("*****************************");
			N = sc.nextInt();

			if (N == 1) {
				System.out.println("Ingrese cedula");
				G = qd.nextLine();
				vector[x] = G;
				x++;

			}
			if (N == 2) {
				System.out.println("Ingrese cedula");
				G = qd.nextLine();
				int estudianteEs = 0;
				for (int i = 0; i < 5; i++) {
					if (G.equals(vector[i])) {
						System.out.println("si se encontro cedula");
						estudianteEs = 1;
					}

				}
				if (estudianteEs == 0) {
					System.out.println("no se encontro cedula");
				}

			}

		} while (N != 3);
	}

}
