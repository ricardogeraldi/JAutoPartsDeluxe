
package views;

import entidades.Usuario;
import java.util.Scanner;
import javax.swing.JOptionPane;
import util.Relatorio;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public TelaPrincipal() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        JBClientesTelaPrincipal = new javax.swing.JButton();
        JBFornecedoresTelaPrincipal = new javax.swing.JButton();
        JBProdutosTelaPrincipal = new javax.swing.JButton();
        JBPrateleirasTelaPrincipal = new javax.swing.JButton();
        JBVeiculosTelaPrincipal = new javax.swing.JButton();
        JBEntradaTelaPrincipal = new javax.swing.JButton();
        JBSaidaTelaPrincipal = new javax.swing.JButton();
        JBSairTelaPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmiEmpresas = new javax.swing.JMenuItem();
        jmiFornecedores = new javax.swing.JMenuItem();
        jmiUsuarios = new javax.swing.JMenuItem();
        jmiFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jmiPrateleiras = new javax.swing.JMenuItem();
        jmiProdutos = new javax.swing.JMenuItem();
        jmiGrupoProdutos = new javax.swing.JMenuItem();
        jmiSubGrupoProdutos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jmiVeiculos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jmiEstados = new javax.swing.JMenuItem();
        jmiCidades = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        jmiSair = new javax.swing.JMenuItem();
        jmMovimentos = new javax.swing.JMenu();
        jmiEntradaMercadorias = new javax.swing.JMenuItem();
        jmiSaidaMercadorias = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmReCadastrais = new javax.swing.JMenu();
        jmiReClientes = new javax.swing.JMenuItem();
        jmiReEmpresas = new javax.swing.JMenuItem();
        jmiReFornecedores = new javax.swing.JMenuItem();
        jmiReUsuarios = new javax.swing.JMenuItem();
        jmiReFuncionarios = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        jmiRePrateleiras = new javax.swing.JMenuItem();
        jmiReProdutos = new javax.swing.JMenuItem();
        jmiReGrupoProdutos = new javax.swing.JMenuItem();
        jmiReSubGrupoProdutos = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JSeparator();
        jmiReVeiculos = new javax.swing.JMenuItem();
        jmiReEstados = new javax.swing.JMenuItem();
        jmiReCidades = new javax.swing.JMenuItem();
        jmReGerenciais = new javax.swing.JMenu();
        jmiReEntrada = new javax.swing.JMenuItem();
        jmiReSaida = new javax.swing.JMenuItem();
        jmiReTotalEstoque = new javax.swing.JMenuItem();
        jmiReProdutosEstoqueAlto = new javax.swing.JMenuItem();
        jmiReProdutosEstoqueBaixo = new javax.swing.JMenuItem();
        jmiReProdutosMaisVendidos = new javax.swing.JMenuItem();
        jmiReProdutosMenosVendidos = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JSeparator();
        jmiReMelhoresClientes = new javax.swing.JMenuItem();
        jmiReAniversariantes = new javax.swing.JMenuItem();
        jmSistema = new javax.swing.JMenu();
        jmiReIniciarCopiaSeguranca = new javax.swing.JMenuItem();
        jmiReRestaurarCopiaSeguranca = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiDocumentacao = new javax.swing.JMenuItem();
        jmiContato = new javax.swing.JMenuItem();
        jmiSobreSistema = new javax.swing.JMenuItem();
        jmSkins = new javax.swing.JMenu();
        jmiSkinMetal = new javax.swing.JRadioButtonMenuItem();
        jmiSkinWindows = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Parts Deluxe");

        jToolBar1.setFloatable(false);

        JBClientesTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBClientesTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeClientes.png"))); // NOI18N
        JBClientesTelaPrincipal.setText("Clientes");
        JBClientesTelaPrincipal.setToolTipText("Cadastro de Clientes");
        JBClientesTelaPrincipal.setFocusable(false);
        JBClientesTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBClientesTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBClientesTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBClientesTelaPrincipal);

        JBFornecedoresTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBFornecedoresTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeFornecedores.png"))); // NOI18N
        JBFornecedoresTelaPrincipal.setText("Fornecedores");
        JBFornecedoresTelaPrincipal.setToolTipText("Cadastro de Fornecedores");
        JBFornecedoresTelaPrincipal.setFocusable(false);
        JBFornecedoresTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBFornecedoresTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBFornecedoresTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFornecedoresTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBFornecedoresTelaPrincipal);

        JBProdutosTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBProdutosTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeProdutos.png"))); // NOI18N
        JBProdutosTelaPrincipal.setText("Produtos");
        JBProdutosTelaPrincipal.setToolTipText("Cadastro de Produtos");
        JBProdutosTelaPrincipal.setFocusable(false);
        JBProdutosTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBProdutosTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBProdutosTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProdutosTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBProdutosTelaPrincipal);

        JBPrateleirasTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBPrateleirasTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconePrateleiras.png"))); // NOI18N
        JBPrateleirasTelaPrincipal.setText("Prateleiras");
        JBPrateleirasTelaPrincipal.setToolTipText("Cadastro de Prateleiras");
        JBPrateleirasTelaPrincipal.setFocusable(false);
        JBPrateleirasTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBPrateleirasTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBPrateleirasTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPrateleirasTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBPrateleirasTelaPrincipal);

        JBVeiculosTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBVeiculosTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeVeiculos.png"))); // NOI18N
        JBVeiculosTelaPrincipal.setText("Veículos");
        JBVeiculosTelaPrincipal.setToolTipText("Cadastro de Veículos");
        JBVeiculosTelaPrincipal.setFocusable(false);
        JBVeiculosTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBVeiculosTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBVeiculosTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVeiculosTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBVeiculosTelaPrincipal);

        JBEntradaTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBEntradaTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeEntrada.png"))); // NOI18N
        JBEntradaTelaPrincipal.setText("Entrada");
        JBEntradaTelaPrincipal.setToolTipText("Movimentação de Entrada de Mercadorias");
        JBEntradaTelaPrincipal.setFocusable(false);
        JBEntradaTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBEntradaTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBEntradaTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntradaTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBEntradaTelaPrincipal);

        JBSaidaTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBSaidaTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeSaida.png"))); // NOI18N
        JBSaidaTelaPrincipal.setText("Saída");
        JBSaidaTelaPrincipal.setToolTipText("Movimentação de Saída de Mercadorias");
        JBSaidaTelaPrincipal.setFocusable(false);
        JBSaidaTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBSaidaTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBSaidaTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaidaTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBSaidaTelaPrincipal);

        JBSairTelaPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBSairTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeSair.png"))); // NOI18N
        JBSairTelaPrincipal.setText("Sair da Sessão");
        JBSairTelaPrincipal.setToolTipText("Sair da Sessão");
        JBSairTelaPrincipal.setFocusable(false);
        JBSairTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBSairTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBSairTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairTelaPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(JBSairTelaPrincipal);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/logo2.png"))); // NOI18N

        jToolBar2.setFloatable(false);

        jLabel2.setText(new Usuario().getUsuNome());
        jToolBar2.add(jLabel2);
        jToolBar2.add(jSeparator8);

        jmCadastros.setText("Cadastros");

        jmiClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiClientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeClientes.png"))); // NOI18N
        jmiClientes.setText("Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiClientes);

        jmiEmpresas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiEmpresas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/empresa.png"))); // NOI18N
        jmiEmpresas.setText("Empresas");
        jmiEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmpresasActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiEmpresas);

        jmiFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiFornecedores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeFornecedores.png"))); // NOI18N
        jmiFornecedores.setText("Fornecedores");
        jmiFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFornecedoresActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiFornecedores);

        jmiUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/usuario.png"))); // NOI18N
        jmiUsuarios.setText("Usuários");
        jmiUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuariosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiUsuarios);

        jmiFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/funcionario.png"))); // NOI18N
        jmiFuncionarios.setText("Funcionários");
        jmiFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFuncionariosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiFuncionarios);
        jmCadastros.add(jSeparator1);

        jmiPrateleiras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiPrateleiras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiPrateleiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconePrateleiras.png"))); // NOI18N
        jmiPrateleiras.setText("Prateleiras");
        jmiPrateleiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrateleirasActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiPrateleiras);

        jmiProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiProdutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeProdutos.png"))); // NOI18N
        jmiProdutos.setText("Produtos");
        jmiProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiProdutos);

        jmiGrupoProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiGrupoProdutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiGrupoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/grupo.png"))); // NOI18N
        jmiGrupoProdutos.setText("Grupos de Produtos");
        jmiGrupoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGrupoProdutosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiGrupoProdutos);

        jmiSubGrupoProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiSubGrupoProdutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiSubGrupoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/subgrupo.png"))); // NOI18N
        jmiSubGrupoProdutos.setText("Sub-Grupos de Produtos");
        jmiSubGrupoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSubGrupoProdutosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiSubGrupoProdutos);
        jmCadastros.add(jSeparator2);

        jmiVeiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiVeiculos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeVeiculos.png"))); // NOI18N
        jmiVeiculos.setText("Veículos");
        jmiVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVeiculosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiVeiculos);
        jmCadastros.add(jSeparator3);

        jmiEstados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiEstados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiEstados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/estado.png"))); // NOI18N
        jmiEstados.setText("Estados");
        jmiEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstadosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiEstados);

        jmiCidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiCidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/cidade.png"))); // NOI18N
        jmiCidades.setText("Cidades");
        jmiCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCidadesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCidades);
        jmCadastros.add(jSeparator4);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeSair.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiSair);

        jMenuBar1.add(jmCadastros);

        jmMovimentos.setText("Movimentos");

        jmiEntradaMercadorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiEntradaMercadorias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiEntradaMercadorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeEntrada.png"))); // NOI18N
        jmiEntradaMercadorias.setText("Entrada de Mercadorias");
        jmiEntradaMercadorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEntradaMercadoriasActionPerformed(evt);
            }
        });
        jmMovimentos.add(jmiEntradaMercadorias);

        jmiSaidaMercadorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiSaidaMercadorias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiSaidaMercadorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iconeSaida.png"))); // NOI18N
        jmiSaidaMercadorias.setText("Saída de Mercadorias");
        jmiSaidaMercadorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaidaMercadoriasActionPerformed(evt);
            }
        });
        jmMovimentos.add(jmiSaidaMercadorias);

        jMenuBar1.add(jmMovimentos);

        jmRelatorios.setText("Relatórios");

        jmReCadastrais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/reCadastral.png"))); // NOI18N
        jmReCadastrais.setText("Cadastrais");
        jmReCadastrais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmiReClientes.setText("Clientes");
        jmiReClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReClientesActionPerformed(evt);
            }
        });
        jmReCadastrais.add(jmiReClientes);

        jmiReEmpresas.setText("Empresas");
        jmReCadastrais.add(jmiReEmpresas);

        jmiReFornecedores.setText("Fornecedores");
        jmReCadastrais.add(jmiReFornecedores);

        jmiReUsuarios.setText("Usuários");
        jmReCadastrais.add(jmiReUsuarios);

        jmiReFuncionarios.setText("Funcionários");
        jmReCadastrais.add(jmiReFuncionarios);
        jmReCadastrais.add(jSeparator5);

        jmiRePrateleiras.setText("Prateleiras");
        jmReCadastrais.add(jmiRePrateleiras);

        jmiReProdutos.setText("Produtos");
        jmReCadastrais.add(jmiReProdutos);

        jmiReGrupoProdutos.setText("Grupos de Produtos");
        jmReCadastrais.add(jmiReGrupoProdutos);

        jmiReSubGrupoProdutos.setText("Sub-Grupos de Produtos");
        jmReCadastrais.add(jmiReSubGrupoProdutos);
        jmReCadastrais.add(jSeparator6);

        jmiReVeiculos.setText("Veículos");
        jmReCadastrais.add(jmiReVeiculos);

        jmiReEstados.setText("Estados");
        jmiReEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReEstadosActionPerformed(evt);
            }
        });
        jmReCadastrais.add(jmiReEstados);

        jmiReCidades.setText("Cidades");
        jmReCadastrais.add(jmiReCidades);

        jmRelatorios.add(jmReCadastrais);

        jmReGerenciais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/reGerencial.png"))); // NOI18N
        jmReGerenciais.setText("Gerenciais");
        jmReGerenciais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmiReEntrada.setText("Entrada de Mercadorias");
        jmReGerenciais.add(jmiReEntrada);

        jmiReSaida.setText("Saída de Mercadorias");
        jmReGerenciais.add(jmiReSaida);

        jmiReTotalEstoque.setText("Total do Estoque");
        jmReGerenciais.add(jmiReTotalEstoque);

        jmiReProdutosEstoqueAlto.setText("Produtos Com Estoque Alto");
        jmReGerenciais.add(jmiReProdutosEstoqueAlto);

        jmiReProdutosEstoqueBaixo.setText("Produtos Com Estoque Baixo");
        jmReGerenciais.add(jmiReProdutosEstoqueBaixo);

        jmiReProdutosMaisVendidos.setText("Produtos Mais Vendidos");
        jmReGerenciais.add(jmiReProdutosMaisVendidos);

        jmiReProdutosMenosVendidos.setText("Produtos Menos Vendidos");
        jmReGerenciais.add(jmiReProdutosMenosVendidos);
        jmReGerenciais.add(jSeparator7);

        jmiReMelhoresClientes.setText("Melhores Clientes");
        jmReGerenciais.add(jmiReMelhoresClientes);

        jmiReAniversariantes.setText("Aniversariantes");
        jmReGerenciais.add(jmiReAniversariantes);

        jmRelatorios.add(jmReGerenciais);

        jMenuBar1.add(jmRelatorios);

        jmSistema.setText("Sistema");

        jmiReIniciarCopiaSeguranca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiReIniciarCopiaSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/iniciarCopia.png"))); // NOI18N
        jmiReIniciarCopiaSeguranca.setText("Iniciar Cópia de Segurança");
        jmiReIniciarCopiaSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReIniciarCopiaSegurancaActionPerformed(evt);
            }
        });
        jmSistema.add(jmiReIniciarCopiaSeguranca);

        jmiReRestaurarCopiaSeguranca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiReRestaurarCopiaSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/restauraCopia.png"))); // NOI18N
        jmiReRestaurarCopiaSeguranca.setText("Restaurar Cópia de Segurança");
        jmSistema.add(jmiReRestaurarCopiaSeguranca);

        jMenuBar1.add(jmSistema);

        jmAjuda.setText("Ajuda");

        jmiDocumentacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiDocumentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/documentacao.png"))); // NOI18N
        jmiDocumentacao.setText("Documentação");
        jmAjuda.add(jmiDocumentacao);

        jmiContato.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/contato.png"))); // NOI18N
        jmiContato.setText("Contato");
        jmiContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContatoActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiContato);

        jmiSobreSistema.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiSobreSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/sobreSistema.png"))); // NOI18N
        jmiSobreSistema.setText("Sobre o Sistema");
        jmAjuda.add(jmiSobreSistema);

        jMenuBar1.add(jmAjuda);

        jmSkins.setText("Skins");

        jmiSkinMetal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiSkinMetal.setText("Metal");
        jmiSkinMetal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/skMetal.png"))); // NOI18N
        jmSkins.add(jmiSkinMetal);

        jmiSkinWindows.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmiSkinWindows.setText("Windows");
        jmiSkinWindows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenseicones/skWindows.png"))); // NOI18N
        jmSkins.add(jmiSkinWindows);

        jMenuBar1.add(jmSkins);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
          ViewClienteConsulta viewclienteconsulta = new ViewClienteConsulta();
          viewclienteconsulta.setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmpresasActionPerformed
          ViewEmpresaConsulta viewempresaconsulta = new ViewEmpresaConsulta();
          viewempresaconsulta.setVisible(true);
    }//GEN-LAST:event_jmiEmpresasActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        if (evt.getSource() == jmiSair) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja Realmente Fechar esta Sessão do Sistema?",
                     "Fechar Sessão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
                 ViewLogin viewlogin = new ViewLogin();
                 viewlogin.setVisible(true);
             } 
        }    
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFornecedoresActionPerformed
          ViewFornecedorConsulta viewfornecedorconsulta = new ViewFornecedorConsulta();
          viewfornecedorconsulta.setVisible(true);
    }//GEN-LAST:event_jmiFornecedoresActionPerformed

    private void jmiFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFuncionariosActionPerformed
          ViewFuncionarioConsulta viewfuncionarioconsulta = new ViewFuncionarioConsulta();
          viewfuncionarioconsulta.setVisible(true);
    }//GEN-LAST:event_jmiFuncionariosActionPerformed

    private void jmiUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuariosActionPerformed
          ViewUsuarioConsulta viewusuarioconsulta = new ViewUsuarioConsulta();
          viewusuarioconsulta.setVisible(true);
    }//GEN-LAST:event_jmiUsuariosActionPerformed

private void JBProdutosTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProdutosTelaPrincipalActionPerformed
          ViewProdutoConsulta viewprodutoconsulta = new ViewProdutoConsulta();
          viewprodutoconsulta.setVisible(true);
}//GEN-LAST:event_JBProdutosTelaPrincipalActionPerformed

private void jmiPrateleirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrateleirasActionPerformed
          ViewPrateleiraConsulta viewprateleiraconsulta = new ViewPrateleiraConsulta();
          viewprateleiraconsulta.setVisible(true);
}//GEN-LAST:event_jmiPrateleirasActionPerformed

private void jmiProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutosActionPerformed
          ViewProdutoConsulta viewprodutoconsulta = new ViewProdutoConsulta();
          viewprodutoconsulta.setVisible(true);
}//GEN-LAST:event_jmiProdutosActionPerformed

private void jmiGrupoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGrupoProdutosActionPerformed
          ViewGrupoConsulta viewgrupoconsulta = new ViewGrupoConsulta();
          viewgrupoconsulta.setVisible(true);
}//GEN-LAST:event_jmiGrupoProdutosActionPerformed

private void jmiSubGrupoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSubGrupoProdutosActionPerformed
          ViewSubGrupoConsulta viewsubgrupoconsulta = new ViewSubGrupoConsulta();
          viewsubgrupoconsulta.setVisible(true);
}//GEN-LAST:event_jmiSubGrupoProdutosActionPerformed

private void jmiVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVeiculosActionPerformed
          ViewVeiculoConsulta viewveiculoconsulta = new ViewVeiculoConsulta();
          viewveiculoconsulta.setVisible(true);
}//GEN-LAST:event_jmiVeiculosActionPerformed

private void jmiEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstadosActionPerformed
          ViewEstadoConsulta viewestadoconsulta = new ViewEstadoConsulta();
          viewestadoconsulta.setVisible(true);
}//GEN-LAST:event_jmiEstadosActionPerformed

private void jmiCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCidadesActionPerformed
          ViewCidadeConsulta viewcidadeconsulta = new ViewCidadeConsulta();
          viewcidadeconsulta.setVisible(true);
}//GEN-LAST:event_jmiCidadesActionPerformed

private void JBSairTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairTelaPrincipalActionPerformed
        if (evt.getSource() == JBSairTelaPrincipal) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja Realmente Fechar esta Sessão do Sistema?",
                     "Fechar Sessão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
                 dispose();
                 ViewLogin viewlogin = new ViewLogin();
                 viewlogin.setVisible(true);
             } 
        }  
}//GEN-LAST:event_JBSairTelaPrincipalActionPerformed

private void JBClientesTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesTelaPrincipalActionPerformed
          ViewClienteConsulta viewclienteconsulta = new ViewClienteConsulta();
          viewclienteconsulta.setVisible(true);
}//GEN-LAST:event_JBClientesTelaPrincipalActionPerformed

private void JBFornecedoresTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFornecedoresTelaPrincipalActionPerformed
          ViewFornecedorConsulta viewfornecedorconsulta = new ViewFornecedorConsulta();
          viewfornecedorconsulta.setVisible(true);
}//GEN-LAST:event_JBFornecedoresTelaPrincipalActionPerformed

private void JBPrateleirasTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPrateleirasTelaPrincipalActionPerformed
          ViewPrateleiraConsulta viewprateleiraconsulta = new ViewPrateleiraConsulta();
          viewprateleiraconsulta.setVisible(true);
}//GEN-LAST:event_JBPrateleirasTelaPrincipalActionPerformed

private void JBVeiculosTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVeiculosTelaPrincipalActionPerformed
          ViewVeiculoConsulta viewveiculoconsulta = new ViewVeiculoConsulta();
          viewveiculoconsulta.setVisible(true);
}//GEN-LAST:event_JBVeiculosTelaPrincipalActionPerformed

private void JBEntradaTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntradaTelaPrincipalActionPerformed
          ViewEntradaConsulta viewentradaconsulta = new ViewEntradaConsulta();
          viewentradaconsulta.setVisible(true);
}//GEN-LAST:event_JBEntradaTelaPrincipalActionPerformed

private void JBSaidaTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaidaTelaPrincipalActionPerformed
          ViewSaidaConsulta viewsaidaconsulta = new ViewSaidaConsulta();
          viewsaidaconsulta.setVisible(true);
}//GEN-LAST:event_JBSaidaTelaPrincipalActionPerformed

private void jmiEntradaMercadoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEntradaMercadoriasActionPerformed
          ViewEntradaConsulta viewentradaconsulta = new ViewEntradaConsulta();
          viewentradaconsulta.setVisible(true);
}//GEN-LAST:event_jmiEntradaMercadoriasActionPerformed

private void jmiSaidaMercadoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaidaMercadoriasActionPerformed
          ViewSaidaConsulta viewsaidaconsulta = new ViewSaidaConsulta();
          viewsaidaconsulta.setVisible(true);
}//GEN-LAST:event_jmiSaidaMercadoriasActionPerformed

private void jmiReIniciarCopiaSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReIniciarCopiaSegurancaActionPerformed
          if (evt.getSource() == jmiReIniciarCopiaSeguranca) {         
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Iniciar Cópia de Segurança?",
                     "Cópia de Segurança", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {        
          try {
            Scanner s = new Scanner(Runtime.getRuntime().exec("C:/Arquivos de " +
            "programas/PostgreSQL/8.2/bin/pg_dump.exe -i -h 127.0.0.1 -p 5432" +
            " -U postgres -F c -b -v -f C:/autopecas.bck autopecas").getInputStream()); 
          } catch (Exception exx) {
              exx.printStackTrace();
          }
     }
}          
}//GEN-LAST:event_jmiReIniciarCopiaSegurancaActionPerformed

private void jmiReClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReClientesActionPerformed
         Relatorio reClientes = new Relatorio("../JAutoPartsDeluxe/src/relatorios/Clientes.jasper");
         reClientes.setVisible(true);
}//GEN-LAST:event_jmiReClientesActionPerformed

private void jmiReEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReEstadosActionPerformed
         Relatorio reClientes = new Relatorio("../JAutoPartsDeluxe/src/relatorios/Estados.jasper");
         reClientes.setVisible(true);
}//GEN-LAST:event_jmiReEstadosActionPerformed

private void jmiContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContatoActionPerformed
        Contato con = new Contato();
        con.setVisible(true);
}//GEN-LAST:event_jmiContatoActionPerformed

            public void run() {
                new TelaPrincipal().setVisible(true);
            }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBClientesTelaPrincipal;
    private javax.swing.JButton JBEntradaTelaPrincipal;
    private javax.swing.JButton JBFornecedoresTelaPrincipal;
    private javax.swing.JButton JBPrateleirasTelaPrincipal;
    private javax.swing.JButton JBProdutosTelaPrincipal;
    private javax.swing.JButton JBSaidaTelaPrincipal;
    private javax.swing.JButton JBSairTelaPrincipal;
    private javax.swing.JButton JBVeiculosTelaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmMovimentos;
    private javax.swing.JMenu jmReCadastrais;
    private javax.swing.JMenu jmReGerenciais;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JMenu jmSkins;
    private javax.swing.JMenuItem jmiCidades;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiContato;
    private javax.swing.JMenuItem jmiDocumentacao;
    private javax.swing.JMenuItem jmiEmpresas;
    private javax.swing.JMenuItem jmiEntradaMercadorias;
    private javax.swing.JMenuItem jmiEstados;
    private javax.swing.JMenuItem jmiFornecedores;
    private javax.swing.JMenuItem jmiFuncionarios;
    private javax.swing.JMenuItem jmiGrupoProdutos;
    private javax.swing.JMenuItem jmiPrateleiras;
    private javax.swing.JMenuItem jmiProdutos;
    private javax.swing.JMenuItem jmiReAniversariantes;
    private javax.swing.JMenuItem jmiReCidades;
    private javax.swing.JMenuItem jmiReClientes;
    private javax.swing.JMenuItem jmiReEmpresas;
    private javax.swing.JMenuItem jmiReEntrada;
    private javax.swing.JMenuItem jmiReEstados;
    private javax.swing.JMenuItem jmiReFornecedores;
    private javax.swing.JMenuItem jmiReFuncionarios;
    private javax.swing.JMenuItem jmiReGrupoProdutos;
    private javax.swing.JMenuItem jmiReIniciarCopiaSeguranca;
    private javax.swing.JMenuItem jmiReMelhoresClientes;
    private javax.swing.JMenuItem jmiRePrateleiras;
    private javax.swing.JMenuItem jmiReProdutos;
    private javax.swing.JMenuItem jmiReProdutosEstoqueAlto;
    private javax.swing.JMenuItem jmiReProdutosEstoqueBaixo;
    private javax.swing.JMenuItem jmiReProdutosMaisVendidos;
    private javax.swing.JMenuItem jmiReProdutosMenosVendidos;
    private javax.swing.JMenuItem jmiReRestaurarCopiaSeguranca;
    private javax.swing.JMenuItem jmiReSaida;
    private javax.swing.JMenuItem jmiReSubGrupoProdutos;
    private javax.swing.JMenuItem jmiReTotalEstoque;
    private javax.swing.JMenuItem jmiReUsuarios;
    private javax.swing.JMenuItem jmiReVeiculos;
    private javax.swing.JMenuItem jmiSaidaMercadorias;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JRadioButtonMenuItem jmiSkinMetal;
    private javax.swing.JRadioButtonMenuItem jmiSkinWindows;
    private javax.swing.JMenuItem jmiSobreSistema;
    private javax.swing.JMenuItem jmiSubGrupoProdutos;
    private javax.swing.JMenuItem jmiUsuarios;
    private javax.swing.JMenuItem jmiVeiculos;
    // End of variables declaration//GEN-END:variables
    
}
