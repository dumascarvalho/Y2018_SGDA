package sgda.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sgda.dao.AlunoDisciplinaDAO;
import sgda.dao.CursoDAO;
import sgda.dao.DisciplinaProfessorDAO;
import sgda.model.LoginModel;

public class TelaPainelProfessorView extends javax.swing.JPanel {

    private final LoginModel dadosLogin;
    
    public TelaPainelProfessorView(LoginModel dadosLogin) {
        
        this.dadosLogin = dadosLogin;
        initComponents();
        preencherCombos();
    }
    
    private void preencherCombos() {
        CursoDAO curso = new CursoDAO();

        cmbCodigoCurso.setModel(new DefaultComboBoxModel(curso.selectForCombo("cod_curso").toArray()));
        cmbCurso.setModel(new DefaultComboBoxModel(curso.selectForCombo("nome_curso").toArray()));
        cmbCurso.setSelectedIndex(-1); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbDisciplina = new javax.swing.JComboBox<>();
        cmbCodigoDisciplina = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCodigoCurso = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(165, 214, 167));

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Painel do Professor");
        Titulo.setPreferredSize(new java.awt.Dimension(181, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Escolha um Curso:");

        jLabel1.setText("Disciplina");

        cmbDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDisciplinaActionPerformed(evt);
            }
        });

        cmbCodigoDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoDisciplina.setEnabled(false);
        cmbCodigoDisciplina.setFocusable(false);
        cmbCodigoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoDisciplinaActionPerformed(evt);
            }
        });

        jLabel25.setText("Código:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Escolha uma Disciplina:");

        cmbCodigoCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCodigoCurso.setEnabled(false);
        cmbCodigoCurso.setFocusable(false);
        cmbCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoCursoActionPerformed(evt);
            }
        });

        jLabel24.setText("Código:");

        cmbCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        jLabel22.setText("Curso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(cmbCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(451, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDisciplinaActionPerformed
        cmbCodigoDisciplina.setSelectedIndex(cmbDisciplina.getSelectedIndex());
    }//GEN-LAST:event_cmbDisciplinaActionPerformed

    private void cmbCodigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoDisciplinaActionPerformed
        cmbDisciplina.setSelectedIndex(cmbCodigoDisciplina.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoDisciplinaActionPerformed

    private void cmbCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoCursoActionPerformed
        cmbCurso.setSelectedIndex(cmbCodigoCurso.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoCursoActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        cmbCodigoCurso.setSelectedIndex(cmbCurso.getSelectedIndex());
        
        if (cmbCurso.getSelectedIndex() != -1) {
            DisciplinaProfessorDAO dao = new DisciplinaProfessorDAO();

            cmbCodigoDisciplina.setModel(new DefaultComboBoxModel(dao.selectForComboComCurso("cod_disciplina", Integer.parseInt(cmbCodigoCurso.getSelectedItem().toString()), dadosLogin).toArray()));
            cmbDisciplina.setModel(new DefaultComboBoxModel(dao.selectForComboComCurso("nome_disciplina", Integer.parseInt(cmbCodigoCurso.getSelectedItem().toString()), dadosLogin).toArray()));
            cmbDisciplina.setSelectedIndex(-1);
            
            if(cmbDisciplina.getItemCount() == 0) {
                JOptionPane.showConfirmDialog(null, "Este professor não leciona nenhuma das disciplina do curso informado, favor informar um novo curso.", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                cmbCurso.setSelectedIndex(-1);
                cmbCodigoCurso.setSelectedIndex(cmbCurso.getSelectedIndex());
                cmbCurso.grabFocus();
                
            } else {
                cmbDisciplina.grabFocus();
            }
        }
    }//GEN-LAST:event_cmbCursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbCodigoDisciplina;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
