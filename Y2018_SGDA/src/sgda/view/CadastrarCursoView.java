package sgda.view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sgda.dao.CursoDAO;
import sgda.model.CursoModel;
import sgda.model.FormatarCamposModel;
import sgda.model.RedimensionarJTableModel;

public class CadastrarCursoView extends javax.swing.JPanel {

    public CadastrarCursoView() {
        initComponents();

        FormatarCamposModel.filtrarSpinner(spnCarga);
        preencherTabela();

        tabelaDados.getParent().setBackground(new Color(217, 224, 217));
    }

    private void limparCampos() {
        txtNome.setText("");
        spnCarga.setValue(0);
        cmbPeriodo.setSelectedIndex(-1);
        txtPesquisar.setText("");
        txtNome.grabFocus();
    }

    private void ativarCRUD() {
        txtPesquisar.setEnabled(true);
        btnInserir.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnRemover.setEnabled(true);
    }

    private void preencherTabela() {
        CursoDAO dao = new CursoDAO();

        tabelaDados.setModel(dao.selectForTable());
        tabelaDados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        RedimensionarJTableModel redimensionar = new RedimensionarJTableModel(tabelaDados);
        redimensionar.adjustColumns();
    }

    private void escolhaCRUD(String tipo) {
        try {
            CursoModel cr = new CursoModel();
            cr.setDescricao(txtNome.getText());
            cr.setCargaHoras((int) spnCarga.getValue());
            cr.setPeriodo(cmbPeriodo.getSelectedItem().toString());

            CursoDAO dao = new CursoDAO();

            switch (tipo) {
                case "incluir":
                    dao.insert(cr);
                    break;

                case "alterar":
                    cr.setCodCurso((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("COD_CURSO").getModelIndex()));
                    dao.update(cr);
                    break;

                case "remover":
                    cr.setCodCurso((int) tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("COD_CURSO").getModelIndex()));
                    dao.delete(cr);
                    break;
            }

            limparCampos();

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
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnCarga = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cmbPeriodo = new javax.swing.JComboBox<>();
        CRUD = new javax.swing.JPanel();
        menuBancoDados = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(165, 214, 167));
        setPreferredSize(new java.awt.Dimension(845, 690));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Cursos");
        jLabel1.setPreferredSize(new java.awt.Dimension(153, 40));

        jLabel2.setText("Descrição:");

        jLabel3.setText("Carga Horária:");

        spnCarga.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCargaStateChanged(evt);
            }
        });

        jLabel4.setText("Período:");

        cmbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Noturno", "Integral" }));
        cmbPeriodo.setSelectedIndex(-1);
        cmbPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPeriodoActionPerformed(evt);
            }
        });

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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Pesquisar:");
        menuBancoDados.add(jLabel5);

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
                .addComponent(scrollPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spnCarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbPeriodo, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(CRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        escolhaCRUD("incluir");
    }//GEN-LAST:event_btnInserirActionPerformed

    private void cmbPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPeriodoActionPerformed
        ativarCRUD();
    }//GEN-LAST:event_cmbPeriodoActionPerformed

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked
        if (tabelaDados.getSelectedRow() != -1) {
            txtNome.setText(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("DESCRICAO").getModelIndex()).toString());
            spnCarga.setValue(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("CARGA_HORARIA").getModelIndex()));
            cmbPeriodo.setSelectedItem(tabelaDados.getValueAt(tabelaDados.getSelectedRow(), tabelaDados.getColumn("PERIODO").getModelIndex()).toString());
        }

        txtNome.grabFocus();
    }//GEN-LAST:event_tabelaDadosMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        escolhaCRUD("alterar");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        escolhaCRUD("remover");
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void spnCargaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCargaStateChanged
        if ((int) spnCarga.getValue() <= 0) {
            spnCarga.setValue(0);
        }
    }//GEN-LAST:event_spnCargaStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CRUD;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToolBar menuBancoDados;
    private javax.swing.JScrollPane scrollPessoa;
    private javax.swing.JSpinner spnCarga;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
