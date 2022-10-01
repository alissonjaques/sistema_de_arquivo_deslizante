package br.com.sicoob_credinova.arquivo_prejuizo_uad.controller;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.dao.CaixaDAO;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.factory.ConnectionFactory;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.Caixa;
import java.sql.Connection;

/**
 *
 * @author Alisson Jaques
 */
public class CaixaController {

    private final CaixaDAO caixaDAO;

    public CaixaController() {
        Connection connection = new ConnectionFactory().con;
        this.caixaDAO = new CaixaDAO(connection);
    }
    
    public void inserir(Caixa caixa){
        this.caixaDAO.inserir(caixa);
    }
    
    public void deletarTodos(){
        this.caixaDAO.deletarTodos();
    }
    
    public Caixa selecionar(int id){
        return this.caixaDAO.selecionar(id);
    }
}
