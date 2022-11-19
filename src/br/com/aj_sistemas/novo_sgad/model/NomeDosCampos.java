package br.com.aj_sistemas.novo_sgad.model;

/**
 * A classe NomeDosCampos representa os nomes dos campos de um documento do
 * Arquivo
 *
 * @author Alisson Jaques
 */
public class NomeDosCampos { // declaração da classe

    // campos da classe
    private int id_nome_dos_campos;
    private int numero_identificacao;
    private String nome;
    private String nome1;
    private String nome2;
    private String nome3;
    private String nome4;
    private String nome5;
    private String nome6;
    private String nome7;

    /**
     *
     * Construtor completo da classe NomeDosCampos, que recebe argumentos
     * suficientes, e necessários, para inicializar todos os campos da classe.
     *
     * @param id_nome_dos_campos o id dessa classe no banco de dados
     * @param numero_identificacao um número de inteficação do documento
     * @param nome o nome do tipo documental
     * @param nome1 informação complementar 1
     * @param nome2 informação complementar 2
     * @param nome3 informação complementar 3
     * @param nome4 informação complementar 4
     * @param nome5 informação complementar 5
     * @param nome6 informação complementar 6
     * @param nome7 informação complementar 7
     */
    public NomeDosCampos(int id_nome_dos_campos, int numero_identificacao,
            String nome, String nome1, String nome2, String nome3, String nome4,
            String nome5, String nome6, String nome7) {
        this.id_nome_dos_campos = id_nome_dos_campos;
        this.numero_identificacao = numero_identificacao;
        this.nome = nome;
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nome3 = nome3;
        this.nome4 = nome4;
        this.nome5 = nome5;
        this.nome6 = nome6;
        this.nome7 = nome7;
    }

    /**
     * Construtor default
     */
    public NomeDosCampos() {
        this.id_nome_dos_campos = 0;
        this.numero_identificacao = 0;
        this.nome = "";
        this.nome1 = "Informação Complementar 1";
        this.nome2 = "Informação Complementar 2";
        this.nome3 = "Informação Complementar 3";
        this.nome4 = "Informação Complementar 4";
        this.nome5 = "Informação Complementar 5";
        this.nome6 = "Informação Complementar 6";
        this.nome7 = "Informação Complementar 7";
    }

    /**
     * @return the numero_identificacao
     */
    public int getNumero_identificacao() {
        return numero_identificacao;
    }

    /**
     * @param numero_identificacao the numero_identificacao to set
     */
    public void setNumero_identificacao(int numero_identificacao) {
        this.numero_identificacao = numero_identificacao;
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
     * @return the id_nome_dos_campos
     */
    public int getId_nome_dos_campos() {
        return id_nome_dos_campos;
    }

    /**
     * @param id_nome_dos_campos the id_nome_dos_campos to set
     */
    public void setId_nome_dos_campos(int id_nome_dos_campos) {
        this.id_nome_dos_campos = id_nome_dos_campos;
    }

    /**
     * @return the nome1
     */
    public String getNome1() {
        return nome1;
    }

    /**
     * @param nome1 the nome1 to set
     */
    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    /**
     * @return the nome2
     */
    public String getNome2() {
        return nome2;
    }

    /**
     * @param nome2 the nome2 to set
     */
    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    /**
     * @return the nome3
     */
    public String getNome3() {
        return nome3;
    }

    /**
     * @param nome3 the nome3 to set
     */
    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    /**
     * @return the nome4
     */
    public String getNome4() {
        return nome4;
    }

    /**
     * @param nome4 the nome4 to set
     */
    public void setNome4(String nome4) {
        this.nome4 = nome4;
    }

    /**
     * @return the nome5
     */
    public String getNome5() {
        return nome5;
    }

    /**
     * @param nome5 the nome5 to set
     */
    public void setNome5(String nome5) {
        this.nome5 = nome5;
    }

    /**
     * @return the nome6
     */
    public String getNome6() {
        return nome6;
    }

    /**
     * @param nome6 the nome6 to set
     */
    public void setNome6(String nome6) {
        this.nome6 = nome6;
    }

    /**
     * @return the nome7
     */
    public String getNome7() {
        return nome7;
    }

    /**
     * @param nome7 the nome7 to set
     */
    public void setNome7(String nome7) {
        this.nome7 = nome7;
    }

    /**
     * @return uma String com os campos da classe formatados
     */
    @Override
    public String toString() {
        StringBuilder camposFormatados = new StringBuilder();
        camposFormatados.append("ID : ").append(getId_nome_dos_campos());        
        camposFormatados.append("\nNúmero de Identificação: ").append(getNumero_identificacao());
        camposFormatados.append("\nTipo Documental: ").append(getNome());
        camposFormatados.append("\nInformação Complementar 1: ").append(getNome1());
        camposFormatados.append("\nInformação Complementar 2: ").append(getNome2());
        camposFormatados.append("\nInformação Complementar 3: ").append(getNome3());
        camposFormatados.append("\nInformação Complementar 4: ").append(getNome4());
        camposFormatados.append("\nInformação Complementar 5: ").append(getNome5());
        camposFormatados.append("\nInformação Complementar 6: ").append(getNome6());
        camposFormatados.append("\nInformação Complementar 7: ").append(getNome7());
        return camposFormatados.toString();
    }
}
