
package punto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solucion {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA LA SLUCI�N DE UNA ECUACI�N DE PRIMER GRADO\n");

		// Se declara un pbjeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir;

		do {
			// Se declara un objeto de tipo n�mero
			Ecuacion ecuacionAComprobar = new Ecuacion(0, 0, 0);

			// Se piden los datos del objeto
			System.out.print("\n\n\tIngresa el coeficiente de la variable de la ecuaci�n: ");
			ecuacionAComprobar.coeficiente = Double.parseDouble(in.readLine());

			System.out.print("\n\n\tIngresa la constante de la ecuaci�n: ");
			ecuacionAComprobar.constante = Double.parseDouble(in.readLine());

			System.out.print("\n\n\tIngresa el resultado de la ecuaci�n: ");
			ecuacionAComprobar.resultado = Double.parseDouble(in.readLine());

			// Se calcula la solucion de la ecuaci�n llamando al respectivo m�todo
			ecuacionAComprobar.solucion = ecuacionAComprobar.solucion();

			// Dependiendo del coeficiente se muestra la salida por pantalla
			if (ecuacionAComprobar.coeficiente == 0) {
				System.out.print("\n\n\tEl sistema no tiene soluci�n");
			} else {
				System.out.print("\n\n\tLa soluci�n de la ecuacion: " + ecuacionAComprobar.coeficiente + "x + "
						+ ecuacionAComprobar.constante + " = " + ecuacionAComprobar.resultado + "\n\tEs: x = "
						+ ecuacionAComprobar.solucion);
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
