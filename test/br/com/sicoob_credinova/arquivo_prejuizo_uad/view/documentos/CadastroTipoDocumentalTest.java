package br.com.sicoob_credinova.arquivo_prejuizo_uad.view.documentos;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.view.tipo_documental.CadastroTipoDocumental;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alisson Jaques
 */
public class CadastroTipoDocumentalTest {    
    private CadastroTipoDocumental ctd;
    
    @Before
    public void beforeAll(){
        setCtd(new CadastroTipoDocumental());   
    }

    @Test
    public void deveriaValidarSeOsCamposDoFormularioEstaoVaziosOuNao() {
        getCtd().getJtfNome().setText("");
        getCtd().getJtfNome1().setText("");
        getCtd().getJtfNome2().setText("");
        getCtd().getJtfNome3().setText("");
        getCtd().getJtfNome4().setText("");
        getCtd().getJtfNome5().setText("");
        getCtd().getJtfNome6().setText("");
        getCtd().getJtfNome7().setText("");
        boolean retorno;
        retorno = getCtd().verificaCamposVazios() && getCtd().verificaNomeTipoDocumental();
        assertEquals("Deveria retornar true", true, retorno);

        getCtd().getJtfNome().setText("a");
        getCtd().getJtfNome1().setText("");
        getCtd().getJtfNome2().setText("");
        getCtd().getJtfNome3().setText("");
        getCtd().getJtfNome4().setText("");
        getCtd().getJtfNome5().setText("");
        getCtd().getJtfNome6().setText("");
        getCtd().getJtfNome7().setText("");
        retorno = getCtd().verificaCamposVazios() && getCtd().verificaNomeTipoDocumental() 
                || getCtd().verificaCamposVazios() && !ctd.verificaNomeTipoDocumental();
        assertEquals("Deveria retornar true", true, retorno);
        
        getCtd().getJtfNome().setText("a");
        getCtd().getJtfNome1().setText("");
        getCtd().getJtfNome2().setText("");
        getCtd().getJtfNome3().setText("");
        getCtd().getJtfNome4().setText("a");
        getCtd().getJtfNome5().setText("");
        getCtd().getJtfNome6().setText("");
        getCtd().getJtfNome7().setText("");
        retorno = getCtd().verificaCamposVazios() && getCtd().verificaNomeTipoDocumental();
        assertEquals("Deveria retornar false", false, retorno);
    }

    /**
     * @return the ctd
     */
    public CadastroTipoDocumental getCtd() {
        return ctd;
    }

    /**
     * @param ctd the ctd to set
     */
    public void setCtd(CadastroTipoDocumental ctd) {
        this.ctd = ctd;
    }
}
