package br.com.sicoob_credinova.arquivo_prejuizo_uad.controller;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.UsuarioArquivo;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alisson Jaques
 */
public class UsuarioControllerTest {

    private UsuarioController controle;

    @Before
    public void before() {
        setControle(new UsuarioController());
    }

    @Test
    public void deveriaRetornarONomeDoUsuarioAoPassarOCPF() {
        UsuarioArquivo usuario = getControle().selecionar("999.999.999-99");
        assertEquals("Deveria retorna o nome do usuário", "admin", usuario.getNomeDeUsuario());
    }

    @Test
    public void deveriaRetornarONomeDoUsuarioAoPassarONome() {
        UsuarioArquivo usuario = getControle().consultarPorNome("admin");
        assertEquals("Deveria retorna o nome do usuário", "admin", usuario.getNomeDeUsuario());
    }

    /**
     * @return the controle
     */
    public UsuarioController getControle() {
        return controle;
    }

    /**
     * @param controle the controle to set
     */
    public void setControle(UsuarioController controle) {
        this.controle = controle;
    }
}
