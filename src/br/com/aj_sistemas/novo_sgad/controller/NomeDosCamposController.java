package br.com.aj_sistemas.novo_sgad.controller;

import br.com.aj_sistemas.novo_sgad.dao.NomeDosCamposDAO;
import br.com.aj_sistemas.novo_sgad.factory.ConnectionFactory;
import br.com.aj_sistemas.novo_sgad.model.NomeDosCampos;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Alisson Jaques
 */
public class NomeDosCamposController {

    private final NomeDosCamposDAO nomeDosCamposDAO;

    public NomeDosCamposController() {
        Connection connection = new ConnectionFactory().con;
        this.nomeDosCamposDAO = new NomeDosCamposDAO(connection);
    }
    
    public void inserir(NomeDosCampos nomeDosCampos){
        this.nomeDosCamposDAO.inserir(nomeDosCampos);
    }
    
    public void editar(NomeDosCampos nomeDosCampos){
        this.nomeDosCamposDAO.editar(nomeDosCampos);
    }
    
    public NomeDosCampos selecionar(int numero_identificacao){
        return this.nomeDosCamposDAO.selecionar(numero_identificacao);
    }
    
    public String selecionarPorId(int id){
        return this.nomeDosCamposDAO.selecionarPorId(id);
    }
    
    public NomeDosCampos selecionarId(int id){
        return this.nomeDosCamposDAO.selecionarId(id);
    }
    
    public List<NomeDosCampos> selecionar(String nome){
        return this.nomeDosCamposDAO.selecionar(nome);
    }
    
    public void deletar(int numero_identificacao){
        this.nomeDosCamposDAO.deletar(numero_identificacao);
    }

    public boolean verificaNomeTipoDocumental(String nome) {
        return this.nomeDosCamposDAO.verificaNomeTipoDocumental(nome);
    }

    public boolean verificaNumero(String numero) {
        return this.nomeDosCamposDAO.verificaNumero(numero);
    }

    public boolean isRegistros(String nomeTipoDocumental) {
        return this.nomeDosCamposDAO.isRegistros(nomeTipoDocumental);
    }
}
