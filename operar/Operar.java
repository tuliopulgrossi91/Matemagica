
package operar;

import java.util.Scanner;

public class Operar { // classe Operar
    public static int Menu_Operar(){ // metodo Menu Operar 
        String vetor_Operar[] = new String[4]; // vetor dos operadores
        
        Scanner sc = new Scanner(System.in); // criando objeto para leitura de variaveis

        int op; // definindo variavel para escolha de operador 
        
        // definindo os operadores
        vetor_Operar[0] = " || 01 - Somar        ||";
        vetor_Operar[1] = " || 02 - Subtrair     ||";
        vetor_Operar[2] = " || 03 - Multiplicar  ||";
        vetor_Operar[3] = " || 04 - Dividir      ||";
        
        System.out.println(" _______________________ ");
                // definindo comando para exibir os operadores
                for (int i = 0; i < 4; i++) {
                    System.out.println(vetor_Operar[i]);
                }
                System.out.println(" _______________________ ");

                System.out.println();
                System.out.print(" Escolha o operador que deseja: ");
                op = sc.nextInt();
                
                // retorna o operador escolhido
                return op;
                }
}