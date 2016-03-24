/**
 *
 * @author Ricardo Theis Geraldi
 */
package views;

import comboboxmodel.ComboCidade;
import comboboxmodel.ComboEstado;
import daos.DAOGenerico;
import entidades.Cidade;
import entidades.Estado;
import entidades.Fornecedor;
import javax.swing.JOptionPane;

public class ViewFornecedor extends javax.swing.JDialog {
    
    private Fornecedor fornecedor;

    public ViewFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Fornecedor forn) {
        fornecedor = forn;
        JTFFornRazaoSocial.setText(forn.getFornRazaoSocial());
        JDCFornDataCadastro.setDate(forn.getFornDataCadastro());
        JTFFornNomeFantasia.setText(forn.getFornNomeFantasia());
        JFTFFornCnpj.setText(forn.getFornCNPJ());
        JFTFFornInscricaoEstadual.setText(forn.getFornInscricaoEstadual());
        JTFFornEndereco.setText(forn.getFornEndereco());
        JFTFFornNumero.setText(forn.getFornNumero());
        JTFFornBairro.setText(forn.getFornBairro());
        JTFFornComplemento.setText(forn.getFornComplemento());
        JFTFFornCep.setText(forn.getFornCep());
        JCBFornEstado.setModel(new ComboEstado());
        JCBFornCidade.setModel(new ComboCidade());
        JFTFFornTelefone.setText(forn.getFornTelefone());
        JTFFornEmail.setText(forn.getFornEmail());
        JTFFornNomeVendedor.setText(forn.getFornNomeVendedor());
        JFTFFornTelefoneVendedor.setText(forn.getFornTelefoneVendedor());
        JFTFFornCelularVendedor.setText(forn.getFornCelularVendedor());
        JTAFornObservacao.setText(forn.getFornObservacao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSCliTopo = new javax.swing.JSeparator();
        JBFornSalvar = new javax.swing.JButton();
        JBFornCancelar = new javax.swing.JButton();
        JLFornRazaoSocial = new javax.swing.JLabel();
        JTFFornRazaoSocial = new javax.swing.JTextField();
        JLFornDataCadastro = new javax.swing.JLabel();
        JLFornCnpj = new javax.swing.JLabel();
        JLFornInscricaoEstadual = new javax.swing.JLabel();
        JFTFFornCnpj = new javax.swing.JFormattedTextField();
        JLFornEndereco = new javax.swing.JLabel();
        JTFFornEndereco = new javax.swing.JTextField();
        JLFornNumero = new javax.swing.JLabel();
        JLFornComplemento = new javax.swing.JLabel();
        JLFornBairro = new javax.swing.JLabel();
        JLFornCep = new javax.swing.JLabel();
        JTFFornBairro = new javax.swing.JTextField();
        JFTFFornCep = new javax.swing.JFormattedTextField();
        JLFornEstado = new javax.swing.JLabel();
        JCBFornEstado = new javax.swing.JComboBox();
        JLFornCidade = new javax.swing.JLabel();
        JCBFornCidade = new javax.swing.JComboBox();
        JLFornTelefone = new javax.swing.JLabel();
        JFTFFornTelefone = new javax.swing.JFormattedTextField();
        JLFornEmail = new javax.swing.JLabel();
        JTFFornEmail = new javax.swing.JTextField();
        JLFornNomeVendedor = new javax.swing.JLabel();
        JTFFornComplemento = new javax.swing.JTextField();
        JLFornNomeFantasia = new javax.swing.JLabel();
        JTFFornNomeFantasia = new javax.swing.JTextField();
        JTFFornNomeVendedor = new javax.swing.JTextField();
        JLFornCelularVendedor = new javax.swing.JLabel();
        JFTFFornTelefoneVendedor = new javax.swing.JFormattedTextField();
        JLFornTelefoneVendedor = new javax.swing.JLabel();
        JFTFFornCelularVendedor = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAFornObservacao = new javax.swing.JTextArea();
        JLFornObservacao = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        JDCFornDataCadastro = new com.toedter.calendar.JDateChooser();
        JFTFFornInscricaoEstadual = new javax.swing.JFormattedTextField();
        JFTFFornNumero = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBFornSalvar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFornSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBConfirmar.png"))); // NOI18N
        JBFornSalvar.setText("Salvar");
        JBFornSalvar.setToolTipText("Salvar Empresa");
        JBFornSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFornSalvarActionPerformed(evt);
            }
        });

        JBFornCancelar.setFont(new java.awt.Font("Tahoma", 1, 12));
        JBFornCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensEIcones/JBCancelar.png"))); // NOI18N
        JBFornCancelar.setText("Cancelar");
        JBFornCancelar.setToolTipText("Cancelar Cliente");
        JBFornCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFornCancelarActionPerformed(evt);
            }
        });

        JLFornRazaoSocial.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornRazaoSocial.setText("Razão Social:");

        JTFFornRazaoSocial.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornDataCadastro.setText("Data de Cadastro:");

        JLFornCnpj.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornCnpj.setText("CNPJ:");

        JLFornInscricaoEstadual.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornInscricaoEstadual.setText("Inscrição Estadual:");

        try {
            JFTFFornCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFFornCnpj.setToolTipText("");
        JFTFFornCnpj.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornEndereco.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornEndereco.setText("Endereço:");

        JTFFornEndereco.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornNumero.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornNumero.setText("Número:");

        JLFornComplemento.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornComplemento.setText("Complemento:");

        JLFornBairro.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornBairro.setText("Bairro:");

        JLFornCep.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornCep.setText("Cep:");

        JTFFornBairro.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFFornCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFFornCep.setToolTipText("");
        JFTFFornCep.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornEstado.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornEstado.setText("Estado:");

        JCBFornEstado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JCBFornEstado.setModel(new ComboEstado());

        JLFornCidade.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornCidade.setText("Cidade:");

        JCBFornCidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JCBFornCidade.setModel(new ComboCidade());

        JLFornTelefone.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornTelefone.setText("Fone:");

        try {
            JFTFFornTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFFornTelefone.setToolTipText("");
        JFTFFornTelefone.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornEmail.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornEmail.setText("E-Mail:");

        JTFFornEmail.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornNomeVendedor.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornNomeVendedor.setText("Nome Vendedor:");

        JTFFornComplemento.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornNomeFantasia.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornNomeFantasia.setText("Nome Fantasia:");

        JTFFornNomeFantasia.setFont(new java.awt.Font("Arial", 0, 11));

        JTFFornNomeVendedor.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornCelularVendedor.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornCelularVendedor.setText("Celular Vendedor:");

        try {
            JFTFFornTelefoneVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFFornTelefoneVendedor.setToolTipText("");
        JFTFFornTelefoneVendedor.setFont(new java.awt.Font("Arial", 0, 11));

        JLFornTelefoneVendedor.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornTelefoneVendedor.setText("Fone Vendedor:");

        try {
            JFTFFornCelularVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFFornCelularVendedor.setToolTipText("");
        JFTFFornCelularVendedor.setFont(new java.awt.Font("Arial", 0, 11));

        JTAFornObservacao.setColumns(20);
        JTAFornObservacao.setFont(new java.awt.Font("Arial", 2, 11));
        JTAFornObservacao.setLineWrap(true);
        JTAFornObservacao.setRows(3);
        JTAFornObservacao.setToolTipText("Observação Sobre o Cliente");
        jScrollPane1.setViewportView(JTAFornObservacao);

        JLFornObservacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JLFornObservacao.setText("Observação:");

        try {
            JFTFFornInscricaoEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFFornInscricaoEstadual.setFont(new java.awt.Font("Arial", 0, 11));

        try {
            JFTFFornNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTFFornNumero.setFont(new java.awt.Font("Arial", 0, 11));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLFornObservacao)
                    .addComponent(JLFornTelefoneVendedor)
                    .addComponent(JLFornNomeVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JTFFornNomeVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(JFTFFornTelefoneVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(JLFornCelularVendedor)
                            .addGap(4, 4, 4)
                            .addComponent(JFTFFornCelularVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLFornTelefone)
                    .addComponent(JLFornEstado)
                    .addComponent(JLFornBairro)
                    .addComponent(JLFornEndereco)
                    .addComponent(JLFornCnpj)
                    .addComponent(JLFornNomeFantasia)
                    .addComponent(JLFornRazaoSocial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JFTFFornTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(JLFornEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFFornEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JFTFFornCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(JLFornInscricaoEstadual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JFTFFornInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addComponent(JLFornCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JCBFornCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JCBFornEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JTFFornBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JLFornComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(JTFFornComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JTFFornEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JLFornCep)
                                .addComponent(JLFornNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JFTFFornNumero, 0, 0, Short.MAX_VALUE)
                                .addComponent(JFTFFornCep, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFFornNomeFantasia)
                            .addComponent(JTFFornRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLFornDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCFornDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(JBFornSalvar)
                .addGap(26, 26, 26)
                .addComponent(JBFornCancelar)
                .addContainerGap(256, Short.MAX_VALUE))
            .addComponent(JSCliTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFornSalvar)
                    .addComponent(JBFornCancelar))
                .addGap(15, 15, 15)
                .addComponent(JSCliTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JLFornRazaoSocial)
                    .addComponent(JTFFornRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLFornDataCadastro)
                    .addComponent(JDCFornDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(JLFornNomeFantasia)
                            .addComponent(JTFFornNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLFornCnpj)
                            .addComponent(JLFornInscricaoEstadual)
                            .addComponent(JFTFFornCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFTFFornInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLFornEndereco)
                            .addComponent(JTFFornEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLFornBairro)
                            .addComponent(JTFFornBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLFornComplemento)
                            .addComponent(JTFFornComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLFornNumero)
                            .addComponent(JFTFFornNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLFornCep)
                            .addComponent(JFTFFornCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFornEstado)
                    .addComponent(JCBFornEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLFornCidade)
                    .addComponent(JCBFornCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFornTelefone)
                    .addComponent(JFTFFornTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLFornEmail)
                    .addComponent(JTFFornEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFornNomeVendedor)
                    .addComponent(JTFFornNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLFornTelefoneVendedor)
                    .addComponent(JFTFFornTelefoneVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLFornCelularVendedor)
                    .addComponent(JFTFFornCelularVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLFornObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-734)/2, (screenSize.height-430)/2, 734, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void JBFornCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFornCancelarActionPerformed
        if (evt.getSource() == JBFornCancelar) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja fechar a tela de Cadastro de Fornecedores?",
                     "Fechar Cadastro de Fornecedores", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
             } 
        }    
}//GEN-LAST:event_JBFornCancelarActionPerformed

    private void JBFornSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFornSalvarActionPerformed
        DAOGenerico<Fornecedor> dao = new DAOGenerico<Fornecedor>(Fornecedor.class);
        
        if (fornecedor == null) {
            Fornecedor forn = new Fornecedor();
            forn.setFornRazaoSocial(JTFFornRazaoSocial.getText());
            forn.setFornDataCadastro(JDCFornDataCadastro.getDate());
            forn.setFornNomeFantasia(JTFFornNomeFantasia.getText());
            forn.setFornCNPJ(JFTFFornCnpj.getText());
            forn.setFornInscricaoEstadual(JFTFFornInscricaoEstadual.getText());
            forn.setFornEndereco(JTFFornEndereco.getText());
            forn.setFornNumero(JFTFFornNumero.getText());
            forn.setFornBairro(JTFFornBairro.getText());
            forn.setFornComplemento(JTFFornComplemento.getText());
            forn.setFornCep(JFTFFornCep.getText());
            forn.setEstado((Estado) JCBFornEstado.getSelectedItem());
            forn.setCidade((Cidade) JCBFornCidade.getSelectedItem());
            forn.setFornTelefone(JFTFFornTelefone.getText());
            forn.setFornEmail(JTFFornEmail.getText());
            forn.setFornNomeVendedor(JTFFornNomeVendedor.getText());
            forn.setFornTelefoneVendedor(JFTFFornTelefoneVendedor.getText());
            forn.setFornCelularVendedor(JFTFFornCelularVendedor.getText());
            forn.setFornObservacao(JTAFornObservacao.getText());
            dao.insert(forn);  
        } else { 
               fornecedor.setFornRazaoSocial(JTFFornRazaoSocial.getText());
               fornecedor.setFornDataCadastro(JDCFornDataCadastro.getDate());
               fornecedor.setFornNomeFantasia(JTFFornNomeFantasia.getText());
               fornecedor.setFornCNPJ(JFTFFornCnpj.getText());
               fornecedor.setFornInscricaoEstadual(JFTFFornInscricaoEstadual.getText());
               fornecedor.setFornEndereco(JTFFornEndereco.getText());
               fornecedor.setFornNumero(JFTFFornNumero.getText());
               fornecedor.setFornBairro(JTFFornBairro.getText());
               fornecedor.setFornComplemento(JTFFornComplemento.getText());
               fornecedor.setFornCep(JFTFFornCep.getText());
               fornecedor.setEstado((Estado) JCBFornEstado.getSelectedItem());
               fornecedor.setCidade((Cidade) JCBFornCidade.getSelectedItem());
               fornecedor.setFornTelefone(JFTFFornTelefone.getText());
               fornecedor.setFornEmail(JTFFornEmail.getText());
               fornecedor.setFornNomeVendedor(JTFFornNomeVendedor.getText());
               fornecedor.setFornTelefoneVendedor(JFTFFornTelefoneVendedor.getText());
               fornecedor.setFornCelularVendedor(JFTFFornCelularVendedor.getText());
               fornecedor.setFornObservacao(JTAFornObservacao.getText());
               dao.update(fornecedor);
            }    
        setVisible(false);
}//GEN-LAST:event_JBFornSalvarActionPerformed
     
            public void run() {
               ViewFornecedor dialogFornecedor = new ViewFornecedor(new javax.swing.JFrame(), true);
                dialogFornecedor.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogFornecedor.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBFornCancelar;
    private javax.swing.JButton JBFornSalvar;
    private javax.swing.JComboBox JCBFornCidade;
    private javax.swing.JComboBox JCBFornEstado;
    private com.toedter.calendar.JDateChooser JDCFornDataCadastro;
    private javax.swing.JFormattedTextField JFTFFornCelularVendedor;
    private javax.swing.JFormattedTextField JFTFFornCep;
    private javax.swing.JFormattedTextField JFTFFornCnpj;
    private javax.swing.JFormattedTextField JFTFFornInscricaoEstadual;
    private javax.swing.JFormattedTextField JFTFFornNumero;
    private javax.swing.JFormattedTextField JFTFFornTelefone;
    private javax.swing.JFormattedTextField JFTFFornTelefoneVendedor;
    private javax.swing.JLabel JLFornBairro;
    private javax.swing.JLabel JLFornCelularVendedor;
    private javax.swing.JLabel JLFornCep;
    private javax.swing.JLabel JLFornCidade;
    private javax.swing.JLabel JLFornCnpj;
    private javax.swing.JLabel JLFornComplemento;
    private javax.swing.JLabel JLFornDataCadastro;
    private javax.swing.JLabel JLFornEmail;
    private javax.swing.JLabel JLFornEndereco;
    private javax.swing.JLabel JLFornEstado;
    private javax.swing.JLabel JLFornInscricaoEstadual;
    private javax.swing.JLabel JLFornNomeFantasia;
    private javax.swing.JLabel JLFornNomeVendedor;
    private javax.swing.JLabel JLFornNumero;
    private javax.swing.JLabel JLFornObservacao;
    private javax.swing.JLabel JLFornRazaoSocial;
    private javax.swing.JLabel JLFornTelefone;
    private javax.swing.JLabel JLFornTelefoneVendedor;
    private javax.swing.JSeparator JSCliTopo;
    private javax.swing.JTextArea JTAFornObservacao;
    private javax.swing.JTextField JTFFornBairro;
    private javax.swing.JTextField JTFFornComplemento;
    private javax.swing.JTextField JTFFornEmail;
    private javax.swing.JTextField JTFFornEndereco;
    private javax.swing.JTextField JTFFornNomeFantasia;
    private javax.swing.JTextField JTFFornNomeVendedor;
    private javax.swing.JTextField JTFFornRazaoSocial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}