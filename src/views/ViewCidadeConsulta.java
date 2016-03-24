/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Cidade;
import javax.swing.JOptionPane;
import tablemodels.ModelCidade;

public class ViewCidadeConsulta extends javax.swing.JFrame {

    private DAOGenerico<Cidade> dao;
    
    public ViewCidadeConsulta() {
        dao = new DAOGenerico<Cidade>(Cidade.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTCidades = new javax.swing.JTable();
        JBCidExcluir = new javax.swing.JButton();
        JBCidInserir = new javax.swing.JButton();
        JBCidAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBCidFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setName(""); // NOI18N

        JTCidades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTCidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTCidades.setModel(new ModelCidade());
        JTCidades.setToolTipText("Pesquise o nome da cidade");
        JTCidades.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTCidades);

        JBCidExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBCidExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBCidExcluir.setText("Excluir");
        JBCidExcluir.setToolTipText("Excluir Cidade");
        JBCidExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCidExcluirActionPerformed(evt);
            }
        });

        JBCidInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBCidInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBCidInserir.setText("Inserir");
        JBCidInserir.setToolTipText("Inserir Cidade");
        JBCidInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCidInserirActionPerformed(evt);
            }
        });

        JBCidAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBCidAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBCidAlterar.setText("Alterar");
        JBCidAlterar.setToolTipText("Alterar Cidade");
        JBCidAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCidAlterarActionPerformed(evt);
            }
        });

        JBCidFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBCidFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBCidFechar.setText("Fechar");
        JBCidFechar.setToolTipText("Fechar Tela");
        JBCidFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCidFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(JBCidInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCidAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCidExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBCidFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCidInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCidAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCidExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCidFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-482)/2, 648, 482);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCidExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCidExcluirActionPerformed
        int selecionado = JTCidades.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTCidades.setModel(new ModelCidade());
                JTCidades.updateUI();
             }      
        }    
}//GEN-LAST:event_JBCidExcluirActionPerformed

    private void JBCidInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCidInserirActionPerformed
        ViewCidade vc = new ViewCidade(this, true);
        vc.setVisible(true);
        JTCidades.setModel(new ModelCidade());
        JTCidades.updateUI();
}//GEN-LAST:event_JBCidInserirActionPerformed

    private void JBCidAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCidAlterarActionPerformed
        int selecionado = JTCidades.getSelectedRow();
        if (selecionado != -1) {
            Cidade cid = dao.list().get(selecionado);
            ViewCidade vc = new ViewCidade(this, true);
            vc.setEntidade(cid);
            vc.setVisible(true);
            JTCidades.setModel(new ModelCidade());
            JTCidades.updateUI();
        } 
}//GEN-LAST:event_JBCidAlterarActionPerformed

    private void JBCidFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCidFecharActionPerformed
        if (evt.getSource() == JBCidFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Cidades?",
                    "Fechar Cadastro de Cidades", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBCidFecharActionPerformed

            public void run() {
                new ViewCidadeConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCidAlterar;
    private javax.swing.JButton JBCidExcluir;
    private javax.swing.JButton JBCidFechar;
    private javax.swing.JButton JBCidInserir;
    private javax.swing.JTable JTCidades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
