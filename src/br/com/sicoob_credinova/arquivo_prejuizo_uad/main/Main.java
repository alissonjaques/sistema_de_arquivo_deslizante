package br.com.sicoob_credinova.arquivo_prejuizo_uad.main;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.view.principal.TelaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Alisson Jaques
 */
public class Main {

    public static void main(String[] args) {
        try {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
