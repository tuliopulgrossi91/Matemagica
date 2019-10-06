
package opcao;

import java.util.Scanner;
import matemagica.Jogo_Matemagica;
import niveis.Niveis_Dividir;
import niveis.Niveis_Multiplicar;
import niveis.Niveis_Somar;
import niveis.Niveis_Subtrair;
import operar.Operar;

public class Opcao { // classe Opcao
    public static int Menu_Opcao(){ // metodo Menu Opção
        String vetor_Opcao[] = new String[7]; // vetor das opções
        
        Scanner sc = new Scanner(System.in); // criando objeto para leitura de variaveis

        int opc; // definindo variavel para escolha de operador 
        
        // definindo os operadores
        vetor_Opcao[0] = " || 01 - Voltar para Escolha de Operadores          ||";
        vetor_Opcao[1] = " || 02 - Voltar para Escolha de Niveis Somar        ||";
        vetor_Opcao[2] = " || 03 - Voltar para Escolha de Niveis Subtrair     ||";
        vetor_Opcao[3] = " || 04 - Voltar para Escolha de Niveis Multiplicar  ||";
        vetor_Opcao[4] = " || 05 - Voltar para Escolha de Niveis Dividir      ||";
        vetor_Opcao[5] = " || 06 - Voltar para Menu Principal                 ||";
        vetor_Opcao[6] = " || 07 - Sair do Jogo                               ||";
        
        System.out.println(" ____________________________________________________ ");
                // definindo comando para exibir os operadores
                for (int i = 0; i < 7; i++) {
                    System.out.println(vetor_Opcao[i]);
                }
                System.out.println(" ____________________________________________________ ");

                System.out.println();
                System.out.print(" Escolha o que deseja fazer: ");
                opc = sc.nextInt();
                
                    Niveis_Dividir acessar_niveis_dividir = new Niveis_Dividir(); // criando objeto para acessar menu niveis dividir
                    Niveis_Multiplicar acessar_niveis_multiplicar = new Niveis_Multiplicar(); // criando objeto para acessar menu niveis multiplicar 
                    Niveis_Somar acessar_niveis_somar = new Niveis_Somar(); // criando objeto para acessar menu niveis somar
                    Niveis_Subtrair acessar_niveis_subtrair = new Niveis_Subtrair(); // criando objeto para acessar menu niveis subtrair 
                    Jogo_Matemagica acessar_menu_principal = new Jogo_Matemagica(); // criando objeto para acessar menu principal
                    
                    switch(opc){

                        case 1:  // Volta para Escolha de Operadores
                            int op; 
                            op = Operar.Menu_Operar();
                            
                            if (op == 1){ // chama o método da classe Niveis_Somar
                                acessar_niveis_somar.Menu_Niveis_Somar(); 
                            } else if (op == 2){ // chama o método da classe Niveis_Subtrair
                                acessar_niveis_subtrair.Menu_Niveis_Subtrair(); 
                            } else if (op == 3){ // chama o método da classe Niveis_Multiplicar
                                acessar_niveis_multiplicar.Menu_Niveis_Multiplicar(); 
                            } else if (op == 4){ // chama o método da classe Niveis_Dividir
                                acessar_niveis_dividir.Menu_Niveis_Dividir(); 
                            }
                            
                            break;

                        case 2: // Volta para Escolha de Niveis Somar
                            acessar_niveis_somar.Menu_Niveis_Somar();
                            break;

                        case 3: // Volta para Escolha de Niveis Subtrair
                            acessar_niveis_subtrair.Menu_Niveis_Subtrair();
                            break;

                        case 4: // Voltar para Escolha de Niveis Multiplicar
                            acessar_niveis_multiplicar.Menu_Niveis_Multiplicar();
                            break;

                        case 5: // Voltar para Escolha de Niveis Dividir
                            acessar_niveis_dividir.Menu_Niveis_Dividir();
                            break;

                        case 6: // Voltar para Menu Principal
                            acessar_menu_principal.Menu_Matemagica();
                            break;
                            
                        case 7: // Sair do Jogo
                            System.out.println(" Developed by Tulio Pulgrossi - All rights reserved © 2015 ");
                            System.exit(0);
                        break;

                        default:
                            System.out.println(" Alternativa invalida! ");
                    }
                
                // retorna o operador escolhido
                return opc;
                }
}
