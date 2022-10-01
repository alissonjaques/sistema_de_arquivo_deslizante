package br.com.sicoob_credinova.arquivo_prejuizo_uad.dao;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.controller.CaixaController;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.controller.NomeDosCamposController;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.controller.ValoresDosCamposController;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.enums.Status;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.Caixa;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.Documento;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.NomeDosCampos;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.ValoresDosCampos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alisson Jaques
 */
public class DocumentoDAO {

    private final Connection connection;
    private final NomeDosCamposController controleNomeDosCampos;
    private final ValoresDosCamposController controleValoresDosCampos;
    private final CaixaController controleCaixa;

    public DocumentoDAO(Connection connection) {
        this.connection = connection;
        controleNomeDosCampos = new NomeDosCamposController();
        controleValoresDosCampos = new ValoresDosCamposController();
        controleCaixa = new CaixaController();
    }

    public void inserir(Documento documento) {
        try {
            String sql = "insert into documento (ordem,id_nome_dos_campos,id_valores_dos_campos,id_caixa, "
                    + "data_ultima_alteracao,usuario_ultima_alteracao,status) values(?,?,?,?,?,?,?)";

            try (PreparedStatement pstm = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setInt(1, documento.getOrdem());
                pstm.setInt(2, documento.getNomeDosCampos().getId_nome_dos_campos());
                pstm.setInt(3, documento.getValoresDosCampos().getId_valores_dos_campos());
                pstm.setInt(4, documento.getCaixa().getId_caixa());
                pstm.setDate(5, documento.getDateTime());
                pstm.setString(6, documento.getNomeUsuario());
                pstm.setString(7, documento.getStatus().toString());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Documento> selecionarPorCaixa(int id_caixa) {
        List<Documento> lista = new ArrayList();
        try {
            String sql = "select *from documento where id_caixa = ?";
            try (PreparedStatement pstm = getConnection().prepareStatement(sql)) {
                pstm.setInt(1, id_caixa);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    while (rst.next()) {
                        Documento documento = new Documento();
                        documento.setIdDocumento(rst.getInt(1));
                        documento.setOrdem(rst.getInt(2));

                        NomeDosCampos nomeDosCampos = new NomeDosCampos();
                        nomeDosCampos.setId_nome_dos_campos(rst.getInt(3));
                        documento.setNomeDosCampos(nomeDosCampos);

                        ValoresDosCampos valoresDosCampos = new ValoresDosCampos();
                        valoresDosCampos.setId_valores_dos_campos(rst.getInt(4));
                        documento.setValoresDosCampos(valoresDosCampos);

                        Caixa caixa = new Caixa();
                        caixa.setId_caixa(rst.getInt(5));
                        documento.setCaixa(caixa);

                        documento.setDateTime(rst.getDate(6));
                        documento.setNomeUsuario(rst.getString(7));

                        if (rst.getString(8).equals("DISPONIVEL") || rst.getString(8).equals("Disponível")) {
                            documento.setStatus(Status.DISPONIVEL);
                        } else {
                            documento.setStatus(Status.EMPRESTADO);
                        }
                        lista.add(documento);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public Documento selecionar(int id_documento) {
        Documento documento = null;
        try {
            String sql = "select *from documento where id_documento = ?";
            try (PreparedStatement pstm = getConnection().prepareStatement(sql)) {
                pstm.setInt(1, id_documento);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    while (rst.next()) {
                        documento = new Documento();
                        documento.setIdDocumento(rst.getInt(1));
                        documento.setOrdem(rst.getInt(2));

                        NomeDosCampos nomeDosCampos = getControleNomeDosCampos().selecionarId(rst.getInt(3));
                        documento.setNomeDosCampos(nomeDosCampos);

                        ValoresDosCampos valoresDosCampos = getControleValoresDosCampos().selecionar(rst.getInt(4));
                        documento.setValoresDosCampos(valoresDosCampos);

                        Caixa caixa = getControleCaixa().selecionar(rst.getInt(5));
                        documento.setCaixa(caixa);

                        documento.setDateTime(rst.getDate(6));
                        documento.setNomeUsuario(rst.getString(7));

                        if (rst.getString(8).equals("DISPONIVEL") || rst.getString(8).equals("Disponível")) {
                            documento.setStatus(Status.DISPONIVEL);
                        } else {
                            documento.setStatus(Status.EMPRESTADO);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return documento;
    }

    public void excluir(int id_documento) {
        try (PreparedStatement stm = getConnection().prepareStatement("delete from documento"
                + " where id_documento = ?")) {
            stm.setInt(1, id_documento);
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editar(Documento documento) {
        try {
            String sql = "update documento set ordem = ?, id_nome_dos_campos = ?, "
                    + "id_valores_dos_campos = ?, id_caixa = ?, \n"
                    + "data_ultima_alteracao = ?, usuario_ultima_alteracao = ?, status = ?\n"
                    + "where id_documento = ?";

            try (PreparedStatement pstm = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setInt(1, documento.getOrdem());
                pstm.setInt(2, documento.getNomeDosCampos().getId_nome_dos_campos());
                pstm.setInt(3, documento.getValoresDosCampos().getId_valores_dos_campos());
                pstm.setInt(4, documento.getCaixa().getId_caixa());
                pstm.setDate(5, documento.getDateTime());
                pstm.setString(6, documento.getNomeUsuario());
                pstm.setString(7, documento.getStatus().toString());
                pstm.setInt(8, documento.getIdDocumento());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getOrdem(int id_caixa) {
        Documento documento = null;
        try {
            String sql = "select count(*) from documento "
                    + "where documento.id_caixa = ?";
            try (PreparedStatement pstm = getConnection().prepareStatement(sql)) {
                pstm.setInt(1, id_caixa);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    if (rst.next()) {
                        return rst.getInt(1) + 1;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 1;
    }

    public void atualizaOrdens(int id_documento, int id_caixa) {
        try (PreparedStatement stm = getConnection().prepareStatement("update documento set ordem = ordem - 1 "
                + "where id_documento > ? and id_caixa = ?")) {
            stm.setInt(1, id_documento);
            stm.setInt(2, id_caixa);
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @return the controleNomeDosCampos
     */
    public NomeDosCamposController getControleNomeDosCampos() {
        return controleNomeDosCampos;
    }

    /**
     * @return the controleValoresDosCampos
     */
    public ValoresDosCamposController getControleValoresDosCampos() {
        return controleValoresDosCampos;
    }

    /**
     * @return the controleCaixa
     */
    public CaixaController getControleCaixa() {
        return controleCaixa;
    }

    public List<String> buscarDocumento(String tipoDocumental, int valor, String termo) {
        List<String> lista = new ArrayList();
        try {
            String sql = "call consulta_documentos_pr(?,?,?)";
            try (PreparedStatement pstm = getConnection().prepareStatement(sql)) {
                pstm.setString(1, tipoDocumental);
                pstm.setInt(2, valor);
                pstm.setString(3, termo);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    while (rst.next()) {
                        StringBuilder documento = new StringBuilder();
                        // ordem, data_ultima_alteracao, usuario_ultima_alteracao e status
                        documento.append(String.valueOf(rst.getInt(1))).append(":");
                        documento.append(String.valueOf(rst.getDate(2))).append(":");
                        documento.append(rst.getString(3)).append(":");
                        documento.append(rst.getString(4)).append(":");

                        // id, rua, avenida, predio, andar e apartamento
                        documento.append(String.valueOf(rst.getInt(5))).append(":");
                        documento.append(String.valueOf(rst.getInt(6))).append(":");
                        documento.append(String.valueOf(rst.getInt(7))).append(":");
                        documento.append(String.valueOf(rst.getInt(8))).append(":");
                        documento.append(String.valueOf(rst.getInt(9))).append(":");
                        documento.append(String.valueOf(rst.getInt(10))).append(":");
                        
                        // nome, nome1, nome2, nome3, nome4, nome5, nome6 e nome7
                        documento.append(rst.getString(11)).append(":");
                        documento.append(rst.getString(12)).append(":");
                        documento.append(rst.getString(13)).append(":");
                        documento.append(rst.getString(14)).append(":");
                        documento.append(rst.getString(15)).append(":");
                        documento.append(rst.getString(16)).append(":");
                        documento.append(rst.getString(17)).append(":");
                        documento.append(rst.getString(18)).append(":");
                        
                        // valor1, valor2, valor3, valor4, valor5, valor6 e valor7
                        if(rst.getString(19).equals("")){
                            documento.append(" ").append(":");
                        } else{
                            documento.append(rst.getString(19)).append(":");
                        }
                        
                        if(rst.getString(20).equals("")){
                            documento.append(" ").append(":");
                        } else{
                            documento.append(rst.getString(20)).append(":");
                        }
                        
                        if(rst.getString(21).equals("")){
                            documento.append(" ").append(":");
                        } else{
                            documento.append(rst.getString(21)).append(":");
                        }
                        
                        if(rst.getString(22).equals("")){
                            documento.append(" ").append(":");
                        } else{
                            documento.append(rst.getString(22)).append(":");
                        }
                        
                        if(rst.getString(23).equals("")){
                            documento.append(" ").append(":");
                        } else{
                            documento.append(rst.getString(23)).append(":");
                        }
                        
                        if(rst.getString(24).equals("")){
                            documento.append(" ").append(":");
                        } else{
                            documento.append(rst.getString(24)).append(":");
                        }
                        
                        if(rst.getString(25).equals("")){
                            documento.append(" ").append(":");
                        } else{
                            documento.append(rst.getString(25)).append(":");
                        }

                        lista.add(documento.toString());
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}
