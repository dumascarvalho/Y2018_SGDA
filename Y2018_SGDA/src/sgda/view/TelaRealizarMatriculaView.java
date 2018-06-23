package sgda.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sgda.dao.AlunoDisciplinaDAO;
import sgda.model.AlunoDisciplinaModel;
import sgda.model.LoginModel;

public class TelaRealizarMatriculaView extends javax.swing.JPanel {
    
    private final LoginModel dadosLogin;
    
    public TelaRealizarMatriculaView(LoginModel dadosLogin) {
        
        this.dadosLogin = dadosLogin;
        initComponents();
        pegarDisciplinasDoCurso();
    }
    
    private void pegarDisciplinasDoCurso() {
        AlunoDisciplinaDAO dao = new AlunoDisciplinaDAO();
        
        cmbCodigoDisciplina.setModel(new DefaultComboBoxModel(dao.selectForComboComCurso("cod_disciplina", dadosLogin).toArray()));
        cmbDisciplina.setModel(new DefaultComboBoxModel(dao.selectForComboComCurso("nome_disciplina", dadosLogin).toArray()));
        cmbDisciplina.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbDisciplina = new javax.swing.JComboBox<>();
        cmbCodigoDisciplina = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        btnConfirma = new javax.swing.JButton();

        setBackground(new java.awt.Color(165, 214, 167));

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Realização de Matrículas");
        Titulo.setPreferredSize(new java.awt.Dimension(181, 40));

        jLabel1.setText("Disciplina");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Escolha uma Disciplina:");

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

        btnConfirma.setBackground(new java.awt.Color(217, 224, 217));
        btnConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/img/tick.png"))); // NOI18N
        btnConfirma.setText("Confirmar");
        btnConfirma.setBorder(new javax.swing.border.MatteBorder(null));
        btnConfirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirma.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfirma.setIconTextGap(10);
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnConfirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(cmbCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jLabel25)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDisciplinaActionPerformed
        cmbCodigoDisciplina.setSelectedIndex(cmbDisciplina.getSelectedIndex());
    }//GEN-LAST:event_cmbDisciplinaActionPerformed

    private void cmbCodigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoDisciplinaActionPerformed
        cmbDisciplina.setSelectedIndex(cmbCodigoDisciplina.getSelectedIndex());
    }//GEN-LAST:event_cmbCodigoDisciplinaActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        
        try {
            AlunoDisciplinaModel ad = new AlunoDisciplinaModel();
            ad.setAluno(dadosLogin.getMatricula());
            ad.setDisciplina(Integer.parseInt(cmbCodigoDisciplina.getSelectedItem().toString()));

            AlunoDisciplinaDAO dao = new AlunoDisciplinaDAO();
            dao.insert(ad);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, "Ocorreu algum erro durante a operação e encontra-se abaixo as possíveis causas deste problema:\n\nInserção: algum está campo vazio e/ou em formato inválido;\nAlteração: mesmas possíveis causas das demais operações;\nRemoção: nenhuma linha foi selecionada.\n\nInformações técnicas sobre este erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        
        } finally {
            pegarDisciplinasDoCurso();
            cmbDisciplina.grabFocus();
        }
    }//GEN-LAST:event_btnConfirmaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JComboBox<String> cmbCodigoDisciplina;
    private javax.swing.JComboBox<String> cmbDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
