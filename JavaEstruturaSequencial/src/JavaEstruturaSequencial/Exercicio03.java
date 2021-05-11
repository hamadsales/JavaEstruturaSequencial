/*
Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
*/

package JavaEstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);

		System.out.println("Digite 1 se você for homem: ");
		System.out.println("Digite 2 se você for mulher: ");

		int sexo = r.nextInt();

		if (sexo == 1) {

			System.out.println("Digite a sua altura: ");
			float alturaH = r.nextFloat();
			float calculo1 = ((727 * alturaH)/10) - 58;
			System.out.printf("O seu peso ideal é %.2f", calculo1);

		} else if (sexo == 2) {

			System.out.println("Digite a sua altura: ");
			float alturaF = r.nextFloat();
			float calculo2 = ((621 * alturaF)/10) - (447/10);
			System.out.printf("O seu peso ideal é %.2f", calculo2);

		} else {

			System.out.println("Digite um valor válido, por favor :)");
			System.out.println("Digite 1 se você for homem e Digite 2 se você for mulher ;) ");

		}

	}
}
