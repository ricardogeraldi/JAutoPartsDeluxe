/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Grupo;
import javax.swing.JOptionPane;

public class ViewGrupo extends javax.swing.JDialog {
    
    private Grupo grupo;

    public ViewGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Grupo gru) {
        grupo = gru;
        JTAGruDescricao.setText(gru.getGruProdutosDescricao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBGruCriar = new javax.swing.JButton();
        JBGruCancelar = new javax.swing.JButton();
        JLGruDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAGruDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Grupos de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBGruCriar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBGruCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCriar.PNG"))); // NOI18N
        JBGruCriar.setText("Criar Grupo de Produtos");
        JBGruCriar.setToolTipText("Salvar Grupo de Produtos");
        JBGruCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGruCriarActionPerformed(evt);
            }
        });

        JBGruCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBGruCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelarr.png"))); // NOI18N
        JBGruCancelar.setText("Cancelar Grupo de Produtos");
        JBGruCancelar.setToolTipText("Cancelar Grupo de Produtos");
        JBGruCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGruCancelarActionPerformed(evt);
            }
        });

        JLGruDescricao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLGruDescricao.setText("Grupo de Produtos Descrição:");

        JTAGruDescricao.setColumns(20);
        JTAGruDescricao.setFont(new java.awt.Font("Arial", 2, 12));
        JTAGruDescricao.setLineWrap(true);
        JTAGruDescricao.setRows(5);
        jScrollPane1.setViewportView(JTAGruDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBGruCriar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBGruCancelar)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLGruDescricao)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addGap(31, 31, 31)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JLGruDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGruCriar)
                    .addComponent(JBGruCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-519)/2, (screenSize.height-215)/2, 519, 215);
    }// </editor-fold>//GEN-END:initComponents

    private void JBGruCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGruCriarActionPerformed
        DAOGenerico<Grupo> dao = new DAOGenerico<Grupo>(Grupo.class);
        
        if (grupo == null) {
            Grupo gru = new Grupo();
            gru.setGruProdutosDescricao(JTAGruDescricao.getText());
            dao.insert(gru);  
        } else { 
               grupo.setGruProdutosDescricao(JTAGruDescricao.getText());
               dao.update(grupo);
            }    
        setVisible(false);
}//GEN-LAST:event_JBGruCriarActionPerformed

    private void JBGruCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGruCancelarActionPerformed
        if (evt.getSource() == JBGruCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Grupos?",
                     "Fechar Cadastro de Grupos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }  
}//GEN-LAST:event_JBGruCancelarActionPerformed
      
            public void run() {
               ViewGrupo dialogGrupo = new ViewGrupo(new javax.swing.JFrame(), true);
                dialogGrupo.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogGrupo.setVisible(true);
             }  
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGruCancelar;
    private javax.swing.JButton JBGruCriar;
    private javax.swing.JLabel JLGruDescricao;
    private javax.swing.JTextArea JTAGruDescricao;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}