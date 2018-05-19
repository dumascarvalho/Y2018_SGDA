package sgda.view;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class PrincipalView extends javax.swing.JFrame {

    public PrincipalView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelJanela = new javax.swing.JPanel();
        txtPerfil = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        Administrador = new javax.swing.JPanel();
        menuAdministrador = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Professor = new javax.swing.JPanel();
        menuProfessor = new javax.swing.JToolBar();
        jLabel11 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        Aluno = new javax.swing.JPanel();
        menuAluno = new javax.swing.JToolBar();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        Vazio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Dados Acadêmcios");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(217, 224, 217));

        panelJanela.setBackground(new java.awt.Color(165, 214, 167));
        panelJanela.setLayout(new java.awt.CardLayout());

        txtPerfil.setBackground(new java.awt.Color(76, 175, 80));
        txtPerfil.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtPerfil.setForeground(new java.awt.Color(76, 175, 80));
        txtPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPerfil.setText("Perfil de Acesso");
        txtPerfil.setToolTipText("");

        panelMenu.setBackground(new java.awt.Color(76, 175, 80));
        panelMenu.setLayout(new java.awt.CardLayout());

        Administrador.setBackground(new java.awt.Color(76, 175, 80));

        menuAdministrador.setFloatable(false);
        menuAdministrador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuAdministrador.setBorderPainted(false);

        jLabel1.setText(" ");
        menuAdministrador.add(jLabel1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Cadastro de Pessoas");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuAdministrador.add(jButton1);

        jLabel2.setText(" ");
        menuAdministrador.add(jLabel2);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Cadastro de Cursos");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAdministrador.add(jButton2);

        jLabel3.setText(" ");
        menuAdministrador.add(jLabel3);

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Cadastro de Disciplinas");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAdministrador.add(jButton3);

        javax.swing.GroupLayout AdministradorLayout = new javax.swing.GroupLayout(Administrador);
        Administrador.setLayout(AdministradorLayout);
        AdministradorLayout.setHorizontalGroup(
            AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        AdministradorLayout.setVerticalGroup(
            AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMenu.add(Administrador, "Administrador");

        Professor.setBackground(new java.awt.Color(76, 175, 80));

        menuProfessor.setFloatable(false);
        menuProfessor.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuProfessor.setBorderPainted(false);

        jLabel11.setText(" ");
        menuProfessor.add(jLabel11);

        jButton12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton12.setText("Dados Pessoais");
        jButton12.setBorder(new javax.swing.border.MatteBorder(null));
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton12);

        jLabel12.setText(" ");
        menuProfessor.add(jLabel12);

        jButton15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton15.setText("Consultar Cursos");
        jButton15.setBorder(new javax.swing.border.MatteBorder(null));
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton15);

        jLabel13.setText(" ");
        menuProfessor.add(jLabel13);

        jButton14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton14.setText("Consultar Disciplinas");
        jButton14.setBorder(new javax.swing.border.MatteBorder(null));
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton14);

        jLabel14.setText(" ");
        menuProfessor.add(jLabel14);

        jButton13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton13.setText("Consultar Grade");
        jButton13.setBorder(new javax.swing.border.MatteBorder(null));
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton13);

        jLabel15.setText(" ");
        menuProfessor.add(jLabel15);

        jButton16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton16.setText("Editar Calendário");
        jButton16.setBorder(new javax.swing.border.MatteBorder(null));
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton16);

        javax.swing.GroupLayout ProfessorLayout = new javax.swing.GroupLayout(Professor);
        Professor.setLayout(ProfessorLayout);
        ProfessorLayout.setHorizontalGroup(
            ProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        ProfessorLayout.setVerticalGroup(
            ProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMenu.add(Professor, "Professor");

        Aluno.setBackground(new java.awt.Color(76, 175, 80));

        menuAluno.setFloatable(false);
        menuAluno.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuAluno.setBorderPainted(false);

        jLabel4.setText(" ");
        menuAluno.add(jLabel4);

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Dados Pessoais");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton5);

        jLabel5.setText(" ");
        menuAluno.add(jLabel5);

        jButton11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton11.setText("Consultar Disciplinas");
        jButton11.setBorder(new javax.swing.border.MatteBorder(null));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton11);

        jLabel6.setText(" ");
        menuAluno.add(jLabel6);

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("Consultar Boletim");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton7);

        jLabel10.setText(" ");
        menuAluno.add(jLabel10);

        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("Consultar Grade");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton6);

        jLabel16.setText(" ");
        menuAluno.add(jLabel16);

        jButton17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton17.setText("Consultar Calendário");
        jButton17.setBorder(new javax.swing.border.MatteBorder(null));
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setFocusable(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton17);

        javax.swing.GroupLayout AlunoLayout = new javax.swing.GroupLayout(Aluno);
        Aluno.setLayout(AlunoLayout);
        AlunoLayout.setHorizontalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        AlunoLayout.setVerticalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMenu.add(Aluno, "Aluno");

        Vazio.setBackground(new java.awt.Color(76, 175, 80));

        javax.swing.GroupLayout VazioLayout = new javax.swing.GroupLayout(Vazio);
        Vazio.setLayout(VazioLayout);
        VazioLayout.setHorizontalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        VazioLayout.setVerticalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );

        panelMenu.add(Vazio, "Vazio");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJanela, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPanel painel = new PessoaView();
        setPainel(painel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setPainel(JPanel painel){
        panelJanela.removeAll();
        panelJanela.add(painel);
        panelJanela.repaint();
        
        this.pack();
    }
        
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        CardLayout layout = (CardLayout) panelMenu.getLayout();
        String perfil = "Administrador";
        layout.show(panelMenu, perfil);        
        txtPerfil.setText(perfil); 
    }//GEN-LAST:event_formWindowActivated
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Administrador;
    private javax.swing.JPanel Aluno;
    private javax.swing.JPanel Professor;
    private javax.swing.JPanel Vazio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToolBar menuAdministrador;
    private javax.swing.JToolBar menuAluno;
    private javax.swing.JToolBar menuProfessor;
    private javax.swing.JPanel panelJanela;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel txtPerfil;
    // End of variables declaration//GEN-END:variables
}
