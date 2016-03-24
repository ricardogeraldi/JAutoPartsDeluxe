/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Produto;
import javax.swing.JOptionPane;
import tablemodels.ModelProduto;

public class ViewProdutoConsulta extends javax.swing.JFrame {

    private DAOGenerico<Produto> dao;
    
    public ViewProdutoConsulta() {
        dao = new DAOGenerico<Produto>(Produto.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTProdutos = new javax.swing.JTable();
        JBProExcluir = new javax.swing.JButton();
        JBProInserir = new javax.swing.JButton();
        JBProAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBProFechar = new javax.swing.JButton();
        JBProConsultar = new javax.swing.JButton();
        JTFProPesquisar = new javax.swing.JTextField();
        JLProPesquisar = new javax.swing.JLabel();
        JBProPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setName(""); // NOI18N

        JTProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTProdutos.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTProdutos.setModel(new ModelProduto());
        JTProdutos.setToolTipText("Pesquise o nome do produto");
        JTProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTProdutos);

        JBProExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBProExcluir.setText("Excluir");
        JBProExcluir.setToolTipText("Excluir Usuário");
        JBProExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProExcluirActionPerformed(evt);
            }
        });

        JBProInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBProInserir.setText("Inserir");
        JBProInserir.setToolTipText("Inserir Usuário");
        JBProInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProInserirActionPerformed(evt);
            }
        });

        JBProAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBProAlterar.setText("Alterar");
        JBProAlterar.setToolTipText("Alterar Usuário");
        JBProAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProAlterarActionPerformed(evt);
            }
        });

        JBProFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBProFechar.setText("Fechar");
        JBProFechar.setToolTipText("Fechar Tela");
        JBProFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProFecharActionPerformed(evt);
            }
        });

        JBProConsultar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBProConsultar.setText("Consultar");
        JBProConsultar.setToolTipText("Consultar Cliente");
        JBProConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProConsultarActionPerformed(evt);
            }
        });

        JTFProPesquisar.setToolTipText("Pesquisar");

        JLProPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProPesquisar.setText("Pesquisar:");

        JBProPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBProPesquisar.setText("Pesquisar");
        JBProPesquisar.setToolTipText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JBProFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(JLProPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFProPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBProPesquisar)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(JBProInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBProAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBProExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBProConsultar)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBProInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBProAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBProExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBProConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBProFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBProPesquisar)
                    .addComponent(JTFProPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLProPesquisar))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-513)/2, 648, 513);
    }// </editor-fold>//GEN-END:initComponents

    private void JBProExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProExcluirActionPerformed
        int selecionado = JTProdutos.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTProdutos.setModel(new ModelProduto());
                JTProdutos.updateUI();
             }      
        }    
}//GEN-LAST:event_JBProExcluirActionPerformed

    private void JBProInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProInserirActionPerformed
        ViewProduto vc = new ViewProduto(this, true);
        vc.setVisible(true);
        JTProdutos.setModel(new ModelProduto());
        JTProdutos.updateUI();
}//GEN-LAST:event_JBProInserirActionPerformed

    private void JBProAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProAlterarActionPerformed
        int selecionado = JTProdutos.getSelectedRow();
        if (selecionado != -1) {
            Produto pro = dao.list().get(selecionado);
            ViewProduto vc = new ViewProduto(this, true);
            vc.setEntidade(pro);
            vc.setVisible(true);
            JTProdutos.setModel(new ModelProduto());
            JTProdutos.updateUI();
        } 
}//GEN-LAST:event_JBProAlterarActionPerformed

    private void JBProFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProFecharActionPerformed
        if (evt.getSource() == JBProFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Produtos?",
                    "Fechar Cadastro de Produtos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBProFecharActionPerformed

private void JBProConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProConsultarActionPerformed
         int selecionado = JTProdutos.getSelectedRow();
           Produto pro = dao.list().get(selecionado);
            ViewProduto vc = new ViewProduto(this, true);
            vc.setEntidade(pro);
            vc.setVisible(true);
}//GEN-LAST:event_JBProConsultarActionPerformed

            public void run() {
                new ViewProdutoConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBProAlterar;
    private javax.swing.JButton JBProConsultar;
    private javax.swing.JButton JBProExcluir;
    private javax.swing.JButton JBProFechar;
    private javax.swing.JButton JBProInserir;
    private javax.swing.JButton JBProPesquisar;
    private javax.swing.JLabel JLProPesquisar;
    private javax.swing.JTextField JTFProPesquisar;
    private javax.swing.JTable JTProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
