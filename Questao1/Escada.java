package Questao1;


import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		
		 // Leio a quantidada de degraus que o usu�rio digitar.
		
		 System.out.println("Quantidade de degraus: ");
		 Scanner sc = new Scanner(System.in);
		 int degrau = sc.nextInt();
		 
		 // Acrescento + 1 ao dregrau.
		 degrau = degrau + 1;
		 int x = 0;
		 
		 	 // Contador das linhas que come��o de degrau, imprimi cada linha.
			 for (int linha = degrau; linha >= 0 ; linha += -1) {
				 
				 // La�o que imprimi espa�os () a menos.
				 for (int coluna = 1; coluna <= (degrau -x) ; coluna += 1 ) {
		
				 System.out.print(" ");
		
				 }
				     // La�o que imprimi os *	.
					 for (int coluna = 1; coluna <= x; coluna += 1) {
			
					 System.out.print("*");
			
					 }
					 
					 x = degrau-linha;
					 System.out.println("");

			 }
	}
		 
}


