/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Estado;
import javax.swing.JOptionPane;

public class ViewEstado extends javax.swing.JDialog {
    
    private Estado estado;

    public ViewEstado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Estado est) {
        estado = est;
        JTFEstNome.setText(est.getEstNome());
        JTFEstSigla.setText(est.getEstSigla());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBEstSalvar = new javax.swing.JButton();
        JBEstCancelar = new javax.swing.JButton();
        JLEstNome = new javax.swing.JLabel();
        JTFEstNome = new javax.swing.JTextField();
        JLEstSigla = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JTFEstSigla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBEstSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEstSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConfirmar.png"))); // NOI18N
        JBEstSalvar.setText("Salvar Estado");
        JBEstSalvar.setToolTipText("Salvar Estado");
        JBEstSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstSalvarActionPerformed(evt);
            }
        });

        JBEstCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEstCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelar.png"))); // NOI18N
        JBEstCancelar.setText("Cancelar Estado");
        JBEstCancelar.setToolTipText("Cancelar Estado");
        JBEstCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstCancelarActionPerformed(evt);
            }
        });

        JLEstNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEstNome.setText("Nome:");

        JTFEstNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFEstNome.setToolTipText("Nome do Estado");

        JLEstSigla.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEstSigla.setText("Sigla:");

        JTFEstSigla.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFEstSigla.setToolTipText("Sigla do Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLEstNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFEstNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JLEstSigla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFEstSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(JBEstSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(JBEstCancelar)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEstSalvar)
                    .addComponent(JBEstCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEstNome)
                    .addComponent(JTFEstNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEstSigla)
                    .addComponent(JTFEstSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-384)/2, (screenSize.height-169)/2, 384, 169);
    }// </editor-fold>//GEN-END:initComponents

    private void JBEstSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstSalvarActionPerformed
        DAOGenerico<Estado> dao = new DAOGenerico<Estado>(Estado.class);
        
        if (estado == null) {
            Estado est = new Estado();
            est.setEstNome(JTFEstNome.getText());
            est.setEstSigla(JTFEstSigla.getText());
            dao.insert(est);
        } else { 
               estado.setEstNome(JTFEstNome.getText());
               estado.setEstSigla(JTFEstSigla.getText());
               dao.update(estado);
            }    
        setVisible(false);
}//GEN-LAST:event_JBEstSalvarActionPerformed

    private void JBEstCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstCancelarActionPerformed
        if (evt.getSource() == JBEstCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Estados?",
                     "Fechar Cadastro de Estados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }  
}//GEN-LAST:event_JBEstCancelarActionPerformed
      
            public void run() {
               ViewEstado dialogEstado = new ViewEstado(new javax.swing.JFrame(), true);
                dialogEstado.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogEstado.setVisible(true);
             }  
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEstCancelar;
    private javax.swing.JButton JBEstSalvar;
    private javax.swing.JLabel JLEstNome;
    private javax.swing.JLabel JLEstSigla;
    private javax.swing.JTextField JTFEstNome;
    private javax.swing.JTextField JTFEstSigla;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}