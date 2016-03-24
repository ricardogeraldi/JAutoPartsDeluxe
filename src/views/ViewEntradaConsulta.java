/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Entrada;
import javax.swing.JOptionPane;
import tablemodels.ModelEntrada;

public class ViewEntradaConsulta extends javax.swing.JFrame {

    private DAOGenerico<Entrada> dao;
    
    public ViewEntradaConsulta() {
        dao = new DAOGenerico<Entrada>(Entrada.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTEntradasMercadorias = new javax.swing.JTable();
        JBEntExcluir = new javax.swing.JButton();
        JBEntInserir = new javax.swing.JButton();
        JBEntAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBEntFechar = new javax.swing.JButton();
        JBEntConsultar = new javax.swing.JButton();
        JTFEntPesquisar = new javax.swing.JTextField();
        JLEntPesquisar = new javax.swing.JLabel();
        JBEntPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentação de Entrada de Mercadorias");
        setName(""); // NOI18N

        JTEntradasMercadorias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTEntradasMercadorias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTEntradasMercadorias.setModel(new ModelEntrada());
        JTEntradasMercadorias.setToolTipText("Entrada de Mercadorias");
        JTEntradasMercadorias.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTEntradasMercadorias);

        JBEntExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEntExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBEntExcluir.setText("Excluir");
        JBEntExcluir.setToolTipText("Excluir");
        JBEntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntExcluirActionPerformed(evt);
            }
        });

        JBEntInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEntInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBEntInserir.setText("Inserir");
        JBEntInserir.setToolTipText("Inserir ");
        JBEntInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntInserirActionPerformed(evt);
            }
        });

        JBEntAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEntAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBEntAlterar.setText("Alterar");
        JBEntAlterar.setToolTipText("Alterar");
        JBEntAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntAlterarActionPerformed(evt);
            }
        });

        JBEntFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEntFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBEntFechar.setText("Fechar");
        JBEntFechar.setToolTipText("Fechar Tela");
        JBEntFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntFecharActionPerformed(evt);
            }
        });

        JBEntConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEntConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBEntConsultar.setText("Consultar");
        JBEntConsultar.setToolTipText("Consultar ");
        JBEntConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntConsultarActionPerformed(evt);
            }
        });

        JTFEntPesquisar.setToolTipText("Pesquisar");

        JLEntPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLEntPesquisar.setText("Pesquisar:");

        JBEntPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEntPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBEntPesquisar.setText("Pesquisar");
        JBEntPesquisar.setToolTipText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBEntFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(JLEntPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFEntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBEntPesquisar)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(JBEntInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEntConsultar)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEntInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEntConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEntFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEntPesquisar)
                    .addComponent(JTFEntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEntPesquisar))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-487)/2, 648, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void JBEntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntExcluirActionPerformed
        int selecionado = JTEntradasMercadorias.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTEntradasMercadorias.setModel(new ModelEntrada());
                JTEntradasMercadorias.updateUI();
             }      
        }    
}//GEN-LAST:event_JBEntExcluirActionPerformed

    private void JBEntInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntInserirActionPerformed
        ViewEntrada vc = new ViewEntrada(this, true);
        vc.setVisible(true);
        JTEntradasMercadorias.setModel(new ModelEntrada());
        JTEntradasMercadorias.updateUI();
}//GEN-LAST:event_JBEntInserirActionPerformed

    private void JBEntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntAlterarActionPerformed
        int selecionado = JTEntradasMercadorias.getSelectedRow();
        if (selecionado != -1) {
            Entrada ent = dao.list().get(selecionado);
            ViewEntrada vc = new ViewEntrada(this, true);
            vc.setEntidade(ent);
            vc.setVisible(true);
            JTEntradasMercadorias.setModel(new ModelEntrada());
            JTEntradasMercadorias.updateUI();
        } 
}//GEN-LAST:event_JBEntAlterarActionPerformed

    private void JBEntFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntFecharActionPerformed
        if (evt.getSource() == JBEntFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Gostaria de Fechar a Movimentação de Entrada de Mercadorias??",
                    "Fechar Movimentação de Entrada de Mercadorias", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBEntFecharActionPerformed

private void JBEntConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntConsultarActionPerformed
        int selecionado = JTEntradasMercadorias.getSelectedRow();
            Entrada ent = dao.list().get(selecionado);
            ViewEntrada vc = new ViewEntrada(this, true);
            vc.setEntidade(ent);
            vc.setVisible(true);
}//GEN-LAST:event_JBEntConsultarActionPerformed

            public void run() {
                new ViewEntradaConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEntAlterar;
    private javax.swing.JButton JBEntConsultar;
    private javax.swing.JButton JBEntExcluir;
    private javax.swing.JButton JBEntFechar;
    private javax.swing.JButton JBEntInserir;
    private javax.swing.JButton JBEntPesquisar;
    private javax.swing.JLabel JLEntPesquisar;
    private javax.swing.JTable JTEntradasMercadorias;
    private javax.swing.JTextField JTFEntPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
