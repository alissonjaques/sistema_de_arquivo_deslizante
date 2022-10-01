package br.com.sicoob_credinova.arquivo_prejuizo_uad.model;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.enums.Perfil;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.interfaces.Usuario;

/**
 * A classe UsuarioArquivo representa um usuário do sistema.
 *
 * @author Alisson Jaques
 */
public class UsuarioArquivo implements Usuario {

    private int idUsuario;
    private String nome;
    private String nomeDeUsuario;
    private String cpf;
    private String senha;
    private Perfil perfil;

    /**
     * Construtor completo da classe Usuario, que recebe argumentos suficientes,
     * e necessários, para inicializar todos os campos da classe.
     *
     * @param idUsuario o id do usuário no banco de dados
     * @param nome o nome do usuário
     * @param nomeDeUsuario o nome de login do usuário
     * @param cpf o cpf do usuário
     * @param senha a senha do usuário
     * @param perfil o perfil de acesso do usuário
     */
    public UsuarioArquivo(int idUsuario, String nome, String nomeDeUsuario,
            String cpf, String senha, Perfil perfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.nomeDeUsuario = nomeDeUsuario;
        this.cpf = cpf;
        this.senha = senha;
        this.perfil = perfil;
    }

    /**
     * @return the nomeDeUsuario
     */
    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    /**
     * @param nomeDeUsuario the nomeDeUsuario to set
     */
    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    /**
     * Construtor default
     */
    public UsuarioArquivo() {

    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * O método setSenha altera a senha do usuário recebe como argumento a senha
     * anterior e a nova senha.
     *
     * @param senhaAtual a senha atual do usuário
     * @param novaSenha a nova senha do usuário
     * @return true se a alteração ocorrer, false caso contrário
     */
    @Override
    public boolean setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Atualiza a senha encapsulada no objeto com a passada como argumennto
     * @param senha a nova senha
     */
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    /**
     * @return the perfil
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    /**
     * @return uma String com os campos da classe formatados
     */
    @Override
    public String toString() {
        StringBuilder camposFormatados = new StringBuilder();
        camposFormatados.append("ID Usuário: ").append(getIdUsuario());
        camposFormatados.append("\nNome: ").append(getNome());
        camposFormatados.append("\nNome de usuário: ").append(getNomeDeUsuario());
        camposFormatados.append("\nCPF: ").append(getCpf());
        camposFormatados.append("\nSenha: ").append(getSenha());
        camposFormatados.append("\nPerfil: ").append(getPerfil().toString());
        return camposFormatados.toString();
    }
}
