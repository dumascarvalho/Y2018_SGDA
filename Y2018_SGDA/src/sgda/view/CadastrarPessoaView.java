package sgda.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sgda.dao.CursoDAO;
import sgda.dao.PessoaDAO;
import sgda.model.AdministradorModel;
import sgda.model.AlunoModel;
import sgda.model.FormatarCamposModel;
import sgda.model.PessoaModel;
import sgda.model.ProfessorModel;
import sgda.model.RedimensionarJTableModel;

public class CadastrarPessoaView extends javax.swing.JPanel {

    public CadastrarPessoaView() {
        initComponents();
        Pessoa.setVisible(false);
        btnLimpar.setVisible(false);
        tabelaPessoa.getParent().setBackground(new Color(217, 224, 217));
    }

    private void limparCamposEspecificos() {
        txtDtMatricula.setText("");
        cmbCurso.setSelectedIndex(-1);
        cmbSituacao.setSelectedIndex(-1);
        txtSalario.setText("");
        txtDtAdmissao.setText("");
        cmbBanco.setSelectedIndex(-1);
        txtAgencia.setText("");
        txtConta.setText("");
        cmbNivel.setSelectedIndex(-1);
        cmbFormacao.setSelectedIndex(-1);
    }

    private void limparCamposComuns() {
        txtNome.setText("");
        cmbGenero.setSelectedIndex(-1);
        txtDtNascimento.setText("");
        txtRG.setText("");
        txtCPF.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cmbEstado.setSelectedIndex(-1);
        txtCEP.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        Adicional = new javax.swing.JPanel();
        Vazio = new javax.swing.JPanel();
        Aluno = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        cmbCodigo = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cmbSituacao = new javax.swing.JComboBox<>();
        txtDtMatricula = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        Outros = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtDtAdmissao = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbBanco = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtConta = new javax.swing.JTextField();
        lblFormacao = new javax.swing.JLabel();
        cmbFormacao = new javax.swing.JComboBox<>();
        lblNivel = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox<>();
        CRUD = new javax.swing.JPanel();
        menuBancoDados = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRemover = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        scrollPessoa = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();
        Pessoa = new javax.swing.JPanel();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setBackground(new java.awt.Color(165, 214, 167));
        setPreferredSize(new java.awt.Dimension(846, 678));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Pessoas");

        lblLogo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogo.setText("Selecione um Perfil:");

        cmbPerfil.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Aluno", "Professor" }));
        cmbPerfil.setSelectedIndex(-1);
        cmbPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbPerfil.setFocusable(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        Adicional.setBackground(new java.awt.Color(165, 214, 167));
        Adicional.setPreferredSize(new java.awt.Dimension(350, 300));
        Adicional.setLayout(new java.awt.CardLayout());

        Vazio.setBackground(new java.awt.Color(165, 214, 167));
        Vazio.setPreferredSize(new java.awt.Dimension(300, 295));

        javax.swing.GroupLayout VazioLayout = new javax.swing.GroupLayout(Vazio);
        Vazio.setLayout(VazioLayout);
        VazioLayout.setHorizontalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        VazioLayout.setVerticalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        Adicional.add(Vazio, "Vazio");

        Aluno.setBackground(new java.awt.Color(165, 214, 167));
        Aluno.setPreferredSize(new java.awt.Dimension(300, 295));

        jLabel21.setText("Data de Matrícula:");

        jLabel22.setText("Curso:");

        cmbCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        cmbCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigo.setEnabled(false);
        cmbCodigo.setFocusable(false);
        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });

        jLabel23.setText("Situação:");

        cmbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cursando", "Formado", "Jubilado" }));
        cmbSituacao.setSelectedIndex(-1);
        cmbSituacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtDtMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtDtMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtMatricula.setToolTipText("Formato: AAAA/MM/DD");
        txtDtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDtMatriculaKeyPressed(evt);
            }
        });

        jLabel24.setText("Código:");

        javax.swing.GroupLayout AlunoLayout = new javax.swing.GroupLayout(Aluno);
        Aluno.setLayout(AlunoLayout);
        AlunoLayout.setHorizontalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(cmbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AlunoLayout.createSequentialGroup()
                        .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        AlunoLayout.setVerticalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        Adicional.add(Aluno, "Aluno");

        Outros.setBackground(new java.awt.Color(165, 214, 167));
        Outros.setPreferredSize(new java.awt.Dimension(300, 295));

        jLabel13.setText("Data de Admissão:");

        txtDtAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtDtAdmissao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtAdmissao.setToolTipText("Formato: AAAA/MM/DD");
        txtDtAdmissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDtAdmissaoKeyPressed(evt);
            }
        });

        jLabel14.setText("Salário:");

        txtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioKeyPressed(evt);
            }
        });

        jLabel15.setText("Banco:");

        cmbBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bradesco", "Banco do Brasil", "Caixa Econômica", "Itaú", "Santander", "Outro" }));
        cmbBanco.setSelectedIndex(-1);
        cmbBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel17.setText("Agência:");

        txtAgencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgenciaKeyPressed(evt);
            }
        });

        jLabel18.setText("Conta:");

        txtConta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContaKeyPressed(evt);
            }
        });

        lblFormacao.setText("Formação:");

        cmbFormacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bacharelado", "Licenciatura", "Especializado", "Pós-Graduação", "Mestrado", "Doutorado" }));
        cmbFormacao.setSelectedIndex(-1);
        cmbFormacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblNivel.setText("Nível:");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médio", "Técnico", "Superior" }));
        cmbNivel.setSelectedIndex(-1);
        cmbNivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout OutrosLayout = new javax.swing.GroupLayout(Outros);
        Outros.setLayout(OutrosLayout);
        OutrosLayout.setHorizontalGroup(
            OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
            .addGroup(OutrosLayout.createSequentialGroup()
                .addGroup(OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtDtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormacao)
                    .addComponent(cmbFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel17)
            .addComponent(jLabel18)
            .addGroup(OutrosLayout.createSequentialGroup()
                .addGroup(OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbBanco, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivel)))
        );
        OutrosLayout.setVerticalGroup(
            OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutrosLayout.createSequentialGroup()
                .addGroup(OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OutrosLayout.createSequentialGroup()
                        .addComponent(lblFormacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OutrosLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(OutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OutrosLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OutrosLayout.createSequentialGroup()
                        .addComponent(lblNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Adicional.add(Outros, "Outros");

        CRUD.setBackground(new java.awt.Color(76, 175, 80));
        CRUD.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        CRUD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuBancoDados.setBackground(new java.awt.Color(76, 175, 80));
        menuBancoDados.setFloatable(false);
        menuBancoDados.setBorderPainted(false);
        menuBancoDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBancoDados.setMaximumSize(new java.awt.Dimension(783, 102));
        menuBancoDados.setPreferredSize(new java.awt.Dimension(783, 102));

        jPanel4.setBackground(new java.awt.Color(76, 175, 80));
        jPanel4.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel4);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Pesquisar:");
        menuBancoDados.add(jLabel2);

        jPanel6.setBackground(new java.awt.Color(76, 175, 80));
        jPanel6.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel6);

        txtPesquisar.setEnabled(false);
        txtPesquisar.setMaximumSize(new java.awt.Dimension(200, 30));
        txtPesquisar.setMinimumSize(new java.awt.Dimension(200, 30));
        txtPesquisar.setPreferredSize(new java.awt.Dimension(300, 30));
        txtPesquisar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisarCaretUpdate(evt);
            }
        });
        menuBancoDados.add(txtPesquisar);

        jPanel1.setBackground(new java.awt.Color(76, 175, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel1);

        btnInserir.setBackground(new java.awt.Color(217, 224, 217));
        btnInserir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setActionCommand("");
        btnInserir.setBorder(new javax.swing.border.MatteBorder(null));
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserir.setEnabled(false);
        btnInserir.setFocusable(false);
        btnInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInserir.setMaximumSize(new java.awt.Dimension(100, 30));
        btnInserir.setMinimumSize(new java.awt.Dimension(100, 30));
        btnInserir.setPreferredSize(new java.awt.Dimension(100, 35));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnInserir);

        jPanel2.setBackground(new java.awt.Color(76, 175, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel2);

        btnAlterar.setBackground(new java.awt.Color(217, 224, 217));
        btnAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setActionCommand("");
        btnAlterar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setEnabled(false);
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAlterar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAlterar.setPreferredSize(new java.awt.Dimension(100, 35));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnAlterar);

        jPanel3.setBackground(new java.awt.Color(76, 175, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel3);

        btnRemover.setBackground(new java.awt.Color(217, 224, 217));
        btnRemover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setActionCommand("");
        btnRemover.setBorder(new javax.swing.border.MatteBorder(null));
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.setEnabled(false);
        btnRemover.setFocusable(false);
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setMaximumSize(new java.awt.Dimension(100, 30));
        btnRemover.setMinimumSize(new java.awt.Dimension(100, 30));
        btnRemover.setPreferredSize(new java.awt.Dimension(100, 35));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnRemover);

        jPanel5.setBackground(new java.awt.Color(76, 175, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel5);

        scrollPessoa.setBackground(new java.awt.Color(217, 224, 217));

        tabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaPessoa.setToolTipText("");
        tabelaPessoa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaPessoa.setFocusable(false);
        tabelaPessoa.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaPessoa.setSelectionBackground(new java.awt.Color(76, 175, 80));
        tabelaPessoa.getTableHeader().setResizingAllowed(false);
        tabelaPessoa.getTableHeader().setReorderingAllowed(false);
        tabelaPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPessoaMouseClicked(evt);
            }
        });
        scrollPessoa.setViewportView(tabelaPessoa);

        javax.swing.GroupLayout CRUDLayout = new javax.swing.GroupLayout(CRUD);
        CRUD.setLayout(CRUDLayout);
        CRUDLayout.setHorizontalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        CRUDLayout.setVerticalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CRUDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(menuBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pessoa.setBackground(new java.awt.Color(165, 214, 167));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));
        cmbGenero.setSelectedIndex(-1);
        cmbGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setText("CEP:");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("RG:");

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Nome:");

        jLabel12.setText("Número:");

        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroKeyPressed(evt);
            }
        });

        jLabel9.setText("Bairro:");

        jLabel10.setText("Cidade:");

        jLabel11.setText("Estado:");

        jLabel7.setText("CPF:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Data de Nascimento:");

        txtDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtDtNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtNascimento.setToolTipText("Formato: AAAA/MM/DD");
        txtDtNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDtNascimentoKeyPressed(evt);
            }
        });

        jLabel8.setText("Rua:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        cmbEstado.setSelectedIndex(-1);
        cmbEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Gênero:");

        javax.swing.GroupLayout PessoaLayout = new javax.swing.GroupLayout(Pessoa);
        Pessoa.setLayout(PessoaLayout);
        PessoaLayout.setHorizontalGroup(
            PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
            .addGroup(PessoaLayout.createSequentialGroup()
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCidade)
                    .addComponent(txtCEP)
                    .addComponent(txtBairro)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PessoaLayout.setVerticalGroup(
            PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoaLayout.createSequentialGroup()
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnLimpar.setBackground(new java.awt.Color(217, 224, 217));
        btnLimpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar Campos");
        btnLimpar.setBorder(null);
        btnLimpar.setBorderPainted(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setFocusable(false);
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Adicional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cmbPerfil)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(CRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        btnLimpar.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtDtNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtNascimentoKeyPressed
        FormatarCamposModel.formatarData(txtDtNascimento, evt);
    }//GEN-LAST:event_txtDtNascimentoKeyPressed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        Pessoa.setVisible(true);
        txtPesquisar.setEnabled(true);
        btnInserir.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnRemover.setEnabled(true);
        btnLimpar.setVisible(true);

        CardLayout card = (CardLayout) Adicional.getLayout();

        switch (cmbPerfil.getSelectedIndex()) {
            case 0: // Administrador
                card.show(Adicional, "Outros");

                lblNivel.setVisible(false);
                cmbNivel.setVisible(false);
                lblFormacao.setVisible(false);
                cmbFormacao.setVisible(false);
                break;
            case 1: // Aluno
                card.show(Adicional, "Aluno");

                CursoDAO curso = new CursoDAO();
                cmbCodigo.setModel(new DefaultComboBoxModel(curso.selectForCombo("cod_curso").toArray()));
                cmbCurso.setModel(new DefaultComboBoxModel(curso.selectForCombo("descricao").toArray()));
                cmbCurso.setSelectedIndex(-1);
                break;
            case 2: // Professor
                card.show(Adicional, "Outros");

                lblNivel.setVisible(true);
                cmbNivel.setVisible(true);
                lblFormacao.setVisible(true);
                cmbFormacao.setVisible(true);
                break;
        }

        preencherTabela();
        limparCamposEspecificos();
        limparCamposComuns();
        txtNome.grabFocus();
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void txtDtAdmissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtAdmissaoKeyPressed
        FormatarCamposModel.formatarData(txtDtAdmissao, evt);
    }//GEN-LAST:event_txtDtAdmissaoKeyPressed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        cmbCodigo.setSelectedIndex(cmbCurso.getSelectedIndex());
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void txtDtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtMatriculaKeyPressed
        FormatarCamposModel.formatarData(txtDtMatricula, evt);
    }//GEN-LAST:event_txtDtMatriculaKeyPressed

    private Object encapsularPessoa(PessoaModel obj) {
        obj.setNome(txtNome.getText());
        obj.setGenero(cmbGenero.getSelectedItem().toString());
        obj.setDtnascimento(txtDtNascimento.getText());
        obj.setRg(txtRG.getText());
        obj.setCpf(txtCPF.getText());
        obj.setRua(txtRua.getText());
        obj.setNumero(Integer.parseInt(txtNumero.getText()));
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setEstado(cmbEstado.getSelectedItem().toString());
        obj.setCep(txtCEP.getText());
        obj.setPerfil(cmbPerfil.getSelectedItem().toString());

        return obj;
    }

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            PessoaDAO dao = new PessoaDAO();

            switch (cmbPerfil.getSelectedIndex()) {
                case 0: // Administrador
                    AdministradorModel ad = new AdministradorModel();
                    ad = (AdministradorModel) encapsularPessoa(ad);

                    ad.setDtadmissao(txtDtAdmissao.getText());
                    ad.setSalario(new BigDecimal(txtSalario.getText().replace(",", ".")));
                    ad.setBanco(cmbBanco.getSelectedItem().toString());
                    ad.setAgencia(txtAgencia.getText());
                    ad.setConta(txtConta.getText());

                    dao.insert(ad, "administrador");
                    break;
                case 1: // Aluno
                    AlunoModel al = new AlunoModel();
                    al = (AlunoModel) encapsularPessoa(al);

                    al.setDtmatricula(txtDtMatricula.getText());
                    al.setCurso(Integer.parseInt(cmbCodigo.getSelectedItem().toString()));
                    al.setSituacao(cmbSituacao.getSelectedItem().toString());

                    dao.insert(al, "aluno");
                    break;
                case 2: // Professor
                    ProfessorModel pr = new ProfessorModel();
                    pr = (ProfessorModel) encapsularPessoa(pr);

                    pr.setDtadmissao(txtDtAdmissao.getText());
                    pr.setSalario(new BigDecimal(txtSalario.getText().replace(",", ".")));
                    pr.setBanco(cmbBanco.getSelectedItem().toString());
                    pr.setAgencia(txtAgencia.getText());
                    pr.setConta(txtConta.getText());
                    pr.setFormacao(cmbFormacao.getSelectedItem().toString());
                    pr.setNivel(cmbNivel.getSelectedItem().toString());

                    dao.insert(pr, "professor");
                    break;
            }

            limparCamposEspecificos();
            limparCamposComuns();

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio e/ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            txtNome.grabFocus();
            preencherTabela();
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyPressed
        FormatarCamposModel.formatarTamanho(txtNumero, evt, 5);
    }//GEN-LAST:event_txtNumeroKeyPressed

    private void txtSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyPressed
        FormatarCamposModel.formatarTamanho(txtSalario, evt, 8);
    }//GEN-LAST:event_txtSalarioKeyPressed

    private void txtAgenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgenciaKeyPressed
        FormatarCamposModel.formatarTamanho(txtAgencia, evt, 10);
    }//GEN-LAST:event_txtAgenciaKeyPressed

    private void txtContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContaKeyPressed
        FormatarCamposModel.formatarTamanho(txtConta, evt, 10);
    }//GEN-LAST:event_txtContaKeyPressed

    private void tabelaPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPessoaMouseClicked

        if (tabelaPessoa.getSelectedRow() != -1) {

            txtNome.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("NOME").getModelIndex()).toString());
            cmbGenero.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("GENERO").getModelIndex()).toString());
            txtDtNascimento.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("DT_NASCIMENTO").getModelIndex()).toString());
            txtRG.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("RG").getModelIndex()).toString());
            txtCPF.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("CPF").getModelIndex()).toString());
            txtRua.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("RUA").getModelIndex()).toString());
            txtNumero.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("NUMERO").getModelIndex()).toString());
            txtBairro.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("BAIRRO").getModelIndex()).toString());
            txtCidade.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("CIDADE").getModelIndex()).toString());
            cmbEstado.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("ESTADO").getModelIndex()).toString());
            txtCEP.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("CEP").getModelIndex()).toString());

            switch (cmbPerfil.getSelectedIndex()) {
                case 0: // Administrador
                    txtDtAdmissao.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("DT_ADMISSAO").getModelIndex()).toString());
                    txtSalario.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("SALARIO").getModelIndex()).toString().replace(".", ","));
                    cmbBanco.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("BANCO").getModelIndex()).toString());
                    txtAgencia.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("AGENCIA").getModelIndex()).toString());
                    txtConta.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("CONTA").getModelIndex()).toString());
                    break;
                case 1: // Aluno
                    txtDtMatricula.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("DT_MATRICULA").getModelIndex()).toString());
                    cmbCodigo.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("CURSO").getModelIndex()).toString());
                    cmbSituacao.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("SITUACAO").getModelIndex()).toString());
                    break;
                case 2: // Professor
                    txtDtAdmissao.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("DT_ADMISSAO").getModelIndex()).toString());
                    txtSalario.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("SALARIO").getModelIndex()).toString().replace(".", ","));
                    cmbBanco.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("BANCO").getModelIndex()).toString());
                    txtAgencia.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("AGENCIA").getModelIndex()).toString());
                    txtConta.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("CONTA").getModelIndex()).toString());
                    cmbFormacao.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("FORMACAO").getModelIndex()).toString());
                    cmbNivel.setSelectedItem(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), tabelaPessoa.getColumn("NIVEL").getModelIndex()).toString());
                    break;
            }

            txtNome.grabFocus();
        }
    }//GEN-LAST:event_tabelaPessoaMouseClicked

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        cmbCurso.setSelectedIndex(cmbCodigo.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            PessoaDAO dao = new PessoaDAO();

            switch (cmbPerfil.getSelectedIndex()) {
                case 0: // Administrador
                    AdministradorModel ad = new AdministradorModel();

                    ad.setMatricula((int) tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 0));
                    dao.delete(ad, "administrador");
                    break;
                case 1: // Aluno
                    AlunoModel al = new AlunoModel();

                    al.setMatricula((int) tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 0));
                    dao.delete(al, "aluno");
                    break;
                case 2: // Professor
                    ProfessorModel pr = new ProfessorModel();

                    pr.setMatricula((int) tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 0));
                    dao.delete(pr, "professor");
                    break;
            }

            limparCamposEspecificos();
            limparCamposComuns();

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, "Nenhuma linha foi selecionada!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            txtNome.grabFocus();
            preencherTabela();
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            PessoaDAO dao = new PessoaDAO();

            switch (cmbPerfil.getSelectedIndex()) {
                case 0: // Administrador
                    AdministradorModel ad = new AdministradorModel();
                    ad = (AdministradorModel) encapsularPessoa(ad);

                    ad.setMatricula((int) tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 0));
                    ad.setDtadmissao(txtDtAdmissao.getText());
                    ad.setSalario(new BigDecimal(txtSalario.getText().replace(",", ".")));
                    ad.setBanco(cmbBanco.getSelectedItem().toString());
                    ad.setAgencia(txtAgencia.getText());
                    ad.setConta(txtConta.getText());

                    dao.update(ad, "administrador");
                    break;
                case 1: // Aluno
                    AlunoModel al = new AlunoModel();
                    al = (AlunoModel) encapsularPessoa(al);

                    al.setMatricula((int) tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 0));
                    al.setDtmatricula(txtDtMatricula.getText());
                    al.setCurso(Integer.parseInt(cmbCodigo.getSelectedItem().toString()));
                    al.setSituacao(cmbSituacao.getSelectedItem().toString());

                    dao.update(al, "aluno");
                    break;
                case 2: // Professor
                    ProfessorModel pr = new ProfessorModel();
                    pr = (ProfessorModel) encapsularPessoa(pr);

                    pr.setMatricula((int) tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 0));
                    pr.setDtadmissao(txtDtAdmissao.getText());
                    pr.setSalario(new BigDecimal(txtSalario.getText().replace(",", ".")));
                    pr.setBanco(cmbBanco.getSelectedItem().toString());
                    pr.setAgencia(txtAgencia.getText());
                    pr.setConta(txtConta.getText());
                    pr.setFormacao(cmbFormacao.getSelectedItem().toString());
                    pr.setNivel(cmbNivel.getSelectedItem().toString());

                    dao.update(pr, "professor");
                    break;
            }

            limparCamposEspecificos();
            limparCamposComuns();

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio/formato inválido e/ou nenhuma linha foi selecionada!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            txtNome.grabFocus();
            preencherTabela();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtPesquisarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisarCaretUpdate
        if (!"".equals(txtPesquisar.getText())) {

            String tabela = "";

            switch (cmbPerfil.getSelectedIndex()) {
                case 0: // Administrador
                    tabela = "administrador";
                    break;
                case 1: // Aluno
                    tabela = "aluno";
                    break;
                case 2: // Professor
                    tabela = "professor";
                    break;
            }

            PessoaDAO dao = new PessoaDAO();

            tabelaPessoa.setModel(dao.pesquisarPessoas(tabela, txtPesquisar.getText()));
            tabelaPessoa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaPessoa);
            redimensionar.adjustColumns();

        } else {
            preencherTabela();
        }
    }//GEN-LAST:event_txtPesquisarCaretUpdate

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCamposEspecificos();
        limparCamposComuns();

        txtNome.grabFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void preencherTabela() {

        try {
            String tabela = "";

            switch (cmbPerfil.getSelectedIndex()) {
                case 0: // Administrador
                    tabela = "administrador";
                    break;
                case 1: // Aluno
                    tabela = "aluno";
                    break;
                case 2: // Professor
                    tabela = "professor";
                    break;
            }

            PessoaDAO dao = new PessoaDAO();
            tabelaPessoa.setModel(dao.select(tabela));

        } catch (Exception ex) {
            System.out.println("\nExceção: " + ex);

        } finally {
            tabelaPessoa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaPessoa);
            redimensionar.adjustColumns();
            txtPesquisar.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adicional;
    private javax.swing.JPanel Aluno;
    private javax.swing.JPanel CRUD;
    private javax.swing.JPanel Outros;
    private javax.swing.JPanel Pessoa;
    private javax.swing.JPanel Vazio;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbBanco;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbFormacao;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JComboBox<String> cmbSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JToolBar menuBancoDados;
    private javax.swing.JScrollPane scrollPessoa;
    private javax.swing.JTable tabelaPessoa;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConta;
    private javax.swing.JFormattedTextField txtDtAdmissao;
    private javax.swing.JFormattedTextField txtDtMatricula;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}