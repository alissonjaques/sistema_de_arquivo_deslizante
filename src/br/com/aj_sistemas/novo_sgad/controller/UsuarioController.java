package br.com.aj_sistemas.novo_sgad.controller;

import br.com.aj_sistemas.novo_sgad.dao.UsuarioArquivoDAO;
import br.com.aj_sistemas.novo_sgad.factory.ConnectionFactory;
import br.com.aj_sistemas.novo_sgad.model.UsuarioArquivo;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Alisson Jaques
 */
public class UsuarioController {

    private final UsuarioArquivoDAO usuarioArquivoDAO;

    public UsuarioController() {
        Connection connection = new ConnectionFactory().con;
        this.usuarioArquivoDAO = new UsuarioArquivoDAO(connection);
    }
    
    public void inserir(UsuarioArquivo usuario){
        this.usuarioArquivoDAO.inserir(usuario);
    }
    
    public void editar(UsuarioArquivo usuario){
        this.usuarioArquivoDAO.editar(usuario);
    }
    
    public UsuarioArquivo selecionar(String cpf){
        return this.usuarioArquivoDAO.selecionar(cpf);
    }
    
    public ArrayList<UsuarioArquivo> selecionarTodos(){
        return this.usuarioArquivoDAO.selecionarTodos();
    }
    
    public UsuarioArquivo consultarPorNome(String nome){
        return this.usuarioArquivoDAO.consultarPorNome(nome);
    }
    
    public ArrayList<UsuarioArquivo> selecionarPorNome(String nome){
        return this.usuarioArquivoDAO.selecionarPorNome(nome);
    }
    
    public boolean verificaUsuarioBancoCpf(String cpf){
        return this.usuarioArquivoDAO.verificaUsuarioBancoCpf(cpf);
    }
    
    public boolean verificaUsuarioBancoNomeUsuario(String nomeUsuario){
        return this.usuarioArquivoDAO.verificaUsuarioBancoNomeUsuario(nomeUsuario);
    }
    
    public void deletarTodos(){
        this.usuarioArquivoDAO.deletarTodos();
    }
    
    public void deletar(String cpf){
        this.usuarioArquivoDAO.deletar(cpf);
    }
}
