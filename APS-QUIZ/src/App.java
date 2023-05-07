import textos.Gui;

public class App {
        public static void main(String[] args) {
                Gui jogo = new Gui();
                //Criará a chamada para mostrar a interface de apresentação, perguntando o nome do usuário
                jogo.obterNome();
                
                //Mostrará a questão ao usuário, com interface
                jogo.inicio();
                
                //Esse método mostra a interface com as alternativas do quiz, de acordo com a dificuldade
                //o usuário responderá com a que achar correta
                jogo.Jogar("Fácil");
                jogo.Jogar("Médio");
                jogo.Jogar("Dificil");
                
                //Interface de despedida, mostrando a quantidade de acertos
                jogo.Despedida();
        }
}