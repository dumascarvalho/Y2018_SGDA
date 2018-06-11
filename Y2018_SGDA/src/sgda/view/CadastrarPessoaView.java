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

        cmbPerfil.setSelectedIndex(0);
        txtNome.grabFocus();
        
        tabelaDados.getParent().setBackground(new Color(217, 224, 217));
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
        txtEmail.setText("");
        txtRG.setText("");
        txtCPF.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cmbEstado.setSelectedIndex(-1);
        txtCEP.setText("");
    }

    private void ativarCRUD() {
        txtPesquisar.setEnabled(true);
        btnInserir.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnRemover.setEnabled(true);
    }

    private void preencherTabela() {
        
        try {            
            String tabela;
            
            switch (cmbPerfil.getSelectedIndex()) {
                case 1: // Administrador
                    tabela = "administrador";
                    break;
                case 2: // Aluno
                    tabela = "aluno";
                    break;
                case 3: // Professor
                    tabela = "professor";
                    break;
                default:
                    tabela = "pessoa";
                    break;
            }

            PessoaDAO dao = new PessoaDAO();
            tabelaDados.setModel(dao.select(tabela));

        } catch (Exception ex) {
            System.out.println("\nExceção: " + ex);

        } finally {
            tabelaDados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaDados);
            redimensionar.adjustColumns();
            txtPesquisar.setText("");
        }
    }

    private Object encapsularPessoa(PessoaModel obj) {
        obj.setNome(txtNome.getText());
        obj.setGenero(cmbGenero.getSelectedItem().toString());
        obj.setDtnascimento(txtDtNascimento.getText());
        obj.setEmail(txtEmail.getText());
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

    private void escolhaCRUD(String tipo) {
        try {

            PessoaDAO dao = new PessoaDAO();

            switch (cmbPerfil.getSelectedIndex()) {
                case 1: // Administrador
                    AdministradorModel ad = new AdministradorModel();
                    ad = (AdministradorModel) encapsularPessoa(ad);

                    ad.setDtadmissao(txtDtAdmissao.getText());
                    ad.setSalario(new BigDecimal(txtSalario.getText().replace(",", ".")));
                    ad.setBanco(cmbBanco.getSelectedItem().toString());
                    ad.setAgencia(txtAgencia.getText());
                    ad.setConta(txtConta.getText());

                    switch (tipo) {
                        case "incluir":
                            dao.insert(ad, "administrador");
                            break;

                        case "alterar":
                            ad.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                            dao.update(ad, "administrador");
                            break;

                        case "remover":
                            ad.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                            dao.delete(ad, "administrador");
                            break;
                    }
                    break;
                case 2: // Aluno
                    AlunoModel al = new AlunoModel();
                    al = (AlunoModel) encapsularPessoa(al);

                    al.setDtmatricula(txtDtMatricula.getText());
                    al.setCurso(Integer.parseInt(cmbCodigo.getSelectedItem().toString()));
                    al.setSituacao(cmbSituacao.getSelectedItem().toString());

                    switch (tipo) {
                        case "incluir":
                            dao.insert(al, "aluno");
                            break;

                        case "alterar":
                            al.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                            dao.update(al, "aluno");
                            break;

                        case "remover":
                            al.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                            dao.delete(al, "aluno");
                            break;
                    }
                    break;
                case 3: // Professor
                    ProfessorModel pr = new ProfessorModel();
                    pr = (ProfessorModel) encapsularPessoa(pr);

                    pr.setDtadmissao(txtDtAdmissao.getText());
                    pr.setSalario(new BigDecimal(txtSalario.getText().replace(",", ".")));
                    pr.setBanco(cmbBanco.getSelectedItem().toString());
                    pr.setAgencia(txtAgencia.getText());
                    pr.setConta(txtConta.getText());
                    pr.setFormacao(cmbFormacao.getSelectedItem().toString());
                    pr.setNivel(cmbNivel.getSelectedItem().toString());

                    switch (tipo) {
                        case "incluir":
                            dao.insert(pr, "professor");
                            break;

                        case "alterar":
                            pr.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                            dao.update(pr, "professor");
                            break;

                        case "remover":
                            pr.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                            dao.delete(pr, "professor");
                            break;
                    }
                    break;                
                default:
                     switch (tipo) {
                        case "alterar":
                            PessoaModel ps = new PessoaModel();
                            ps = (PessoaModel) encapsularPessoa(ps);
                    
                            ps.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                            ps.setPerfil(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("PERFIL").getModelIndex()).toString());
                            dao.update(ps, "pessoa");
                            break;
                        case "remover":                      
                            switch(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("PERFIL").getModelIndex()).toString().toLowerCase()) {
                                case "administrador":
                                    ad = new AdministradorModel();
                                    ad.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                                    dao.delete(ad, "administrador");
                                    break;
                                case "aluno":
                                    al = new AlunoModel();
                                    al.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
                                    dao.delete(al, "aluno");
                                    break;
                                case "professor":
                                    pr = new ProfessorModel();
                                    pr.setMatricula((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));                                    
                                    dao.delete(pr, "professor");
                                    break;
                            }
                            break;
                    }
                    break;
            }

            limparCamposComuns();
            limparCamposEspecificos();

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, "Ocorreu algum erro durante a operação e encontra-se abaixo as possíveis causas deste problema:\n\nInserção: algum está campo vazio e/ou em formato inválido;\nAlteração: mesmas possíveis causas das demais operações;\nRemoção: nenhuma linha foi selecionada.\n\nInformações técnicas sobre este erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {

            txtNome.grabFocus();
            preencherTabela();
        }
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
        btnLimpar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
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
        tabelaDados = new javax.swing.JTable();
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
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(165, 214, 167));
        setPreferredSize(new java.awt.Dimension(845, 690));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Pessoas");

        lblLogo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogo.setText("Selecione um Perfil:");

        cmbPerfil.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Administrador", "Aluno", "Professor" }));
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
            .addGap(0, 345, Short.MAX_VALUE)
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
        txtDtMatricula.setToolTipText("Formato: AAAA-MM-DD");
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
                .addGap(0, 0, Short.MAX_VALUE))
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
        txtDtAdmissao.setToolTipText("Formato: AAAA-MM-DD");
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
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel4);

        btnLimpar.setBackground(new java.awt.Color(217, 224, 217));
        btnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setActionCommand("");
        btnLimpar.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setFocusable(false);
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnLimpar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnLimpar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnLimpar);

        jPanel7.setBackground(new java.awt.Color(76, 175, 80));
        jPanel7.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel7);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Pesquisar:");
        menuBancoDados.add(jLabel2);

        jPanel6.setBackground(new java.awt.Color(76, 175, 80));
        jPanel6.setPreferredSize(new java.awt.Dimension(20, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel6);

        txtPesquisar.setEnabled(false);
        txtPesquisar.setMaximumSize(new java.awt.Dimension(200, 30));
        txtPesquisar.setMinimumSize(new java.awt.Dimension(200, 30));
        txtPesquisar.setPreferredSize(new java.awt.Dimension(200, 30));
        txtPesquisar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisarCaretUpdate(evt);
            }
        });
        menuBancoDados.add(txtPesquisar);

        jPanel1.setBackground(new java.awt.Color(76, 175, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(30, 30));

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
        btnInserir.setToolTipText("A inclusão de novas pessoas só é possível após escolher um perfil.");
        btnInserir.setActionCommand("");
        btnInserir.setBorder(new javax.swing.border.MatteBorder(null));
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserir.setEnabled(false);
        btnInserir.setFocusable(false);
        btnInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInserir.setMaximumSize(new java.awt.Dimension(100, 30));
        btnInserir.setMinimumSize(new java.awt.Dimension(100, 30));
        btnInserir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInserirMouseClicked(evt);
            }
        });
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
            .addGap(0, 14, Short.MAX_VALUE)
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
        btnAlterar.setPreferredSize(new java.awt.Dimension(100, 30));
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
            .addGap(0, 14, Short.MAX_VALUE)
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
        btnRemover.setPreferredSize(new java.awt.Dimension(100, 30));
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
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel5);

        scrollPessoa.setBackground(new java.awt.Color(217, 224, 217));

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaDados.setToolTipText("");
        tabelaDados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaDados.setFocusable(false);
        tabelaDados.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaDados.setSelectionBackground(new java.awt.Color(76, 175, 80));
        tabelaDados.getTableHeader().setResizingAllowed(false);
        tabelaDados.getTableHeader().setReorderingAllowed(false);
        tabelaDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDadosMouseClicked(evt);
            }
        });
        scrollPessoa.setViewportView(tabelaDados);

        javax.swing.GroupLayout CRUDLayout = new javax.swing.GroupLayout(CRUD);
        CRUD.setLayout(CRUDLayout);
        CRUDLayout.setHorizontalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuBancoDados, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addComponent(scrollPessoa))
                .addGap(15, 15, 15))
        );
        CRUDLayout.setVerticalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CRUDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(menuBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
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
        txtDtNascimento.setToolTipText("Formato: AAAA-MM-DD");
        txtDtNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDtNascimentoKeyPressed(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        cmbEstado.setSelectedIndex(-1);
        cmbEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Gênero:");

        jLabel8.setText("Rua:");

        jLabel19.setText("Email:");

        javax.swing.GroupLayout PessoaLayout = new javax.swing.GroupLayout(Pessoa);
        Pessoa.setLayout(PessoaLayout);
        PessoaLayout.setHorizontalGroup(
            PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoaLayout.createSequentialGroup()
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addComponent(txtEmail))
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
                    .addComponent(txtNumero)
                    .addComponent(jLabel8)
                    .addComponent(txtRua)))
        );
        PessoaLayout.setVerticalGroup(
            PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoaLayout.createSequentialGroup()
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PessoaLayout.createSequentialGroup()
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
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PessoaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPerfil))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(CRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDtNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtNascimentoKeyPressed
        FormatarCamposModel.formatarData(txtDtNascimento, evt);
    }//GEN-LAST:event_txtDtNascimentoKeyPressed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        ativarCRUD();

        CardLayout card = (CardLayout) Adicional.getLayout();

        switch (cmbPerfil.getSelectedIndex()) {
            case 1: // Administrador
                card.show(Adicional, "Outros");

                lblNivel.setVisible(false);
                cmbNivel.setVisible(false);
                lblFormacao.setVisible(false);
                cmbFormacao.setVisible(false);
                break;
            case 2: // Aluno
                card.show(Adicional, "Aluno");

                CursoDAO curso = new CursoDAO();
                cmbCodigo.setModel(new DefaultComboBoxModel(curso.selectForCombo("cod_curso").toArray()));
                cmbCurso.setModel(new DefaultComboBoxModel(curso.selectForCombo("nome_curso").toArray()));
                cmbCurso.setSelectedIndex(-1);
                break;
            case 3: // Professor
                card.show(Adicional, "Outros");

                lblNivel.setVisible(true);
                cmbNivel.setVisible(true);
                lblFormacao.setVisible(true);
                cmbFormacao.setVisible(true);
                break;
            default:
                card.show(Adicional, "Vazio");
                btnInserir.setEnabled(false);
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

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        escolhaCRUD("incluir");       
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

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked

        if (tabelaDados.getSelectedRow() != -1) {
            txtNome.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NOME").getModelIndex()).toString());
            cmbGenero.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("GENERO").getModelIndex()).toString());
            txtEmail.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("EMAIL").getModelIndex()).toString());
            txtDtNascimento.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("DT_NASCIMENTO").getModelIndex()).toString());
            txtRG.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("RG").getModelIndex()).toString());
            txtCPF.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CPF").getModelIndex()).toString());
            txtRua.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("RUA").getModelIndex()).toString());
            txtNumero.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NUMERO").getModelIndex()).toString());
            txtBairro.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("BAIRRO").getModelIndex()).toString());
            txtCidade.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CIDADE").getModelIndex()).toString());
            cmbEstado.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("ESTADO").getModelIndex()).toString());
            txtCEP.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CEP").getModelIndex()).toString());

            switch (cmbPerfil.getSelectedIndex()) {
                case 1: // Administrador
                    txtDtAdmissao.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("DT_ADMISSAO").getModelIndex()).toString());
                    txtSalario.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("SALARIO").getModelIndex()).toString().replace(".", ","));
                    cmbBanco.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("BANCO").getModelIndex()).toString());
                    txtAgencia.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("AGENCIA").getModelIndex()).toString());
                    txtConta.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CONTA").getModelIndex()).toString());
                    break;
                case 2: // Aluno
                    txtDtMatricula.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("DT_MATRICULA").getModelIndex()).toString());
                    cmbCodigo.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CURSO").getModelIndex()).toString());
                    cmbSituacao.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("SITUACAO").getModelIndex()).toString());
                    break;
                case 3: // Professor
                    txtDtAdmissao.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("DT_ADMISSAO").getModelIndex()).toString());
                    txtSalario.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("SALARIO").getModelIndex()).toString().replace(".", ","));
                    cmbBanco.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("BANCO").getModelIndex()).toString());
                    txtAgencia.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("AGENCIA").getModelIndex()).toString());
                    txtConta.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CONTA").getModelIndex()).toString());
                    cmbFormacao.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("FORMACAO").getModelIndex()).toString());
                    cmbNivel.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NIVEL").getModelIndex()).toString());
                    break;
            }

            txtNome.grabFocus();
        }
    }//GEN-LAST:event_tabelaDadosMouseClicked

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        cmbCurso.setSelectedIndex(cmbCodigo.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        escolhaCRUD("remover");
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        escolhaCRUD("alterar");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtPesquisarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisarCaretUpdate
        if (!"".equals(txtPesquisar.getText())) {

            String tabela = "pessoa";

            switch (cmbPerfil.getSelectedIndex()) {
                case 1: // Administrador
                    tabela = "administrador";
                    break;
                case 2: // Aluno
                    tabela = "aluno";
                    break;
                case 3: // Professor
                    tabela = "professor";
                    break;                    
            }

            PessoaDAO dao = new PessoaDAO();

            tabelaDados.setModel(dao.pesquisarPessoas(tabela, txtPesquisar.getText()));
            tabelaDados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaDados);
            redimensionar.adjustColumns();
        } else {
            preencherTabela();
        }
    }//GEN-LAST:event_txtPesquisarCaretUpdate

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCamposEspecificos();
        limparCamposComuns();
        txtPesquisar.setText("");
        preencherTabela();
        tabelaDados.clearSelection();
        txtNome.grabFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseClicked
        if (!btnInserir.isEnabled()) {
            JOptionPane.showConfirmDialog(null, "A inserção de dados somente é possível após um perfil ter sido selecionado.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirMouseClicked

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
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JToolBar menuBancoDados;
    private javax.swing.JScrollPane scrollPessoa;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConta;
    private javax.swing.JFormattedTextField txtDtAdmissao;
    private javax.swing.JFormattedTextField txtDtMatricula;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
