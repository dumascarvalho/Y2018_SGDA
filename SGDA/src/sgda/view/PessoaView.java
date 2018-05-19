package sgda.view;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTable;
import sgda.model.RedimensionarJTableModel;

public class PessoaView extends javax.swing.JPanel {

    public PessoaView() {
        initComponents();        
        tabelaPessoa.getParent().setBackground(new Color(217,224,217));
        preencherTabela("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        fmtCEP = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        Adicional = new javax.swing.JPanel();
        Vazio = new javax.swing.JPanel();
        Aluno = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        cmbCodigo = new javax.swing.JComboBox<>();
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
        jTextField1 = new javax.swing.JTextField();
        lblFormacao = new javax.swing.JLabel();
        cmbFormacao = new javax.swing.JComboBox<>();
        lblNivel = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox<>();
        scrollPessoa = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();
        menuBancoDados = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRemover = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(165, 214, 167));
        setPreferredSize(new java.awt.Dimension(803, 744));

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

        try {
            fmtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Pessoas");

        lblLogo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogo.setText("Selecione um Perfil:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Aluno", "Professor" }));
        cmbPerfil.setSelectedIndex(-1);
        cmbPerfil.setFocusable(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel12.setText("Número:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("Cidade:");

        jLabel11.setText("Estado:");

        jLabel4.setText("Gênero:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        cmbEstado.setSelectedIndex(-1);

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));
        cmbGenero.setSelectedIndex(-1);

        jLabel16.setText("CEP:");

        jLabel6.setText("RG:");

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Adicional.setBackground(new java.awt.Color(165, 214, 167));
        Adicional.setPreferredSize(new java.awt.Dimension(350, 300));
        Adicional.setLayout(new java.awt.CardLayout());

        Vazio.setBackground(new java.awt.Color(165, 214, 167));
        Vazio.setPreferredSize(new java.awt.Dimension(300, 295));

        javax.swing.GroupLayout VazioLayout = new javax.swing.GroupLayout(Vazio);
        Vazio.setLayout(VazioLayout);
        VazioLayout.setHorizontalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        VazioLayout.setVerticalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        Adicional.add(Vazio, "Vazio");

        Aluno.setBackground(new java.awt.Color(165, 214, 167));
        Aluno.setPreferredSize(new java.awt.Dimension(300, 295));

        jLabel21.setText("Data de Matrícula:");

        jLabel22.setText("Curso:");

        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        jLabel23.setText("Semestre:");

        cmbCodigo.setEnabled(false);
        cmbCodigo.setFocusable(false);

        javax.swing.GroupLayout AlunoLayout = new javax.swing.GroupLayout(Aluno);
        Aluno.setLayout(AlunoLayout);
        AlunoLayout.setHorizontalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel21)
            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel23)
            .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AlunoLayout.setVerticalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
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

        jLabel15.setText("Banco:");

        cmbBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bradesco", "Banco do Brasil", "Caixa Econômica", "Itáu", "Santander" }));
        cmbBanco.setSelectedIndex(-1);

        jLabel17.setText("Agência:");

        txtAgencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setText("Conta:");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFormacao.setText("Formação:");

        cmbFormacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bacharelado", "Licenciatura", "Especializado", "Pós-Graduação", "Mestrado", "Doutorado" }));
        cmbFormacao.setSelectedIndex(-1);

        lblNivel.setText("Nível:");

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médio", "Técnico", "Superior" }));
        cmbNivel.setSelectedIndex(-1);

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
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Adicional.add(Outros, "Outros");

        scrollPessoa.setBackground(new java.awt.Color(217, 224, 217));

        tabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Gênero", "Data de Nascimento", "RG", "CPF", "Rua", "Número", "Bairro", "Cidade", "Estado", "CEP"
            }
        ));
        tabelaPessoa.setFocusable(false);
        tabelaPessoa.setGridColor(new java.awt.Color(217, 224, 217));
        scrollPessoa.setViewportView(tabelaPessoa);

        menuBancoDados.setFloatable(false);
        menuBancoDados.setBorderPainted(false);
        menuBancoDados.setMaximumSize(new java.awt.Dimension(783, 102));
        menuBancoDados.setPreferredSize(new java.awt.Dimension(783, 102));

        jPanel4.setBackground(new java.awt.Color(165, 214, 167));
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

        jPanel6.setBackground(new java.awt.Color(165, 214, 167));
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

        jTextField2.setMaximumSize(new java.awt.Dimension(200, 30));
        jTextField2.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextField2.setPreferredSize(new java.awt.Dimension(300, 30));
        menuBancoDados.add(jTextField2);

        jPanel1.setBackground(new java.awt.Color(165, 214, 167));
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
        btnInserir.setFocusable(false);
        btnInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInserir.setMaximumSize(new java.awt.Dimension(100, 30));
        btnInserir.setMinimumSize(new java.awt.Dimension(100, 30));
        btnInserir.setPreferredSize(new java.awt.Dimension(100, 35));
        menuBancoDados.add(btnInserir);

        jPanel2.setBackground(new java.awt.Color(165, 214, 167));
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
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAlterar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAlterar.setPreferredSize(new java.awt.Dimension(100, 35));
        menuBancoDados.add(btnAlterar);

        jPanel3.setBackground(new java.awt.Color(165, 214, 167));
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
        btnRemover.setFocusable(false);
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setMaximumSize(new java.awt.Dimension(100, 30));
        btnRemover.setMinimumSize(new java.awt.Dimension(100, 30));
        btnRemover.setPreferredSize(new java.awt.Dimension(100, 35));
        menuBancoDados.add(btnRemover);

        jPanel5.setBackground(new java.awt.Color(165, 214, 167));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCidade)
                                        .addComponent(fmtCEP)
                                        .addComponent(txtNumero)
                                        .addComponent(txtBairro)))
                                .addComponent(txtRua))
                            .addGap(18, 18, 18)
                            .addComponent(Adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblLogo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(menuBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                .addComponent(fmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(menuBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDtNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtNascimentoKeyPressed
        sgda.model.FormatarCamposModel.formatarData(txtDtNascimento, evt);
    }//GEN-LAST:event_txtDtNascimentoKeyPressed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        CardLayout card = (CardLayout) Adicional.getLayout();
        txtNome.grabFocus();

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
            break;
            case 2: // Professor
            card.show(Adicional, "Outros");
            lblNivel.setVisible(true);
            cmbNivel.setVisible(true);
            lblFormacao.setVisible(true);
            cmbFormacao.setVisible(true);
            break;
        }
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void txtDtAdmissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtAdmissaoKeyPressed
        sgda.model.FormatarCamposModel.formatarData(txtDtAdmissao, evt);
    }//GEN-LAST:event_txtDtAdmissaoKeyPressed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        cmbCodigo.setSelectedIndex(cmbCurso.getSelectedIndex());
    }//GEN-LAST:event_cmbCursoActionPerformed

        private void preencherTabela(String tabela) {
        try {
            
        /*
        banco.conectar();
        banco.setComando("SELECT * FROM " + tabela);
        banco.parametrizar();
        banco.consultar();
        
        tabelaDados.setModel(Formatar_Campos.colocarDadosTabela(banco.resultado)); 
        */
        
        } catch (Exception ex) {
            System.out.println("\nExceção: " + ex);
        } finally {
            // banco.desconectar(); 

            tabelaPessoa.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaPessoa);
            redimensionar.adjustColumns();   
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adicional;
    private javax.swing.JPanel Aluno;
    private javax.swing.JPanel Outros;
    private javax.swing.JPanel Vazio;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbBanco;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbFormacao;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JFormattedTextField fmtCEP;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JToolBar menuBancoDados;
    private javax.swing.JScrollPane scrollPessoa;
    private javax.swing.JTable tabelaPessoa;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDtAdmissao;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtSalario;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}


