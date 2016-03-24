/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboVeiculo;
import daos.DAOGenerico;
import entidades.Prateleira;
import entidades.Veiculo;
import javax.swing.JOptionPane;

public class ViewPrateleira extends javax.swing.JDialog {
    
    private Prateleira prateleira;

    public ViewPrateleira(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Prateleira pra) {
        prateleira = pra;
        JTFPraNome.setText(pra.getPraNome());
        JDCPraDataCadastro.setDate(pra.getPraDataCadastro());
        JFTFPraNumero.setText(pra.getPraNumero());
        JCBPraVeiculo.setModel(new ComboVeiculo());
        JTAPraDescricao.setText(pra.getPraDescricao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBPraCriar = new javax.swing.JButton();
        JBPraCancelar = new javax.swing.JButton();
        JLPraNome = new javax.swing.JLabel();
        JTFPraNome = new javax.swing.JTextField();
        JLPraNumero = new javax.swing.JLabel();
        JLPraDescricao = new javax.swing.JLabel();
        JLPraVeiculo = new javax.swing.JLabel();
        JLPraDataCadastro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAPraDescricao = new javax.swing.JTextArea();
        JCBPraVeiculo = new javax.swing.JComboBox();
        JDCPraDataCadastro = new com.toedter.calendar.JDateChooser();
        JFTFPraNumero = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Prateleiras");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBPraCriar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBPraCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCriar.PNG"))); // NOI18N
        JBPraCriar.setText("Criar Prateleira");
        JBPraCriar.setToolTipText("Salvar Prateleira");
        JBPraCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPraCriarActionPerformed(evt);
            }
        });

        JBPraCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBPraCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/JBCancelarr.png"))); // NOI18N
        JBPraCancelar.setText("Cancelar Prateleira");
        JBPraCancelar.setToolTipText("Cancelar Prateleira");
        JBPraCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPraCancelarActionPerformed(evt);
            }
        });

        JLPraNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLPraNome.setText("Nome:");

        JTFPraNome.setFont(new java.awt.Font("Arial", 0, 11));
        JTFPraNome.setToolTipText("");

        JLPraNumero.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLPraNumero.setText("Número:");

        JLPraDescricao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLPraDescricao.setText("Descrição:");

        JLPraVeiculo.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLPraVeiculo.setText("Veículo:");

        JLPraDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLPraDataCadastro.setText("Data Cadastro:");

        JTAPraDescricao.setColumns(20);
        JTAPraDescricao.setFont(new java.awt.Font("Arial", 2, 11));
        JTAPraDescricao.setLineWrap(true);
        JTAPraDescricao.setRows(3);
        jScrollPane1.setViewportView(JTAPraDescricao);

        JCBPraVeiculo.setMaximumRowCount(50);
        JCBPraVeiculo.setModel(new ComboVeiculo());

        try {
            JFTFPraNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFPraNumero.setFont(new java.awt.Font("Arial", 0, 11));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLPraNome)
                    .addComponent(JLPraDescricao)
                    .addComponent(JLPraNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JFTFPraNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(JLPraVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCBPraVeiculo, 0, 253, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JTFPraNome, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(JLPraDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCPraDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(JBPraCriar)
                .addGap(18, 18, 18)
                .addComponent(JBPraCancelar)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLPraNome)
                        .addComponent(JLPraDataCadastro)
                        .addComponent(JTFPraNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JDCPraDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPraVeiculo)
                    .addComponent(JCBPraVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPraNumero)
                    .addComponent(JFTFPraNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLPraDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBPraCriar)
                    .addComponent(JBPraCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-526)/2, (screenSize.height-230)/2, 526, 230);
    }// </editor-fold>//GEN-END:initComponents

    private void JBPraCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPraCancelarActionPerformed
        if (evt.getSource() == JBPraCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Prateleiras?",
                     "Fechar Cadastro de Prateleiras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }    
}//GEN-LAST:event_JBPraCancelarActionPerformed

    private void JBPraCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPraCriarActionPerformed
        DAOGenerico<Prateleira> dao = new DAOGenerico<Prateleira>(Prateleira.class);
        
        if (prateleira == null) {
            Prateleira pra = new Prateleira();
            pra.setPraNome(JTFPraNome.getText());
            pra.setPraDataCadastro(JDCPraDataCadastro.getDate());
            pra.setPraNumero(JFTFPraNumero.getText());
            pra.setVeiculo((Veiculo) JCBPraVeiculo.getSelectedItem());
            pra.setPraDescricao(JTAPraDescricao.getText());
            dao.insert(pra);  
        } else { 
               prateleira.setPraNome(JTFPraNome.getText());
               prateleira.setPraDataCadastro(JDCPraDataCadastro.getDate());
               prateleira.setPraNumero(JFTFPraNumero.getText());
               prateleira.setVeiculo((Veiculo) JCBPraVeiculo.getSelectedItem());
               prateleira.setPraDescricao(JTAPraDescricao.getText());
               dao.update(prateleira);
            }    
        setVisible(false);
}//GEN-LAST:event_JBPraCriarActionPerformed
     
            public void run() {
               ViewPrateleira dialogPrateleira = new ViewPrateleira(new javax.swing.JFrame(), true);
                dialogPrateleira.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogPrateleira.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPraCancelar;
    private javax.swing.JButton JBPraCriar;
    private javax.swing.JComboBox JCBPraVeiculo;
    private com.toedter.calendar.JDateChooser JDCPraDataCadastro;
    private javax.swing.JFormattedTextField JFTFPraNumero;
    private javax.swing.JLabel JLPraDataCadastro;
    private javax.swing.JLabel JLPraDescricao;
    private javax.swing.JLabel JLPraNome;
    private javax.swing.JLabel JLPraNumero;
    private javax.swing.JLabel JLPraVeiculo;
    private javax.swing.JTextArea JTAPraDescricao;
    private javax.swing.JTextField JTFPraNome;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}