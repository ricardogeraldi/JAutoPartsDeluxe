/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.SubGrupo;
import javax.swing.JOptionPane;
import tablemodels.ModelSubGrupo;

public class ViewSubGrupoConsulta extends javax.swing.JFrame {

    private DAOGenerico<SubGrupo> dao;
    
    public ViewSubGrupoConsulta() {
        dao = new DAOGenerico<SubGrupo>(SubGrupo.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTSubGrupos = new javax.swing.JTable();
        JBSubGruExcluir = new javax.swing.JButton();
        JBSubGruInserir = new javax.swing.JButton();
        JBSubGruAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBSubGruFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Sub-Grupos de Produtos");
        setName(""); // NOI18N

        JTSubGrupos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTSubGrupos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTSubGrupos.setModel(new ModelSubGrupo());
        JTSubGrupos.setToolTipText("Pesquise o subgrupo de produtos");
        JTSubGrupos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTSubGrupos);

        JBSubGruExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSubGruExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBSubGruExcluir.setText("Excluir");
        JBSubGruExcluir.setToolTipText("Excluir Funcionário");
        JBSubGruExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSubGruExcluirActionPerformed(evt);
            }
        });

        JBSubGruInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSubGruInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBSubGruInserir.setText("Inserir");
        JBSubGruInserir.setToolTipText("Inserir Funcionário");
        JBSubGruInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSubGruInserirActionPerformed(evt);
            }
        });

        JBSubGruAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSubGruAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBSubGruAlterar.setText("Alterar");
        JBSubGruAlterar.setToolTipText("Alterar Funcionário");
        JBSubGruAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSubGruAlterarActionPerformed(evt);
            }
        });

        JBSubGruFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSubGruFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBSubGruFechar.setText("Fechar");
        JBSubGruFechar.setToolTipText("Fechar Tela");
        JBSubGruFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSubGruFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(JBSubGruInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSubGruAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSubGruExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBSubGruFechar)
                .addContainerGap(531, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSubGruInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSubGruAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSubGruExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBSubGruFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-442)/2, 648, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void JBSubGruExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSubGruExcluirActionPerformed
        int selecionado = JTSubGrupos.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTSubGrupos.setModel(new ModelSubGrupo());
                JTSubGrupos.updateUI();
             }      
        }    
}//GEN-LAST:event_JBSubGruExcluirActionPerformed

    private void JBSubGruInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSubGruInserirActionPerformed
        ViewSubGrupo vc = new ViewSubGrupo(this, true);
        vc.setVisible(true);
        JTSubGrupos.setModel(new ModelSubGrupo());
        JTSubGrupos.updateUI();
}//GEN-LAST:event_JBSubGruInserirActionPerformed

    private void JBSubGruAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSubGruAlterarActionPerformed
        int selecionado = JTSubGrupos.getSelectedRow();
        if (selecionado != -1) {
            SubGrupo subgru = dao.list().get(selecionado);
            ViewSubGrupo vc = new ViewSubGrupo(this, true);
            vc.setEntidade(subgru);
            vc.setVisible(true);
            JTSubGrupos.setModel(new ModelSubGrupo());
            JTSubGrupos.updateUI();
        } 
}//GEN-LAST:event_JBSubGruAlterarActionPerformed

    private void JBSubGruFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSubGruFecharActionPerformed
        if (evt.getSource() == JBSubGruFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Sub-Grupo?",
                    "Fechar Cadastro de Sub-Grupos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBSubGruFecharActionPerformed
           
            public void run() {
                new ViewSubGrupoConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSubGruAlterar;
    private javax.swing.JButton JBSubGruExcluir;
    private javax.swing.JButton JBSubGruFechar;
    private javax.swing.JButton JBSubGruInserir;
    private javax.swing.JTable JTSubGrupos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
