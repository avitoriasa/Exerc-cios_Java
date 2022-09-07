/* Neste problema, deve-se ler:

O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1.
O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago. */

import java.io.IOException;
import java.util.Scanner;

public class Pecas {
	

    public static void main(String[] args) throws IOException {
       Scanner leitor = new Scanner(System.in);
          
        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();
          
  // TODO: Implemente um Cálculo Simples.
  // Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:
          
       double total = ( valor1 * n1) + ( valor2 * n2);2
       System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
      }
      
    
}
