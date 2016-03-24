/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Usuario;
import javax.swing.JOptionPane;
import tablemodels.ModelUsuario;

public class ViewUsuarioConsulta extends javax.swing.JFrame {

    private DAOGenerico<Usuario> dao;
    
    public ViewUsuarioConsulta() {
        dao = new DAOGenerico<Usuario>(Usuario.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTUsuarios = new javax.swing.JTable();
        JBUsuExcluir = new javax.swing.JButton();
        JBUsuInserir = new javax.swing.JButton();
        JBUsuAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBUsuFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setName(""); // NOI18N

        JTUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTUsuarios.setModel(new ModelUsuario());
        JTUsuarios.setToolTipText("Pesquise o usuário");
        JTUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTUsuarios);

        JBUsuExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBUsuExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBUsuExcluir.setText("Excluir");
        JBUsuExcluir.setToolTipText("Excluir Usuário");
        JBUsuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuExcluirActionPerformed(evt);
            }
        });

        JBUsuInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBUsuInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBUsuInserir.setText("Inserir");
        JBUsuInserir.setToolTipText("Inserir Usuário");
        JBUsuInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuInserirActionPerformed(evt);
            }
        });

        JBUsuAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBUsuAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBUsuAlterar.setText("Alterar");
        JBUsuAlterar.setToolTipText("Alterar Usuário");
        JBUsuAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuAlterarActionPerformed(evt);
            }
        });

        JBUsuFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBUsuFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBUsuFechar.setText("Fechar");
        JBUsuFechar.setToolTipText("Fechar Tela");
        JBUsuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(JBUsuInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBUsuAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBUsuExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBUsuFechar)
                .addContainerGap(531, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUsuInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBUsuAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBUsuExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBUsuFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-442)/2, 648, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void JBUsuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuExcluirActionPerformed
        int selecionado = JTUsuarios.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTUsuarios.setModel(new ModelUsuario());
                JTUsuarios.updateUI();
             }      
        }    
}//GEN-LAST:event_JBUsuExcluirActionPerformed

    private void JBUsuInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuInserirActionPerformed
        ViewUsuario vc = new ViewUsuario(this, true);
        vc.setVisible(true);
        JTUsuarios.setModel(new ModelUsuario());
        JTUsuarios.updateUI();
}//GEN-LAST:event_JBUsuInserirActionPerformed

    private void JBUsuAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuAlterarActionPerformed
        int selecionado = JTUsuarios.getSelectedRow();
        if (selecionado != -1) {
            Usuario usu = dao.list().get(selecionado);
            ViewUsuario vc = new ViewUsuario(this, true);
            vc.setEntidade(usu);
            vc.setVisible(true);
            JTUsuarios.setModel(new ModelUsuario());
            JTUsuarios.updateUI();
        } 
}//GEN-LAST:event_JBUsuAlterarActionPerformed

    private void JBUsuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuFecharActionPerformed
        if (evt.getSource() == JBUsuFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Usuários?",
                    "Fechar Cadastro de Usuários", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBUsuFecharActionPerformed

            public void run() {
                new ViewUsuarioConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBUsuAlterar;
    private javax.swing.JButton JBUsuExcluir;
    private javax.swing.JButton JBUsuFechar;
    private javax.swing.JButton JBUsuInserir;
    private javax.swing.JTable JTUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
