/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Funcionario;
import javax.swing.JOptionPane;
import tablemodels.ModelFuncionario;

public class ViewFuncionarioConsulta extends javax.swing.JFrame {

    private DAOGenerico<Funcionario> dao;
    
    public ViewFuncionarioConsulta() {
        dao = new DAOGenerico<Funcionario>(Funcionario.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTFuncionarios = new javax.swing.JTable();
        JBFunExcluir = new javax.swing.JButton();
        JBFunInserir = new javax.swing.JButton();
        JBFunAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBFunFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionários");
        setName(""); // NOI18N

        JTFuncionarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTFuncionarios.setModel(new ModelFuncionario());
        JTFuncionarios.setToolTipText("Pesquise o nome do funcionário");
        JTFuncionarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTFuncionarios);

        JBFunExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBFunExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBFunExcluir.setText("Excluir");
        JBFunExcluir.setToolTipText("Excluir Funcionário");
        JBFunExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFunExcluirActionPerformed(evt);
            }
        });

        JBFunInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFunInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBFunInserir.setText("Inserir");
        JBFunInserir.setToolTipText("Inserir Funcionário");
        JBFunInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFunInserirActionPerformed(evt);
            }
        });

        JBFunAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBFunAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBFunAlterar.setText("Alterar");
        JBFunAlterar.setToolTipText("Alterar Funcionário");
        JBFunAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFunAlterarActionPerformed(evt);
            }
        });

        JBFunFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFunFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBFunFechar.setText("Fechar");
        JBFunFechar.setToolTipText("Fechar Tela");
        JBFunFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFunFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBFunFechar)
                .addContainerGap(531, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(JBFunInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBFunAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBFunExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFunInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFunAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFunExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBFunFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-442)/2, 648, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void JBFunExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFunExcluirActionPerformed
        int selecionado = JTFuncionarios.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTFuncionarios.setModel(new ModelFuncionario());
                JTFuncionarios.updateUI();
             }      
        }    
}//GEN-LAST:event_JBFunExcluirActionPerformed

    private void JBFunInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFunInserirActionPerformed
        ViewFuncionario vc = new ViewFuncionario(this, true);
        vc.setVisible(true);
        JTFuncionarios.setModel(new ModelFuncionario());
        JTFuncionarios.updateUI();
}//GEN-LAST:event_JBFunInserirActionPerformed

    private void JBFunAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFunAlterarActionPerformed
        int selecionado = JTFuncionarios.getSelectedRow();
        if (selecionado != -1) {
            Funcionario fun = dao.list().get(selecionado);
            ViewFuncionario vc = new ViewFuncionario(this, true);
            vc.setEntidade(fun);
            vc.setVisible(true);
            JTFuncionarios.setModel(new ModelFuncionario());
            JTFuncionarios.updateUI();
        } 
}//GEN-LAST:event_JBFunAlterarActionPerformed

    private void JBFunFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFunFecharActionPerformed
        if (evt.getSource() == JBFunFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Funcionários?",
                    "Fechar Cadastro de Funcionários", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBFunFecharActionPerformed
           
            public void run() {
                new ViewFuncionarioConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBFunAlterar;
    private javax.swing.JButton JBFunExcluir;
    private javax.swing.JButton JBFunFechar;
    private javax.swing.JButton JBFunInserir;
    private javax.swing.JTable JTFuncionarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
