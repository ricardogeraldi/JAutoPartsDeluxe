/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Prateleira;
import javax.swing.JOptionPane;
import tablemodels.ModelPrateleira;

public class ViewPrateleiraConsulta extends javax.swing.JFrame {

    private DAOGenerico<Prateleira> dao;
    
    public ViewPrateleiraConsulta() {
        dao = new DAOGenerico<Prateleira>(Prateleira.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTPrateleiras = new javax.swing.JTable();
        JBPraExcluir = new javax.swing.JButton();
        JBPraInserir = new javax.swing.JButton();
        JBPraAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBPraFechar = new javax.swing.JButton();
        JBPraConsultar = new javax.swing.JButton();
        JLPraPesquisar = new javax.swing.JLabel();
        JTFPraPesquisar = new javax.swing.JTextField();
        JBPraPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Prateleiras");
        setName(""); // NOI18N

        JTPrateleiras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTPrateleiras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTPrateleiras.setModel(new ModelPrateleira());
        JTPrateleiras.setToolTipText("Pesquise o nome da prateleira");
        JTPrateleiras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTPrateleiras);

        JBPraExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBPraExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBPraExcluir.setText("Excluir");
        JBPraExcluir.setToolTipText("Excluir Prateleira");
        JBPraExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPraExcluirActionPerformed(evt);
            }
        });

        JBPraInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBPraInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBPraInserir.setText("Inserir");
        JBPraInserir.setToolTipText("Inserir Prateleira");
        JBPraInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPraInserirActionPerformed(evt);
            }
        });

        JBPraAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBPraAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBPraAlterar.setText("Alterar");
        JBPraAlterar.setToolTipText("Alterar Prateleira");
        JBPraAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPraAlterarActionPerformed(evt);
            }
        });

        JBPraFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBPraFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBPraFechar.setText("Fechar");
        JBPraFechar.setToolTipText("Fechar Tela");
        JBPraFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPraFecharActionPerformed(evt);
            }
        });

        JBPraConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBPraConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBPraConsultar.setText("Consultar");
        JBPraConsultar.setToolTipText("Consultar Prateleira");

        JLPraPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLPraPesquisar.setText("Pesquisar:");

        JTFPraPesquisar.setToolTipText("Pesquisar");

        JBPraPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBPraPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBPraPesquisar.setText("Pesquisar");
        JBPraPesquisar.setToolTipText("Pesquisar");

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
                .addComponent(JBPraFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(JLPraPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFPraPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBPraPesquisar)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(JBPraInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBPraAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBPraExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBPraConsultar)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBPraInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPraAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPraExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPraConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBPraFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPraPesquisar)
                    .addComponent(JTFPraPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPraPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-442)/2, 648, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void JBPraExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPraExcluirActionPerformed
        int selecionado = JTPrateleiras.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTPrateleiras.setModel(new ModelPrateleira());
                JTPrateleiras.updateUI();
             }      
        }    
}//GEN-LAST:event_JBPraExcluirActionPerformed

    private void JBPraInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPraInserirActionPerformed
        ViewPrateleira vc = new ViewPrateleira(this, true);
        vc.setVisible(true);
        JTPrateleiras.setModel(new ModelPrateleira());
        JTPrateleiras.updateUI();
}//GEN-LAST:event_JBPraInserirActionPerformed

    private void JBPraAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPraAlterarActionPerformed
        int selecionado = JTPrateleiras.getSelectedRow();
        if (selecionado != -1) {
            Prateleira pra = dao.list().get(selecionado);
            ViewPrateleira vc = new ViewPrateleira(this, true);
            vc.setEntidade(pra);
            vc.setVisible(true);
            JTPrateleiras.setModel(new ModelPrateleira());
            JTPrateleiras.updateUI();
        } 
}//GEN-LAST:event_JBPraAlterarActionPerformed

    private void JBPraFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPraFecharActionPerformed
        if (evt.getSource() == JBPraFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Prateleiras?",
                    "Fechar Cadastro de Prateleiras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBPraFecharActionPerformed

            public void run() {
                new ViewPrateleiraConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPraAlterar;
    private javax.swing.JButton JBPraConsultar;
    private javax.swing.JButton JBPraExcluir;
    private javax.swing.JButton JBPraFechar;
    private javax.swing.JButton JBPraInserir;
    private javax.swing.JButton JBPraPesquisar;
    private javax.swing.JLabel JLPraPesquisar;
    private javax.swing.JTextField JTFPraPesquisar;
    private javax.swing.JTable JTPrateleiras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
