/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import javax.swing.JOptionPane;
import util.Criptografia;

public class ViewLogin extends javax.swing.JFrame {
    
    public ViewLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLLogin = new javax.swing.JLabel();
        JLSenha = new javax.swing.JLabel();
        JTLogin = new javax.swing.JTextField();
        JBEntrar = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JLLogoLogin = new javax.swing.JLabel();
        JTSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acessar o Sistema");

        JLLogin.setFont(new java.awt.Font("Tahoma", 1, 12));
        JLLogin.setText("Login:");

        JLSenha.setFont(new java.awt.Font("Tahoma", 1, 12));
        JLSenha.setText("Senha:");

        JTLogin.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        JTLogin.setToolTipText("Digite seu Login");
        JTLogin.setMinimumSize(new java.awt.Dimension(67, 28));

        JBEntrar.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        JBEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBEntrar1.png"))); // NOI18N
        JBEntrar.setText("Entrar");
        JBEntrar.setToolTipText("Entrar no Sistema");
        JBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntrarActionPerformed(evt);
            }
        });

        JBSair.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        JBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBCancelar1.png"))); // NOI18N
        JBSair.setText("Sair");
        JBSair.setToolTipText("Sair do Sistema");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        JLLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/logoLogin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLLogoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLLogoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );

        JTSenha.setFont(new java.awt.Font("Tahoma", 0, 18));
        JTSenha.setToolTipText("Digite sua Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLLogin)
                            .addComponent(JLSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBEntrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBSair)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLLogin)
                            .addComponent(JTLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLSenha)
                            .addComponent(JTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBSair)
                            .addComponent(JBEntrar))
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void JBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntrarActionPerformed
           String usuSenha = Criptografia.usuSenha(JTSenha.getPassword());
           JOptionPane.showMessageDialog(null,"Seja Bem-Vindo");
        
           TelaPrincipal telaprincipal = new TelaPrincipal();
           dispose();
}//GEN-LAST:event_JBEntrarActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
}//GEN-LAST:event_JBSairActionPerformed

        public void run() {
             new ViewLogin().setVisible(true);
        }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEntrar;
    private javax.swing.JButton JBSair;
    private javax.swing.JLabel JLLogin;
    private javax.swing.JLabel JLLogoLogin;
    private javax.swing.JLabel JLSenha;
    private javax.swing.JTextField JTLogin;
    private javax.swing.JPasswordField JTSenha;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 
}
