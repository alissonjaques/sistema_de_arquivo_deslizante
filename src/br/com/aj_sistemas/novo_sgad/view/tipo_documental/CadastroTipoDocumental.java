package br.com.aj_sistemas.novo_sgad.view.tipo_documental;

import br.com.aj_sistemas.novo_sgad.controller.NomeDosCamposController;
import br.com.aj_sistemas.novo_sgad.model.NomeDosCampos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alisson Jaques
 */
public class CadastroTipoDocumental extends javax.swing.JInternalFrame {

    private NomeDosCamposController controle;

    /**
     * Creates new form CadastroTipoDocumental
     */
    public CadastroTipoDocumental() {
        this.setFrameIcon(new ImageIcon("src\\br\\com\\aj_sistemas\\novo_sgad\\img\\arquivo.png"));
        initComponents();
        controle = new NomeDosCamposController();
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
        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlNome1 = new javax.swing.JLabel();
        jtfNome1 = new javax.swing.JTextField();
        jtfNome2 = new javax.swing.JTextField();
        jlNome2 = new javax.swing.JLabel();
        jtfNome3 = new javax.swing.JTextField();
        jlNome3 = new javax.swing.JLabel();
        jtfNome4 = new javax.swing.JTextField();
        jlNome4 = new javax.swing.JLabel();
        jtfNome5 = new javax.swing.JTextField();
        jlNome5 = new javax.swing.JLabel();
        jtfNome6 = new javax.swing.JTextField();
        jlNome6 = new javax.swing.JLabel();
        jlNome7 = new javax.swing.JLabel();
        jtfNome7 = new javax.swing.JTextField();
        jbInserir = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jftNumero = new javax.swing.JTextField();

        setBackground(new java.awt.Color(72, 61, 139));
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Tipo Documental");

        jlNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome.setText("Nome do Tipo Documental:");

        jtfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlNome1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome1.setText("Nome do campo 1:");

        jtfNome1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jtfNome2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlNome2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome2.setText("Nome do campo 2:");

        jtfNome3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlNome3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome3.setText("Nome do campo 3:");

        jtfNome4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlNome4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome4.setText("Nome do campo 4:");

        jtfNome5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlNome5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome5.setText("Nome do campo 5:");

        jtfNome6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlNome6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome6.setText("Nome do campo 6:");

        jlNome7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNome7.setText("Nome do campo 7:");

        jtfNome7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbInserir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aj_sistemas/novo_sgad/img/add_16.png"))); // NOI18N
        jbInserir.setText("Cadastrar");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });
        jbInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbInserirKeyPressed(evt);
            }
        });

        jlCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlCodigo.setText("Informe um n�mero para identificar o documento:");

        jftNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNome2)))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome4)
                                    .addComponent(jlNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNome3)
                                    .addComponent(jtfNome4)))
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlNome7, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(jlNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlNome5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNome6)
                                    .addComponent(jtfNome5)
                                    .addComponent(jtfNome7)))
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addComponent(jlCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftNumero)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGap(0, 295, Short.MAX_VALUE)
                .addComponent(jbInserir)
                .addGap(268, 268, 268))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome1)
                    .addComponent(jtfNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome2)
                    .addComponent(jtfNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome3)
                    .addComponent(jtfNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome4)
                    .addComponent(jtfNome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome5)
                    .addComponent(jtfNome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome6)
                    .addComponent(jtfNome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome7)
                    .addComponent(jtfNome7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jbInserir)
                .addContainerGap())
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
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean verificaNomeTipoDocumental() {
        return getJtfNome().getText().equals("");
    }

    /**
     *
     * @return
     */
    public boolean verificaCamposVazios() {
        return getJtfNome1().getText().equals("")
                && getJtfNome2().getText().equals("") && getJtfNome3().getText().equals("")
                && getJtfNome4().getText().equals("") && getJtfNome5().getText().equals("")
                && getJtfNome6().getText().equals("") && getJtfNome7().getText().equals("");
    }

    /**
     * Este m�todo verifica se o nome do tipo documental passado como argumento
     * j� existe no banco de dados.
     *
     * @param nomeTipoDocumental o nome do tipo documental
     * @return true se existir um documento com esse nome no banco de dados,
     * false caso contr�rio.
     */
    public boolean verificaNomeTipoDocumental(String nomeTipoDocumental) {
        return true;
    }

    private void acaoInserir() {
        if (verificaNomeTipoDocumental()) {
            JOptionPane.showMessageDialog(this, "O 'Nome do Tipo Documental' deve "
                    + "ser preenchido!", "Alerta", 2);
        } else if (verificaCamposVazios()) {
            JOptionPane.showMessageDialog(this, "Ao menos um 'Nome do Campo' deve ser preenchido, "
                    + "para ser poss�vel a pesquisa do tipo documental!", "Alerta", 2);
        } else if (getJftNumero().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe um n�mero de identifica��o para o documento!", "Alerta", 2);
        } else if (getControle().verificaNumero(getJftNumero().getText())) {
            JOptionPane.showMessageDialog(this, " J� existe documento com o n�mero de identifica��o informado!", "Alerta", 2);
        } else if (getControle().verificaNomeTipoDocumental(getJtfNome().getText())) {
            JOptionPane.showMessageDialog(this, " J� existe documento com o nome "
                    + " '" + getJtfNome().getText() + "' cadastrado no sistema!", "Alerta", 2);
        } else {
            NomeDosCampos tipoDocumental = new NomeDosCampos();
            try {
                tipoDocumental.setNumero_identificacao(Integer.parseInt(getJftNumero().getText()));
                tipoDocumental.setNome(getJtfNome().getText());

                for (int i = 0; i < 7; i++) {
                    switch (i) {
                        case 0:
                            if (!getJtfNome1().getText().equals("")) {
                                tipoDocumental.setNome1(getJtfNome1().getText());
                            }
                            break;
                        case 1:
                            if (!getJtfNome2().getText().equals("")) {
                                tipoDocumental.setNome2(getJtfNome2().getText());
                            }
                            break;
                        case 2:
                            if (!getJtfNome3().getText().equals("")) {
                                tipoDocumental.setNome3(getJtfNome3().getText());
                            }
                            break;
                        case 3:
                            if (!getJtfNome4().getText().equals("")) {
                                tipoDocumental.setNome4(getJtfNome4().getText());
                            }
                            break;
                        case 4:
                            if (!getJtfNome5().getText().equals("")) {
                                tipoDocumental.setNome5(getJtfNome5().getText());
                            }
                            break;
                        case 5:
                            if (!getJtfNome6().getText().equals("")) {
                                tipoDocumental.setNome6(getJtfNome6().getText());
                            }
                            break;
                        case 6:
                            if (!getJtfNome7().getText().equals("")) {
                                tipoDocumental.setNome7(getJtfNome7().getText());
                            }
                            break;
                    }
                }

                getControle().inserir(tipoDocumental);
                JOptionPane.showMessageDialog(this, "Tipo documental cadastrado com sucesso!", "Alerta", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar Tipo Documental. "
                        + "N�mero de indentica��o inv�lido.\nDescri��o do erro: " + e.getMessage(), "Alerta", 2);
            }
        }
    }

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        acaoInserir();
    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbInserirKeyPressed
        acaoInserir();
    }//GEN-LAST:event_jbInserirKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbInserir;
    private javax.swing.JTextField jftNumero;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNome1;
    private javax.swing.JLabel jlNome2;
    private javax.swing.JLabel jlNome3;
    private javax.swing.JLabel jlNome4;
    private javax.swing.JLabel jlNome5;
    private javax.swing.JLabel jlNome6;
    private javax.swing.JLabel jlNome7;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNome1;
    private javax.swing.JTextField jtfNome2;
    private javax.swing.JTextField jtfNome3;
    private javax.swing.JTextField jtfNome4;
    private javax.swing.JTextField jtfNome5;
    private javax.swing.JTextField jtfNome6;
    private javax.swing.JTextField jtfNome7;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the controle
     */
    public NomeDosCamposController getControle() {
        return controle;
    }

    /**
     * @param controle the controle to set
     */
    public void setControle(NomeDosCamposController controle) {
        this.controle = controle;
    }

    /**
     * @return the jbInserir
     */
    public javax.swing.JButton getJbInserir() {
        return jbInserir;
    }

    /**
     * @param jbInserir the jbInserir to set
     */
    public void setJbInserir(javax.swing.JButton jbInserir) {
        this.jbInserir = jbInserir;
    }

    /**
     * @return the jlNome
     */
    public javax.swing.JLabel getJlNome() {
        return jlNome;
    }

    /**
     * @param jlNome the jlNome to set
     */
    public void setJlNome(javax.swing.JLabel jlNome) {
        this.jlNome = jlNome;
    }

    /**
     * @return the jlNome1
     */
    public javax.swing.JLabel getJlNome1() {
        return jlNome1;
    }

    /**
     * @param jlNome1 the jlNome1 to set
     */
    public void setJlNome1(javax.swing.JLabel jlNome1) {
        this.jlNome1 = jlNome1;
    }

    /**
     * @return the jlNome2
     */
    public javax.swing.JLabel getJlNome2() {
        return jlNome2;
    }

    /**
     * @param jlNome2 the jlNome2 to set
     */
    public void setJlNome2(javax.swing.JLabel jlNome2) {
        this.jlNome2 = jlNome2;
    }

    /**
     * @return the jlNome3
     */
    public javax.swing.JLabel getJlNome3() {
        return jlNome3;
    }

    /**
     * @param jlNome3 the jlNome3 to set
     */
    public void setJlNome3(javax.swing.JLabel jlNome3) {
        this.jlNome3 = jlNome3;
    }

    /**
     * @return the jlNome4
     */
    public javax.swing.JLabel getJlNome4() {
        return jlNome4;
    }

    /**
     * @param jlNome4 the jlNome4 to set
     */
    public void setJlNome4(javax.swing.JLabel jlNome4) {
        this.jlNome4 = jlNome4;
    }

    /**
     * @return the jlNome5
     */
    public javax.swing.JLabel getJlNome5() {
        return jlNome5;
    }

    /**
     * @param jlNome5 the jlNome5 to set
     */
    public void setJlNome5(javax.swing.JLabel jlNome5) {
        this.jlNome5 = jlNome5;
    }

    /**
     * @return the jlNome6
     */
    public javax.swing.JLabel getJlNome6() {
        return jlNome6;
    }

    /**
     * @param jlNome6 the jlNome6 to set
     */
    public void setJlNome6(javax.swing.JLabel jlNome6) {
        this.jlNome6 = jlNome6;
    }

    /**
     * @return the jlNome7
     */
    public javax.swing.JLabel getJlNome7() {
        return jlNome7;
    }

    /**
     * @param jlNome7 the jlNome7 to set
     */
    public void setJlNome7(javax.swing.JLabel jlNome7) {
        this.jlNome7 = jlNome7;
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
     * @return the jtfNome
     */
    public javax.swing.JTextField getJtfNome() {
        return jtfNome;
    }

    /**
     * @param jtfNome the jtfNome to set
     */
    public void setJtfNome(javax.swing.JTextField jtfNome) {
        this.jtfNome = jtfNome;
    }

    /**
     * @return the jtfNome1
     */
    public javax.swing.JTextField getJtfNome1() {
        return jtfNome1;
    }

    /**
     * @param jtfNome1 the jtfNome1 to set
     */
    public void setJtfNome1(javax.swing.JTextField jtfNome1) {
        this.jtfNome1 = jtfNome1;
    }

    /**
     * @return the jtfNome2
     */
    public javax.swing.JTextField getJtfNome2() {
        return jtfNome2;
    }

    /**
     * @param jtfNome2 the jtfNome2 to set
     */
    public void setJtfNome2(javax.swing.JTextField jtfNome2) {
        this.jtfNome2 = jtfNome2;
    }

    /**
     * @return the jtfNome3
     */
    public javax.swing.JTextField getJtfNome3() {
        return jtfNome3;
    }

    /**
     * @param jtfNome3 the jtfNome3 to set
     */
    public void setJtfNome3(javax.swing.JTextField jtfNome3) {
        this.jtfNome3 = jtfNome3;
    }

    /**
     * @return the jtfNome4
     */
    public javax.swing.JTextField getJtfNome4() {
        return jtfNome4;
    }

    /**
     * @param jtfNome4 the jtfNome4 to set
     */
    public void setJtfNome4(javax.swing.JTextField jtfNome4) {
        this.jtfNome4 = jtfNome4;
    }

    /**
     * @return the jtfNome5
     */
    public javax.swing.JTextField getJtfNome5() {
        return jtfNome5;
    }

    /**
     * @param jtfNome5 the jtfNome5 to set
     */
    public void setJtfNome5(javax.swing.JTextField jtfNome5) {
        this.jtfNome5 = jtfNome5;
    }

    /**
     * @return the jtfNome6
     */
    public javax.swing.JTextField getJtfNome6() {
        return jtfNome6;
    }

    /**
     * @param jtfNome6 the jtfNome6 to set
     */
    public void setJtfNome6(javax.swing.JTextField jtfNome6) {
        this.jtfNome6 = jtfNome6;
    }

    /**
     * @return the jtfNome7
     */
    public javax.swing.JTextField getJtfNome7() {
        return jtfNome7;
    }

    /**
     * @param jtfNome7 the jtfNome7 to set
     */
    public void setJtfNome7(javax.swing.JTextField jtfNome7) {
        this.jtfNome7 = jtfNome7;
    }

    /**
     * @return the jftNumero
     */
    public javax.swing.JTextField getJftNumero() {
        return jftNumero;
    }

    /**
     * @param jftNumero the jftNumero to set
     */
    public void setJftNumero(javax.swing.JTextField jftNumero) {
        this.jftNumero = jftNumero;
    }
}