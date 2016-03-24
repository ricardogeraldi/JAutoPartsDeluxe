/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Fornecedor;
import javax.swing.JOptionPane;
import tablemodels.ModelFornecedor;

public class ViewFornecedorConsulta extends javax.swing.JFrame {

    private DAOGenerico<Fornecedor> dao;
    
    public ViewFornecedorConsulta() {
        dao = new DAOGenerico<Fornecedor>(Fornecedor.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTFornecedores = new javax.swing.JTable();
        JBFornExcluir = new javax.swing.JButton();
        JBFornInserir = new javax.swing.JButton();
        JBFornAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBFornFechar = new javax.swing.JButton();
        JLFornPesquisar = new javax.swing.JLabel();
        JTFFornPesquisar = new javax.swing.JTextField();
        JBFornPesquisar = new javax.swing.JButton();
        JBCliConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedores");
        setName(""); // NOI18N

        JTFornecedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTFornecedores.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTFornecedores.setModel(new ModelFornecedor());
        JTFornecedores.setToolTipText("Pesquise o nome do fornecedor");
        JTFornecedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTFornecedores);

        JBFornExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFornExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBFornExcluir.setText("Excluir");
        JBFornExcluir.setToolTipText("Excluir Fornecedor");
        JBFornExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFornExcluirActionPerformed(evt);
            }
        });

        JBFornInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFornInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBFornInserir.setText("Inserir");
        JBFornInserir.setToolTipText("Inserir Fornecedor");
        JBFornInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFornInserirActionPerformed(evt);
            }
        });

        JBFornAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFornAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBFornAlterar.setText("Alterar");
        JBFornAlterar.setToolTipText("Alterar Fornecedor");
        JBFornAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFornAlterarActionPerformed(evt);
            }
        });

        JBFornFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFornFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBFornFechar.setText("Fechar");
        JBFornFechar.setToolTipText("Fechar Tela");
        JBFornFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFornFecharActionPerformed(evt);
            }
        });

        JLFornPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornPesquisar.setText("Pesquisar:");

        JTFFornPesquisar.setToolTipText("Pesquisar");

        JBFornPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFornPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBFornPesquisar.setText("Pesquisar");
        JBFornPesquisar.setToolTipText("Pesquisar");

        JBCliConsultar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBCliConsultar.setText("Consultar");
        JBCliConsultar.setToolTipText("Consultar Fornecedor");
        JBCliConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBFornFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(JLFornPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFFornPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBFornPesquisar)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(JBFornInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBFornAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBFornExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCliConsultar)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFornInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFornAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFornExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCliConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFornFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFornPesquisar)
                    .addComponent(JTFFornPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLFornPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-522)/2, 648, 522);
    }// </editor-fold>//GEN-END:initComponents

    private void JBFornExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFornExcluirActionPerformed
        int selecionado = JTFornecedores.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTFornecedores.setModel(new ModelFornecedor());
                JTFornecedores.updateUI();
             }      
        }    
}//GEN-LAST:event_JBFornExcluirActionPerformed

    private void JBFornInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFornInserirActionPerformed
        ViewFornecedor vc = new ViewFornecedor(this, true);
        vc.setVisible(true);
        JTFornecedores.setModel(new ModelFornecedor());
        JTFornecedores.updateUI();
}//GEN-LAST:event_JBFornInserirActionPerformed

    private void JBFornAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFornAlterarActionPerformed
        int selecionado = JTFornecedores.getSelectedRow();
        if (selecionado != -1) {
            Fornecedor forn = dao.list().get(selecionado);
            ViewFornecedor vc = new ViewFornecedor(this, true);
            vc.setEntidade(forn);
            vc.setVisible(true);
            JTFornecedores.setModel(new ModelFornecedor());
            JTFornecedores.updateUI();
        } 
}//GEN-LAST:event_JBFornAlterarActionPerformed

    private void JBFornFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFornFecharActionPerformed
        if (evt.getSource() == JBFornFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Fornecedores?",
                    "Fechar Cadastro de Fornecedores", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBFornFecharActionPerformed

private void JBCliConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliConsultarActionPerformed
       int selecionado = JTFornecedores.getSelectedRow();
        Fornecedor forn = dao.list().get(selecionado);
        ViewFornecedor vc = new ViewFornecedor(this, true);
        vc.setEntidade(forn);
        vc.setVisible(true);
}//GEN-LAST:event_JBCliConsultarActionPerformed

            public void run() {
                new ViewFornecedorConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCliConsultar;
    private javax.swing.JButton JBFornAlterar;
    private javax.swing.JButton JBFornExcluir;
    private javax.swing.JButton JBFornFechar;
    private javax.swing.JButton JBFornInserir;
    private javax.swing.JButton JBFornPesquisar;
    private javax.swing.JLabel JLFornPesquisar;
    private javax.swing.JTextField JTFFornPesquisar;
    private javax.swing.JTable JTFornecedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
