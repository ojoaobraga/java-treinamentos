package Exercicio1_DesafioRonao;

public class DesafioRonao {

	public static void main(String[] args) {

		/*
		 * 1. Criar um programinha para calcular a média de salários de uma empresa,
		 * precisamos de 5 funcionarios, 1000, 4000, 5000, 3000, 10000, são os salarios
		 * respectivamente e precisamos exibir a média.
		 */

		int funcionario1 = 1000;
		int funcionario2 = 4000;
		int funcionario3 = 5000;
		int funcionario4 = 3000;
		int funcionario5 = 10000;

		int media = (funcionario1 + funcionario2 + funcionario3 + funcionario4 + funcionario5) / 5;

		System.out.println("1) A media de salario dos funcionários é: R$" + media);

		/*
		 * 2. Criar um programinha que dado uma temperatura em graus celsius, converta e
		 * exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as
		 * fórmulas: 
		 * F = C * 1.8 + 32; 
		 * K = C + 273.15; 
		 * Re = C * 0.8; 
		 * Ra = C * 1.8 + 32 +
		 * 459.67
		 */
		System.out.println("");

		double temperatura = 30.0;
		
		System.out.println("2)");
		System.out.println("Temperatura em C: "+temperatura);
		System.out.println("Temperatura em K: "+(temperatura+273.15));
		System.out.println("Temperatura em F: "+(temperatura*1.8+32));
		System.out.println("Temperatura em Re: "+(temperatura*0.8));
		System.out.println("Temperatura em Ra: "+(temperatura*1.8 + 32 + 459.67));

		/*
		 * 3. Criar um programa que pegue os numeros de 1 até 100 e imprima IMPAR caso o
		 * numero for IMPAR e PAR caso o numero for PAR
		 */
		System.out.println("");
		System.out.println("3)");
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0) {
				System.out.println("O número " +i+ " é par");
			}else if (i % 2 != 0) {
				System.out.println("O número " +i+ " é impar");
			}
		}
		
		
	}
}
