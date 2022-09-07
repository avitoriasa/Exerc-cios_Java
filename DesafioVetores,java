/* Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes. Imprima o vetor N.*/


import java.io.IOException;
import java.util.Scanner;

public class DesafioVetores{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int[] N = new int[1000];
        int pos = 0;
        while (pos < 999) {
        	for (int j = 0; j < T; j++) {
        		if (pos > 999) break;
        		N[pos] = j;
        		pos++;
        	}
        }
        
        for (int i = 0; i < N.length; i++) {
        	System.out.println("N[" + i + "] = " + N[i]);
        }
    }
	
}
