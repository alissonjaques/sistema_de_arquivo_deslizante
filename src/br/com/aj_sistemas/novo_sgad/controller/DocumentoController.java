package br.com.aj_sistemas.novo_sgad.controller;

import br.com.aj_sistemas.novo_sgad.dao.DocumentoDAO;
import br.com.aj_sistemas.novo_sgad.factory.ConnectionFactory;
import br.com.aj_sistemas.novo_sgad.model.Documento;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Alisson Jaques
 */
public class DocumentoController {
    
    private final DocumentoDAO documentoDAO;
    
    public DocumentoController() {
        Connection connection = new ConnectionFactory().con;
        this.documentoDAO = new DocumentoDAO(connection);
    }
    
    public void inserir(Documento documento){
        this.documentoDAO.inserir(documento);
    }
    
    public void editar(Documento documento){
        this.documentoDAO.editar(documento);
    }
    
    public List<Documento> selecionarPorCaixa(int id_caixa) {
        return this.documentoDAO.selecionarPorCaixa(id_caixa);
    }
    
    public Documento selecionar(int id_documento){
        return this.documentoDAO.selecionar(id_documento);
    }
    
    public void excluir(int id_documento){
        this.documentoDAO.excluir(id_documento);
    }   

    public int getOrdem(int id_caixa) {
        return this.documentoDAO.getOrdem(id_caixa);
    }
    
    public void atualizaOrdens(int id_documento, int id_caixa){
        this.documentoDAO.atualizaOrdens(id_documento, id_caixa);
    }

    public List<String> buscarDocumento(String tipoDocumental, int valor, String termo) {
        return this.documentoDAO.buscarDocumento(tipoDocumental,valor,termo);
    }
    
}
