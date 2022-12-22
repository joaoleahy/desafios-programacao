package desafio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();
		
		double[] notas = {100, 50, 20, 10, 5, 2};
		double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
		int qtdNotas, qtdMoeda;
		System.out.println("NOTAS:");
		for (double nota : notas) {
		qtdNotas = (int)(valor / nota);
		System.out.println(qtdNotas + " nota(s) de R$ " + String.format("%.2f", nota));
		valor -= qtdNotas * nota;
		}
		System.out.println("MOEDAS:");
		for (double moeda : moedas) {
		qtdMoeda = (int)(valor / moeda);
		System.out.println(qtdMoeda + " moeda(s) de R$ " + String.format("%.2f", moeda));
		valor -= qtdMoeda * moeda;
		}
		sc.close();
	}

}