
package matemagica;

// Matemágica versão 2.0
// Developed by Tulio Pulgrossi - All rights reserved © 2015

/* 
   Como a Matemágica funciona? 

   Jogador escolhe a operação aritmética: Somar, Subtrair, Multiplicar e Dividir; 
   Em seguida escolhe o nível que deseja jogar: Fácil, Médio, Difícil; 
   Após a escolha do nível o jogador responde a 10 questões;
   
   O grau de dificuldade vai depender do nível que o jogador escolheu.
   
   Se o Jogador escolher:
   
   Fácil - São gerados dois valores aleatórios entre 0 e 10 para que seja respondido
   Médio - São gerados dois valores aleatórios entre 0 e 100 para que seja respondido
   Difícil - São gerados dois valores aleatórios entre 0 e 1000 para que seja respondido

   Cada acerto do Jogador é exibido: Resposta Correta :)
   Cada acerto do Jogador é exibido: Resposta Incorreta :(

    Ao final das 10 questões respondidas são exibidos:
    
    Número de Acertos;
    Número de Erros;
    Total de Pontos (Cada questão certo vale +5 e Cada errada subtrai -5)
    
    */

public class Matemagica { // classe principal - jogo matemágica
 
    public static void main(String[] args) {
        
        Jogo_Matemagica acessar_menu_principal = new Jogo_Matemagica(); // criando objeto para acessar menu principal
        acessar_menu_principal.Menu_Matemagica(); // acessando menu do jogo
    }
}