
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Conversor {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA LAS RAZONES TRIGONOM�TICAS DE UN �NGULO\n");

		// Se declara un pbjeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se declara un objeto que pasa de notacion cientifica a decimal
		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(8);

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir;

		do {

			// Declaraci�n de las variables a usar
			int decision;

			// Se declara un objeto de tipo �ngulo con el que se har�n los c�lculos
			Angulo anguloACalcular = new Angulo();

			// Se le pregunta al usuario la medida del �ngulo
			System.out.print("\n\tEn que sistema vas a introducir el �ngulo? \n" + "\n\t1. Grados " + "\n\t2. Radianes "
					+ "\n\n\tDecisi�n: ");

			// M�todo para comprobar la decisi�n del usuario
			decision = anguloACalcular.tomarDecision(1, 2);

			// Se calcula el �ngulo en grados y radianes
			System.out.print("\n\tIntroduce el �ngulo: ");
			switch (decision) {
			case 1:
				anguloACalcular.anguloEnGrados = Double.parseDouble(in.readLine());
				anguloACalcular.anguloEnRadianes = Math.toRadians(anguloACalcular.anguloEnGrados);
				break;
			case 2:
				anguloACalcular.anguloEnRadianes = Double.parseDouble(in.readLine());
				anguloACalcular.anguloEnGrados = Math.toDegrees(anguloACalcular.anguloEnRadianes);
				break;
			}

			// Se le pregunta al usuario la razon trigonom�trica que desea realizar
			System.out.print("\n\tQu� deseas calcular? \n" + "\n\t1. Seno " + "\n\t2. Coseno " + "\n\t3. Tangente "
					+ "\n\n\tDecisi�n: ");

			// Se comprueba la decisi�n
			decision = anguloACalcular.tomarDecision(1, 3);

			// Se calculan las tres razones trigoom�tricas
			anguloACalcular.calcularRazonesTrigonometricas(anguloACalcular.anguloEnRadianes);

			// Se muestra la raz�n dependiendo de la elecci�n
			System.out.print("\n\tEl �ngulo: \n\tEn radianes: " + anguloACalcular.anguloEnRadianes + "\n\tEn grados: "
					+ anguloACalcular.anguloEnGrados);
			switch (decision) {
			case 1:
				System.out.print("\n\n\tTiene un seno de: " + anguloACalcular.seno);
				break;
			case 2:
				System.out.print("\n\n\tTiene un coseno de: " + anguloACalcular.coseno);
				break;
			case 3:
				if(anguloACalcular.anguloEnGrados % 180 == 0) {
					System.out.print("\n\n\tTiene una tangente de: 0");
				} else if (anguloACalcular.anguloEnGrados % 90 == 0) {
					System.out.print("\n\n\tLa tangente no existe para este �ngulo");
				} else {
					System.out.print("\n\n\tTiene una tangente de: " + anguloACalcular.tangente);
				}
				break;

			}

			// Se le pregunta al usuario si quiere volver a usar el programa
			System.out.print("\n\n\t�Quieres volver a usar el programa? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
			repetir = Integer.parseInt(in.readLine());
			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
				}
			}
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}
