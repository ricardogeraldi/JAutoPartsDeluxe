/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboCidade;
import comboboxmodel.ComboEstado;
import daos.DAOGenerico;
import entidades.Cidade;
import entidades.Empresa;
import entidades.Estado;
import javax.swing.JOptionPane;

public class ViewEmpresa extends javax.swing.JDialog {
    
    private Empresa empresa;

    public ViewEmpresa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Empresa emp) {
        empresa = emp;
        JTFEmpRazaoSocial.setText(emp.getEmpRazaoSocial());
        JDCEmpDataCadastro.setDate(emp.getEmpDataCadastro());
        JTFEmpNomeFantasia.setText(emp.getEmpNomeFantasia());
        JFTFEmpCnpj.setText(emp.getEmpCNPJ());
        JFTFEmpInscricaoEstadual.setText(emp.getEmpInscricaoEstadual());
        JTFEmpEndereco.setText(emp.getEmpEndereco());
        JFTFEmpNumero.setText(emp.getEmpNumero());
        JTFEmpBairro.setText(emp.getEmpBairro());
        JTFEmpComplemento.setText(emp.getEmpComplemento());
        JFTFEmpCep.setText(emp.getEmpCep());
        JCBEmpEstado.setModel(new ComboEstado());
        JCBEmpCidade.setModel(new ComboCidade());
        JFTFEmpTelefone.setText(emp.getEmpTelefone());
        JTFEmpEmail.setText(emp.getEmpEmail());
        JTAEmpObservacao.setText(emp.getEmpObservacao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSCliTopo = new javax.swing.JSeparator();
        JBEmpSalvar = new javax.swing.JButton();
        JBEmpCancelar = new javax.swing.JButton();
        JLEmpRazaoSocial = new javax.swing.JLabel();
        JTFEmpRazaoSocial = new javax.swing.JTextField();
        JLEmpDataCadastro = new javax.swing.JLabel();
        JLEmpCnpj = new javax.swing.JLabel();
        JLEmpInscricaoEstadual = new javax.swing.JLabel();
        JFTFEmpCnpj = new javax.swing.JFormattedTextField();
        JLEmpEndereco = new javax.swing.JLabel();
        JTFEmpEndereco = new javax.swing.JTextField();
        JLEmpNumero = new javax.swing.JLabel();
        JLEmpComplemento = new javax.swing.JLabel();
        JLEmpBairro = new javax.swing.JLabel();
        JLEmpCep = new javax.swing.JLabel();
        JTFEmpBairro = new javax.swing.JTextField();
        JFTFEmpCep = new javax.swing.JFormattedTextField();
        JLEmpEstado = new javax.swing.JLabel();
        JCBEmpEstado = new javax.swing.JComboBox();
        JLEmpCidade = new javax.swing.JLabel();
        JCBEmpCidade = new javax.swing.JComboBox();
        JLEmpTelefone = new javax.swing.JLabel();
        JFTFEmpTelefone = new javax.swing.JFormattedTextField();
        JLEmpEmail = new javax.swing.JLabel();
        JTFEmpEmail = new javax.swing.JTextField();
        JLEmpObservacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAEmpObservacao = new javax.swing.JTextArea();
        JTFEmpComplemento = new javax.swing.JTextField();
        JLEmpNomeFantasia = new javax.swing.JLabel();
        JTFEmpNomeFantasia = new javax.swing.JTextField();
        JDCEmpDataCadastro = new com.toedter.calendar.JDateChooser();
        JFTFEmpInscricaoEstadual = new javax.swing.JFormattedTextField();
        JFTFEmpNumero = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Empresas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBEmpSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBConfirmar.png"))); // NOI18N
        JBEmpSalvar.setText("Salvar");
        JBEmpSalvar.setToolTipText("Salvar Empresa");
        JBEmpSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmpSalvarActionPerformed(evt);
            }
        });

        JBEmpCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBEmpCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBCancelar.png"))); // NOI18N
        JBEmpCancelar.setText("Cancelar");
        JBEmpCancelar.setToolTipText("Cancelar Cliente");
        JBEmpCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmpCancelarActionPerformed(evt);
            }
        });

        JLEmpRazaoSocial.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpRazaoSocial.setText("Razão Social:");

        JTFEmpRazaoSocial.setFont(new java.awt.Font("Arial", 0, 11));

        JLEmpDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpDataCadastro.setText("Data de Cadastro:");

        JLEmpCnpj.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpCnpj.setText("CNPJ:");

        JLEmpInscricaoEstadual.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpInscricaoEstadual.setText("Inscrição Estadual:");

        try {
            JFTFEmpCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFEmpCnpj.setToolTipText("");
        JFTFEmpCnpj.setFont(new java.awt.Font("Arial", 0, 11));

        JLEmpEndereco.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpEndereco.setText("Endereço:");

        JTFEmpEndereco.setFont(new java.awt.Font("Arial", 0, 11));

        JLEmpNumero.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpNumero.setText("Número:");

        JLEmpComplemento.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpComplemento.setText("Complemento:");

        JLEmpBairro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpBairro.setText("Bairro:");

        JLEmpCep.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpCep.setText("Cep:");

        JTFEmpBairro.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFEmpCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFEmpCep.setToolTipText("");
        JFTFEmpCep.setFont(new java.awt.Font("Arial", 0, 11));

        JLEmpEstado.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpEstado.setText("Estado:");

        JCBEmpEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JCBEmpEstado.setMaximumRowCount(26);
        JCBEmpEstado.setModel(new ComboEstado());

        JLEmpCidade.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpCidade.setText("Cidade:");

        JCBEmpCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JCBEmpCidade.setModel(new ComboCidade());

        JLEmpTelefone.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpTelefone.setText("Fone:");

        try {
            JFTFEmpTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFEmpTelefone.setToolTipText("");
        JFTFEmpTelefone.setFont(new java.awt.Font("Arial", 0, 11));

        JLEmpEmail.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpEmail.setText("E-Mail:");

        JTFEmpEmail.setFont(new java.awt.Font("Arial", 0, 11));

        JLEmpObservacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpObservacao.setText("Observação:");

        JTAEmpObservacao.setColumns(20);
        JTAEmpObservacao.setFont(new java.awt.Font("Arial", 2, 11));
        JTAEmpObservacao.setRows(3);
        JTAEmpObservacao.setToolTipText("Observação Sobre o Cliente");
        jScrollPane1.setViewportView(JTAEmpObservacao);

        JTFEmpComplemento.setFont(new java.awt.Font("Arial", 0, 11));

        JLEmpNomeFantasia.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLEmpNomeFantasia.setText("Nome Fantasia:");

        JTFEmpNomeFantasia.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFEmpInscricaoEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFEmpInscricaoEstadual.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFEmpNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEmpRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLEmpNomeFantasia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFEmpNomeFantasia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(JTFEmpRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLEmpDataCadastro)
                        .addGap(4, 4, 4)
                        .addComponent(JDCEmpDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(JLEmpObservacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLEmpTelefone)
                            .addComponent(JLEmpCnpj)
                            .addComponent(JLEmpBairro)
                            .addComponent(JLEmpEstado)
                            .addComponent(JLEmpEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JFTFEmpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(JLEmpEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JFTFEmpCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(JLEmpInscricaoEstadual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JFTFEmpInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(224, 224, 224)
                                    .addComponent(JLEmpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JCBEmpCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JCBEmpEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(JTFEmpBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JLEmpComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)
                                            .addComponent(JTFEmpComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(JTFEmpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JLEmpCep)
                                        .addComponent(JLEmpNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JFTFEmpNumero, 0, 0, Short.MAX_VALUE)
                                        .addComponent(JFTFEmpCep, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(JSCliTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(JBEmpSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBEmpCancelar)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEmpSalvar)
                    .addComponent(JBEmpCancelar))
                .addGap(15, 15, 15)
                .addComponent(JSCliTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JLEmpRazaoSocial)
                    .addComponent(JTFEmpRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEmpDataCadastro)
                    .addComponent(JDCEmpDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(JLEmpNomeFantasia)
                            .addComponent(JTFEmpNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEmpCnpj)
                            .addComponent(JLEmpInscricaoEstadual)
                            .addComponent(JFTFEmpCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFTFEmpInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEmpEndereco)
                            .addComponent(JTFEmpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEmpBairro)
                            .addComponent(JTFEmpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLEmpComplemento)
                            .addComponent(JTFEmpComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEmpNumero)
                            .addComponent(JFTFEmpNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEmpCep)
                            .addComponent(JFTFEmpCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEmpEstado)
                    .addComponent(JCBEmpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEmpCidade)
                    .addComponent(JCBEmpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEmpTelefone)
                    .addComponent(JFTFEmpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEmpEmail)
                    .addComponent(JTFEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLEmpObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-731)/2, (screenSize.height-345)/2, 731, 345);
    }// </editor-fold>//GEN-END:initComponents

    private void JBEmpCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmpCancelarActionPerformed
        if (evt.getSource() == JBEmpCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Empresas?",
                     "Fechar Cadastro de Empresas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }    
}//GEN-LAST:event_JBEmpCancelarActionPerformed

    private void JBEmpSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmpSalvarActionPerformed
        DAOGenerico<Empresa> dao = new DAOGenerico<Empresa>(Empresa.class);
        
        if (empresa == null) {
            Empresa emp = new Empresa();
            emp.setEmpRazaoSocial(JTFEmpRazaoSocial.getText());
            emp.setEmpDataCadastro(JDCEmpDataCadastro.getDate());
            emp.setEmpNomeFantasia(JTFEmpNomeFantasia.getText());
            emp.setEmpCNPJ(JFTFEmpCnpj.getText());
            emp.setEmpInscricaoEstadual(JFTFEmpInscricaoEstadual.getText());
            emp.setEmpEndereco(JTFEmpEndereco.getText());
            emp.setEmpNumero(JFTFEmpNumero.getText());
            emp.setEmpBairro(JTFEmpBairro.getText());
            emp.setEmpComplemento(JTFEmpComplemento.getText());
            emp.setEmpCep(JFTFEmpCep.getText());
            emp.setEstado((Estado) JCBEmpEstado.getSelectedItem());
            emp.setCidade((Cidade) JCBEmpCidade.getSelectedItem());
            emp.setEmpTelefone(JFTFEmpTelefone.getText());
            emp.setEmpEmail(JTFEmpEmail.getText());
            emp.setEmpObservacao(JTAEmpObservacao.getText());
            dao.insert(emp);  
        } else { 
               empresa.setEmpRazaoSocial(JTFEmpRazaoSocial.getText());
               empresa.setEmpDataCadastro(JDCEmpDataCadastro.getDate());
               empresa.setEmpNomeFantasia(JTFEmpNomeFantasia.getText());
               empresa.setEmpCNPJ(JFTFEmpCnpj.getText());
               empresa.setEmpInscricaoEstadual(JFTFEmpInscricaoEstadual.getText());
               empresa.setEmpEndereco(JTFEmpEndereco.getText());
               empresa.setEmpNumero(JFTFEmpNumero.getText());
               empresa.setEmpBairro(JTFEmpBairro.getText());
               empresa.setEmpComplemento(JTFEmpComplemento.getText());
               empresa.setEmpCep(JFTFEmpCep.getText());
               empresa.setEstado((Estado) JCBEmpEstado.getSelectedItem());
               empresa.setCidade((Cidade) JCBEmpCidade.getSelectedItem());
               empresa.setEmpTelefone(JFTFEmpTelefone.getText());
               empresa.setEmpEmail(JTFEmpEmail.getText());
               empresa.setEmpObservacao(JTAEmpObservacao.getText());
               dao.update(empresa);
            }    
        setVisible(false);
}//GEN-LAST:event_JBEmpSalvarActionPerformed
      
            public void run() {
               ViewEmpresa dialogEmpresa = new ViewEmpresa(new javax.swing.JFrame(), true);
                dialogEmpresa.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogEmpresa.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEmpCancelar;
    private javax.swing.JButton JBEmpSalvar;
    private javax.swing.JComboBox JCBEmpCidade;
    private javax.swing.JComboBox JCBEmpEstado;
    private com.toedter.calendar.JDateChooser JDCEmpDataCadastro;
    private javax.swing.JFormattedTextField JFTFEmpCep;
    private javax.swing.JFormattedTextField JFTFEmpCnpj;
    private javax.swing.JFormattedTextField JFTFEmpInscricaoEstadual;
    private javax.swing.JFormattedTextField JFTFEmpNumero;
    private javax.swing.JFormattedTextField JFTFEmpTelefone;
    private javax.swing.JLabel JLEmpBairro;
    private javax.swing.JLabel JLEmpCep;
    private javax.swing.JLabel JLEmpCidade;
    private javax.swing.JLabel JLEmpCnpj;
    private javax.swing.JLabel JLEmpComplemento;
    private javax.swing.JLabel JLEmpDataCadastro;
    private javax.swing.JLabel JLEmpEmail;
    private javax.swing.JLabel JLEmpEndereco;
    private javax.swing.JLabel JLEmpEstado;
    private javax.swing.JLabel JLEmpInscricaoEstadual;
    private javax.swing.JLabel JLEmpNomeFantasia;
    private javax.swing.JLabel JLEmpNumero;
    private javax.swing.JLabel JLEmpObservacao;
    private javax.swing.JLabel JLEmpRazaoSocial;
    private javax.swing.JLabel JLEmpTelefone;
    private javax.swing.JSeparator JSCliTopo;
    private javax.swing.JTextArea JTAEmpObservacao;
    private javax.swing.JTextField JTFEmpBairro;
    private javax.swing.JTextField JTFEmpComplemento;
    private javax.swing.JTextField JTFEmpEmail;
    private javax.swing.JTextField JTFEmpEndereco;
    private javax.swing.JTextField JTFEmpNomeFantasia;
    private javax.swing.JTextField JTFEmpRazaoSocial;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}