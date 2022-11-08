package br.com.sicoob_credinova.arquivo_prejuizo_uad.view.tipo_documental;

import br.com.sicoob_credinova.arquivo_prejuizo_uad.controller.NomeDosCamposController;
import br.com.sicoob_credinova.arquivo_prejuizo_uad.model.NomeDosCampos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alisson Jaques
 */
public class ConsultaTipoDocumental extends javax.swing.JInternalFrame {

    private final NomeDosCamposController controle;
    private List<NomeDosCampos> lista;

    /**
     * Creates new form ConsultaTipoDocumental
     */
    public ConsultaTipoDocumental() {
        this.setFrameIcon(new ImageIcon("src\\br\\com\\sicoob_credinova\\arquivo_prejuizo_uad\\img\\arquivo.png"));
        initComponents();
        controle = new NomeDosCamposController();
        lista = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlConsulta = new javax.swing.JLabel();
        jcbConsulta = new javax.swing.JComboBox<>();
        jtfConsulta = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();

        setBackground(new java.awt.Color(72, 61, 139));
        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Tipos Documentais");

        jlConsulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlConsulta.setText("Consultar por:");

        jcbConsulta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "N�mero de Identifica��o" }));
        jcbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbConsultaActionPerformed(evt);
            }
        });

        jtfConsulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbPesquisar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sicoob_credinova/arquivo_prejuizo_uad/img/Search.png"))); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N�mero Identifica��o", "Nome Tipo Documental", "Campo 1", "Campo 2", "Campo 3", "Campo 4", "Campo 5", "Campo 6", "Campo 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfConsulta)
                        .addComponent(jbPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlConsulta)
                        .addComponent(jcbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbConsultaActionPerformed

    }//GEN-LAST:event_jcbConsultaActionPerformed

    /**
     * O m�todo limparTabela() limpa a tabela de interface do usu�rio
     */
    public void limparTabela() {
        DefaultTableModel dm = (DefaultTableModel) getJtTabela().getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }

    private void preencherTabela() {
        limparTabela();
        DefaultTableModel modelo = (DefaultTableModel) getJtTabela().getModel();
        getLista().forEach((tipoDocumental) -> {
            modelo.addRow(new Object[]{
                tipoDocumental.getNumero_identificacao(),
                tipoDocumental.getNome(),
                tipoDocumental.getNome1(),
                tipoDocumental.getNome2(),
                tipoDocumental.getNome3(),
                tipoDocumental.getNome4(),
                tipoDocumental.getNome5(),
                tipoDocumental.getNome6(),
                tipoDocumental.getNome7()
            });
        });
    }

    private void acaoPesquisar() {
        if (getJcbConsulta().getSelectedIndex() == 0) {
            setLista(controle.selecionar(getJtfConsulta().getText()));
            if (getLista().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhum tipo documental encontrado "
                        + "para a pesquisa informada!", "Alerta", 2);
            } else {
                preencherTabela();
            }
        } else {
            setLista(new ArrayList());
            try {
                NomeDosCampos nomeDosCampos = controle.selecionar(Integer.parseInt(getJtfConsulta().getText()));

                if (nomeDosCampos == null) {
                    JOptionPane.showMessageDialog(this, "Nenhum tipo documental encontrado "
                            + "para a pesquisa informada!", "Alerta", 2);
                } else {
                    getLista().add(nomeDosCampos);
                }
                preencherTabela();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Erro ao realizar consulta, n�mero inv�lido. Descri��o erro: "
                            + e.getMessage(), "Alerta", 2);
            }
        }
    }

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        acaoPesquisar();
    }//GEN-LAST:event_jbPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JComboBox<String> jcbConsulta;
    private javax.swing.JLabel jlConsulta;
    private javax.swing.JTable jtTabela;
    private javax.swing.JTextField jtfConsulta;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the lista
     */
    public List<NomeDosCampos> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<NomeDosCampos> lista) {
        this.lista = lista;
    }

    /**
     * @return the controle
     */
    public NomeDosCamposController getControle() {
        return controle;
    }

    /**
     * @return the jcbConsulta
     */
    public javax.swing.JComboBox<String> getJcbConsulta() {
        return jcbConsulta;
    }

    /**
     * @return the jtTabela
     */
    public javax.swing.JTable getJtTabela() {
        return jtTabela;
    }

    /**
     * @param jtTabela the jtTabela to set
     */
    public void setJtTabela(javax.swing.JTable jtTabela) {
        this.jtTabela = jtTabela;
    }

    /**
     * @return the jtfConsulta
     */
    public javax.swing.JTextField getJtfConsulta() {
        return jtfConsulta;
    }
}
