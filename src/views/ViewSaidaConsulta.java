/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Saida;
import javax.swing.JOptionPane;
import tablemodels.ModelSaida;

public class ViewSaidaConsulta extends javax.swing.JFrame {

    private DAOGenerico<Saida> dao;
    
    public ViewSaidaConsulta() {
        dao = new DAOGenerico<Saida>(Saida.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTESaidasMercadorias = new javax.swing.JTable();
        JBSaiExcluir = new javax.swing.JButton();
        JBSaiInserir = new javax.swing.JButton();
        JBSaiAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBSaiFechar = new javax.swing.JButton();
        JBSaiConsultar = new javax.swing.JButton();
        JTFSaiPesquisar = new javax.swing.JTextField();
        JLSaiPesquisar = new javax.swing.JLabel();
        JBSaiPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentação de Saída de Mercadorias");
        setName(""); // NOI18N

        JTESaidasMercadorias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTESaidasMercadorias.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTESaidasMercadorias.setModel(new ModelSaida());
        JTESaidasMercadorias.setToolTipText("Saída de Mercadorias");
        JTESaidasMercadorias.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTESaidasMercadorias);

        JBSaiExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSaiExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBSaiExcluir.setText("Excluir");
        JBSaiExcluir.setToolTipText("Excluir");
        JBSaiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaiExcluirActionPerformed(evt);
            }
        });

        JBSaiInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSaiInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBSaiInserir.setText("Inserir");
        JBSaiInserir.setToolTipText("Inserir ");
        JBSaiInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaiInserirActionPerformed(evt);
            }
        });

        JBSaiAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSaiAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBSaiAlterar.setText("Alterar");
        JBSaiAlterar.setToolTipText("Alterar");
        JBSaiAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaiAlterarActionPerformed(evt);
            }
        });

        JBSaiFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSaiFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBSaiFechar.setText("Fechar");
        JBSaiFechar.setToolTipText("Fechar Tela");
        JBSaiFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaiFecharActionPerformed(evt);
            }
        });

        JBSaiConsultar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSaiConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBSaiConsultar.setText("Consultar");
        JBSaiConsultar.setToolTipText("Consultar ");
        JBSaiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaiConsultarActionPerformed(evt);
            }
        });

        JTFSaiPesquisar.setToolTipText("Pesquisar");

        JLSaiPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiPesquisar.setText("Pesquisar:");

        JBSaiPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSaiPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBSaiPesquisar.setText("Pesquisar");
        JBSaiPesquisar.setToolTipText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBSaiFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(JLSaiPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFSaiPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBSaiPesquisar)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(JBSaiInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSaiAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSaiExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSaiConsultar)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSaiInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSaiAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSaiExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSaiConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSaiFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSaiPesquisar)
                    .addComponent(JTFSaiPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLSaiPesquisar))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-487)/2, 648, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void JBSaiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaiExcluirActionPerformed
        int selecionado = JTESaidasMercadorias.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTESaidasMercadorias.setModel(new ModelSaida());
                JTESaidasMercadorias.updateUI();
             }      
        }    
}//GEN-LAST:event_JBSaiExcluirActionPerformed

    private void JBSaiInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaiInserirActionPerformed
        ViewSaida vc = new ViewSaida(this, true);
        vc.setVisible(true);
        JTESaidasMercadorias.setModel(new ModelSaida());
        JTESaidasMercadorias.updateUI();
}//GEN-LAST:event_JBSaiInserirActionPerformed

    private void JBSaiAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaiAlterarActionPerformed
        int selecionado = JTESaidasMercadorias.getSelectedRow();
        if (selecionado != -1) {
            Saida sai = dao.list().get(selecionado);
            ViewSaida vc = new ViewSaida(this, true);
            vc.setEntidade(sai);
            vc.setVisible(true);
            JTESaidasMercadorias.setModel(new ModelSaida());
            JTESaidasMercadorias.updateUI();
        } 
}//GEN-LAST:event_JBSaiAlterarActionPerformed

    private void JBSaiFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaiFecharActionPerformed
        if (evt.getSource() == JBSaiFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Gostaria de Fechar a Movimentação de Saída de Mercadorias??",
                    "Fechar Movimentação de Saída de Mercadorias", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBSaiFecharActionPerformed

private void JBSaiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaiConsultarActionPerformed
        int selecionado = JTESaidasMercadorias.getSelectedRow();
            Saida sai = dao.list().get(selecionado);
            ViewSaida vc = new ViewSaida(this, true);
            vc.setEntidade(sai);
            vc.setVisible(true);
}//GEN-LAST:event_JBSaiConsultarActionPerformed

            public void run() {
                new ViewSaidaConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSaiAlterar;
    private javax.swing.JButton JBSaiConsultar;
    private javax.swing.JButton JBSaiExcluir;
    private javax.swing.JButton JBSaiFechar;
    private javax.swing.JButton JBSaiInserir;
    private javax.swing.JButton JBSaiPesquisar;
    private javax.swing.JLabel JLSaiPesquisar;
    private javax.swing.JTable JTESaidasMercadorias;
    private javax.swing.JTextField JTFSaiPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
