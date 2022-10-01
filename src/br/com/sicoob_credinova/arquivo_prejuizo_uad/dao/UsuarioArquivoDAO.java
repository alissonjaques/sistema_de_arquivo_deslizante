package br.com.sicoob_credinova.arquivo_prejuizo_uad.dao;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.enums.Perfil;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.UsuarioArquivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alisson Jaques
 */
public class UsuarioArquivoDAO {

    private final Connection connection;

    public UsuarioArquivoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(UsuarioArquivo usuario) {
        try {
            String sql = "insert into usuario (nome,nome_de_usuario,cpf,senha,perfil) values(?,?,?,?,?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, usuario.getNome());
                pstm.setString(2, usuario.getNomeDeUsuario());
                pstm.setString(3, usuario.getCpf());
                pstm.setString(4, usuario.getSenha());
                pstm.setString(5, usuario.getPerfil().toString());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void editar(UsuarioArquivo usuario){
        try {
            String sql = "update usuario set nome = ?, nome_de_usuario = ?, "
                    + "cpf = ?, senha = ?, perfil = ? where cpf = ?";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, usuario.getNome());
                pstm.setString(2, usuario.getNomeDeUsuario());
                pstm.setString(3, usuario.getCpf());
                pstm.setString(4, usuario.getSenha());
                pstm.setString(5, usuario.getPerfil().toString());
                pstm.setString(6, usuario.getCpf());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        
    /**
     * Recebe como argumento um CPF e verifica se existi usuário no banco com esse CPF. Se 
     * existir retorna true, senão retorna false.
     * 
     * @param cpf o cpf a ser consultado no banco de dados
     * @return true se existir usuário já cadastrado no banco, false caso contrário
     */
    public boolean verificaUsuarioBancoCpf(String cpf){
        try {
            String sql = "select *from usuario where cpf = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, cpf);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    UsuarioArquivo usuario = null;
                    while (rst.next()) {
                        switch (rst.getString(6)) {
                            case "Administrador":
                            case "ADMINISTRADOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.ADMINISTRADOR);
                                break;
                            case "Supervisor":
                            case "SUPERVISOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.SUPERVISOR);
                                break;                    
                            default:
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.USUARIO);
                                break;
                        }
                    }
                    return usuario != null;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     /**
     * Recebe como argumento um nome de usuário e verifica se existi usuário no banco com esse dado. Se 
     * existir retorna true, senão retorna false.
     * 
     * @param nomeUsuario o nome de usuário a ser consultado no banco de dados 
     * @return true se existir usuário já cadastrado no banco, false caso contrário
     */
    public boolean verificaUsuarioBancoNomeUsuario(String nomeUsuario){
        try {
            String sql = "select *from usuario where nome_de_usuario = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, nomeUsuario);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    UsuarioArquivo usuario = null;
                    while (rst.next()) {
                        switch (rst.getString(6)) {
                            case "Administrador":
                            case "ADMINISTRADOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.ADMINISTRADOR);
                                break;
                            case "Supervisor":
                            case "SUPERVISOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.SUPERVISOR);
                                break;                    
                            default:
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.USUARIO);
                                break;
                        }                 
                    }
                    return usuario != null;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public UsuarioArquivo selecionar(String cpf) {
        try {
            String sql = "select *from usuario where cpf = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, cpf);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    UsuarioArquivo usuario;
                    while (rst.next()) {
                        switch (rst.getString(6)) {
                            case "Administrador":
                            case "ADMINISTRADOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.ADMINISTRADOR);
                                break;
                            case "Supervisor":
                            case "SUPERVISOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.SUPERVISOR);
                                break;                    
                            default:
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.USUARIO);
                                break;
                        }
                        return usuario;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    public UsuarioArquivo consultarPorNome(String nome) {
        try {
            String sql = "select *from usuario where nome_de_usuario = ?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, nome);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    UsuarioArquivo usuario;
                    while (rst.next()) {
                        switch (rst.getString(6)) {
                            case "Administrador":
                            case "ADMINISTRADOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.ADMINISTRADOR);
                                break;
                            case "Supervisor":
                            case "SUPERVISOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.SUPERVISOR);
                                break;                    
                            default:
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.USUARIO);
                                break;
                        }
                        return usuario;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    public ArrayList<UsuarioArquivo> selecionarTodos() {
        ArrayList<UsuarioArquivo> lista = new ArrayList();
        try {
            String sql = "select *from usuario order by nome";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    UsuarioArquivo usuario;
                    while (rst.next()) {
                        switch (rst.getString(6)) {
                            case "Administrador":
                            case "ADMINISTRADOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.ADMINISTRADOR);
                                break;
                            case "Supervisor":
                            case "SUPERVISOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.SUPERVISOR);
                                break;                    
                            default:
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.USUARIO);
                                break;
                        }
                        lista.add(usuario);                        
                    }
                    return lista;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<UsuarioArquivo> selecionarPorNome(String nome) {
        ArrayList<UsuarioArquivo> lista = new ArrayList(); 
        try {
            String sql = "select *from usuario where nome = ? order by nome";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, nome);
                pstm.execute();
                try (ResultSet rst = pstm.getResultSet()) {
                    UsuarioArquivo usuario;
                    while (rst.next()) {
                        switch (rst.getString(6)) {
                            case "Administrador":
                            case "ADMINISTRADOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.ADMINISTRADOR);
                                break;
                            case "Supervisor":
                            case "SUPERVISOR":
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.SUPERVISOR);
                                break;                    
                            default:
                                usuario = new UsuarioArquivo(rst.getInt(1),
                                        rst.getString(2), rst.getString(3),
                                        rst.getString(4), rst.getString(5), Perfil.USUARIO);
                                break;
                        }
                        lista.add(usuario);
                    }
                    return lista;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletarTodos() {
        try (PreparedStatement stm = connection.prepareStatement("delete from usuario")) {
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletar(String cpf) {
        try (PreparedStatement stm = connection.prepareStatement("delete from usuario"
                + " where cpf = ?")) {
            stm.setString(1, cpf);
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
