
package niveis;

import java.util.Scanner;
import opcao.Opcao;

public class Niveis_Multiplicar { // classe Niveis Somar
    public void Menu_Niveis_Multiplicar(){ // metodo Menu Niveis Multiplicar 
        String vetor_Niveis_Multiplicar[] = new String[0x3]; // vetor dos niveis
        
        Scanner sc = new Scanner(System.in); // criando objeto para leitura de variaveis

        int esc; // definindo variavel para escolha de niveis 
        
        // definindo os níveis para operação multiplicar
        vetor_Niveis_Multiplicar[0] = " || 01 - Facil     ||";
        vetor_Niveis_Multiplicar[1] = " || 02 - Medio     ||";
        vetor_Niveis_Multiplicar[2] = " || 03 - Dificil   ||";
        
        System.out.println(" ____________________ ");
                // definindo comando para exibir os niveis
                for (int i = 0; i < 3; i++) {
                    System.out.println(vetor_Niveis_Multiplicar[i]);
                }
                System.out.println(" ____________________ ");

                System.out.println();
                System.out.print(" Escolha o nivel para Multiplicar: ");
                esc = sc.nextInt();
                
                // usuário escolhe nivel fácil
                if (esc == 1) {

                    int contAcertos = 0;
                    int contErros = 0;
                    int contTotal = 0;

                    // gerando 2 numeros aleatorios, os quais deve ser respondido pelo usuario 10x 
                    for (int i = 0; i < 10; i++) {

                        int n1 = (int) (Math.random() * 10);
                        int n2 = (int) (Math.random() * 10);

                        float r;

                        System.out.println();
                        System.out.printf(" %d x %d = ", n1, n2);

                        r = sc.nextFloat();

                        System.out.println("");

                        // exibi mensagem caso a resposta esteja certa ou errada
                        if (r == n1 * n2) {
                            System.out.println(" Resposta Correta :) ");
                            contAcertos++;
                            contTotal++;

                        } else {
                            System.out.println(" Resposta Incorreta :( ");
                            contErros++;
                        }
                    }

                    System.out.printf("\n");

                    // ao final das 10 questões gera as seguintes informações
                    System.out.printf(" Acertos: %d \n", contAcertos);
                    System.out.printf(" Erros: %d \n", contErros);
                    System.out.printf(" Total de Pontos: %d \n", contTotal * 5);
                    
                }
                
                // usuário escolhe nivel médio
                if (esc == 2) {

                    int contAcertos = 0;
                    int contErros = 0;
                    int contTotal = 0;

                    for (int i = 0; i < 10; i++) {

                        int n1 = (int) (Math.random() * 100);
                        int n2 = (int) (Math.random() * 100);

                        float r;

                        System.out.println();
                        System.out.printf(" %d x %d = ", n1, n2);

                        r = sc.nextFloat();

                        System.out.println("");

                        if (r == n1 * n2) {
                            System.out.println(" Resposta Correta :) ");
                            contAcertos++;
                            contTotal++;

                        } else {
                            System.out.println(" Resposta Incorreta :( ");
                            contErros++;

                        }
                    }

                    System.out.printf("\n");

                    System.out.printf(" Acertos: %d \n", contAcertos);
                    System.out.printf(" Erros: %d \n", contErros);
                    System.out.printf(" Total de Pontos: %d \n", contTotal * 5);

                }
                
                // usuário escolhe nivel difícil
                if (esc == 3) {

                    int contAcertos = 0;
                    int contErros = 0;
                    int contTotal = 0;

                    for (int i = 0; i < 10; i++) {

                        int n1 = (int) (Math.random() * 1000);
                        int n2 = (int) (Math.random() * 1000);

                        float r;

                        System.out.println();
                        System.out.printf(" %d x %d = ", n1, n2);

                        r = sc.nextFloat();

                        System.out.println("");

                        if (r == n1 * n2) {
                            System.out.println(" Resposta Correta :) ");
                            contAcertos++;
                            contTotal++;

                        } else {
                            System.out.println(" Resposta Incorreta :( ");
                            contErros++;

                        }
                    }

                    System.out.printf("\n");

                    System.out.printf(" Acertos: %d \n", contAcertos);
                    System.out.printf(" Erros: %d \n", contErros);
                    System.out.printf(" Total de Pontos: %d \n", contTotal * 5);
                }
                
                    int opc;
                    opc = Opcao.Menu_Opcao(); // acessa o menu de opções

    }
}