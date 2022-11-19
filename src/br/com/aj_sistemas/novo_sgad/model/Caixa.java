package br.com.aj_sistemas.novo_sgad.model;

/**
 * A classe Caixa representa uma caixa do Arquivo.
 * @author Alisson Jaques
 */
public class Caixa { // declaração da classe
    
    // campos da classe
    private int id_caixa;
    private int rua;
    private int avenida;
    private int predio;
    private int andar;
    private int apartamento;
    
    /**
     * Construtor completo da classe Caixa, que recebe argumentos suficientes, e 
     * necessários, para inicializar todos os campos da classe.
     * @param id_caixa o número da caixa
     * @param rua a rua da caixa
     * @param avenida a avenida da caixa
     * @param predio o prédio da caixa
     * @param andar o andar da caixa
     * @param apartamento o apartamento da caixa
    */
    public Caixa(int id_caixa, int rua, int avenida, int predio,
            int andar, int apartamento) {
        this.id_caixa = id_caixa;
        this.rua = rua;
        this.avenida = avenida;
        this.predio = predio;
        this.andar = andar;
        this.apartamento = apartamento;
    }
    
    /**
     * Construtor default da classe Caixa
     */
    public Caixa() {

    }

    /**
     * @return the id_caixa
     */
    public int getId_caixa() {
        return id_caixa;
    }

    /**
     * @param id_caixa the id_caixa to set
     */
    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    /**
     * @return the rua
     */
    public int getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(int rua) {
        this.rua = rua;
    }

    /**
     * @return the avenida
     */
    public int getAvenida() {
        return avenida;
    }

    /**
     * @param avenida the avenida to set
     */
    public void setAvenida(int avenida) {
        this.avenida = avenida;
    }

    /**
     * @return the predio
     */
    public int getPredio() {
        return predio;
    }

    /**
     * @param predio the predio to set
     */
    public void setPredio(int predio) {
        this.predio = predio;
    }

    /**
     * @return the andar
     */
    public int getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * @return the apartamento
     */
    public int getApartamento() {
        return apartamento;
    }

    /**
     * @param apartamento the apartamento to set
     */
    public void setApartamento(int apartamento) {
        this.apartamento = apartamento;
    }

    /**
     * @return uma String com os campos da classe formatados
     */
    @Override
    public String toString() {
        StringBuilder camposFormatados = new StringBuilder();
        camposFormatados.append("Id Caixa: ").append(getId_caixa());
        camposFormatados.append("\nRua: ").append(getRua());
        camposFormatados.append("\nAvenida: ").append(getAvenida());
        camposFormatados.append("\nPredio: ").append(getPredio());
        camposFormatados.append("\nAndar: ").append(getAndar());
        camposFormatados.append("\nApartamento: ").append(getApartamento());
        return camposFormatados.toString();
    }
}
