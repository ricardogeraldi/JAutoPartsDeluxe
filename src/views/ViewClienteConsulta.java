/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Cliente;
import javax.swing.JOptionPane;
import tablemodels.ModelCliente;

public class ViewClienteConsulta extends javax.swing.JFrame {

    private DAOGenerico<Cliente> dao;
    
    public ViewClienteConsulta() {
        dao = new DAOGenerico<Cliente>(Cliente.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTClientes = new javax.swing.JTable();
        JBCliExcluir = new javax.swing.JButton();
        JBCliInserir = new javax.swing.JButton();
        JBCliAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBCliFechar = new javax.swing.JButton();
        JBCliConsultar = new javax.swing.JButton();
        JLCliPesquisar = new javax.swing.JLabel();
        JTFCliPesquisar = new javax.swing.JTextField();
        JBCliPesquisar = new javax.swing.JButton();
        JBCliAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setName(""); // NOI18N

        JTClientes.setAutoCreateRowSorter(true);
        JTClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTClientes.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTClientes.setModel(new ModelCliente());
        JTClientes.setToolTipText("Pesquise o nome do cliente");
        jScrollPane1.setViewportView(JTClientes);

        JBCliExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBCliExcluir.setText("Excluir");
        JBCliExcluir.setToolTipText("Excluir Cliente");
        JBCliExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliExcluirActionPerformed(evt);
            }
        });

        JBCliInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBCliInserir.setText("Inserir");
        JBCliInserir.setToolTipText("Inserir Cliente");
        JBCliInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliInserirActionPerformed(evt);
            }
        });

        JBCliAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConfirmar.png"))); // NOI18N
        JBCliAlterar.setText("Alterar");
        JBCliAlterar.setToolTipText("Alterar Cliente");
        JBCliAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliAlterarActionPerformed(evt);
            }
        });

        JBCliFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBCliFechar.setText("Fechar");
        JBCliFechar.setToolTipText("Fechar Tela");
        JBCliFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliFecharActionPerformed(evt);
            }
        });

        JBCliConsultar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBCliConsultar.setText("Consultar");
        JBCliConsultar.setToolTipText("Consultar Cliente");

        JLCliPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLCliPesquisar.setText("Pesquisar:");

        JTFCliPesquisar.setToolTipText("Pesquisar");

        JBCliPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBCliPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBCliPesquisar.setToolTipText("Pesquisar");
        JBCliPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliPesquisarActionPerformed(evt);
            }
        });

        JBCliAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBAlterar1.png"))); // NOI18N
        JBCliAtualizar.setToolTipText("Atualizar");
        JBCliAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBCliFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(JLCliPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBCliAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(JBCliInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCliAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCliExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCliConsultar)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCliInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCliAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCliExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCliConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(JBCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCliPesquisar)
                            .addComponent(JBCliAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JBCliFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-522)/2, 648, 522);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCliExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliExcluirActionPerformed
        int selecionado = JTClientes.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTClientes.setModel(new ModelCliente());
                JTClientes.updateUI();
             }      
        }    
    }//GEN-LAST:event_JBCliExcluirActionPerformed

    private void JBCliInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliInserirActionPerformed
        ViewCliente vc = new ViewCliente(this, true);
        vc.setVisible(true);
        JTClientes.setModel(new ModelCliente());
        JTClientes.updateUI();
    }//GEN-LAST:event_JBCliInserirActionPerformed

    private void JBCliAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliAlterarActionPerformed
        int selecionado = JTClientes.getSelectedRow();
        if (selecionado != -1) {
            Cliente cli = dao.list().get(selecionado);
            ViewCliente vc = new ViewCliente(this, true);
            vc.setEntidade(cli);
            vc.setVisible(true);
            JTClientes.setModel(new ModelCliente());
            JTClientes.updateUI();
        } 
    }//GEN-LAST:event_JBCliAlterarActionPerformed

    private void JBCliFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliFecharActionPerformed
        if (evt.getSource() == JBCliFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Clientes?",
                    "Fechar Cadastro de Clientes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
    }//GEN-LAST:event_JBCliFecharActionPerformed

private void JBCliPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliPesquisarActionPerformed
        String consultar = JTFCliPesquisar.getText();
        JTClientes.setModel(new ModelCliente(consultar));
        JTClientes.updateUI();
}//GEN-LAST:event_JBCliPesquisarActionPerformed

private void JBCliAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliAtualizarActionPerformed
        JTClientes.setModel(new ModelCliente());
        JTClientes.updateUI();
}//GEN-LAST:event_JBCliAtualizarActionPerformed

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCliAlterar;
    private javax.swing.JButton JBCliAtualizar;
    private javax.swing.JButton JBCliConsultar;
    private javax.swing.JButton JBCliExcluir;
    private javax.swing.JButton JBCliFechar;
    private javax.swing.JButton JBCliInserir;
    private javax.swing.JButton JBCliPesquisar;
    private javax.swing.JLabel JLCliPesquisar;
    private javax.swing.JTable JTClientes;
    private javax.swing.JTextField JTFCliPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
