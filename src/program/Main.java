package program;

/*
beecrowd | 1172 - Substituição em Vetor I

Faça um programa que leia um vetor X[10]. Substitua a seguir, todos
os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor
e x é o valor armazenado naquela posição.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		for (int i = 0; i < 10; i++) vet[i] = sc.nextInt();

		for (int i = 0; i < 10; i++) if(vet[i] <=0 ) vet[i] = 1;
			
		for(int i = 0; i < 10; i++) System.out.printf("X[%d] = %d\n", i, vet[i]);
		
		sc.close();
	}
}