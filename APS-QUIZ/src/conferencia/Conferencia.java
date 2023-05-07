package conferencia;

import javax.swing.JOptionPane;

public class Conferencia {

    private String validade;
    
    //A seguir, será comparado a String da reposta correta (exemplo: "Terra") com a String da resposta do usuário (exemplo: "Sol")
    //Caso contenha o mesmo texto, retornará que o usuário acertou a questão.
    public String validarResposta(String solucao,String respostaUsuario){
        
        if (respostaUsuario.equals(solucao)){
            JOptionPane.showMessageDialog(null,
                    "Parabéns, Você acertou!",
                    "Resposta Correta",
                    JOptionPane.PLAIN_MESSAGE);
            validade = "correto";
        }else{
            JOptionPane.showMessageDialog(null,
                    "Você errou!",
                    "Resposta Incorreta",
                    JOptionPane.PLAIN_MESSAGE);
            validade = "incorreto";
        }
        return validade;
    }
}