package sgda.view;

import java.awt.Color;

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

                    break;
                case 1: // Disciplinas e Professores

                    break;
                case 2: // Pessoas e Contatos

                    break;
            }

            ativarCRUD();
            limparCampos();
            tornarInvisivel();
        });

        tabelaDados.getParent().setBackground(new Color(217, 224, 217));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        CRUD = new javax.swing.JPanel();
        menuBancoDados = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
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
        jLabel28 = new javax.swing.JLabel();
        cmbCursoProfessor = new javax.swing.JComboBox<>();
        DisciplinasProfessores = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cmbDisciplinaProfessor = new javax.swing.JComboBox<>();
        cmbCodigoDisciplinaProfessor = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cmbProfessor = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cmbCodigoProfessor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        PessoasContatos = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cmbPessoa = new javax.swing.JComboBox<>();
        cmbCodigoPessoa = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtContato = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(165, 214, 167));
        setPreferredSize(new java.awt.Dimension(845, 690));

        Titulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
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
        menuBancoDados.add(txtPesquisar);

        jPanel5.setBackground(new java.awt.Color(76, 175, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(40, 40));

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

        jPanel7.setBackground(new java.awt.Color(76, 175, 80));
        jPanel7.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel7);

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
        menuBancoDados.add(btnAlterar);

        jPanel8.setBackground(new java.awt.Color(76, 175, 80));
        jPanel8.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        menuBancoDados.add(jPanel8);

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
        menuBancoDados.add(btnRemover);

        jPanel9.setBackground(new java.awt.Color(76, 175, 80));
        jPanel9.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
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
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(cmbCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addContainerGap(416, Short.MAX_VALUE))
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

        jLabel28.setText("Curso:");

        cmbCursoProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCursoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoProfessorActionPerformed(evt);
            }
        });

        DisciplinasProfessores.setBackground(new java.awt.Color(165, 214, 167));

        jLabel26.setText("Disciplina:");

        cmbDisciplinaProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDisciplinaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDisciplinaProfessorActionPerformed(evt);
            }
        });

        cmbCodigoDisciplinaProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoDisciplinaProfessor.setEnabled(false);
        cmbCodigoDisciplinaProfessor.setFocusable(false);
        cmbCodigoDisciplinaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoDisciplinaProfessorActionPerformed(evt);
            }
        });

        jLabel27.setText("Código:");

        jLabel30.setText("Professor:");

        cmbProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProfessorActionPerformed(evt);
            }
        });

        jLabel31.setText("Código:");

        cmbCodigoProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoProfessor.setEnabled(false);
        cmbCodigoProfessor.setFocusable(false);
        cmbCodigoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DisciplinasProfessoresLayout = new javax.swing.GroupLayout(DisciplinasProfessores);
        DisciplinasProfessores.setLayout(DisciplinasProfessoresLayout);
        DisciplinasProfessoresLayout.setHorizontalGroup(
            DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisciplinasProfessoresLayout.createSequentialGroup()
                .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DisciplinasProfessoresLayout.createSequentialGroup()
                        .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(cmbCodigoDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DisciplinasProfessoresLayout.createSequentialGroup()
                        .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(cmbCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 406, Short.MAX_VALUE))
        );
        DisciplinasProfessoresLayout.setVerticalGroup(
            DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisciplinasProfessoresLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DisciplinasProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Selecione um Curso:");

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
                            .addComponent(DisciplinasProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(cmbCursoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCursoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(DisciplinasProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Guias.addTab("Disciplinas e Professores", jPanel2);

        jPanel3.setBackground(new java.awt.Color(165, 214, 167));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Selecione um Perfil e Filtre pelo Nome:");

        jLabel35.setText("Perfil:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admnistrador", "Aluno", "Professor" }));
        cmbPerfil.setSelectedIndex(-1);
        cmbPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        PessoasContatos.setBackground(new java.awt.Color(165, 214, 167));

        jLabel36.setText("Pessoa:");

        cmbPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPessoaActionPerformed(evt);
            }
        });

        cmbCodigoPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoPessoa.setEnabled(false);
        cmbCodigoPessoa.setFocusable(false);
        cmbCodigoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoPessoaActionPerformed(evt);
            }
        });

        jLabel37.setText("Código:");

        jLabel38.setText("Contato:");

        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                            .addComponent(cmbCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel38)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 408, Short.MAX_VALUE))
        );
        PessoasContatosLayout.setVerticalGroup(
            PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PessoasContatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PessoasContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setText("Nome:");

        txtNome.setEnabled(false);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PessoasContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel35)
                                    .addComponent(cmbPerfil, 0, 140, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
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

    private void ativarCRUD() {
        txtPesquisar.setEnabled(true);
        btnInserir.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnRemover.setEnabled(true);
    }

    private void tornarInvisivel() {
        DisciplinasProfessores.setVisible(false);
        PessoasContatos.setVisible(false);
    }

    private void tornarVisivel() {
        DisciplinasProfessores.setVisible(true);
        PessoasContatos.setVisible(true);
    }

    private void limparCampos() {
        cmbCurso.setSelectedIndex(-1);
        cmbDisciplina.setSelectedIndex(-1);
        cmbCursoProfessor.setSelectedIndex(-1);
        cmbDisciplinaProfessor.setSelectedIndex(-1);
        cmbProfessor.setSelectedIndex(-1);
        cmbPerfil.setSelectedIndex(-1);
        txtNome.setText("");
        txtNome.setEnabled(false);
        cmbPessoa.setSelectedIndex(-1);
        txtContato.setText("");
        txtPesquisar.setText("");
    }

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        cmbCodigoCurso.setSelectedIndex(cmbCurso.getSelectedIndex());
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
        cmbDisciplinaProfessor.setSelectedIndex(cmbCodigoDisciplinaProfessor.getSelectedIndex());
    }//GEN-LAST:event_cmbDisciplinaProfessorActionPerformed

    private void cmbCodigoDisciplinaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoDisciplinaProfessorActionPerformed
        cmbCodigoDisciplinaProfessor.setSelectedIndex(cmbDisciplinaProfessor.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoDisciplinaProfessorActionPerformed

    private void cmbCursoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoProfessorActionPerformed
        tornarVisivel();
    }//GEN-LAST:event_cmbCursoProfessorActionPerformed

    private void cmbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProfessorActionPerformed
        cmbProfessor.setSelectedIndex(cmbCodigoProfessor.getSelectedIndex());
    }//GEN-LAST:event_cmbProfessorActionPerformed

    private void cmbCodigoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoProfessorActionPerformed
        cmbCodigoProfessor.setSelectedIndex(cmbProfessor.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoProfessorActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        System.out.println(Guias.getSelectedIndex());
    }//GEN-LAST:event_btnInserirActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        txtNome.setEnabled(true);
        tornarVisivel();
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void cmbPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPessoaActionPerformed
        cmbPessoa.setSelectedIndex(cmbCodigoPessoa.getSelectedIndex());
    }//GEN-LAST:event_cmbPessoaActionPerformed

    private void cmbCodigoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoPessoaActionPerformed
        cmbCodigoPessoa.setSelectedIndex(cmbPessoa.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoPessoaActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed

        if (!"".equals(txtNome.getText())) {

        }
    }//GEN-LAST:event_txtNomeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CRUD;
    private javax.swing.JPanel DisciplinasProfessores;
    private javax.swing.JTabbedPane Guias;
    private javax.swing.JPanel PessoasContatos;
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbCodigoDisciplina;
    private javax.swing.JComboBox<String> cmbCodigoDisciplinaProfessor;
    private javax.swing.JComboBox<String> cmbCodigoPessoa;
    private javax.swing.JComboBox<String> cmbCodigoProfessor;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbCursoProfessor;
    private javax.swing.JComboBox<String> cmbDisciplina;
    private javax.swing.JComboBox<String> cmbDisciplinaProfessor;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar menuBancoDados;
    private javax.swing.JScrollPane scrollPessoa;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
