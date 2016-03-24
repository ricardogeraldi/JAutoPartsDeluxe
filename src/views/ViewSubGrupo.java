/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboGrupo;
import daos.DAOGenerico;
import entidades.Grupo;
import entidades.SubGrupo;
import javax.swing.JOptionPane;

public class ViewSubGrupo extends javax.swing.JDialog {
    
    private SubGrupo subgrupo;

    public ViewSubGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(SubGrupo subgru) {
        subgrupo = subgru;
        JTASubGruDescricao.setText(subgru.getSubgruProdutosDescricao());
        JCBSubGruGrupoDescricao.setModel(new ComboGrupo());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBSubGruCriar = new javax.swing.JButton();
        JBSubGruCancelar = new javax.swing.JButton();
        JLSubGruDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTASubGruDescricao = new javax.swing.JTextArea();
        JLSubGruGrupoDescricao = new javax.swing.JLabel();
        JCBSubGruGrupoDescricao = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Sub-Grupos de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBSubGruCriar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSubGruCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCriar.PNG"))); // NOI18N
        JBSubGruCriar.setText("Criar Sub-Grupo");
        JBSubGruCriar.setToolTipText("Salvar Sub-Grupo");
        JBSubGruCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSubGruCriarActionPerformed(evt);
            }
        });

        JBSubGruCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBSubGruCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelarr.png"))); // NOI18N
        JBSubGruCancelar.setText("Cancelar Sub-Grupo");
        JBSubGruCancelar.setToolTipText("Cancelar Sub-Grupo");
        JBSubGruCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSubGruCancelarActionPerformed(evt);
            }
        });

        JLSubGruDescricao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSubGruDescricao.setText("Sub-Grupo de Produtos Descrição:");

        JTASubGruDescricao.setColumns(20);
        JTASubGruDescricao.setFont(new java.awt.Font("Tahoma", 0, 11));
        JTASubGruDescricao.setLineWrap(true);
        JTASubGruDescricao.setRows(5);
        jScrollPane1.setViewportView(JTASubGruDescricao);

        JLSubGruGrupoDescricao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSubGruGrupoDescricao.setText("Grupo Produtos Descrição:");

        JCBSubGruGrupoDescricao.setModel(new ComboGrupo());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLSubGruDescricao)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JLSubGruGrupoDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JCBSubGruGrupoDescricao, 0, 448, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBSubGruCriar)
                        .addGap(18, 18, 18)
                        .addComponent(JBSubGruCancelar)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JLSubGruDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(JLSubGruGrupoDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBSubGruGrupoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSubGruCancelar)
                    .addComponent(JBSubGruCriar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-519)/2, (screenSize.height-303)/2, 519, 303);
    }// </editor-fold>//GEN-END:initComponents

    private void JBSubGruCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSubGruCriarActionPerformed
        DAOGenerico<SubGrupo> dao = new DAOGenerico<SubGrupo>(SubGrupo.class);
        
        if (subgrupo == null) {
            SubGrupo subgru = new SubGrupo();
            subgru.setSubgruProdutosDescricao(JTASubGruDescricao.getText());
            subgru.setGrupo((Grupo)JCBSubGruGrupoDescricao.getSelectedItem());
            dao.insert(subgru);  
        } else { 
               subgrupo.setSubgruProdutosDescricao(JTASubGruDescricao.getText());
               subgrupo.setGrupo((Grupo)JCBSubGruGrupoDescricao.getSelectedItem());
               dao.update(subgrupo);
            }    
        setVisible(false);
}//GEN-LAST:event_JBSubGruCriarActionPerformed

    private void JBSubGruCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSubGruCancelarActionPerformed
        if (evt.getSource() == JBSubGruCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Sub-Grupos?",
                     "Fechar Cadastro de Sub-Grupos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }  
}//GEN-LAST:event_JBSubGruCancelarActionPerformed
      
            public void run() {
               ViewSubGrupo dialogSubGrupo = new ViewSubGrupo(new javax.swing.JFrame(), true);
                dialogSubGrupo.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogSubGrupo.setVisible(true);
             }  
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSubGruCancelar;
    private javax.swing.JButton JBSubGruCriar;
    private javax.swing.JComboBox JCBSubGruGrupoDescricao;
    private javax.swing.JLabel JLSubGruDescricao;
    private javax.swing.JLabel JLSubGruGrupoDescricao;
    private javax.swing.JTextArea JTASubGruDescricao;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}