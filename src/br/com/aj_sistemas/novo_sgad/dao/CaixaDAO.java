package br.com.aj_sistemas.novo_sgad.dao;

import br.com.aj_sistemas.novo_sgad.model.Caixa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alisson Jaques
 */
public class CaixaDAO {

    private final Connection connection;

    public CaixaDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(Caixa caixa) {
        try {
            String sql = "insert into caixa values (?,?,?,?,?,?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setInt(1, caixa.getId_caixa());
                pstm.setInt(2, caixa.getRua());
                pstm.setInt(3, caixa.getAvenida());
                pstm.setInt(4, caixa.getPredio());
                pstm.setInt(5, caixa.getAndar());
                pstm.setInt(6, caixa.getApartamento());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Caixa selecionar(int id_caixa){
        try{
            String sql = "select *from caixa where id_caixa = ?";
            try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                pstm.setInt(1, id_caixa);                
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
			while (rst.next()) {
				Caixa caixa = new Caixa(rst.getInt(1),rst.getInt(2),rst.getInt(3),
                                rst.getInt(4),rst.getInt(5),rst.getInt(6));
				return caixa;
			}
		}
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    public void deletarTodos() {
        try (PreparedStatement stm = connection.prepareStatement("delete from caixa")) {
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
