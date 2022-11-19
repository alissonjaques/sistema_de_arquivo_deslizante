package br.com.aj_sistemas.novo_sgad.model;

import br.com.aj_sistemas.novo_sgad.enums.Status;
import java.sql.Date;

/**
 * A classe Documento representa um documento no arquivo.
 *
 * @author Alisson Jaques
 */
public class Documento { // declaração da classe
    // declaração dos campos da classe

    private int idDocumento;
    private int ordem;
    private NomeDosCampos nomeDosCampos;
    private ValoresDosCampos valoresDosCampos;
    private Caixa caixa;
    private Date dateTime;
    private String nomeUsuario;
    private Status status;

    /**
     * O construtor completo da classe Documento recebe argumentos para
     * inicializar todos os seus campos.
     *
     * @param idDocumento o id do documento no banco de dados
     * @param ordem a ordem do documento na caixa
     * @param nomeDosCampos os nomes dos campos do documento
     * @param valoresDosCampos os valores dos campos do documento
     * @param caixa a caixa que o documento pertence
     * @param nomeUsuario o último usuário que cadastrou/alterou o documento
     * @param status informa se o documento está emprestado ou não
     */
    public Documento(int idDocumento, int ordem, NomeDosCampos nomeDosCampos,
            ValoresDosCampos valoresDosCampos, Caixa caixa, String nomeUsuario, Status status) {
        this.idDocumento = idDocumento;
        this.ordem = ordem;
        this.nomeDosCampos = nomeDosCampos;
        this.valoresDosCampos = valoresDosCampos;
        this.caixa = caixa;
        this.nomeUsuario = nomeUsuario;
        this.status = status;
        this.dateTime = new java.sql.Date(new java.util.Date().getTime());
    }

    public Documento() {
        
    }

    /**
     * @return the idDocumento
     */
    public int getIdDocumento() {
        return idDocumento;
    }

    /**
     * @param idDocumento the idDocumento to set
     */
    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    /**
     * @return the ordem
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * @param ordem the ordem to set
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    /**
     * @return the nomeDosCampos
     */
    public NomeDosCampos getNomeDosCampos() {
        return nomeDosCampos;
    }

    /**
     * @param nomeDosCampos the nomeDosCampos to set
     */
    public void setNomeDosCampos(NomeDosCampos nomeDosCampos) {
        this.nomeDosCampos = nomeDosCampos;
    }

    /**
     * @return the valoresDosCampos
     */
    public ValoresDosCampos getValoresDosCampos() {
        return valoresDosCampos;
    }

    /**
     * @param valoresDosCampos the valoresDosCampos to set
     */
    public void setValoresDosCampos(ValoresDosCampos valoresDosCampos) {
        this.valoresDosCampos = valoresDosCampos;
    }

    /**
     * @return the caixa
     */
    public Caixa getCaixa() {
        return caixa;
    }

    /**
     * @param caixa the caixa to set
     */
    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    /**
     * @return the dateTime
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return uma String com os campos da classe formatados
     */
    @Override
    public String toString() {
        StringBuilder camposFormatados = new StringBuilder();
        camposFormatados.append("ID Documento: ").append(getIdDocumento());
        camposFormatados.append("\nOrdem: ").append(getOrdem());
        camposFormatados.append("\n****************** Campos do documento ******************** \n").append(getNomeDosCampos());
        camposFormatados.append("\n******************* Valores dos campos ******************** \n").append(getValoresDosCampos());
        camposFormatados.append("\nCaixa: ").append(getCaixa());
        camposFormatados.append("\nData e horário do cadastro: ").append(getDateTime());
        camposFormatados.append("\nUsuário responsável: ").append(getNomeUsuario());
        camposFormatados.append("\nStatus do documento: ").append(getStatus().toString());
        return camposFormatados.toString();
    }

}
