package pasiente;

import java.util.Scanner;

public class Paciente {

	public static void main(String[] args) {
		int N = 0;
		String G, G2, G3, G4;
		Scanner sc = new Scanner(System.in);
		Scanner qd = new Scanner(System.in);

		String vector[] = new String[4];

		do {
			System.out.println("*****************************");
			System.out.println(" 1)_Registro");
			System.out.println(" 2)_Impresion");
			System.out.println(" 3)_Salir");
			System.out.println("*****************************");
			N = sc.nextInt();

			if (N == 1) {
				System.out.println("Ingrese Nombre");
				G = qd.nextLine();
				vector[0] = G;
				System.out.println("Ingrese Apellido");
				G2 = qd.nextLine();
				vector[1] = G2;
				System.out.println("Ingrese Edad");
				G3 = qd.nextLine();
				vector[2] = G3;
				System.out.println("Ingrese Enfermedad");
				G4 = qd.nextLine();
				vector[3] = G4;

				if (N == 2) {
					for (int i = 0; i < vector.length; i++) {
						System.out.println(vector[i]);

					}

				}
			}

		} while (N != 3);

	}
}
