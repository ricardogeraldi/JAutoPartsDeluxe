/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboPrateleira;
import comboboxmodel.ComboSubGrupo;
import daos.DAOGenerico;
import entidades.Prateleira;
import entidades.Produto;
import entidades.SubGrupo;
import javax.swing.JOptionPane;

public class ViewProduto extends javax.swing.JDialog {
    
    private Produto produto;

    public ViewProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Produto pro) {
        produto = pro;
        JDCProDataCadastro.setDate(pro.getProDataCadastro());
        JTFProNome.setText(pro.getProNome());
        JTFProMarca.setText(pro.getProMarca());
        JTFProModelo.setText(pro.getProModelo());
        JCBProSubGrupo.setModel(new ComboSubGrupo());
        JCBProPrateleira.setModel(new ComboPrateleira());
        JTFProQuantidade.setText("" + pro.getProQuantidade());
        JTFProQuantidadeMinima.setText("" + pro.getProQuantidadeMinima());
        JTFProPrecoCusto.setText("" + pro.getProPreco());
        JTAProObservacao.setText(pro.getProObservacao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBProSalvar = new javax.swing.JButton();
        JBProCancelar = new javax.swing.JButton();
        JLProNome = new javax.swing.JLabel();
        JTFProNome = new javax.swing.JTextField();
        JLProMarca = new javax.swing.JLabel();
        JLProModelo = new javax.swing.JLabel();
        JLProPrecoCusto = new javax.swing.JLabel();
        JTFProMarca = new javax.swing.JTextField();
        JTFProModelo = new javax.swing.JTextField();
        JTFProQuantidade = new javax.swing.JTextField();
        JLProDataCadastro = new javax.swing.JLabel();
        JLProQuantidade = new javax.swing.JLabel();
        JLProQuantidadeMinima = new javax.swing.JLabel();
        JLProObservacao = new javax.swing.JLabel();
        JLProSubGrupo = new javax.swing.JLabel();
        JLProPrateleira = new javax.swing.JLabel();
        JCBProSubGrupo = new javax.swing.JComboBox();
        JCBProPrateleira = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        JTFProQuantidadeMinima = new javax.swing.JTextField();
        JTFProPrecoCusto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAProObservacao = new javax.swing.JTextArea();
        JDCProDataCadastro = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBProSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBConfirmar.png"))); // NOI18N
        JBProSalvar.setText("Salvar");
        JBProSalvar.setToolTipText("Salvar Produto");
        JBProSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProSalvarActionPerformed(evt);
            }
        });

        JBProCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBProCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelar.png"))); // NOI18N
        JBProCancelar.setText("Cancelar");
        JBProCancelar.setToolTipText("Cancelar Produto");
        JBProCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProCancelarActionPerformed(evt);
            }
        });

        JLProNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProNome.setText("Nome:");

        JTFProNome.setFont(new java.awt.Font("Arial", 0, 11));
        JTFProNome.setToolTipText("");

        JLProMarca.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProMarca.setText("Marca:");

        JLProModelo.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProModelo.setText("Modelo:");

        JLProPrecoCusto.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProPrecoCusto.setText("Preço Custo:");

        JTFProMarca.setFont(new java.awt.Font("Arial", 0, 11));
        JTFProMarca.setToolTipText("");

        JTFProModelo.setFont(new java.awt.Font("Arial", 0, 11));
        JTFProModelo.setToolTipText("");

        JTFProQuantidade.setFont(new java.awt.Font("Arial", 0, 11));
        JTFProQuantidade.setToolTipText("");

        JLProDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProDataCadastro.setText("Data Cadastro:");

        JLProQuantidade.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProQuantidade.setText("Quantidade:");

        JLProQuantidadeMinima.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProQuantidadeMinima.setText("Quantidade Mínima:");

        JLProObservacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProObservacao.setText("Observação:");

        JLProSubGrupo.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProSubGrupo.setText("Sub Grupo:");

        JLProPrateleira.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLProPrateleira.setText("Prateleira:");

        JCBProSubGrupo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JCBProSubGrupo.setModel(new ComboSubGrupo());

        JCBProPrateleira.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JCBProPrateleira.setModel(new ComboPrateleira());

        JTFProQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 11));

        JTFProPrecoCusto.setFont(new java.awt.Font("Arial", 0, 11));

        JTAProObservacao.setColumns(20);
        JTAProObservacao.setFont(new java.awt.Font("Arial", 2, 11));
        JTAProObservacao.setLineWrap(true);
        JTAProObservacao.setRows(4);
        jScrollPane1.setViewportView(JTAProObservacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLProModelo)
                            .addComponent(JLProMarca)
                            .addComponent(JLProNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFProModelo)
                            .addComponent(JTFProMarca)
                            .addComponent(JTFProNome, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLProSubGrupo)
                            .addComponent(JLProQuantidade)
                            .addComponent(JLProPrecoCusto)
                            .addComponent(JLProObservacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JCBProSubGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(JLProPrateleira))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFProPrecoCusto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFProQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(JLProQuantidadeMinima)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLProDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCProDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTFProQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBProPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(JBProSalvar)
                .addGap(18, 18, 18)
                .addComponent(JBProCancelar)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBProSalvar)
                    .addComponent(JBProCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLProNome)
                            .addComponent(JTFProNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLProDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLProMarca)
                            .addComponent(JTFProMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLProModelo)
                            .addComponent(JTFProModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JDCProDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLProPrateleira)
                    .addComponent(JLProSubGrupo)
                    .addComponent(JCBProSubGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBProPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFProQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLProQuantidade)
                    .addComponent(JLProQuantidadeMinima)
                    .addComponent(JTFProQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLProPrecoCusto)
                    .addComponent(JTFProPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLProObservacao))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-617)/2, (screenSize.height-353)/2, 617, 353);
    }// </editor-fold>//GEN-END:initComponents

    private void JBProCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProCancelarActionPerformed
        if (evt.getSource() == JBProCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Produtos?",
                     "Fechar Cadastro de Produtos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }    
}//GEN-LAST:event_JBProCancelarActionPerformed

    private void JBProSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProSalvarActionPerformed
        DAOGenerico<Produto> dao = new DAOGenerico<Produto>(Produto.class);
        
        if (produto == null) {
            Produto pro = new Produto();
            pro.setProDataCadastro(JDCProDataCadastro.getDate());
            pro.setProNome(JTFProNome.getText());
            pro.setProMarca(JTFProMarca.getText());
            pro.setProModelo(JTFProModelo.getText());
            pro.setSubGrupo((SubGrupo) JCBProSubGrupo.getSelectedItem());
            pro.setPrateleira((Prateleira) JCBProPrateleira.getSelectedItem());
            pro.setProQuantidade(Integer.parseInt(JTFProQuantidade.getText()));
            pro.setProQuantidadeMinima(Integer.parseInt(JTFProQuantidadeMinima.getText()));
            pro.setProPreco(Double.parseDouble(JTFProPrecoCusto.getText()));
            pro.setProObservacao(JTAProObservacao.getText());            
            dao.insert(pro);  
        } else { 
               produto.setProDataCadastro(JDCProDataCadastro.getDate());
               produto.setProNome(JTFProNome.getText());
               produto.setProMarca(JTFProMarca.getText());
               produto.setProModelo(JTFProModelo.getText());
               produto.setSubGrupo((SubGrupo) JCBProSubGrupo.getSelectedItem());
               produto.setPrateleira((Prateleira) JCBProPrateleira.getSelectedItem());
               produto.setProQuantidade(Integer.parseInt(JTFProQuantidade.getText()));
               produto.setProQuantidadeMinima(Integer.parseInt(JTFProQuantidadeMinima.getText()));
               produto.setProPreco(Double.parseDouble(JTFProPrecoCusto.getText()));
               produto.setProObservacao(JTAProObservacao.getText());   
               dao.update(produto);
            }    
        setVisible(false);
}//GEN-LAST:event_JBProSalvarActionPerformed
     
            public void run() {
               ViewProduto dialogProduto = new ViewProduto(new javax.swing.JFrame(), true);
                dialogProduto.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogProduto.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBProCancelar;
    private javax.swing.JButton JBProSalvar;
    private javax.swing.JComboBox JCBProPrateleira;
    private javax.swing.JComboBox JCBProSubGrupo;
    private com.toedter.calendar.JDateChooser JDCProDataCadastro;
    private javax.swing.JLabel JLProDataCadastro;
    private javax.swing.JLabel JLProMarca;
    private javax.swing.JLabel JLProModelo;
    private javax.swing.JLabel JLProNome;
    private javax.swing.JLabel JLProObservacao;
    private javax.swing.JLabel JLProPrateleira;
    private javax.swing.JLabel JLProPrecoCusto;
    private javax.swing.JLabel JLProQuantidade;
    private javax.swing.JLabel JLProQuantidadeMinima;
    private javax.swing.JLabel JLProSubGrupo;
    private javax.swing.JTextArea JTAProObservacao;
    private javax.swing.JTextField JTFProMarca;
    private javax.swing.JTextField JTFProModelo;
    private javax.swing.JTextField JTFProNome;
    private javax.swing.JTextField JTFProPrecoCusto;
    private javax.swing.JTextField JTFProQuantidade;
    private javax.swing.JTextField JTFProQuantidadeMinima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}