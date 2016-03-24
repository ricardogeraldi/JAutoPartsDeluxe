/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Usuario;
import javax.swing.JOptionPane;
import util.Criptografia;

public class ViewUsuario extends javax.swing.JDialog {
    
    private Usuario usuario;

    public ViewUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Usuario usu) {
        usuario = usu;
        JTFUsuNome.setText(usu.getUsuNome());
        JTFUsuLogin.setText(usu.getUsuLogin());
        JTFUsuSenha.setText(usu.getUsuSenha());
        //JTFUsuPrivilegio.setText(usu.getPrivilegioToString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBUsuCriar = new javax.swing.JButton();
        JBUsuCancelar = new javax.swing.JButton();
        JLUsuNome = new javax.swing.JLabel();
        JTFUsuNome = new javax.swing.JTextField();
        JLUsuLogin = new javax.swing.JLabel();
        JLUsuSenha = new javax.swing.JLabel();
        JLUsuPrivilegio = new javax.swing.JLabel();
        JTFUsuLogin = new javax.swing.JTextField();
        JTFUsuSenha = new javax.swing.JTextField();
        JTFUsuPrivilegio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBUsuCriar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBUsuCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCriar.PNG"))); // NOI18N
        JBUsuCriar.setText("Criar Usuário");
        JBUsuCriar.setToolTipText("Salvar Usuário");
        JBUsuCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuCriarActionPerformed(evt);
            }
        });

        JBUsuCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBUsuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelarr.png"))); // NOI18N
        JBUsuCancelar.setText("Cancelar Usuário");
        JBUsuCancelar.setToolTipText("Cancelar Usuário");
        JBUsuCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuCancelarActionPerformed(evt);
            }
        });

        JLUsuNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLUsuNome.setText("Nome:");

        JTFUsuNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFUsuNome.setToolTipText("Nome do Usuário");

        JLUsuLogin.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLUsuLogin.setText("Login:");

        JLUsuSenha.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLUsuSenha.setText("Senha:");

        JLUsuPrivilegio.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLUsuPrivilegio.setText("Privilégio:");

        JTFUsuLogin.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFUsuLogin.setToolTipText("Login do Usuário");

        JTFUsuSenha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFUsuSenha.setToolTipText("Senha do Usuário");

        JTFUsuPrivilegio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFUsuPrivilegio.setToolTipText("Privilégio do Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(JBUsuCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBUsuCancelar)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLUsuLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLUsuNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLUsuSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLUsuPrivilegio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFUsuPrivilegio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JTFUsuLogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JTFUsuSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTFUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLUsuNome)
                    .addComponent(JTFUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLUsuLogin)
                    .addComponent(JTFUsuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLUsuSenha)
                    .addComponent(JTFUsuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLUsuPrivilegio)
                    .addComponent(JTFUsuPrivilegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUsuCriar)
                    .addComponent(JBUsuCancelar))
                .addGap(22, 22, 22))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-381)/2, (screenSize.height-226)/2, 381, 226);
    }// </editor-fold>//GEN-END:initComponents

    private void JBUsuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuCancelarActionPerformed
        if (evt.getSource() == JBUsuCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Usuários?",
                     "Fechar Cadastro de Usuários", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }    
}//GEN-LAST:event_JBUsuCancelarActionPerformed

    private void JBUsuCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuCriarActionPerformed
        DAOGenerico<Usuario> dao = new DAOGenerico<Usuario>(Usuario.class);
        
        if (usuario == null) {
            Usuario usu = new Usuario();
            usu.setUsuNome(JTFUsuNome.getText());
            usu.setUsuLogin(JTFUsuLogin.getText());
            usu.setUsuSenha(Criptografia.usuSenha(JTFUsuSenha.getText()));
            //usu.setUsuPrivilegio(JTFUsuPrivilegio.getText());
            dao.insert(usu);  
        } else { 
               usuario.setUsuNome(JTFUsuNome.getText());
               usuario.setUsuLogin(JTFUsuLogin.getText());
               usuario.setUsuSenha(Criptografia.usuSenha(JTFUsuSenha.getText()));
               //usuario.setUsuPrivilegio(JTFUsuPrivilegio.
               dao.update(usuario);
            }    
        setVisible(false);
}//GEN-LAST:event_JBUsuCriarActionPerformed
     
            public void run() {
               ViewUsuario dialogUsuario = new ViewUsuario(new javax.swing.JFrame(), true);
                dialogUsuario.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogUsuario.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBUsuCancelar;
    private javax.swing.JButton JBUsuCriar;
    private javax.swing.JLabel JLUsuLogin;
    private javax.swing.JLabel JLUsuNome;
    private javax.swing.JLabel JLUsuPrivilegio;
    private javax.swing.JLabel JLUsuSenha;
    private javax.swing.JTextField JTFUsuLogin;
    private javax.swing.JTextField JTFUsuNome;
    private javax.swing.JTextField JTFUsuPrivilegio;
    private javax.swing.JTextField JTFUsuSenha;
    // End of variables declaration//GEN-END:variables
    
}