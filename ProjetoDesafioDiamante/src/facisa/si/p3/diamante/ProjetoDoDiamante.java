package facisa.si.p3.diamante;

import java.util.Scanner;

public class ProjetoDoDiamante {
    public static void main(String[] args) {
        int numero; 
        int espacos;
        int	asteriscos;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um n�mero �mpar: ");
        numero = entrada.nextInt();
        
        while (numero%2 == 0) {
        	 System.out.println("O n�mero n�o � impar");
        	 System.out.print("Insira um n�mero �mpar: ");
             numero = entrada.nextInt();
		}
        
        if(numero%2 != 0){
            
            //Imprimindo a parte de cima do diamante
            asteriscos = 1;
            espacos = (numero-1)/2;
            for(int linha = 1 ; espacos > 0 ; linha++){
                
                //Espa�os
                for(int count = 1 ; count <= espacos ; count++){
                    System.out.print(" ");
                }
                
                //Asteriscos
                for(int count = 1 ; count <= asteriscos ; count++){
                    System.out.print("*");
                }
                
                espacos--;
                asteriscos += 2;
                System.out.println();
            }
            
            //Imprimindo a parte de baixo do diamante
            for(int linha=1 ; asteriscos > 0 ; linha++){
                
                //Espa�os
                for(int count = 1 ; count <= espacos ; count++){
                    System.out.print(" ");
                }
                
                //Asteriscos
                for(int count = 1 ; count <= asteriscos ; count++){
                    System.out.print("*");
                }
                
                espacos++;
                asteriscos -= 2;
                System.out.println();
            }
            
        }
        
        
    }
}