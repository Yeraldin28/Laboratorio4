
package punto3;

public class Ecuacion {

	// Se declaran los atributos de la clase
	double coeficiente;
	double constante;
	double resultado;
	double solucion;

	// Se declara el constructor
	Ecuacion(double a, double b, double c) {
		coeficiente = a;
		constante = b;
		resultado = c;
	}

	// Metodo para solucionar la ecuacion
	double solucion() {
		solucion = (resultado - constante) / coeficiente;
		return solucion;
	}
}