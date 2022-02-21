//Strings Sugeridas:
//ovo = 2
//ifailuhkqq = 3
//abba = 4 
//mom = 3
//kkkk = 10
//abcd = 0
//cdcd = 5
//



package Questao3;

import java.util.Arrays;
import java.util.HashMap;
  
public class Anagrama {
    public static void main(String[] args) {
        stringAny("cdcd");
    }
  
    static void stringAny(String s){
    	
    	// Passa por uma string e adiciona todos os valores em um hashmap.
        HashMap<String, Integer> map= new HashMap<>();
        
        // Total de anagramas.
        int total = 0;
        
        // Para cada key adiciona um ao valor.
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
            	
            	//Ordena todas as Strings.
                char[] valC = s.substring(i, j).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                
                //Se a String foi vista antes.
                if (map.containsKey(val)) {
                	
                	// Verifica quantas vezes a string foi vista e adiciona a contagem.
                	int oldValue = map.get(val);
                    total += oldValue;
                    map.put(val, ++ oldValue);
                    
                }else 
                	
                	// Adiciona 1 ao mapa se não for visto.
                    map.put(val, 1);
            }
        }
        
        int coutParAnagramas = 0;
        
        //Contagem de possiveis pares de anagramas.
        for(String key: map.keySet()){
            int n = map.get(key);
            
            //Total de anagramas será a soma n*(n-1)/2 para todas matizes.
            coutParAnagramas += (n * (n-1))/2;
        
        }
        System.out.println(coutParAnagramas);
    }
}