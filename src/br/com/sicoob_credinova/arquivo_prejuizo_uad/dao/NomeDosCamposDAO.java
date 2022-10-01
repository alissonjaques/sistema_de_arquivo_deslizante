package br.com.sicoob_credinova.arquivo_prejuizo_uad.dao;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.Documento;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.NomeDosCampos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author Alisson Jaques
 */
public class NomeDosCamposDAO {

    private final Connection connection;

    public NomeDosCamposDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(NomeDosCampos nomeDosCampos) {
        try {
            String sql = "insert into nome_dos_campos (numero_identificacao,nome,nome1,nome2,nome3,"
                    + "nome4,nome5,nome6,nome7) values(?,?,?,?,?,?,?,?,?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setInt(1, nomeDosCampos.getNumero_identificacao());
                pstm.setString(2, nomeDosCampos.getNome());
                pstm.setString(3, nomeDosCampos.getNome1());
                pstm.setString(4, nomeDosCampos.getNome2());
                pstm.setString(5, nomeDosCampos.getNome3());
                pstm.setString(6, nomeDosCampos.getNome4());
                pstm.setString(7, nomeDosCampos.getNome5());
                pstm.setString(8, nomeDosCampos.getNome6());
                pstm.setString(9, nomeDosCampos.getNome7());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editar(NomeDosCampos nomeDosCampos) {
        try {
            String sql = "update nome_dos_campos set nome = ?, nome1 = ?, "
                    + "nome2 = ?, nome3 = ?, nome4 = ?, nome5 = ?, nome6 = ?, "
                    + "nome7 = ? where numero_identificacao = ?";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, nomeDosCampos.getNome());
                pstm.setString(2, nomeDosCampos.getNome1());
                pstm.setString(3, nomeDosCampos.getNome2());
                pstm.setString(4, nomeDosCampos.getNome3());
                pstm.setString(5, nomeDosCampos.getNome4());
                pstm.setString(6, nomeDosCampos.getNome5());
                pstm.setString(7, nomeDosCampos.getNome6());
                pstm.setString(8, nomeDosCampos.getNome7());
                pstm.setInt(9, nomeDosCampos.getNumero_identificacao());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public NomeDosCampos selecionar(int numeroIdentificacao) {
        try {
            String sql = "select *from nome_dos_campos where numero_identificacao = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setInt(1, numeroIdentificacao);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    NomeDosCampos nomeDosCampos;
                    while (rst.next()) {
                        nomeDosCampos = new NomeDosCampos(rst.getInt(1),
                                rst.getInt(2), rst.getString(3),
                                rst.getString(4), rst.getString(5),
                                rst.getString(6), rst.getString(7),
                                rst.getString(8), rst.getString(9),
                                rst.getString(10));
                        return nomeDosCampos;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    public NomeDosCampos selecionarId(int id) {
        try {
            String sql = "select *from nome_dos_campos where id_nome_dos_campos = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setInt(1, id);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    NomeDosCampos nomeDosCampos;
                    while (rst.next()) {
                        nomeDosCampos = new NomeDosCampos(rst.getInt(1),
                                rst.getInt(2), rst.getString(3),
                                rst.getString(4), rst.getString(5),
                                rst.getString(6), rst.getString(7),
                                rst.getString(8), rst.getString(9),
                                rst.getString(10));
                        return nomeDosCampos;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String selecionarPorId(int id_nome_dos_campos) {
        try {
            String sql = "select *from nome_dos_campos where id_nome_dos_campos = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setInt(1, id_nome_dos_campos);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    if (rst.next()) {
                       return rst.getString(3);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

    public List<NomeDosCampos> selecionar(String nome) {
        List<NomeDosCampos> lista = new ArrayList();
        try {
            String sql = "select *from nome_dos_campos where nome like ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, "%" + nome + "%");
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    while (rst.next()) {
                        NomeDosCampos nomeDosCampos = new NomeDosCampos(rst.getInt(1),
                                rst.getInt(2), rst.getString(3),
                                rst.getString(4), rst.getString(5),
                                rst.getString(6), rst.getString(7),
                                rst.getString(8), rst.getString(9),
                                rst.getString(10));
                        lista.add(nomeDosCampos);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public void deletar(int numero_identificacao) {
        try (PreparedStatement stm = connection.prepareStatement("delete from nome_dos_campos"
                + " where numero_identificacao = ?")) {
            stm.setInt(1, numero_identificacao);
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean verificaNomeTipoDocumental(String nome) {
        try (PreparedStatement pstm = connection.prepareStatement("select * from nome_dos_campos"
                + " where nome = ?")) {
            pstm.setString(1, nome);
            pstm.execute();
            try (ResultSet rst = pstm.getResultSet()) {
                NomeDosCampos nomeDosCampos = null;
                while (rst.next()) {
                    nomeDosCampos = new NomeDosCampos(rst.getInt(1),
                            rst.getInt(2), rst.getString(3),
                            rst.getString(4), rst.getString(5),
                            rst.getString(6), rst.getString(7),
                            rst.getString(8), rst.getString(9),
                            rst.getString(10));
                }
                if (nomeDosCampos != null) {
                    return true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean verificaNumero(String numero) {
        try (PreparedStatement pstm = connection.prepareStatement("select * from nome_dos_campos"
                + " where numero_identificacao = ?")) {
            pstm.setString(1, numero);
            pstm.execute();
            try (ResultSet rst = pstm.getResultSet()) {
                NomeDosCampos nomeDosCampos = null;
                while (rst.next()) {
                    nomeDosCampos = new NomeDosCampos(rst.getInt(1),
                            rst.getInt(2), rst.getString(3),
                            rst.getString(4), rst.getString(5),
                            rst.getString(6), rst.getString(7),
                            rst.getString(8), rst.getString(9),
                            rst.getString(10));
                }
                if (nomeDosCampos != null) {
                    return true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean isRegistros(String nomeTipoDocumental) {
        int quantidadeRegistros = 0;
        try {
            String sql = "call is_registros_pr(?)";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, nomeTipoDocumental);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    if (rst.next()) {
                        quantidadeRegistros = rst.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return quantidadeRegistros!=0;
    }
}
