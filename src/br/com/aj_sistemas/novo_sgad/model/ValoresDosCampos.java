package br.com.aj_sistemas.novo_sgad.model;

/**
 * A classe ValoresDosCampos representa os valores dos campos de um documento do
 * arquivo.
 *
 * @author Alisson Jaques
 */
public class ValoresDosCampos { // declaração da classe

    // campos da classe
    private int id_valores_dos_campos;
    private String valor1;
    private String valor2;
    private String valor3;
    private String valor4;
    private String valor5;
    private String valor6;
    private String valor7;

    /**
     *
     * Construtor completo da classe ValoresDosCampos, que recebe argumentos suficientes, e
     * necessários, para inicializar todos os campos da classe.
     *
     * @param id_valores_dos_campos
     * @param valor1 o conteúdo da primeira descrição complementar
     * @param valor2 o conteúdo da segunda descrição complementar
     * @param valor3 o conteúdo da terceira descrição complementar
     * @param valor4 o conteúdo da quarta descrição complementar
     * @param valor5 o conteúdo da quinta descrição complementar
     * @param valor6 o conteúdo da sexta descrição complementar
     * @param valor7 o conteúdo da sétima descrição complementar
     */
    public ValoresDosCampos(int id_valores_dos_campos, String valor1,
            String valor2, String valor3, String valor4,
            String valor5, String valor6, String valor7) {
        this.id_valores_dos_campos = id_valores_dos_campos;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.valor4 = valor4;
        this.valor5 = valor5;
        this.valor6 = valor6;
        this.valor7 = valor7;
    }

    /**
     * Construtor default
     */
    public ValoresDosCampos() {

    }

    /**
     * @return the id_valores_dos_campos
     */
    public int getId_valores_dos_campos() {
        return id_valores_dos_campos;
    }

    /**
     * @param id_valores_dos_campos the id_valores_dos_campos to set
     */
    public void setId_valores_dos_campos(int id_valores_dos_campos) {
        this.id_valores_dos_campos = id_valores_dos_campos;
    }

    /**
     * @return the valor1
     */
    public String getValor1() {
        return valor1;
    }

    /**
     * @param valor1 the valor1 to set
     */
    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    /**
     * @return the valor2
     */
    public String getValor2() {
        return valor2;
    }

    /**
     * @param valor2 the valor2 to set
     */
    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    /**
     * @return the valor3
     */
    public String getValor3() {
        return valor3;
    }

    /**
     * @param valor3 the valor3 to set
     */
    public void setValor3(String valor3) {
        this.valor3 = valor3;
    }

    /**
     * @return the valor4
     */
    public String getValor4() {
        return valor4;
    }

    /**
     * @param valor4 the valor4 to set
     */
    public void setValor4(String valor4) {
        this.valor4 = valor4;
    }

    /**
     * @return the valor5
     */
    public String getValor5() {
        return valor5;
    }

    /**
     * @param valor5 the valor5 to set
     */
    public void setValor5(String valor5) {
        this.valor5 = valor5;
    }

    /**
     * @return the valor6
     */
    public String getValor6() {
        return valor6;
    }

    /**
     * @param valor6 the valor6 to set
     */
    public void setValor6(String valor6) {
        this.valor6 = valor6;
    }

    /**
     * @return the valor7
     */
    public String getValor7() {
        return valor7;
    }

    /**
     * @param valor7 the valor7 to set
     */
    public void setValor7(String valor7) {
        this.valor7 = valor7;
    }

    /**
     * @return uma String com os campos da classe formatados
     */
    @Override
    public String toString() {
        StringBuilder camposFormatados = new StringBuilder();
        camposFormatados.append("ID : ").append(getId_valores_dos_campos());
        camposFormatados.append("\nDescrição Complementar 1: ").append(getValor1());
        camposFormatados.append("\nDescrição Complementar 2: ").append(getValor2());
        camposFormatados.append("\nDescrição Complementar 3: ").append(getValor3());
        camposFormatados.append("\nDescrição Complementar 4: ").append(getValor4());
        camposFormatados.append("\nDescrição Complementar 5: ").append(getValor5());
        camposFormatados.append("\nDescrição Complementar 6: ").append(getValor6());
        camposFormatados.append("\nDescrição Complementar 7: ").append(getValor7());
        return camposFormatados.toString();
    }
}
