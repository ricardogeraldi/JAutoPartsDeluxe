/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import daos.DAOGenerico;
import entidades.Veiculo;
import javax.swing.JOptionPane;

public class ViewVeiculo extends javax.swing.JDialog {
    
    private Veiculo veiculo;

    public ViewVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Veiculo vei) {
        veiculo = vei;
        JDCVeiDataCadastro.setDate(vei.getVeiDataCadastro());
        JTFVeiTipo.setText(vei.getVeiTipoVeiculo());
        JDCVeiAnoFabricacao.setDate(vei.getVeiAnoFabricacao());
        JTFVeiMarca.setText(vei.getVeiMarca());
        JTFVeiModelo.setText(vei.getVeiModelo());
        JTFVeiCombustivel.setText(vei.getVeiCombustivel());
        JTFVeiCor.setText(vei.getVeiCor());
        JTAVeiObservacao.setText(vei.getVeiObservacao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBVeiSalvar = new javax.swing.JButton();
        JBVeiCancelar = new javax.swing.JButton();
        JLVeiNome = new javax.swing.JLabel();
        JTFVeiTipo = new javax.swing.JTextField();
        JLVeiMarca = new javax.swing.JLabel();
        JLVeiModelo = new javax.swing.JLabel();
        JTFVeiMarca = new javax.swing.JTextField();
        JTFVeiModelo = new javax.swing.JTextField();
        JLVeiDataCadastro = new javax.swing.JLabel();
        JLVeiCor = new javax.swing.JLabel();
        JLVeiObservacao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JTFVeiCor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAVeiObservacao = new javax.swing.JTextArea();
        JLVeiAnoFabricacao = new javax.swing.JLabel();
        JLVeiCor1 = new javax.swing.JLabel();
        JTFVeiCombustivel = new javax.swing.JTextField();
        JDCVeiDataCadastro = new com.toedter.calendar.JDateChooser();
        JDCVeiAnoFabricacao = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBVeiSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBVeiSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConfirmar.png"))); // NOI18N
        JBVeiSalvar.setText("Salvar");
        JBVeiSalvar.setToolTipText("Salvar Veículo");
        JBVeiSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVeiSalvarActionPerformed(evt);
            }
        });

        JBVeiCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBVeiCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelar.png"))); // NOI18N
        JBVeiCancelar.setText("Cancelar");
        JBVeiCancelar.setToolTipText("Cancelar Veículo");
        JBVeiCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVeiCancelarActionPerformed(evt);
            }
        });

        JLVeiNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiNome.setText("Tipo Veículo:");

        JTFVeiTipo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFVeiTipo.setToolTipText("");

        JLVeiMarca.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiMarca.setText("Marca:");

        JLVeiModelo.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiModelo.setText("Modelo:");

        JTFVeiMarca.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFVeiMarca.setToolTipText("");

        JTFVeiModelo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JTFVeiModelo.setToolTipText("");

        JLVeiDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiDataCadastro.setText("Data Cadastro:");

        JLVeiCor.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiCor.setText("Cor:");

        JLVeiObservacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiObservacao.setText("Observação:");

        JTFVeiCor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        JTAVeiObservacao.setColumns(20);
        JTAVeiObservacao.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        JTAVeiObservacao.setLineWrap(true);
        JTAVeiObservacao.setRows(4);
        jScrollPane1.setViewportView(JTAVeiObservacao);

        JLVeiAnoFabricacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiAnoFabricacao.setText("Ano de Fabricação:");

        JLVeiCor1.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLVeiCor1.setText("Combustível:");

        JTFVeiCombustivel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLVeiDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCVeiDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLVeiObservacao)
                            .addComponent(JLVeiModelo)
                            .addComponent(JLVeiMarca)
                            .addComponent(JLVeiNome)
                            .addComponent(JLVeiCor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFVeiCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(JLVeiCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFVeiCor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFVeiModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFVeiMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFVeiTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLVeiAnoFabricacao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCVeiAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(JBVeiSalvar)
                .addGap(18, 18, 18)
                .addComponent(JBVeiCancelar)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVeiSalvar)
                    .addComponent(JBVeiCancelar))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLVeiDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JDCVeiDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLVeiNome)
                            .addComponent(JTFVeiTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLVeiAnoFabricacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLVeiMarca)
                            .addComponent(JTFVeiMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLVeiModelo)
                            .addComponent(JTFVeiModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JDCVeiAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLVeiCor1)
                    .addComponent(JTFVeiCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLVeiCor)
                    .addComponent(JTFVeiCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLVeiObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-596)/2, (screenSize.height-306)/2, 596, 306);
    }// </editor-fold>//GEN-END:initComponents

private void JBVeiCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVeiCancelarActionPerformed
      if (evt.getSource() == JBVeiCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Veículos?",
                     "Fechar Cadastro de Veículos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        } 
}//GEN-LAST:event_JBVeiCancelarActionPerformed

private void JBVeiSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVeiSalvarActionPerformed
      DAOGenerico<Veiculo> dao = new DAOGenerico<Veiculo>(Veiculo.class);
        
        if (veiculo == null) {
            Veiculo vei = new Veiculo();
            vei.setVeiDataCadastro(JDCVeiDataCadastro.getDate());
            vei.setVeiTipoVeiculo(JTFVeiTipo.getText());
            vei.setVeiAnoFabricacao(JDCVeiAnoFabricacao.getDate());
            vei.setVeiMarca(JTFVeiMarca.getText());
            vei.setVeiModelo(JTFVeiModelo.getText());
            vei.setVeiCombustivel(JTFVeiCombustivel.getText());
            vei.setVeiCor(JTFVeiCor.getText());
            vei.setVeiObservacao(JTAVeiObservacao.getText());
            dao.insert(vei);  
        } else { 
               veiculo.setVeiDataCadastro(JDCVeiDataCadastro.getDate());
               veiculo.setVeiTipoVeiculo(JTFVeiTipo.getText());
               veiculo.setVeiAnoFabricacao(JDCVeiAnoFabricacao.getDate());
               veiculo.setVeiMarca(JTFVeiMarca.getText());
               veiculo.setVeiModelo(JTFVeiModelo.getText());
               veiculo.setVeiCombustivel(JTFVeiCombustivel.getText());
               veiculo.setVeiCor(JTFVeiCor.getText());
               veiculo.setVeiObservacao(JTAVeiObservacao.getText());
               dao.update(veiculo);
            }    
        setVisible(false);   
}//GEN-LAST:event_JBVeiSalvarActionPerformed
     
            public void run() {
               ViewVeiculo dialogVeiculo = new ViewVeiculo(new javax.swing.JFrame(), true);
                dialogVeiculo.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogVeiculo.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBVeiCancelar;
    private javax.swing.JButton JBVeiSalvar;
    private com.toedter.calendar.JDateChooser JDCVeiAnoFabricacao;
    private com.toedter.calendar.JDateChooser JDCVeiDataCadastro;
    private javax.swing.JLabel JLVeiAnoFabricacao;
    private javax.swing.JLabel JLVeiCor;
    private javax.swing.JLabel JLVeiCor1;
    private javax.swing.JLabel JLVeiDataCadastro;
    private javax.swing.JLabel JLVeiMarca;
    private javax.swing.JLabel JLVeiModelo;
    private javax.swing.JLabel JLVeiNome;
    private javax.swing.JLabel JLVeiObservacao;
    private javax.swing.JTextArea JTAVeiObservacao;
    private javax.swing.JTextField JTFVeiCombustivel;
    private javax.swing.JTextField JTFVeiCor;
    private javax.swing.JTextField JTFVeiMarca;
    private javax.swing.JTextField JTFVeiModelo;
    private javax.swing.JTextField JTFVeiTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}