package sgda.view;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sgda.dao.CursoDAO;
import sgda.dao.CursoDisciplinaDAO;
import sgda.dao.DisciplinaDAO;
import sgda.dao.DisciplinaProfessorDAO;
import sgda.dao.PessoaContatoDAO;
import sgda.dao.PessoaDAO;
import sgda.model.CursoDisciplinaModel;
import sgda.model.DisciplinaProfessorModel;
import sgda.model.FormatarCamposModel;
import sgda.model.PessoaContatoModel;
import sgda.model.RedimensionarJTableModel;

public class CadastrarRelacaoView extends javax.swing.JPanel {

    public CadastrarRelacaoView() {
        initComponents();

        Guias.setOpaque(true);

        for (int i = 0; i < Guias.getTabCount(); i++) {
            Guias.setBackgroundAt(i, new Color(76, 175, 80));
        }

        Guias.addChangeListener((javax.swing.event.ChangeEvent evt) -> {

            switch (Guias.getSelectedIndex()) {
                case 0: // Cursos e Disciplinas
                    guiaCursosDisciplinas();
                    break;
                case 1: // Disciplinas e Professores
                    guiaDisciplinasProfessores();
                    break;
                case 2: // Pessoas e Contatos
                    guiaPessoasContatos();
                    break;
            }

            ativarCRUD();
            preencherTabela();
            limparCampos();
        });
        
        Guias.setSelectedIndex(0);
        FormatarCamposModel.filtrarSpinner(spnMatricula);
        spnMatricula.setValue(1);
        tabelaDados.getParent().setBackground(new Color(217, 224, 217));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        CRUD = new javax.swing.JPanel();
        menuBancoDados = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnRemover = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        scrollPessoa = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        Principal = new javax.swing.JPanel();
        Guias = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cmbCodigoCurso = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cmbDisciplina = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cmbCodigoDisciplina = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DisciplinasProfessores = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbCodigoProfessor = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cmbProfessor = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbCodigoDisciplinaProfessor = new javax.swing.JComboBox<>();
        cmbDisciplinaProfessor = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PessoasContatos = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cmbPessoa = new javax.swing.JComboBox<>();
        cmbMatriculaPessoa = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtContato = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();
        spnMatricula = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(165, 214, 167));
        setPreferredSize(new java.awt.Dimension(845, 690));

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cadastro de Relações");
        Titulo.setPreferredSize(new java.awt.Dimension(181, 40));

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
        jPanel4.setPreferredSize(new java.awt.Dimension(10, 30));

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
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/img/application_form.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setActionCommand("");
        btnLimpar.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setFocusable(false);
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpar.setIconTextGap(10);
        btnLimpar.setMaximumSize(new java.awt.Dimension(110, 30));
        btnLimpar.setMinimumSize(new java.awt.Dimension(110, 30));
        btnLimpar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnLimpar);

        jPanel11.setBackground(new java.awt.Color(76, 175, 80));
        jPanel11.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel11);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Pesquisar:");
        menuBancoDados.add(jLabel2);

        jPanel12.setBackground(new java.awt.Color(76, 175, 80));
        jPanel12.setPreferredSize(new java.awt.Dimension(20, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel12);

        txtPesquisar.setEnabled(false);
        txtPesquisar.setMaximumSize(new java.awt.Dimension(160, 30));
        txtPesquisar.setMinimumSize(new java.awt.Dimension(160, 30));
        txtPesquisar.setPreferredSize(new java.awt.Dimension(160, 30));
        txtPesquisar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisarCaretUpdate(evt);
            }
        });
        menuBancoDados.add(txtPesquisar);

        jPanel5.setBackground(new java.awt.Color(76, 175, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel5);

        btnInserir.setBackground(new java.awt.Color(217, 224, 217));
        btnInserir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/img/database_add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setActionCommand("");
        btnInserir.setBorder(new javax.swing.border.MatteBorder(null));
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserir.setEnabled(false);
        btnInserir.setFocusable(false);
        btnInserir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInserir.setIconTextGap(10);
        btnInserir.setMaximumSize(new java.awt.Dimension(110, 30));
        btnInserir.setMinimumSize(new java.awt.Dimension(110, 30));
        btnInserir.setPreferredSize(new java.awt.Dimension(110, 30));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnInserir);

        jPanel7.setBackground(new java.awt.Color(76, 175, 80));
        jPanel7.setPreferredSize(new java.awt.Dimension(20, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel7);

        btnAlterar.setBackground(new java.awt.Color(217, 224, 217));
        btnAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/img/database_edit.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setActionCommand("");
        btnAlterar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setEnabled(false);
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAlterar.setIconTextGap(10);
        btnAlterar.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAlterar.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAlterar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnAlterar);

        jPanel8.setBackground(new java.awt.Color(76, 175, 80));
        jPanel8.setPreferredSize(new java.awt.Dimension(20, 30));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel8);

        btnRemover.setBackground(new java.awt.Color(217, 224, 217));
        btnRemover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/img/database_delete.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setActionCommand("");
        btnRemover.setBorder(new javax.swing.border.MatteBorder(null));
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.setEnabled(false);
        btnRemover.setFocusable(false);
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRemover.setIconTextGap(10);
        btnRemover.setMaximumSize(new java.awt.Dimension(110, 30));
        btnRemover.setMinimumSize(new java.awt.Dimension(110, 30));
        btnRemover.setPreferredSize(new java.awt.Dimension(110, 30));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        menuBancoDados.add(btnRemover);

        jPanel9.setBackground(new java.awt.Color(76, 175, 80));
        jPanel9.setPreferredSize(new java.awt.Dimension(10, 30));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel9);

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
                    .addComponent(menuBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        CRUDLayout.setVerticalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CRUDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(menuBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        Principal.setBackground(new java.awt.Color(76, 175, 80));

        Guias.setBackground(new java.awt.Color(76, 175, 80));

        jPanel10.setBackground(new java.awt.Color(165, 214, 167));

        jLabel22.setText("Curso:");

        cmbCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        jLabel24.setText("Código:");

        cmbCodigoCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoCurso.setEnabled(false);
        cmbCodigoCurso.setFocusable(false);
        cmbCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoCursoActionPerformed(evt);
            }
        });

        jLabel23.setText("Disciplina:");

        cmbDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDisciplinaActionPerformed(evt);
            }
        });

        jLabel25.setText("Código:");

        cmbCodigoDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoDisciplina.setEnabled(false);
        cmbCodigoDisciplina.setFocusable(false);
        cmbCodigoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoDisciplinaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Preencha os Campos:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(cmbCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        Guias.addTab("Cursos e Disciplinas", jPanel10);

        jPanel2.setBackground(new java.awt.Color(165, 214, 167));

        DisciplinasProfessores.setBackground(new java.awt.Color(165, 214, 167));

        javax.swing.GroupLayout DisciplinasProfessoresLayout = new javax.swing.GroupLayout(DisciplinasProfessores);
        DisciplinasProfessores.setLayout(DisciplinasProfessoresLayout);
        DisciplinasProfessoresLayout.setHorizontalGroup(
            DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        DisciplinasProfessoresLayout.setVerticalGroup(
            DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Selecione um Curso:");

        cmbCodigoProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoProfessor.setEnabled(false);
        cmbCodigoProfessor.setFocusable(false);
        cmbCodigoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoProfessorActionPerformed(evt);
            }
        });

        jLabel31.setText("Matrícula:");

        cmbProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProfessorActionPerformed(evt);
            }
        });

        jLabel30.setText("Professor:");

        jLabel27.setText("Código:");

        cmbCodigoDisciplinaProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoDisciplinaProfessor.setEnabled(false);
        cmbCodigoDisciplinaProfessor.setFocusable(false);
        cmbCodigoDisciplinaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoDisciplinaProfessorActionPerformed(evt);
            }
        });

        cmbDisciplinaProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDisciplinaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDisciplinaProfessorActionPerformed(evt);
            }
        });

        jLabel26.setText("Disciplina:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(cmbCodigoDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(cmbCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisciplinasProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(DisciplinasProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCodigoDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Guias.addTab("Disciplinas e Professores", jPanel2);

        jPanel3.setBackground(new java.awt.Color(165, 214, 167));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Filtre pelo Perfil ou Escolha pela Matrícula:");

        PessoasContatos.setBackground(new java.awt.Color(165, 214, 167));

        jLabel36.setText("Pessoa:");

        cmbPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPessoaActionPerformed(evt);
            }
        });

        cmbMatriculaPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbMatriculaPessoa.setEnabled(false);
        cmbMatriculaPessoa.setFocusable(false);
        cmbMatriculaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMatriculaPessoaActionPerformed(evt);
            }
        });

        jLabel37.setText("Matrícula:");

        jLabel38.setText("Contato:");

        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator1.setBackground(new java.awt.Color(217, 224, 217));
        jSeparator1.setForeground(new java.awt.Color(76, 175, 80));

        javax.swing.GroupLayout PessoasContatosLayout = new javax.swing.GroupLayout(PessoasContatos);
        PessoasContatos.setLayout(PessoasContatosLayout);
        PessoasContatosLayout.setHorizontalGroup(
            PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoasContatosLayout.createSequentialGroup()
                .addGroup(PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PessoasContatosLayout.createSequentialGroup()
                        .addGroup(PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(18, 18, 18)
                        .addGroup(PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(cmbMatriculaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel38)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 408, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        PessoasContatosLayout.setVerticalGroup(
            PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoasContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMatriculaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setText("Perfil:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Aluno", "Professor" }));
        cmbPerfil.setSelectedIndex(-1);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        spnMatricula.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMatriculaStateChanged(evt);
            }
        });

        jLabel39.setText("Matrícula:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PessoasContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(spnMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel39))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(PessoasContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Guias.addTab("Pessoas e Contatos", jPanel3);

        Guias.setSelectedIndex(-1);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Selecione uma Opção:");

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guias)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(Guias, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guiaCursosDisciplinas() {
        CursoDAO curso = new CursoDAO();
        DisciplinaDAO disciplina = new DisciplinaDAO();

        cmbCodigoCurso.setModel(new DefaultComboBoxModel(curso.selectForCombo("cod_curso").toArray()));
        cmbCurso.setModel(new DefaultComboBoxModel(curso.selectForCombo("nome_curso").toArray()));
        cmbCurso.setSelectedIndex(-1);

        cmbCodigoDisciplina.setModel(new DefaultComboBoxModel(disciplina.selectForCombo("cod_disciplina").toArray()));
        cmbDisciplina.setModel(new DefaultComboBoxModel(disciplina.selectForCombo("nome_disciplina").toArray()));
        cmbDisciplina.setSelectedIndex(-1);
    }

    private void guiaDisciplinasProfessores() {
        DisciplinaDAO disciplina = new DisciplinaDAO();
        PessoaDAO pessoa = new PessoaDAO();

        cmbCodigoDisciplinaProfessor.setModel(new DefaultComboBoxModel(disciplina.selectForCombo("cod_disciplina").toArray()));
        cmbDisciplinaProfessor.setModel(new DefaultComboBoxModel(disciplina.selectForCombo("nome_disciplina").toArray()));
        cmbCurso.setSelectedIndex(-1);

        cmbCodigoProfessor.setModel(new DefaultComboBoxModel(pessoa.selectForComboPerfil("matricula", "professor").toArray()));
        cmbProfessor.setModel(new DefaultComboBoxModel(pessoa.selectForComboPerfil("nome", "professor").toArray()));
        cmbCodigoProfessor.setSelectedIndex(-1);
    }

    private void guiaPessoasContatos() {
        PessoaDAO pessoa = new PessoaDAO();

        cmbMatriculaPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForCombo("matricula").toArray()));
        cmbPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForCombo("nome").toArray()));
        cmbPessoa.setSelectedIndex(-1);
    }
    
    private void ativarCRUD() {
        txtPesquisar.setEnabled(true);
        btnInserir.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnRemover.setEnabled(true);
    }

    private void limparCampos() {
        cmbCurso.setSelectedIndex(-1);
        cmbDisciplina.setSelectedIndex(-1);
        cmbDisciplinaProfessor.setSelectedIndex(-1);
        cmbProfessor.setSelectedIndex(-1);
        cmbPerfil.setSelectedIndex(-1);
        spnMatricula.setValue(1);
        cmbPessoa.setSelectedIndex(-1);
        txtContato.setText("");
        txtPesquisar.setText("");
        tabelaDados.clearSelection();
        
        switch (Guias.getSelectedIndex()) {
            case 0: // Cursos e Disciplinas
                cmbCurso.grabFocus();
                break;
            case 1: // Disciplinas e Professores
                cmbDisciplinaProfessor.grabFocus();
                break;
            case 2: // Pessoas e Contatos
                cmbPerfil.grabFocus();
                break;
        }
    }
    
    private CursoDisciplinaModel CursoDisciplina() {
        CursoDisciplinaModel modelCursoDisciplina = new CursoDisciplinaModel();

        modelCursoDisciplina.setCurso(Integer.parseInt(cmbCodigoCurso.getSelectedItem().toString()));
        modelCursoDisciplina.setDisciplina(Integer.parseInt(cmbCodigoDisciplina.getSelectedItem().toString()));

        return modelCursoDisciplina;
    }
    
    private CursoDisciplinaModel CursoDisciplinaUpdateDelete() {
        CursoDisciplinaModel modelCursoDisciplina = new CursoDisciplinaModel();

        modelCursoDisciplina.setCurso((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CURSO").getModelIndex()));
        modelCursoDisciplina.setDisciplina((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("DISCIPLINA").getModelIndex()));

        return modelCursoDisciplina;
    }
    
    private DisciplinaProfessorModel DisciplinaProfessor() {
        DisciplinaProfessorModel modelDisciplinaProfessor = new DisciplinaProfessorModel();

        modelDisciplinaProfessor.setDisciplina(Integer.parseInt(cmbCodigoDisciplinaProfessor.getSelectedItem().toString()));
        modelDisciplinaProfessor.setProfessor(Integer.parseInt(cmbCodigoProfessor.getSelectedItem().toString()));

        return modelDisciplinaProfessor;
    }
    
    private DisciplinaProfessorModel DisciplinaProfessorUpdateDelete() {
        DisciplinaProfessorModel modelDisciplinaProfessor = new DisciplinaProfessorModel();

        modelDisciplinaProfessor.setDisciplina((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("DISCIPLINA").getModelIndex()));
        modelDisciplinaProfessor.setProfessor((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));

        return modelDisciplinaProfessor;
    }
    
    private PessoaContatoModel PessoaContato() {
        PessoaContatoModel modelPessoaContato = new PessoaContatoModel();

        modelPessoaContato.setPessoa(Integer.parseInt(cmbMatriculaPessoa.getSelectedItem().toString()));
        modelPessoaContato.setContato(txtContato.getText());

        return modelPessoaContato;
    }
    
    private PessoaContatoModel PessoaContatoUpdateDelete() {
        PessoaContatoModel modelPessoaContato = new PessoaContatoModel();

        modelPessoaContato.setPessoa((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("MATRICULA").getModelIndex()));
        modelPessoaContato.setContato(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CONTATO").getModelIndex()).toString());

        return modelPessoaContato;
    }
    
    private void escolhaCRUD(String tipo) {        
        try {           
            switch (Guias.getSelectedIndex()) {
                case 0:
                    CursoDisciplinaDAO daoCursoDisciplina = new CursoDisciplinaDAO();
                    switch (tipo) {
                        case "incluir":
                            daoCursoDisciplina.insert(CursoDisciplina());
                            break;
                        case "alterar":
                            daoCursoDisciplina.update(CursoDisciplina(), CursoDisciplinaUpdateDelete());
                            break;
                        case "remover":
                            daoCursoDisciplina.delete(CursoDisciplinaUpdateDelete());
                            break;
                    }
                    break;

                case 1:
                    DisciplinaProfessorDAO daoDisciplinaProfessor = new DisciplinaProfessorDAO();
                    switch (tipo) {
                        case "incluir":
                            daoDisciplinaProfessor.insert(DisciplinaProfessor());
                            break;
                        case "alterar":
                            daoDisciplinaProfessor.update(DisciplinaProfessor(), DisciplinaProfessorUpdateDelete());
                            break;
                        case "remover":
                            daoDisciplinaProfessor.delete(DisciplinaProfessorUpdateDelete());
                            break;
                    }
                    break;     
                    
                case 2:
                    PessoaContatoDAO daoPessoaContato = new PessoaContatoDAO();
                    switch (tipo) {
                        case "incluir":
                            daoPessoaContato.insert(PessoaContato());
                            break;
                        case "alterar":
                            daoPessoaContato.update(PessoaContato(), PessoaContatoUpdateDelete());
                            break;
                        case "remover":
                            daoPessoaContato.delete(PessoaContatoUpdateDelete());
                            break;
                    }
                    break;                
            }

            limparCampos();

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, "Ocorreu algum erro durante a operação e encontra-se abaixo as possíveis causas deste problema:\n\nInserção: algum está campo vazio e/ou em formato inválido;\nAlteração: mesmas possíveis causas das demais operações;\nRemoção: nenhuma linha foi selecionada.\n\nInformações técnicas sobre este erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            switch (Guias.getSelectedIndex()) {
                case 0:
                    cmbCurso.grabFocus();
                    break;
                case 1:
                    cmbDisciplinaProfessor.grabFocus();
                    break;                
                case 2:
                    cmbPerfil.grabFocus();
                    break;                
            }
            
            preencherTabela();
        }
    }
    
    private void preencherTabela() {
        
        switch (Guias.getSelectedIndex()) {
            case 0:
                CursoDisciplinaDAO daoCursoDisciplina = new CursoDisciplinaDAO();
                tabelaDados.setModel(daoCursoDisciplina.selectForTable()); 
                break;                
            case 1:
                DisciplinaProfessorDAO daoDisciplinaProfessor = new DisciplinaProfessorDAO();
                tabelaDados.setModel(daoDisciplinaProfessor.selectForTable());
                break;                
            case 2:
                PessoaContatoDAO daoPessoaContato = new PessoaContatoDAO();
                tabelaDados.setModel(daoPessoaContato.selectForTable());
                break;                
        }
        
        tabelaDados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaDados);
        redimensionar.adjustColumns();
    }

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        cmbCodigoCurso.setSelectedIndex(cmbCurso.getSelectedIndex());
        
        if (cmbCurso.getSelectedIndex() != -1) {
            cmbDisciplina.grabFocus();
        }
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void cmbCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoCursoActionPerformed
        cmbCurso.setSelectedIndex(cmbCodigoCurso.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoCursoActionPerformed

    private void cmbDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDisciplinaActionPerformed
        cmbCodigoDisciplina.setSelectedIndex(cmbDisciplina.getSelectedIndex());
    }//GEN-LAST:event_cmbDisciplinaActionPerformed

    private void cmbCodigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoDisciplinaActionPerformed
        cmbDisciplina.setSelectedIndex(cmbCodigoDisciplina.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoDisciplinaActionPerformed

    private void cmbDisciplinaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDisciplinaProfessorActionPerformed
        cmbCodigoDisciplinaProfessor.setSelectedIndex(cmbDisciplinaProfessor.getSelectedIndex());
        
        if (cmbDisciplinaProfessor.getSelectedIndex() != -1) {
            cmbProfessor.grabFocus();
        }
    }//GEN-LAST:event_cmbDisciplinaProfessorActionPerformed

    private void cmbCodigoDisciplinaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoDisciplinaProfessorActionPerformed
        cmbDisciplinaProfessor.setSelectedIndex(cmbCodigoDisciplinaProfessor.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoDisciplinaProfessorActionPerformed

    private void cmbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProfessorActionPerformed
        cmbCodigoProfessor.setSelectedIndex(cmbProfessor.getSelectedIndex());
    }//GEN-LAST:event_cmbProfessorActionPerformed

    private void cmbCodigoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoProfessorActionPerformed
        cmbProfessor.setSelectedIndex(cmbCodigoProfessor.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoProfessorActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        escolhaCRUD("incluir");
    }//GEN-LAST:event_btnInserirActionPerformed

    private void cmbPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPessoaActionPerformed
        cmbMatriculaPessoa.setSelectedIndex(cmbPessoa.getSelectedIndex());
        
        if (cmbPessoa.getSelectedIndex() != -1) {
            txtContato.grabFocus();
        }
    }//GEN-LAST:event_cmbPessoaActionPerformed

    private void cmbMatriculaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMatriculaPessoaActionPerformed
        cmbPessoa.setSelectedIndex(cmbMatriculaPessoa.getSelectedIndex());
    }//GEN-LAST:event_cmbMatriculaPessoaActionPerformed

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked
        if (tabelaDados.getSelectedRow() != -1) {
            switch (Guias.getSelectedIndex()) {
                case 0:
                    cmbCurso.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NOME_CURSO").getModelIndex()).toString());
                    cmbDisciplina.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NOME_DISCIPLINA").getModelIndex()).toString());
                    
                    cmbCurso.grabFocus();
                    break;
                case 1:
                    cmbDisciplinaProfessor.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NOME_DISCIPLINA").getModelIndex()).toString());
                    cmbProfessor.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NOME").getModelIndex()).toString());
                    
                    cmbDisciplinaProfessor.grabFocus();
                    break;
                case 2:
                    PessoaDAO pessoa = new PessoaDAO();
                    
                    cmbPerfil.setSelectedIndex(-1);
                    spnMatricula.setValue(1);
                    
                    cmbMatriculaPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForCombo("matricula").toArray()));
                    cmbPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForCombo("nome").toArray()));
                    cmbMatriculaPessoa.setSelectedIndex(-1);
                    
                    cmbPessoa.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("NOME").getModelIndex()).toString());
                    txtContato.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CONTATO").getModelIndex()).toString());
                    
                    cmbPessoa.grabFocus();
                    break;
            }
        }      
    }//GEN-LAST:event_tabelaDadosMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        escolhaCRUD("alterar");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        escolhaCRUD("remover");
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void txtPesquisarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisarCaretUpdate
        if (!"".equals(txtPesquisar.getText())) {
            switch (Guias.getSelectedIndex()) {
                case 0:
                    CursoDisciplinaDAO daoCD = new CursoDisciplinaDAO();
                    tabelaDados.setModel(daoCD.selectForTable(txtPesquisar.getText()));
                    break;
                case 1:
                    DisciplinaProfessorDAO daoDP = new DisciplinaProfessorDAO();
                    tabelaDados.setModel(daoDP.selectForTable(txtPesquisar.getText()));
                    break;
                case 2:
                    PessoaContatoDAO daoPC = new PessoaContatoDAO();
                    tabelaDados.setModel(daoPC.selectForTable(txtPesquisar.getText()));
                    break;
            }
            tabelaDados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaDados);
            redimensionar.adjustColumns();
        } else {
            preencherTabela();
        }
    }//GEN-LAST:event_txtPesquisarCaretUpdate

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void spnMatriculaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMatriculaStateChanged
        if ((int) spnMatricula.getValue() <= 1) {
            spnMatricula.setValue(1);
        }
    }//GEN-LAST:event_spnMatriculaStateChanged

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        PessoaDAO pessoa = new PessoaDAO();
        
        cmbMatriculaPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForComboMatricula("matricula", (int) spnMatricula.getValue()).toArray()));
        cmbPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForComboMatricula("nome", (int) spnMatricula.getValue()).toArray()));
        
        if (cmbPessoa.getSelectedIndex() == -1) {
            cmbMatriculaPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForCombo("matricula").toArray()));
            cmbPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForCombo("nome").toArray()));
            cmbMatriculaPessoa.setSelectedIndex(-1);
            
            JOptionPane.showConfirmDialog(null, "Nenhuma pessoa com esta matrícula foi encontrada.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            spnMatricula.setValue(1);
            spnMatricula.grabFocus();
        } else {
            txtContato.grabFocus();
        }
        
        cmbPerfil.setSelectedIndex(-1);
        txtContato.setText("");
        tabelaDados.clearSelection();
    }//GEN-LAST:event_btnOkActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        PessoaDAO pessoa = new PessoaDAO();
        
        if (cmbPerfil.getSelectedIndex() != -1) {
            cmbMatriculaPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForComboPerfil("matricula", cmbPerfil.getSelectedItem().toString().toLowerCase()).toArray()));
            cmbPessoa.setModel(new DefaultComboBoxModel(pessoa.selectForComboPerfil("nome", cmbPerfil.getSelectedItem().toString().toLowerCase()).toArray()));
            cmbMatriculaPessoa.setSelectedIndex(-1);
            
            spnMatricula.setValue(1);
            txtContato.setText("");
            tabelaDados.clearSelection();
            cmbPessoa.grabFocus();
        }
    }//GEN-LAST:event_cmbPerfilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CRUD;
    private javax.swing.JPanel DisciplinasProfessores;
    private javax.swing.JTabbedPane Guias;
    private javax.swing.JPanel PessoasContatos;
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbCodigoDisciplina;
    private javax.swing.JComboBox<String> cmbCodigoDisciplinaProfessor;
    private javax.swing.JComboBox<String> cmbCodigoProfessor;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbDisciplina;
    private javax.swing.JComboBox<String> cmbDisciplinaProfessor;
    private javax.swing.JComboBox<String> cmbMatriculaPessoa;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JComboBox<String> cmbPessoa;
    private javax.swing.JComboBox<String> cmbProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar menuBancoDados;
    private javax.swing.JScrollPane scrollPessoa;
    private javax.swing.JSpinner spnMatricula;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
