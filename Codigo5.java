import java.util.Scanner;

public class Codigo5 {

	// Faltaba el método main
	public static void main(String[] args) {

		// Falta importar Scanner y agregar el argumento del método Scanner
		Scanner s = new Scanner(System.in);
		// Había una apostrofe en lugar de comilla
		System.out.println("Introduzca un numero");

		// En lugar de utilizar nextLine debe ser nextInt
		// Y definir la variable como int
		int ni = s.nextInt();
		// Aquí se quiere hacer una coercion de tipo de dato
		int c = ni;

		int afo = 0;
		int noAfo = 0;

		while (ni > 0) {
			int digito = (int) (ni % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
			}
			// Esta instruccion iba fuera del bloque else
			ni /= 10;

		}
		
		// La segunda condicion va fuera del bucle
		if (afo > noAfo) {
			// Mal escrito print
			System.out.println("El " + c + " es un número afortunado.");
		} else {
			System.out.println("El " + c + " no es un número afortunado.");
		}
	}

}