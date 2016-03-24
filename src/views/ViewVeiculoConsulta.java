/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Veiculo;
import javax.swing.JOptionPane;
import tablemodels.ModelVeiculo;

public class ViewVeiculoConsulta extends javax.swing.JFrame {

    private DAOGenerico<Veiculo> dao;
    
    public ViewVeiculoConsulta() {
        dao = new DAOGenerico<Veiculo>(Veiculo.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTVeiculos = new javax.swing.JTable();
        JBVeiExcluir = new javax.swing.JButton();
        JBVeiInserir = new javax.swing.JButton();
        JBVeiAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBVeiFechar = new javax.swing.JButton();
        JBCliConsultar = new javax.swing.JButton();
        JBCliPesquisar = new javax.swing.JButton();
        JTFCliPesquisar = new javax.swing.JTextField();
        JLCliPesquisar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículos");
        setName(""); // NOI18N

        JTVeiculos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTVeiculos.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTVeiculos.setModel(new ModelVeiculo());
        JTVeiculos.setToolTipText("Pesquise o nome do veículo");
        JTVeiculos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTVeiculos);

        JBVeiExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBVeiExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBVeiExcluir.setText("Excluir");
        JBVeiExcluir.setToolTipText("Excluir Veículo");
        JBVeiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVeiExcluirActionPerformed(evt);
            }
        });

        JBVeiInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBVeiInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBVeiInserir.setText("Inserir");
        JBVeiInserir.setToolTipText("Inserir Veículo");
        JBVeiInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVeiInserirActionPerformed(evt);
            }
        });

        JBVeiAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBVeiAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBVeiAlterar.setText("Alterar");
        JBVeiAlterar.setToolTipText("Alterar Veículo");
        JBVeiAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVeiAlterarActionPerformed(evt);
            }
        });

        JBVeiFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBVeiFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBVeiFechar.setText("Fechar");
        JBVeiFechar.setToolTipText("Fechar Tela");
        JBVeiFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVeiFecharActionPerformed(evt);
            }
        });

        JBCliConsultar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBCliConsultar.setText("Consultar");
        JBCliConsultar.setToolTipText("Consultar Veículo");
        JBCliConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliConsultarActionPerformed(evt);
            }
        });

        JBCliPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBCliPesquisar.setText("Pesquisar");
        JBCliPesquisar.setToolTipText("Pesquisar");

        JTFCliPesquisar.setToolTipText("Pesquisar");

        JLCliPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliPesquisar.setText("Pesquisar:");

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
                .addComponent(JBVeiFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(JLCliPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCliPesquisar)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(JBVeiInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBVeiAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBVeiExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCliConsultar)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVeiInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBVeiAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBVeiExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCliConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVeiFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCliPesquisar)
                    .addComponent(JTFCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-442)/2, 648, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void JBVeiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVeiExcluirActionPerformed
        int selecionado = JTVeiculos.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTVeiculos.setModel(new ModelVeiculo());
                JTVeiculos.updateUI();
             }      
        }    
}//GEN-LAST:event_JBVeiExcluirActionPerformed

    private void JBVeiInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVeiInserirActionPerformed
        ViewVeiculo vc = new ViewVeiculo(this, true);
        vc.setVisible(true);
        JTVeiculos.setModel(new ModelVeiculo());
        JTVeiculos.updateUI();
}//GEN-LAST:event_JBVeiInserirActionPerformed

    private void JBVeiAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVeiAlterarActionPerformed
        int selecionado = JTVeiculos.getSelectedRow();
        if (selecionado != -1) {
            Veiculo vei = dao.list().get(selecionado);
            ViewVeiculo vc = new ViewVeiculo(this, true);
            vc.setEntidade(vei);
            vc.setVisible(true);
            JTVeiculos.setModel(new ModelVeiculo());
            JTVeiculos.updateUI();
        } 
}//GEN-LAST:event_JBVeiAlterarActionPerformed

    private void JBVeiFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVeiFecharActionPerformed
        if (evt.getSource() == JBVeiFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Veículos?",
                    "Fechar Cadastro de Veículos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBVeiFecharActionPerformed

private void JBCliConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliConsultarActionPerformed
        int selecionado = JTVeiculos.getSelectedRow();
            Veiculo vei = dao.list().get(selecionado);
            ViewVeiculo vc = new ViewVeiculo(this, true);
            vc.setEntidade(vei);
            vc.setVisible(true);
}//GEN-LAST:event_JBCliConsultarActionPerformed

            public void run() {
                new ViewVeiculoConsulta().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCliConsultar;
    private javax.swing.JButton JBCliPesquisar;
    private javax.swing.JButton JBVeiAlterar;
    private javax.swing.JButton JBVeiExcluir;
    private javax.swing.JButton JBVeiFechar;
    private javax.swing.JButton JBVeiInserir;
    private javax.swing.JLabel JLCliPesquisar;
    private javax.swing.JTextField JTFCliPesquisar;
    private javax.swing.JTable JTVeiculos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
