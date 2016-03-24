/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Empresa;
import javax.swing.JOptionPane;
import tablemodels.ModelEmpresa;

public class ViewEmpresaConsulta extends javax.swing.JFrame {

    private DAOGenerico<Empresa> dao;
    
    public ViewEmpresaConsulta() {
        dao = new DAOGenerico<Empresa>(Empresa.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTEmpresas = new javax.swing.JTable();
        JBEmpExcluir = new javax.swing.JButton();
        JBEmpInserir = new javax.swing.JButton();
        JBEmpAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBEmpFechar = new javax.swing.JButton();
        JBEmpConsultar = new javax.swing.JButton();
        JLEmpPesquisar = new javax.swing.JLabel();
        JTFEmpPesquisar = new javax.swing.JTextField();
        JBEmpPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Empresas");
        setName(""); // NOI18N

        JTEmpresas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTEmpresas.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTEmpresas.setModel(new ModelEmpresa());
        JTEmpresas.setToolTipText("Pesquise o nome da empresa");
        JTEmpresas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTEmpresas);

        JBEmpExcluir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBExcluir3.png"))); // NOI18N
        JBEmpExcluir.setText("Excluir");
        JBEmpExcluir.setToolTipText("Excluir Empresa");
        JBEmpExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmpExcluirActionPerformed(evt);
            }
        });

        JBEmpInserir.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBIncluir.png"))); // NOI18N
        JBEmpInserir.setText("Inserir");
        JBEmpInserir.setToolTipText("Inserir Empresa");
        JBEmpInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmpInserirActionPerformed(evt);
            }
        });

        JBEmpAlterar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBAlterar1.png"))); // NOI18N
        JBEmpAlterar.setText("Alterar");
        JBEmpAlterar.setToolTipText("Alterar Empresa");
        JBEmpAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmpAlterarActionPerformed(evt);
            }
        });

        JBEmpFechar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBFechar1.png"))); // NOI18N
        JBEmpFechar.setText("Fechar");
        JBEmpFechar.setToolTipText("Fechar Tela");
        JBEmpFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmpFecharActionPerformed(evt);
            }
        });

        JBEmpConsultar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConsultar.png"))); // NOI18N
        JBEmpConsultar.setText("Consultar");
        JBEmpConsultar.setToolTipText("Consultar Empresa");
        JBEmpConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmpConsultarActionPerformed(evt);
            }
        });

        JLEmpPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpPesquisar.setText("Pesquisar:");

        JTFEmpPesquisar.setToolTipText("Pesquisar");

        JBEmpPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBPesquisar.png"))); // NOI18N
        JBEmpPesquisar.setText("Pesquisar");
        JBEmpPesquisar.setToolTipText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(JBEmpInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEmpAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEmpExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEmpConsultar)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBEmpFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(JLEmpPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFEmpPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBEmpPesquisar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEmpConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEmpExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEmpAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEmpInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEmpFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEmpPesquisar)
                    .addComponent(JTFEmpPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEmpPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-465)/2, 648, 465);
    }// </editor-fold>//GEN-END:initComponents

    private void JBEmpExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmpExcluirActionPerformed
        int selecionado = JTEmpresas.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTEmpresas.setModel(new ModelEmpresa());
                JTEmpresas.updateUI();
             }      
        }    
}//GEN-LAST:event_JBEmpExcluirActionPerformed

    private void JBEmpInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmpInserirActionPerformed
        ViewEmpresa vc = new ViewEmpresa(this, true);
        vc.setVisible(true);
        JTEmpresas.setModel(new ModelEmpresa());
        JTEmpresas.updateUI();
}//GEN-LAST:event_JBEmpInserirActionPerformed

    private void JBEmpAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmpAlterarActionPerformed
        int selecionado = JTEmpresas.getSelectedRow();
        if (selecionado != -1) {
            Empresa emp = dao.list().get(selecionado);
            ViewEmpresa vc = new ViewEmpresa(this, true);
            vc.setEntidade(emp);
            vc.setVisible(true);
            JTEmpresas.setModel(new ModelEmpresa());
            JTEmpresas.updateUI();
        } 
}//GEN-LAST:event_JBEmpAlterarActionPerformed

    private void JBEmpFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmpFecharActionPerformed
        if (evt.getSource() == JBEmpFechar) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Empresas?",
                    "Fechar Cadastro de Empresas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
}//GEN-LAST:event_JBEmpFecharActionPerformed

private void JBEmpConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmpConsultarActionPerformed
        int selecionado = JTEmpresas.getSelectedRow();
        Empresa emp = dao.list().get(selecionado);
        ViewEmpresa vc = new ViewEmpresa(this, true);
        vc.setEntidade(emp);
        vc.setVisible(true);
}//GEN-LAST:event_JBEmpConsultarActionPerformed
           
            public void run() {
                new ViewEmpresaConsulta().setVisible(true);
            } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEmpAlterar;
    private javax.swing.JButton JBEmpConsultar;
    private javax.swing.JButton JBEmpExcluir;
    private javax.swing.JButton JBEmpFechar;
    private javax.swing.JButton JBEmpInserir;
    private javax.swing.JButton JBEmpPesquisar;
    private javax.swing.JLabel JLEmpPesquisar;
    private javax.swing.JTable JTEmpresas;
    private javax.swing.JTextField JTFEmpPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
