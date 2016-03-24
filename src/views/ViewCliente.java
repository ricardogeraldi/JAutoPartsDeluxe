/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboCidade;
import comboboxmodel.ComboEstado;
import daos.DAOGenerico;
import entidades.Cidade;
import entidades.Cliente;
import entidades.Estado;
import javax.swing.JOptionPane;

public class ViewCliente extends javax.swing.JDialog {
    
    private Cliente cliente;

    public ViewCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Cliente cli) {
        cliente = cli;
        JDCCliDataCadastro.setDate(cli.getCliDataCadastro());
        JTFCliNome.setText(cli.getCliNome());
        JDCCliDataNascimento.setDate(cli.getCliDataNascimento());
        JFTFCliCpf.setText(cli.getCliCpf());
        JFTFCliRg.setText(cli.getCliRg());
        JTFCliEndereco.setText(cli.getCliEndereco());
        JFTFCliNumero.setText(cli.getCliNumero());
        JTFCliBairro.setText(cli.getCliBairro());
        JFTFCliCep.setText(cli.getCliCep());
        JTFCliComplemento.setText(cli.getCliComplemento());
        JCBCliEstado.setModel(new ComboEstado());
        JCBCliCidade.setModel(new ComboCidade());
        JTFCliTrabalho.setText(cli.getCliTrabalho());
        JFTFCliTelefone.setText(cli.getCliTelefone());
        JFTFCliCelular.setText(cli.getCliCelular());
        JTFCliEmail.setText(cli.getCliEmail());
        JTACliObservacao.setText(cli.getCliObservacao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSCliTopo = new javax.swing.JSeparator();
        JBCliSalvar = new javax.swing.JButton();
        JBCliCancelar = new javax.swing.JButton();
        JLCliNome = new javax.swing.JLabel();
        JTFCliNome = new javax.swing.JTextField();
        JLCliDataNascimento = new javax.swing.JLabel();
        JLCliDataCadastro = new javax.swing.JLabel();
        JLCliCpf = new javax.swing.JLabel();
        JLCliRg = new javax.swing.JLabel();
        JFTFCliCpf = new javax.swing.JFormattedTextField();
        JLCliEndereco = new javax.swing.JLabel();
        JTFCliEndereco = new javax.swing.JTextField();
        JLCliNumero = new javax.swing.JLabel();
        JLCliComplemento = new javax.swing.JLabel();
        JLCliBairro = new javax.swing.JLabel();
        JLCliCep = new javax.swing.JLabel();
        JTFCliBairro = new javax.swing.JTextField();
        JFTFCliCep = new javax.swing.JFormattedTextField();
        JLCliEstado = new javax.swing.JLabel();
        JCBCliEstado = new javax.swing.JComboBox();
        JLCliCidade = new javax.swing.JLabel();
        JCBCliCidade = new javax.swing.JComboBox();
        JLCliTrabalho = new javax.swing.JLabel();
        JTFCliTrabalho = new javax.swing.JTextField();
        JLCliTelefone = new javax.swing.JLabel();
        JFTFCliTelefone = new javax.swing.JFormattedTextField();
        JLCliCelular = new javax.swing.JLabel();
        JFTFCliCelular = new javax.swing.JFormattedTextField();
        JLCliEmail = new javax.swing.JLabel();
        JTFCliEmail = new javax.swing.JTextField();
        JLCliObservacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTACliObservacao = new javax.swing.JTextArea();
        JTFCliComplemento = new javax.swing.JTextField();
        JDCCliDataCadastro = new com.toedter.calendar.JDateChooser();
        JDCCliDataNascimento = new com.toedter.calendar.JDateChooser();
        JFTFCliNumero = new javax.swing.JFormattedTextField();
        JFTFCliRg = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBCliSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBConfirmar.png"))); // NOI18N
        JBCliSalvar.setText("Salvar");
        JBCliSalvar.setToolTipText("Salvar Cliente");
        JBCliSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliSalvarActionPerformed(evt);
            }
        });

        JBCliCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBCliCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBCancelar.png"))); // NOI18N
        JBCliCancelar.setText("Cancelar");
        JBCliCancelar.setToolTipText("Cancelar Cliente");
        JBCliCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCliCancelarActionPerformed(evt);
            }
        });

        JLCliNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliNome.setText("Nome:");

        JTFCliNome.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliDataNascimento.setText("Data de Nascimento:");

        JLCliDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliDataCadastro.setText("Data de Cadastro:");

        JLCliCpf.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliCpf.setText("CPF:");

        JLCliRg.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliRg.setText("RG:");

        try {
            JFTFCliCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFCliCpf.setToolTipText("");
        JFTFCliCpf.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliEndereco.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliEndereco.setText("Endereço:");

        JTFCliEndereco.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliNumero.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliNumero.setText("Número:");

        JLCliComplemento.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliComplemento.setText("Complemento:");

        JLCliBairro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliBairro.setText("Bairro:");

        JLCliCep.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliCep.setText("Cep:");

        JTFCliBairro.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFCliCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFCliCep.setToolTipText("");
        JFTFCliCep.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliEstado.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliEstado.setText("Estado:");

        JCBCliEstado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JCBCliEstado.setModel(new ComboEstado());

        JLCliCidade.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliCidade.setText("Cidade:");

        JCBCliCidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JCBCliCidade.setModel(new ComboCidade());

        JLCliTrabalho.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliTrabalho.setText("Profissão:");

        JTFCliTrabalho.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliTelefone.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliTelefone.setText("Fone:");

        try {
            JFTFCliTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFCliTelefone.setToolTipText("");
        JFTFCliTelefone.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliCelular.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliCelular.setText("Celular:");

        try {
            JFTFCliCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFCliCelular.setToolTipText("");
        JFTFCliCelular.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliEmail.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliEmail.setText("E-Mail:");

        JTFCliEmail.setFont(new java.awt.Font("Arial", 0, 11));

        JLCliObservacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLCliObservacao.setText("Observação:");

        JTACliObservacao.setColumns(20);
        JTACliObservacao.setFont(new java.awt.Font("Arial", 2, 11));
        JTACliObservacao.setRows(3);
        JTACliObservacao.setToolTipText("Observação Sobre o Cliente");
        jScrollPane1.setViewportView(JTACliObservacao);

        JTFCliComplemento.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFCliNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFCliNumero.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFCliRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFCliRg.setFont(new java.awt.Font("Arial", 0, 11));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLCliObservacao, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLCliDataCadastro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLCliDataNascimento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JDCCliDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JDCCliDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(JBCliSalvar)
                .addGap(18, 18, 18)
                .addComponent(JBCliCancelar)
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JLCliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JLCliTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLCliBairro)
                                    .addComponent(JLCliEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLCliEstado))
                                .addComponent(JLCliTelefone)
                                .addComponent(JLCliEmail)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JFTFCliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(JLCliRg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JFTFCliRg, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JFTFCliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JLCliCelular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JFTFCliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFCliTrabalho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JTFCliEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                            .addGap(38, 38, 38)
                                            .addComponent(JLCliNumero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JFTFCliNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JCBCliEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(JTFCliBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(JLCliCidade)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(JCBCliCidade, 0, 249, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(8, 8, 8)
                                                    .addComponent(JLCliCep)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(JFTFCliCep, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(JLCliComplemento)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(JTFCliComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))))
                                    .addGap(64, 64, 64)))
                            .addGap(158, 158, 158))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(JTFCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(JSCliTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCliSalvar)
                    .addComponent(JBCliCancelar))
                .addGap(7, 7, 7)
                .addComponent(JSCliTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLCliDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(JDCCliDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JLCliDataNascimento)
                    .addComponent(JLCliNome)
                    .addComponent(JTFCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDCCliDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCliRg)
                    .addComponent(JLCliCpf)
                    .addComponent(JFTFCliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFTFCliRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCliEndereco)
                    .addComponent(JTFCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFTFCliNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCliBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliBairro)
                    .addComponent(JTFCliComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliComplemento)
                    .addComponent(JLCliCep)
                    .addComponent(JFTFCliCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBCliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliCidade)
                    .addComponent(JCBCliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCliTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliTrabalho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFTFCliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliCelular)
                    .addComponent(JFTFCliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCliEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLCliObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-694)/2, (screenSize.height-426)/2, 694, 426);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCliCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliCancelarActionPerformed
        if (evt.getSource() == JBCliCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Clientes?",
                     "Fechar Cadastro de Clientes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }    
    }//GEN-LAST:event_JBCliCancelarActionPerformed

    private void JBCliSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCliSalvarActionPerformed
        DAOGenerico<Cliente> dao = new DAOGenerico<Cliente>(Cliente.class);
        
        if (cliente == null) {
            Cliente cli = new Cliente();
            cli.setCliDataCadastro(JDCCliDataCadastro.getDate());
            cli.setCliNome(JTFCliNome.getText());
            cli.setCliDataNascimento(JDCCliDataNascimento.getDate());
            cli.setCliCpf(JFTFCliCpf.getText());
            cli.setCliRg(JFTFCliRg.getText());
            cli.setCliEndereco(JTFCliEndereco.getText());
            cli.setCliNumero(JFTFCliNumero.getText());
            cli.setCliBairro(JTFCliBairro.getText());
            cli.setCliCep(JFTFCliCep.getText());
            cli.setCliComplemento(JTFCliComplemento.getText());
            cli.setEstado((Estado)JCBCliEstado.getSelectedItem());
            cli.setCidade((Cidade)JCBCliCidade.getSelectedItem());
            cli.setCliTrabalho(JTFCliTrabalho.getText());
            cli.setCliTelefone(JFTFCliTelefone.getText());
            cli.setCliCelular(JFTFCliCelular.getText());
            cli.setCliEmail(JTFCliEmail.getText());
            cli.setCliObservacao(JTACliObservacao.getText());
            dao.insert(cli);  
        } else { 
               cliente.setCliDataCadastro(JDCCliDataCadastro.getDate());
               cliente.setCliNome(JTFCliNome.getText());
               cliente.setCliDataNascimento(JDCCliDataNascimento.getDate());
               cliente.setCliCpf(JFTFCliCpf.getText());
               cliente.setCliRg(JFTFCliRg.getText());
               cliente.setCliEndereco(JTFCliEndereco.getText());
               cliente.setCliNumero(JFTFCliNumero.getText());
               cliente.setCliBairro(JTFCliBairro.getText());
               cliente.setCliCep(JFTFCliCep.getText());
               cliente.setCliComplemento(JTFCliComplemento.getText());
               cliente.setEstado((Estado)JCBCliEstado.getSelectedItem());
               cliente.setCidade((Cidade)JCBCliCidade.getSelectedItem());
               cliente.setCliTrabalho(JTFCliTrabalho.getText());
               cliente.setCliTelefone(JFTFCliTelefone.getText());
               cliente.setCliCelular(JFTFCliCelular.getText());
               cliente.setCliEmail(JTFCliEmail.getText());
               cliente.setCliObservacao(JTACliObservacao.getText());
               dao.update(cliente);
            }    
        setVisible(false);
    }//GEN-LAST:event_JBCliSalvarActionPerformed
     
            public void run() {
               ViewCliente dialogCliente = new ViewCliente(new javax.swing.JFrame(), true);
                dialogCliente.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogCliente.setVisible(true);
             }  
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCliCancelar;
    private javax.swing.JButton JBCliSalvar;
    private javax.swing.JComboBox JCBCliCidade;
    private javax.swing.JComboBox JCBCliEstado;
    private com.toedter.calendar.JDateChooser JDCCliDataCadastro;
    private com.toedter.calendar.JDateChooser JDCCliDataNascimento;
    private javax.swing.JFormattedTextField JFTFCliCelular;
    private javax.swing.JFormattedTextField JFTFCliCep;
    private javax.swing.JFormattedTextField JFTFCliCpf;
    private javax.swing.JFormattedTextField JFTFCliNumero;
    private javax.swing.JFormattedTextField JFTFCliRg;
    private javax.swing.JFormattedTextField JFTFCliTelefone;
    private javax.swing.JLabel JLCliBairro;
    private javax.swing.JLabel JLCliCelular;
    private javax.swing.JLabel JLCliCep;
    private javax.swing.JLabel JLCliCidade;
    private javax.swing.JLabel JLCliComplemento;
    private javax.swing.JLabel JLCliCpf;
    private javax.swing.JLabel JLCliDataCadastro;
    private javax.swing.JLabel JLCliDataNascimento;
    private javax.swing.JLabel JLCliEmail;
    private javax.swing.JLabel JLCliEndereco;
    private javax.swing.JLabel JLCliEstado;
    private javax.swing.JLabel JLCliNome;
    private javax.swing.JLabel JLCliNumero;
    private javax.swing.JLabel JLCliObservacao;
    private javax.swing.JLabel JLCliRg;
    private javax.swing.JLabel JLCliTelefone;
    private javax.swing.JLabel JLCliTrabalho;
    private javax.swing.JSeparator JSCliTopo;
    private javax.swing.JTextArea JTACliObservacao;
    private javax.swing.JTextField JTFCliBairro;
    private javax.swing.JTextField JTFCliComplemento;
    private javax.swing.JTextField JTFCliEmail;
    private javax.swing.JTextField JTFCliEndereco;
    private javax.swing.JTextField JTFCliNome;
    private javax.swing.JTextField JTFCliTrabalho;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}