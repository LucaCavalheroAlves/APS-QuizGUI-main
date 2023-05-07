package pontuador;

public class Pontuador {
    // Aqui estão armazenadas as repostas do quiz de forma ordenada
    //private int[] gabarito = { 2, 0, 2, 3, 1, 3, 1, 0, 1, 0, 3, 3, 0, 0, 2, 1, 0, 2, 3, 2, 0, 1, 1, 0, 3, 2, 1, 2, 1, 3 };
    
    //Abaixo está armazenado as reposta do quiz em forma de String
    //O motivo de estar em String é porque na correção (validarResposta, em Conferencia.java) será comparado a String que o usuário respondeu com a da resposta da questão.
    private String[] gabaritoString =
/* 1 a 5 */ { "Indeterminado", "Pau-Brasil", "Hiena", "Vermelho, amarelo, verde, marrom e azul", "Chuveiro",
/* 6 a 10 */ "1%", "Separar o lixo orgânico do seco", "Aquíferos", "Baleia-azul", "Tubarão-da-Groenlândia",
/* 11 a 15 */ "Vênus", "O³ - Oxigênio tri-atômico", "Fotossíntese e clorofila", "Pegada de Carbono", "Solar",
/* 16 a 20 */ "Selando o material e armazenando-o em locais revestidos por concreto, longe de seres vivos", "Cerrado e Mata Atlântica", "Lâmpadas fluorescentes, baterias e seringas", "Antártica", "Tardígrados",
/* 21 a 25 */ "CO2 - Dióxido de Carbono, CH4 - Metano, N2O - Óxido Nitroso", "Lixiviação", "10100", "Amazônia", "Agenda 21",
/* 26 a 30 */ "Local com pouquíssima umidade e raras chuvas", "Inclinação terrestre", "Aranha, ácaro e formiga", "Borboleta, morcego e lêmure", "Lahore, Paquistão"
            };
    
    
    private int pontuaçãoUsuario = 0;

    // Esse método retorna a solução de uma questão
    public String getSolucaoIndividual(int numeroQuestao) {
        return gabaritoString[numeroQuestao];
    }

    // Aqui altera a pontuação do usuário a cada acerto
    public void setPontuaçãoUsuario(String correcao) {
        if (correcao.equals("correto")) {
            this.pontuaçãoUsuario += 1;
        }
    }

    // Retorna a pontuação atual do usuário
    public int getPontuaçãoUsuario() {
        return pontuaçãoUsuario;
    }

}
