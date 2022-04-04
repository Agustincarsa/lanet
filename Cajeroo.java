package cajeroo;

import java.util.Scanner;

public class Cajeroo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int saldo = 2500;
		boolean x = true;
		int opción = 0;
		int retiro = 0;

		do {

			System.out.println("Seleccione una opción");
			System.out.println("	1.Consulta de Saldo");
			System.out.println("	2. Extracción");
			System.out.println("	3. Salir");

			opción = scan.nextInt();

			if (!(opción >= 1 && opción <= 3)) {
				System.out.println("Opción incorrecta.");

			}

			switch (opción) {
			case 1:
				System.out.println("Su saldo actual es $" + saldo);

				System.out.println("Desea volver al menú?");
				System.out.println("1.	Si");
				System.out.println("2.	No. Salir");
				opción = scan.nextInt();
				while (opción != 1 && opción != 2) {
					System.out.println("Error al ingresar el número");
					opción = scan.nextInt();

				}
				if (opción == 2) {
					System.out.println("Gracias por utilizar el cajero, hasta pronto");
					x = false;

				}
				break;

			case 2:

				System.out.println("Qué cantidad desea retirar?");

				System.out.println("1.   $500");
				System.out.println("2.   $1000");
				System.out.println("3.   $2500");
				System.out.println("4.   $3000");
				System.out.println("5.   $5000");
				System.out.println("6.   Salir");

				opción = scan.nextInt();

				while (opción != 1 && opción != 2 && opción != 3 && opción != 4 && opción != 5 && opción != 6) {
					System.out.println("Error al elegir la opción");
					opción = scan.nextInt();

				}
				if (saldo < retiro) {
					System.out.println("Su saldo no es suficiente");

					break;
				}

				if (opción == 1) {
					System.out.println("Retiró $500");
					retiro = 500;
					saldo = saldo - retiro;
					System.out.println("Su saldo actúal es $" + saldo);
				}

				if (opción == 2) {
					System.out.println("Retiró $1000");
					retiro = 1000;
					saldo = saldo - retiro;
					System.out.println("Su saldo actúal es $" + saldo);
				}

				if (opción == 3) {
					System.out.println("Retiró $2500");
					retiro = 2500;
					saldo = saldo - retiro;
					System.out.println("Su saldo actúal es $" + saldo);
				}

				if (opción == 4) {
					System.out.println("Retiró $3000");
					retiro = 3000;
					saldo = saldo - retiro;
					System.out.println("Su saldo actúal es $" + saldo);
				}

				if (opción == 5) {
					System.out.println("Retiró $5000");
					retiro = 5000;
					saldo = saldo - retiro;
					System.out.println("Su saldo actúal es $" + saldo);

				} 

				break;

			case 3:
				System.out.println("Gracias por usar el cajero, vuelva pronto :)");

				x = false;

				break;

			}

		} while (x = false);

		{
		}

	}

}