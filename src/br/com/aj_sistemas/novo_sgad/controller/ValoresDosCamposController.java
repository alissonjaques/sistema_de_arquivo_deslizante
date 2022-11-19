package br.com.aj_sistemas.novo_sgad.controller;

import br.com.aj_sistemas.novo_sgad.dao.ValoresDosCamposDAO;
import br.com.aj_sistemas.novo_sgad.factory.ConnectionFactory;
import br.com.aj_sistemas.novo_sgad.model.ValoresDosCampos;
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
