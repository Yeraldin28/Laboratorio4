package punto2;

public class Numero {

	// Se declaran los atributos de la clase
	double dato;
	double media;
	int contador;

	// Se declara el constructor
	Numero(int m, int c) {
		media = m;
		contador = c;
	}

	double media(double numero) {
		media += numero;
		contador++;
		return media / contador;
	}
}