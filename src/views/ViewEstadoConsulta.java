/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Estado;
import javax.swing.JOptionPane;
import tablemodels.ModelEstado;

public class ViewEstadoConsulta extends javax.swing.JFrame {

    private DAOGenerico<Estado> dao;
    
    public ViewEstadoConsulta() {
        dao = new DAOGenerico<Estado>(Estado.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTEstados = new javax.swing.JTable();
        JBEstExcluir = new javax.swing.JButton();
        JBEstInserir = new javax.swing.JButton();
        JBEstAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBEstFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");
        setName(""); // NOI18N

        JTEstados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTEstados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTEstados.setModel(new ModelEstado());
        JTEstados.setToolTipText("Pesquise o nome do estado");
        JTEstados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTEstados);

        JBEstExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEstExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBEstExcluir.setText("Excluir");
        JBEstExcluir.setToolTipText("Excluir Estado");
        JBEstExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstExcluirActionPerformed(evt);
            }
        });

        JBEstInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEstInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBEstInserir.setText("Inserir");
        JBEstInserir.setToolTipText("Inserir Estado");
        JBEstInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstInserirActionPerformed(evt);
            }
        });

        JBEstAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEstAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBEstAlterar.setText("Alterar");
        JBEstAlterar.setToolTipText("Alterar Estado");
        JBEstAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstAlterarActionPerformed(evt);
            }
        });

        JBEstFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEstFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBEstFechar.setText("Fechar");
        JBEstFechar.setToolTipText("Fechar Tela");
        JBEstFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(JBEstInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEstAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEstExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBEstFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEstInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEstAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEstExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBEstFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-482)/2, 648, 482);
    }// </editor-fold>//GEN-END:initComponents

    private void JBEstExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstExcluirActionPerformed
        int selecionado = JTEstados.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTEstados.setModel(new ModelEstado());
                JTEstados.updateUI();
             }      
        }    
}//GEN-LAST:event_JBEstExcluirActionPerformed

    private void JBEstInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstInserirActionPerformed
        ViewEstado vc = new ViewEstado(this, true);
        vc.setVisible(true);
        JTEstados.setModel(new ModelEstado());
        JTEstados.updateUI();
}//GEN-LAST:event_JBEstInserirActionPerformed

    private void JBEstAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstAlterarActionPerformed
        int selecionado = JTEstados.getSelectedRow();
        if (selecionado != -1) {
            Estado est = dao.list().get(selecionado);
            ViewEstado vc = new ViewEstado(this, true);
            vc.setEntidade(est);
            vc.setVisible(true);
            JTEstados.setModel(new ModelEstado());
            JTEstados.updateUI();
        } 
}//GEN-LAST:event_JBEstAlterarActionPerformed

    private void JBEstFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstFecharActionPerformed
        if (evt.getSource() == JBEstFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Estados?",
                    "Fechar Cadastro de Estados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBEstFecharActionPerformed

            public void run() {
                new ViewEstadoConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEstAlterar;
    private javax.swing.JButton JBEstExcluir;
    private javax.swing.JButton JBEstFechar;
    private javax.swing.JButton JBEstInserir;
    private javax.swing.JTable JTEstados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
