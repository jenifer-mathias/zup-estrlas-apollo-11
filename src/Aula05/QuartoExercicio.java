package Aula05;

import java.util.Scanner;

public class QuartoExercicio {

	// Leia um numero real e imprima o resultado do quadrado desse n�mero.
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println(" Digite um n�mero: \n"); //" escreva"
		float numero = teclado.nextFloat(); // "leia"

		System.out.printf(" O quadrado desse n�mero �: \n %.2f" , numero * numero);
	}
}
