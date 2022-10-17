package br.com.sicoob_credinova.arquivo_prejuizo_uad.dao;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.ValoresDosCampos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alisson Jaques
 */
public class ValoresDosCamposDAO {

    private final Connection connection;

    public ValoresDosCamposDAO(Connection connection) {
        this.connection = connection;
    }

    public int inserir(ValoresDosCampos valoresDosCampos) {
        try {
            String sql = "insert into valores_dos_campos (valor1,valor2,valor3,valor4,"
                    + "valor5,valor6,valor7) values(?,?,?,?,?,?,?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, valoresDosCampos.getValor1());
                pstm.setString(2, valoresDosCampos.getValor2());
                pstm.setString(3, valoresDosCampos.getValor3());
                pstm.setString(4, valoresDosCampos.getValor4());
                pstm.setString(5, valoresDosCampos.getValor5());
                pstm.setString(6, valoresDosCampos.getValor6());
                pstm.setString(7, valoresDosCampos.getValor7());
                pstm.execute();
                try (ResultSet rst = pstm.getGeneratedKeys()) {
                    while (rst.next()) {
                        return rst.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public void editar(ValoresDosCampos valoresDosCampos) {
        try {
            String sql = "update valores_dos_campos set valor1 = ?, valor2 = ?, "
                    + "valor3 = ?, valor4 = ?, valor5 = ?, valor6 = ?, valor7 = ?"
                    + " where id_valores_dos_campos = ?";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, valoresDosCampos.getValor1());
                pstm.setString(2, valoresDosCampos.getValor2());
                pstm.setString(3, valoresDosCampos.getValor3());
                pstm.setString(4, valoresDosCampos.getValor4());
                pstm.setString(5, valoresDosCampos.getValor5());
                pstm.setString(6, valoresDosCampos.getValor6());
                pstm.setString(7, valoresDosCampos.getValor7());
                pstm.setInt(8, valoresDosCampos.getId_valores_dos_campos());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ValoresDosCampos selecionar(int id_valores_dos_campos) {
        try {
            String sql = "select *from valores_dos_campos where id_valores_dos_campos = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setInt(1, id_valores_dos_campos);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    ValoresDosCampos valoresDosCampos;
                    while (rst.next()) {
                        valoresDosCampos = new ValoresDosCampos(rst.getInt(1),
                                rst.getString(2), rst.getString(3),
                                rst.getString(4), rst.getString(5),
                                rst.getString(6), rst.getString(7),
                                rst.getString(8));
                        return valoresDosCampos;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void deletar(int id_valores_dos_campos) {
        try (PreparedStatement stm = connection.prepareStatement("delete from valores_dos_campos"
                + " where id_valores_dos_campos = ?")) {
            stm.setInt(1, id_valores_dos_campos);
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
