package br.com.sicoob_credinova.arquivo_prejuizo_uad.enums;

/**
 * O enum Perfil representa um perfil de acesso de um usu�rio do sistema.
 * @author Alisson Jaques
 */
public enum Perfil {
    
    USUARIO("Usu�rio"), SUPERVISOR("Supervisor"), ADMINISTRADOR("Administrador");
    
    private final String descricao;

    private Perfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }    
}
