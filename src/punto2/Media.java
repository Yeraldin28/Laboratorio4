
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Media {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA EL PROMEDIO DE UN CONJUNTO DE N�MEROS\n");

		// Se declara un pbjeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir;

		do {
			// Se declara el objeto
			Numero numero = new Numero(0, 0);

			// Se introduce en un ciclo para que pueda decidir si agregar mas notas
			do {
				// Se pide el n�mero a promediar
				System.out.print("\n\n\tIngresa un n�mero para promediarlo: ");
				numero.media(Double.parseDouble(in.readLine()));

				// Se le pregunta al usuario si quiere introducir m�s datos
				System.out.print("\n\n\t�Quieres introducir m�s datos? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
				repetir = Integer.parseInt(in.readLine());
				if (repetir < 1 || repetir > 2) {
					while (repetir < 1 || repetir > 2) {
						System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
						repetir = Integer.parseInt(in.readLine());
					}
				}
			} while (repetir == 1);
			
			// Se muestra el promedio
			System.out.print("\n\tLa cantidad de datos que ingreso fue: " + numero.contador + "\n\tY el promedio es: "
					+ numero.media/numero.contador );

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
