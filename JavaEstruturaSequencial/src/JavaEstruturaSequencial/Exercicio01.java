//Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.

package JavaEstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4,media;
		
		Scanner r = new Scanner(System.in);
		System.out.println("Digite a sua 1�nota: ");
		nota1 = r.nextFloat();
		System.out.println("Digite a sua 2�nota: ");
		nota2 = r.nextFloat();
		System.out.println("Digite a sua 3�nota: ");
		nota3 = r.nextFloat();
		System.out.println("Digite a sua 4�nota: ");
		nota4 = r.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("A sua m�dia foi %.2f",media);
		
	}

}
