/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboCliente;
import comboboxmodel.ComboFuncionario;
import comboboxmodel.ComboProduto;
import daos.DAOGenerico;
import entidades.Saida;
import javax.swing.JOptionPane;

public class ViewSaida extends javax.swing.JDialog {
    
    private Saida saida;

    public ViewSaida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Saida sai) {
        saida = sai;
        JDCSaiDataSaida.setDate(sai.getSaiDataSaida());
        JCBSaiCliente.setModel(new ComboCliente());
        JCBSaiFuncionario.setModel(new ComboFuncionario());
        JCBSaiProduto.setModel(new ComboProduto());
        JTFSaiQuantidade.setText("" + sai.getItemsaida().getItemsaimerQuantidade());
        JTFSaiValorUnitario.setText("" + sai.getItemsaida().getItemsaimerValorUnitario());
        JTFSaiValorTotal.setText("" + sai.getSaiValor());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBSaiSalvar = new javax.swing.JButton();
        JBSaiCancelar = new javax.swing.JButton();
        JLSaiCliente = new javax.swing.JLabel();
        JLSaiFuncionario = new javax.swing.JLabel();
        JLSaiQuantidade = new javax.swing.JLabel();
        JLSaiProduto = new javax.swing.JLabel();
        JLSaiValorUnitario = new javax.swing.JLabel();
        JLSaiValorTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JTFSaiQuantidade = new javax.swing.JTextField();
        JLSaiDataSaida = new javax.swing.JLabel();
        JCBSaiCliente = new javax.swing.JComboBox();
        JCBSaiFuncionario = new javax.swing.JComboBox();
        JLSaiObservacao = new javax.swing.JLabel();
        JCBSaiProduto = new javax.swing.JComboBox();
        JTFSaiValorUnitario = new javax.swing.JTextField();
        JTFSaiValorTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTASaiObservacao = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        JDCSaiDataSaida = new com.toedter.calendar.JDateChooser();
        JBSaiCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentação de Saída de Mercadorias");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBSaiSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBSaiSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConfirmar.png"))); // NOI18N
        JBSaiSalvar.setText("Salvar");
        JBSaiSalvar.setToolTipText("Salvar ");
        JBSaiSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaiSalvarActionPerformed(evt);
            }
        });

        JBSaiCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBSaiCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelar.png"))); // NOI18N
        JBSaiCancelar.setText("Cancelar");
        JBSaiCancelar.setToolTipText("Cancelar ");
        JBSaiCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaiCancelarActionPerformed(evt);
            }
        });

        JLSaiCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLSaiCliente.setText("Cliente:");

        JLSaiFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiFuncionario.setText("Funcionário:");

        JLSaiQuantidade.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiQuantidade.setText("Quantidade:");

        JLSaiProduto.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiProduto.setText("Produto:");

        JLSaiValorUnitario.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiValorUnitario.setText("Valor Unitário:");

        JLSaiValorTotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiValorTotal.setText("Valor Total:");

        JTFSaiQuantidade.setFont(new java.awt.Font("Arial", 0, 11));

        JLSaiDataSaida.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiDataSaida.setText("Data da Saída:");

        JCBSaiCliente.setModel(new ComboCliente());

        JCBSaiFuncionario.setModel(new ComboFuncionario());

        JLSaiObservacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLSaiObservacao.setText("Observação:");

        JCBSaiProduto.setModel(new ComboProduto());

        JTFSaiValorUnitario.setFont(new java.awt.Font("Arial", 0, 11));

        JTFSaiValorTotal.setFont(new java.awt.Font("Arial", 0, 11));
        JTFSaiValorTotal.setEnabled(false);

        JTASaiObservacao.setColumns(20);
        JTASaiObservacao.setFont(new java.awt.Font("Arial", 2, 11));
        JTASaiObservacao.setLineWrap(true);
        JTASaiObservacao.setRows(4);
        jScrollPane1.setViewportView(JTASaiObservacao);

        JBSaiCalcular.setFont(new java.awt.Font("Tahoma", 1, 11));
        JBSaiCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/calc.png"))); // NOI18N
        JBSaiCalcular.setText("Calcular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JLSaiProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBSaiProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(JBSaiSalvar)
                .addGap(18, 18, 18)
                .addComponent(JBSaiCancelar)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLSaiQuantidade)
                    .addComponent(JLSaiObservacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFSaiQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLSaiValorUnitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFSaiValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLSaiValorTotal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JBSaiCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JTFSaiValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLSaiCliente)
                    .addComponent(JLSaiFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JCBSaiFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCBSaiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JLSaiDataSaida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDCSaiDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSaiCancelar)
                    .addComponent(JBSaiSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JLSaiDataSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JDCSaiDataSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBSaiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLSaiCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLSaiFuncionario)
                            .addComponent(JCBSaiFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSaiProduto)
                    .addComponent(JCBSaiProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSaiQuantidade)
                    .addComponent(JTFSaiQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLSaiValorUnitario)
                    .addComponent(JTFSaiValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLSaiValorTotal)
                    .addComponent(JTFSaiValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLSaiObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSaiCalcular))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-665)/2, (screenSize.height-355)/2, 665, 355);
    }// </editor-fold>//GEN-END:initComponents

private void JBSaiSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaiSalvarActionPerformed
     DAOGenerico<Saida> dao = new DAOGenerico<Saida>(Saida.class);
        
        if (saida == null) {
            Saida sai = new Saida();
            sai.setSaiDataSaida(JDCSaiDataSaida.getDate());
            sai.getCliente().setCliNome(JCBSaiCliente.getSelectedItem().toString());
            sai.getFuncionario().setFunNome(JCBSaiFuncionario.getSelectedItem().toString());
            sai.getItemsaida().getProduto().setProNome(JCBSaiProduto.getSelectedItem().toString());
            sai.getItemsaida().setItemsaimerQuantidade(Integer.parseInt(JTFSaiQuantidade.getText()));
            sai.getItemsaida().setItemsaimerValorUnitario(Double.parseDouble(JTFSaiValorUnitario.getText()));
            sai.setSaiValor(Double.parseDouble(JTFSaiValorTotal.getText()));
            dao.insert(sai);
        } else { 
               saida.setSaiDataSaida(JDCSaiDataSaida.getDate());
               saida.getCliente().setCliNome(JCBSaiCliente.getSelectedItem().toString());
               saida.getFuncionario().setFunNome(JCBSaiFuncionario.getSelectedItem().toString());
               saida.getItemsaida().getProduto().setProNome(JCBSaiProduto.getSelectedItem().toString());
               saida.getItemsaida().setItemsaimerQuantidade(Integer.parseInt(JTFSaiQuantidade.getText()));
               saida.getItemsaida().setItemsaimerValorUnitario(Double.parseDouble(JTFSaiValorUnitario.getText()));
               saida.setSaiValor(Double.parseDouble(JTFSaiValorTotal.getText()));
               dao.update(saida);
            }    
        setVisible(false);
}//GEN-LAST:event_JBSaiSalvarActionPerformed

private void JBSaiCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaiCancelarActionPerformed
      if (evt.getSource() == JBSaiCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Gostaria de Fechar a Movimentação de Saída de Mercadorias?",
                     "Fechar Movimentação de Saída de Mercadorias", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        } 
}//GEN-LAST:event_JBSaiCancelarActionPerformed
     
            public void run() {
               ViewSaida dialogSaida = new ViewSaida(new javax.swing.JFrame(), true);
                dialogSaida.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogSaida.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSaiCalcular;
    private javax.swing.JButton JBSaiCancelar;
    private javax.swing.JButton JBSaiSalvar;
    private javax.swing.JComboBox JCBSaiCliente;
    private javax.swing.JComboBox JCBSaiFuncionario;
    private javax.swing.JComboBox JCBSaiProduto;
    private com.toedter.calendar.JDateChooser JDCSaiDataSaida;
    private javax.swing.JLabel JLSaiCliente;
    private javax.swing.JLabel JLSaiDataSaida;
    private javax.swing.JLabel JLSaiFuncionario;
    private javax.swing.JLabel JLSaiObservacao;
    private javax.swing.JLabel JLSaiProduto;
    private javax.swing.JLabel JLSaiQuantidade;
    private javax.swing.JLabel JLSaiValorTotal;
    private javax.swing.JLabel JLSaiValorUnitario;
    private javax.swing.JTextArea JTASaiObservacao;
    private javax.swing.JTextField JTFSaiQuantidade;
    private javax.swing.JTextField JTFSaiValorTotal;
    private javax.swing.JTextField JTFSaiValorUnitario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}