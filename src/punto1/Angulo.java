
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Angulo {

	// Se declaran los atributos de la clase
	double anguloEnGrados;
	double anguloEnRadianes;
	double seno;
	double coseno;
	double tangente;

	// Se declara un objeto de tipo BufferedReader
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	// M�todo para comprobar las condiciones dadas
	int tomarDecision(int limiteInferior, int limiteSuperior) throws NumberFormatException, IOException {
		int n = Integer.parseInt(in.readLine());
		if (n < limiteInferior || n > limiteSuperior) {
			while (n < limiteInferior || n > limiteSuperior) {
				System.out.print("\n\n\tEscribe un n�mero que este entre " + limiteInferior + " y " + limiteSuperior);
				n = Integer.parseInt(in.readLine());
			}
		}
		return n;
	}

	// M�todo para calcular las razones trigonom�tricas
	void calcularRazonesTrigonometricas(double x) {
		seno = Math.sin(x);
		coseno = Math.cos(x);
		tangente = Math.tan(x);
	}
}