package br.com.aj_sistemas.novo_sgad.view.consultas;

import br.com.aj_sistemas.novo_sgad.utils.BibliotecaDeMetodos;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Alisson Jaques
 */
public class DetalhesDocumento extends javax.swing.JFrame {

    private String documento;
    /**
     * Creates new form DetalhesDocumento
     * @param documento o documento a ser apresentado na tela
     */
    public DetalhesDocumento(String documento) {
        this.setIconImage(Toolkit.getDefaultToolkit()
                .getImage("src\\br\\com\\aj_sistemas\\novo_sgad\\img\\arquivo.png"));
        initComponents();
        this.documento = documento;
        preencheDados();
    }
    
    private void preencheDados(){
        String[] dadosDocumento = getDocumento().split(":");
        
        StringBuilder informacoesDocumento = new StringBuilder();
        // dados da caixa
        informacoesDocumento.append("<html></head><body><h1 style=\"text-align:center\">Informa��es do Documento</h1>");
        informacoesDocumento.append("<strong>N�mero da caixa: </strong>").append(dadosDocumento[4]);
        informacoesDocumento.append("<br>").append("<strong>Ordem do documento na caixa: </strong>").append(dadosDocumento[0]);
        informacoesDocumento.append("<br>").append("<strong>Endere�o da caixa: </strong> Rua ").append(dadosDocumento[5]);
        informacoesDocumento.append(" Avenida ").append(dadosDocumento[6]);
        informacoesDocumento.append(" Pr�dio ").append(dadosDocumento[7]);
        informacoesDocumento.append(" Andar ").append(dadosDocumento[8]);
        informacoesDocumento.append(" Apartamento ").append(dadosDocumento[9]);
        informacoesDocumento.append("<br>------------------------------------------------------------------------------------------------");
        
        // dados do documento
        informacoesDocumento.append("<br>").append("<strong>Tipo documental: </strong>").append(dadosDocumento[10]);
        
        informacoesDocumento.append("<br>").append("<strong>").append(dadosDocumento[11]).append(": </strong>").append(dadosDocumento[18]);
        informacoesDocumento.append("<br>").append("<strong>").append(dadosDocumento[12]).append(": </strong>").append(dadosDocumento[19]);
        informacoesDocumento.append("<br>").append("<strong>").append(dadosDocumento[13]).append(": </strong>").append(dadosDocumento[20]);
        informacoesDocumento.append("<br>").append("<strong>").append(dadosDocumento[14]).append(": </strong>").append(dadosDocumento[21]);
        informacoesDocumento.append("<br>").append("<strong>").append(dadosDocumento[15]).append(": </strong>").append(dadosDocumento[22]);
        informacoesDocumento.append("<br>").append("<strong>").append(dadosDocumento[16]).append(": </strong>").append(dadosDocumento[23]);
        informacoesDocumento.append("<br>").append("<strong>").append(dadosDocumento[17]).append(": </strong>").append(dadosDocumento[24]);
        informacoesDocumento.append("<br>").append("<strong>Situa��o do documento: </strong>").append(dadosDocumento[3]);
        informacoesDocumento.append("<br>------------------------------------------------------------------------------------------------");
        
        // informa��es de cadastro        
        informacoesDocumento.append("<br>").append("<strong>Data �ltima altera��o: </strong>").append(BibliotecaDeMetodos.getData(dadosDocumento[1]));
        informacoesDocumento.append("<br>").append("<strong>Respons�vel pela �ltima altera��o: </strong>").append(dadosDocumento[2]);
        informacoesDocumento.append("</html>");        
        getJlInfoDocumento().setText(informacoesDocumento.toString());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jlInfoDocumento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informa��es do Documento");
        setBackground(new java.awt.Color(72, 61, 139));

        jlInfoDocumento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlInfoDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jlInfoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jlInfoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlInfoDocumento;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

     /**
     * @return the jpPrincipal
     */
    public javax.swing.JPanel getJpPrincipal() {
        return jpPrincipal;
    }

    /**
     * @param jpPrincipal the jpPrincipal to set
     */
    public void setJpPrincipal(javax.swing.JPanel jpPrincipal) {
        this.jpPrincipal = jpPrincipal;
    }

    /**
     * @return the jlInfoDocumento
     */
    public javax.swing.JLabel getJlInfoDocumento() {
        return jlInfoDocumento;
    }

    /**
     * @param jlInfoDocumento the jlInfoDocumento to set
     */
    public void setJlInfoDocumento(javax.swing.JLabel jlInfoDocumento) {
        this.jlInfoDocumento = jlInfoDocumento;
    }

}