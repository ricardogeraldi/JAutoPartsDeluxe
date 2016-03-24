/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboEstado;
import daos.DAOGenerico;
import entidades.Cidade;
import entidades.Estado;
import javax.swing.JOptionPane;


public class ViewCidade extends javax.swing.JDialog {
    
    private Cidade cidade;

    public ViewCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Cidade cid) {
        cidade = cid;
        JTFCidNome.setText(cid.getCidNome());
        JCBCidEstado.setModel(new ComboEstado());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBCidSalvar = new javax.swing.JButton();
        JBCidCancelar = new javax.swing.JButton();
        JLCidNome = new javax.swing.JLabel();
        JTFCidNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        JLCidEstado = new javax.swing.JLabel();
        JCBCidEstado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBCidSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCidSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConfirmar.png"))); // NOI18N
        JBCidSalvar.setText("Salvar Cidade");
        JBCidSalvar.setToolTipText("Salvar Cidade");
        JBCidSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCidSalvarActionPerformed(evt);
            }
        });

        JBCidCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCidCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelar.png"))); // NOI18N
        JBCidCancelar.setText("Cancelar Cidade");
        JBCidCancelar.setToolTipText("Cancelar Cidade");
        JBCidCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCidCancelarActionPerformed(evt);
            }
        });

        JLCidNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCidNome.setText("Nome:");

        JTFCidNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFCidNome.setToolTipText("Nome da Cidade");

        JLCidEstado.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCidEstado.setText("Estado:");

        JCBCidEstado.setModel(new ComboEstado());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(JBCidSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(JBCidCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLCidEstado)
                            .addComponent(JLCidNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFCidNome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBCidEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCidSalvar)
                    .addComponent(JBCidCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCidNome)
                    .addComponent(JTFCidNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCidEstado)
                    .addComponent(JCBCidEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-384)/2, (screenSize.height-169)/2, 384, 169);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCidSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCidSalvarActionPerformed
        DAOGenerico<Cidade> dao = new DAOGenerico<Cidade>(Cidade.class);
        
        if (cidade == null) {
            Cidade cid = new Cidade();
                cid.setCidNome(JTFCidNome.getText());
                cid.setEstado((Estado) JCBCidEstado.getSelectedItem());
                dao.insert(cid);  
        } else {  
                cidade.setCidNome(JTFCidNome.getText());
                cidade.setEstado((Estado) JCBCidEstado.getSelectedItem());
                dao.update(cidade);
            }    
        setVisible(false);
}//GEN-LAST:event_JBCidSalvarActionPerformed

    private void JBCidCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCidCancelarActionPerformed
        if (evt.getSource() == JBCidCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Cidades?",
                     "Fechar Cadastro de Cidades", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }  
}//GEN-LAST:event_JBCidCancelarActionPerformed
      
            public void run() {
               ViewCidade dialogCidade = new ViewCidade(new javax.swing.JFrame(), true);
                dialogCidade.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogCidade.setVisible(true);
             }  
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCidCancelar;
    private javax.swing.JButton JBCidSalvar;
    private javax.swing.JComboBox JCBCidEstado;
    private javax.swing.JLabel JLCidEstado;
    private javax.swing.JLabel JLCidNome;
    private javax.swing.JTextField JTFCidNome;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}