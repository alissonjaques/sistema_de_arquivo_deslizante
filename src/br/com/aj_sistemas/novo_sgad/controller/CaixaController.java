package br.com.aj_sistemas.novo_sgad.controller;

import br.com.aj_sistemas.novo_sgad.dao.CaixaDAO;
import br.com.aj_sistemas.novo_sgad.factory.ConnectionFactory;
import br.com.aj_sistemas.novo_sgad.model.Caixa;
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
