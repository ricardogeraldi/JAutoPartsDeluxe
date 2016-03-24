/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboFornecedor;
import comboboxmodel.ComboFuncionario;
import comboboxmodel.ComboProduto;
import daos.DAOGenerico;
import entidades.Entrada;
import entidades.Fornecedor;
import entidades.Funcionario;
import entidades.Produto;
import javax.swing.JOptionPane;

public class ViewEntrada extends javax.swing.JDialog {
    
    private Entrada entrada;

    public ViewEntrada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Entrada ent) {
        entrada = ent;
        JDCEntDataEntrada.setDate(ent.getEntDataEntrada());
        JCBEntFornecedor.setModel(new ComboFornecedor());
        JCBEntFuncionario.setModel(new ComboFuncionario());
        JCBEntProduto.setModel(new ComboProduto());
        JTFEntQuantidade.setText("" + ent.getItemEntrada().getItementmerQuantidade());
        //JTFEntValorUnitario.setText("" + ent.getItemEntrada().getItementmerValorUnitario());
        //JTFEntValorTotal.setText("" + ent.getEntValor());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBEntSalvar = new javax.swing.JButton();
        JBEntCancelar = new javax.swing.JButton();
        JLEntFornecedor = new javax.swing.JLabel();
        JLEntFuncionario = new javax.swing.JLabel();
        JLEntQuantidade = new javax.swing.JLabel();
        JLEntProduto = new javax.swing.JLabel();
        JLEntValorUnitario = new javax.swing.JLabel();
        JLEntValorTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JTFEntQuantidade = new javax.swing.JTextField();
        JLEntDataEntrada = new javax.swing.JLabel();
        JCBEntFornecedor = new javax.swing.JComboBox();
        JCBEntFuncionario = new javax.swing.JComboBox();
        JLEntObservacao = new javax.swing.JLabel();
        JCBEntProduto = new javax.swing.JComboBox();
        JTFEntValorUnitario = new javax.swing.JTextField();
        JTFEntValorTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAEntObservacao = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        JDCEntDataEntrada = new com.toedter.calendar.JDateChooser();
        JBEntCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentação de Entrada de Mercadorias");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBEntSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEntSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConfirmar.png"))); // NOI18N
        JBEntSalvar.setText("Salvar");
        JBEntSalvar.setToolTipText("Salvar ");
        JBEntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntSalvarActionPerformed(evt);
            }
        });

        JBEntCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelar.png"))); // NOI18N
        JBEntCancelar.setText("Cancelar");
        JBEntCancelar.setToolTipText("Cancelar ");
        JBEntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntCancelarActionPerformed(evt);
            }
        });

        JLEntFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntFornecedor.setText("Fornecedor:");

        JLEntFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntFuncionario.setText("Funcionário:");

        JLEntQuantidade.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntQuantidade.setText("Quantidade:");

        JLEntProduto.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntProduto.setText("Produto:");

        JLEntValorUnitario.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntValorUnitario.setText("Valor Unitário:");

        JLEntValorTotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntValorTotal.setText("Valor Total:");

        JTFEntQuantidade.setFont(new java.awt.Font("Arial", 0, 11));

        JLEntDataEntrada.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntDataEntrada.setText("Data da Entrada:");

        JCBEntFornecedor.setModel(new ComboFornecedor());

        JCBEntFuncionario.setModel(new ComboFuncionario());

        JLEntObservacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEntObservacao.setText("Observação:");

        JCBEntProduto.setModel(new ComboProduto());

        JTFEntValorUnitario.setFont(new java.awt.Font("Arial", 0, 11));

        JTFEntValorTotal.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        JTAEntObservacao.setColumns(20);
        JTAEntObservacao.setFont(new java.awt.Font("Arial", 2, 11));
        JTAEntObservacao.setLineWrap(true);
        JTAEntObservacao.setRows(4);
        jScrollPane1.setViewportView(JTAEntObservacao);

        JBEntCalcular.setFont(new java.awt.Font("Tahoma", 1, 11));
        JBEntCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/calc.png"))); // NOI18N
        JBEntCalcular.setText("Calcular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JLEntProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBEntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLEntFornecedor)
                    .addComponent(JLEntFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JCBEntFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCBEntFornecedor, 0, 323, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLEntDataEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDCEntDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(JBEntSalvar)
                .addGap(18, 18, 18)
                .addComponent(JBEntCancelar)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLEntQuantidade)
                    .addComponent(JLEntObservacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFEntQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLEntValorUnitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFEntValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLEntValorTotal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JBEntCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JTFEntValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEntCancelar)
                    .addComponent(JBEntSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBEntFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLEntFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEntFuncionario)
                            .addComponent(JCBEntFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JLEntDataEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JDCEntDataEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEntProduto)
                    .addComponent(JCBEntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEntQuantidade)
                    .addComponent(JTFEntQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEntValorUnitario)
                    .addComponent(JTFEntValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEntValorTotal)
                    .addComponent(JTFEntValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLEntObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEntCalcular))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-665)/2, (screenSize.height-355)/2, 665, 355);
    }// </editor-fold>//GEN-END:initComponents

private void JBEntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntSalvarActionPerformed
     DAOGenerico<Entrada> dao = new DAOGenerico<Entrada>(Entrada.class);
        
        if (entrada == null) {
            Entrada ent = new Entrada();
            ent.setEntDataEntrada(JDCEntDataEntrada.getDate());
            ent.setFornecedor((Fornecedor) JCBEntFornecedor.getSelectedItem());
            ent.setFuncionario((Funcionario) JCBEntFuncionario.getSelectedItem());
            ent.getItemEntrada().setProduto((Produto) JCBEntProduto.getSelectedItem());
            ent.getItemEntrada().setItementmerQuantidade(Integer.parseInt(JTFEntQuantidade.getText()));
            //ent.getItemEntrada().setItementmerValorUnitario(Double.parseDouble(JTFEntValorUnitario.getText()));
            //ent.setEntValor(Double.parseDouble(JTFEntValorTotal.getText()));
            dao.insert(ent);
        } else { 
               entrada.setEntDataEntrada(JDCEntDataEntrada.getDate());
               entrada.setFornecedor((Fornecedor) JCBEntFornecedor.getSelectedItem());
               entrada.setFuncionario((Funcionario) JCBEntFuncionario.getSelectedItem());
               entrada.getItemEntrada().setProduto((Produto) JCBEntProduto.getSelectedItem());
               entrada.getItemEntrada().setItementmerQuantidade(Integer.parseInt(JTFEntQuantidade.getText()));
               //entrada.getItemEntrada().setItementmerValorUnitario(Double.parseDouble(JTFEntValorUnitario.getText()));
               //entrada.setEntValor(Double.parseDouble(JTFEntValorTotal.getText()));
               dao.update(entrada);
            }    
        setVisible(false);
}//GEN-LAST:event_JBEntSalvarActionPerformed

private void JBEntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntCancelarActionPerformed
      if (evt.getSource() == JBEntCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Gostaria de Fechar a Movimentação de Entrada de Mercadorias?",
                     "Fechar Movimentação de Entrada de Mercadorias", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        } 
}//GEN-LAST:event_JBEntCancelarActionPerformed
     
            public void run() {
               ViewEntrada dialogEntrada = new ViewEntrada(new javax.swing.JFrame(), true);
                dialogEntrada.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogEntrada.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEntCalcular;
    private javax.swing.JButton JBEntCancelar;
    private javax.swing.JButton JBEntSalvar;
    private javax.swing.JComboBox JCBEntFornecedor;
    private javax.swing.JComboBox JCBEntFuncionario;
    private javax.swing.JComboBox JCBEntProduto;
    private com.toedter.calendar.JDateChooser JDCEntDataEntrada;
    private javax.swing.JLabel JLEntDataEntrada;
    private javax.swing.JLabel JLEntFornecedor;
    private javax.swing.JLabel JLEntFuncionario;
    private javax.swing.JLabel JLEntObservacao;
    private javax.swing.JLabel JLEntProduto;
    private javax.swing.JLabel JLEntQuantidade;
    private javax.swing.JLabel JLEntValorTotal;
    private javax.swing.JLabel JLEntValorUnitario;
    private javax.swing.JTextArea JTAEntObservacao;
    private javax.swing.JTextField JTFEntQuantidade;
    private javax.swing.JTextField JTFEntValorTotal;
    private javax.swing.JTextField JTFEntValorUnitario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}