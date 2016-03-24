/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Funcionario;
import javax.swing.JOptionPane;

public class ViewFuncionario extends javax.swing.JDialog {
    
    private Funcionario funcionario;

    public ViewFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Funcionario fun) {
        funcionario = fun;
        JTFFunNome.setText(fun.getFunNome());
        JTFFunCargo.setText(fun.getFunCargo());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBFunCriar = new javax.swing.JButton();
        JBFunCancelar = new javax.swing.JButton();
        JLFunNome = new javax.swing.JLabel();
        JTFFunNome = new javax.swing.JTextField();
        JLFunCargo = new javax.swing.JLabel();
        JTFFunCargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBFunCriar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBFunCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCriar.PNG"))); // NOI18N
        JBFunCriar.setText("Criar Funcionário");
        JBFunCriar.setToolTipText("Salvar Funcionário");
        JBFunCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFunCriarActionPerformed(evt);
            }
        });

        JBFunCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBFunCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelarr.png"))); // NOI18N
        JBFunCancelar.setText("Cancelar Funcionário");
        JBFunCancelar.setToolTipText("Cancelar Funcionário");
        JBFunCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFunCancelarActionPerformed(evt);
            }
        });

        JLFunNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLFunNome.setText("Nome:");

        JTFFunNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFFunNome.setToolTipText("Nome do Funcionário");

        JLFunCargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLFunCargo.setText("Cargo:");

        JTFFunCargo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFFunCargo.setToolTipText("Cargo do Funcionário");

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
                                .addComponent(JLFunNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFFunNome, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLFunCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFFunCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(JBFunCriar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBFunCancelar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFunNome)
                    .addComponent(JTFFunNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFunCargo)
                    .addComponent(JTFFunCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFunCriar)
                    .addComponent(JBFunCancelar))
                .addGap(22, 22, 22))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-439)/2, (screenSize.height-179)/2, 439, 179);
    }// </editor-fold>//GEN-END:initComponents

    private void JBFunCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFunCriarActionPerformed
        DAOGenerico<Funcionario> dao = new DAOGenerico<Funcionario>(Funcionario.class);
        
        if (funcionario == null) {
            Funcionario fun = new Funcionario();
            fun.setFunNome(JTFFunNome.getText());
            fun.setFunCargo(JTFFunCargo.getText());
            dao.insert(fun);  
        } else { 
               funcionario.setFunNome(JTFFunNome.getText());
               funcionario.setFunCargo(JTFFunCargo.getText());
               dao.update(funcionario);
            }    
        setVisible(false);
    }//GEN-LAST:event_JBFunCriarActionPerformed

    private void JBFunCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFunCancelarActionPerformed
        if (evt.getSource() == JBFunCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Funcionários?",
                     "Fechar Cadastro de Funcionários", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }  
    }//GEN-LAST:event_JBFunCancelarActionPerformed
      
            public void run() {
               ViewFuncionario dialogFuncionario = new ViewFuncionario(new javax.swing.JFrame(), true);
                dialogFuncionario.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogFuncionario.setVisible(true);
             }  
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBFunCancelar;
    private javax.swing.JButton JBFunCriar;
    private javax.swing.JLabel JLFunCargo;
    private javax.swing.JLabel JLFunNome;
    private javax.swing.JTextField JTFFunCargo;
    private javax.swing.JTextField JTFFunNome;
    // End of variables declaration//GEN-END:variables
    
}