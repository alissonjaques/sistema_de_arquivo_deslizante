package br.com.sicoob_credinova.arquivo_prejuizo_uad.controller;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.dao.ValoresDosCamposDAO;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.factory.ConnectionFactory;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.ValoresDosCampos;
import java.sql.Connection;

/**
 *
 * @author Alisson Jaques
 */
public class ValoresDosCamposController {
    private final ValoresDosCamposDAO valoresDosCamposDAO;

    public ValoresDosCamposController() {
        Connection connection = new ConnectionFactory().con;
        this.valoresDosCamposDAO = new ValoresDosCamposDAO(connection);
    }
    
    public int inserir(ValoresDosCampos valoresDosCampos){
        return this.valoresDosCamposDAO.inserir(valoresDosCampos);
    }
            
    public void editar(ValoresDosCampos valoresDosCampos){
        this.valoresDosCamposDAO.editar(valoresDosCampos);
    }
    
    public ValoresDosCampos selecionar(int id_valores_dos_campos){
        return this.valoresDosCamposDAO.selecionar(id_valores_dos_campos);
    }
    
    public void deletar(int id_valores_dos_campos){
        this.valoresDosCamposDAO.deletar(id_valores_dos_campos);
    }
}
