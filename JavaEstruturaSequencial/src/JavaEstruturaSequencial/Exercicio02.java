//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//ou transforme a temperatura em graus Celsius em graus Fahrenheit.
//C = 5 * ((F-32) / 9).

package JavaEstruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		
		System.out.println("Digite 1 para transformar graus Fahrenheit em Celsius: ");
		System.out.println("Digite 2 para transformar graus Celsius em Fahrenheit: ");
		
		int graus = r.nextInt();
		
		if(graus == 1) {
			
			System.out.println("Digite a temperatura em graus Fahrenheit: ");
			float grausF = r.nextFloat();
			float calc1 = ((grausF - 32)/18)*10;
			System.out.printf("A temperatura em graus Celsius é %.2f", calc1);

		}else if(graus == 2){
			
			System.out.println("Digite a temperatura em graus Celsius: ");
			float grausC = r.nextFloat();
			float calc2 = ((grausC*18)/10 + 32) ;
			System.out.printf("A temperatura em graus Fahrenheit é %.2f", calc2);
			
		}else {
			
			System.out.println("Digite um valor válido, por favor :)");
			System.out.println("Digite 1 para calcular graus Celsius e 2 para calcular graus Fahrenheit ;)");

		}

	}

}
