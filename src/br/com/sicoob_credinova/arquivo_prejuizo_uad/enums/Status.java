package br.com.sicoob_credinova.arquivo_prejuizo_uad.enums;

/**
 * O enum Status representa o estado atual do documento no arquivo: disponível ou
 * emprestado.
 * @author Alisson Jaques
 */
public enum Status {
    
    EMPRESTADO("Emprestado"), DISPONIVEL("Disponível");
    
    private final String descricao;

    private Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }    
}
