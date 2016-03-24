/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Grupo;
import javax.swing.JOptionPane;
import tablemodels.ModelGrupo;

public class ViewGrupoConsulta extends javax.swing.JFrame {

    private DAOGenerico<Grupo> dao;
    
    public ViewGrupoConsulta() {
        dao = new DAOGenerico<Grupo>(Grupo.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTGrupos = new javax.swing.JTable();
        JBGruExcluir = new javax.swing.JButton();
        JBGruInserir = new javax.swing.JButton();
        JBGruAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBGruFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Grupos de Produtos");
        setName(""); // NOI18N

        JTGrupos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTGrupos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTGrupos.setModel(new ModelGrupo());
        JTGrupos.setToolTipText("Pesquise o nome do grupo de produtos");
        JTGrupos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTGrupos);

        JBGruExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBGruExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBGruExcluir.setText("Excluir");
        JBGruExcluir.setToolTipText("Excluir Grupo");
        JBGruExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGruExcluirActionPerformed(evt);
            }
        });

        JBGruInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBGruInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBGruInserir.setText("Inserir");
        JBGruInserir.setToolTipText("Inserir Grupo");
        JBGruInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGruInserirActionPerformed(evt);
            }
        });

        JBGruAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBGruAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBGruAlterar.setText("Alterar");
        JBGruAlterar.setToolTipText("Alterar Grupo");
        JBGruAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGruAlterarActionPerformed(evt);
            }
        });

        JBGruFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBGruFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBGruFechar.setText("Fechar");
        JBGruFechar.setToolTipText("Fechar Tela");
        JBGruFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGruFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(JBGruInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBGruAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBGruExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBGruFechar)
                .addContainerGap(531, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGruInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGruAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGruExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBGruFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-442)/2, 648, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void JBGruExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGruExcluirActionPerformed
        int selecionado = JTGrupos.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTGrupos.setModel(new ModelGrupo());
                JTGrupos.updateUI();
             }      
        }    
}//GEN-LAST:event_JBGruExcluirActionPerformed

    private void JBGruInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGruInserirActionPerformed
        ViewGrupo vc = new ViewGrupo(this, true);
        vc.setVisible(true);
        JTGrupos.setModel(new ModelGrupo());
        JTGrupos.updateUI();
}//GEN-LAST:event_JBGruInserirActionPerformed

    private void JBGruAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGruAlterarActionPerformed
        int selecionado = JTGrupos.getSelectedRow();
        if (selecionado != -1) {
            Grupo gru = dao.list().get(selecionado);
            ViewGrupo vc = new ViewGrupo(this, true);
            vc.setEntidade(gru);
            vc.setVisible(true);
            JTGrupos.setModel(new ModelGrupo());
            JTGrupos.updateUI();
        } 
}//GEN-LAST:event_JBGruAlterarActionPerformed

    private void JBGruFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGruFecharActionPerformed
        if (evt.getSource() == JBGruFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Grupos?",
                    "Fechar Cadastro de Grupos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBGruFecharActionPerformed
           
            public void run() {
                new ViewGrupoConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGruAlterar;
    private javax.swing.JButton JBGruExcluir;
    private javax.swing.JButton JBGruFechar;
    private javax.swing.JButton JBGruInserir;
    private javax.swing.JTable JTGrupos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
