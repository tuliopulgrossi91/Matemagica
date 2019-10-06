
package matemagica;

import java.util.Scanner;
import niveis.Niveis_Dividir;
import niveis.Niveis_Multiplicar;
import niveis.Niveis_Somar;
import niveis.Niveis_Subtrair;
import operar.Operar;

public class Jogo_Matemagica {
    public void Menu_Matemagica(){
        String vetor_Menu_Principal[] = new String[2]; // vetor menu principal
        
        Scanner sc = new Scanner(System.in); // criando objeto para leitura de variaveis

        int esc; // definindo variavel para escolha de operações e niveis  
        
        Niveis_Dividir acessar_niveis_dividir = new Niveis_Dividir(); // criando objeto para acessar menu niveis dividir
        Niveis_Multiplicar acessar_niveis_multiplicar = new Niveis_Multiplicar(); // criando objeto para acessar menu niveis multiplicar 
        Niveis_Somar acessar_niveis_somar = new Niveis_Somar(); // criando objeto para acessar menu niveis somar
        Niveis_Subtrair acessar_niveis_subtrair = new Niveis_Subtrair(); // criando objeto para acessar menu niveis subtrair 
        
        // definindo menu principal
        vetor_Menu_Principal[0] = " || 01 - Iniciar Jogo ||";
        vetor_Menu_Principal[1] = " || 02 - Sair do Jogo ||";
        
        System.out.println();
        System.out.println(" Matemágica ");
        
        
        System.out.println(" _______________________ ");
                // definindo comando para exibir os operadores
                for (int i = 0; i < 2; i++) {
                    System.out.println(vetor_Menu_Principal[i]);
                }
                System.out.println(" _______________________ ");

                System.out.println();
                System.out.print(" Escolha: ");
                esc = sc.nextInt();
                
        switch(esc){
            case 1:
                    int op; 
                    op = Operar.Menu_Operar();
                    
                    if (op == 1){
                        acessar_niveis_somar.Menu_Niveis_Somar();  // chama o método da classe Niveis_Somar
                    } else if (op == 2){
                        acessar_niveis_subtrair.Menu_Niveis_Subtrair(); // chama o método da classe Niveis_Subtrair
                    } else if (op == 3){
                        acessar_niveis_multiplicar.Menu_Niveis_Multiplicar(); // chama o método da classe Niveis_Multiplicar
                    } else if (op == 4){
                        acessar_niveis_dividir.Menu_Niveis_Dividir(); // chama o método da classe Niveis_Dividir
                    }
                break;
                
                case 2:
                    System.out.println(" Developed by Tulio Pulgrossi - All rights reserved © 2015 ");
                    System.exit(0);
                break;
                    
             default:
                System.out.println(" Alternativa invalida! ");
        
        }
    }
}
