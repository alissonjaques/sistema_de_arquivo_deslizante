package br.com.aj_sistemas.novo_sgad.enums;

/**
 * O enum Status representa o estado atual do documento no arquivo: dispon�vel ou
 * emprestado.
 * @author Alisson Jaques
 */
public enum Status {
    
    EMPRESTADO("Emprestado"), DISPONIVEL("Dispon�vel");
    
    private final String descricao;

    private Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }    
}
