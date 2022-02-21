package Questao2;

import java.util.Scanner;

public class Validacao {

	public static void main(String[] args) {
		
		 // Leio a senha que o usuario digita
		 System.out.println("Digite a senha: ");
		 Scanner sc = new Scanner(System.in);
		 String password = sc.nextLine();
		 
		 boolean validPassword = isValidPassword(password);
		
	}
	
	  /**
     * Metodo que verifica se o password � valido ou n�o
     * @paramentro password
     * @returna boolean
     */
	
	public static boolean isValidPassword(String password)
	{
        boolean isValid = true;
        //Verifica a quantidade de caracteres, mostra ao usu�rio quantos caracteres digitou e quantos caracteres sao exigidos.
        if (password.length() > 50 || password.length() < 6)
        {       
        	    System.out.println("Sua senha tem somente "+ password.length() + " caracteres");
        		System.out.println("Minimo 6 Caracteres");
                isValid = false;
        }
        
        // Verifica caracteres especiais, usando o metodo matches().
        String specialChars = "(.*[!,@,#,$,%,^,&,*,(),-,+].*$)";
        if (!password.matches(specialChars ))
        {
                System.out.println("Minimo 1 Caracteres Especial");
                isValid = false;
        }
        
        // Verifica os numeros, usando o metodo matches().
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
                System.out.println("Minimo 1 Numero ");
                isValid = false;
        }
        
        // Verifica letras maiusculas, usando o metodo matches().
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
                System.out.println("Minimo 1 Letra Mai�scula");
                isValid = false;
        }
        
        // Verifica letras minusculas, usando o metodo matches().
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
                System.out.println("Minimo 1 Letra Min�scula ");
                isValid = false;
        }
       
        // Se valido, atende aos requisitos da senha testadas a cima.
        if (isValid) {
        	
        	 System.out.println("Sua senha atende todos os requisitos ");
        	 return isValid;
        }
        
        return isValid; 
        
      
	}

}
