package sgda.view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sgda.model.LoginModel;

public class TelaPrincipalView extends javax.swing.JFrame {

    private LoginModel dadosLogin;
    private String nomeUsuario;
   
    
    public TelaPrincipalView(LoginModel dadosLogin, String nomeUsuario) {
        
        this.dadosLogin = dadosLogin; 
        this.nomeUsuario = nomeUsuario;
        initComponents();
    }
    
    public TelaPrincipalView() {        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelJanela = new javax.swing.JPanel();
        janelaVazia = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();
        lblLogo2 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        Vazio = new javax.swing.JPanel();
        Administrador = new javax.swing.JPanel();
        menuAdministrador = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Professor = new javax.swing.JPanel();
        menuProfessor = new javax.swing.JToolBar();
        jLabel11 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
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
        jLabel18 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        panelDados = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtPerfil = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtAcesso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Dados Acadêmcios");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(217, 224, 217));

        panelJanela.setBackground(new java.awt.Color(165, 214, 167));
        panelJanela.setLayout(new java.awt.CardLayout());

        janelaVazia.setBackground(new java.awt.Color(165, 214, 167));
        janelaVazia.setMaximumSize(new java.awt.Dimension(846, 690));
        janelaVazia.setMinimumSize(new java.awt.Dimension(846, 690));
        janelaVazia.setPreferredSize(new java.awt.Dimension(846, 690));

        lblLogo1.setBackground(new java.awt.Color(76, 175, 80));
        lblLogo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo1.setText("Versão Protótipo");

        lblLogo2.setBackground(new java.awt.Color(76, 175, 80));
        lblLogo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLogo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo2.setText("Tela Principal do Sistema");

        javax.swing.GroupLayout janelaVaziaLayout = new javax.swing.GroupLayout(janelaVazia);
        janelaVazia.setLayout(janelaVaziaLayout);
        janelaVaziaLayout.setHorizontalGroup(
            janelaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janelaVaziaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(janelaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addComponent(lblLogo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        janelaVaziaLayout.setVerticalGroup(
            janelaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janelaVaziaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );

        panelJanela.add(janelaVazia, "card2");

        panelMenu.setBackground(new java.awt.Color(76, 175, 80));
        panelMenu.setLayout(new java.awt.CardLayout());

        Vazio.setBackground(new java.awt.Color(76, 175, 80));

        javax.swing.GroupLayout VazioLayout = new javax.swing.GroupLayout(Vazio);
        Vazio.setLayout(VazioLayout);
        VazioLayout.setHorizontalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        VazioLayout.setVerticalGroup(
            VazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        panelMenu.add(Vazio, "Vazio");

        Administrador.setBackground(new java.awt.Color(76, 175, 80));

        menuAdministrador.setBackground(new java.awt.Color(76, 175, 80));
        menuAdministrador.setFloatable(false);
        menuAdministrador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuAdministrador.setBorderPainted(false);

        jLabel1.setText(" ");
        jLabel1.setMaximumSize(new java.awt.Dimension(30, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(30, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 20));
        menuAdministrador.add(jLabel1);

        jButton1.setBackground(new java.awt.Color(217, 224, 217));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Cadastro de Pessoas");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuAdministrador.add(jButton1);

        jLabel2.setText(" ");
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        menuAdministrador.add(jLabel2);

        jButton2.setBackground(new java.awt.Color(217, 224, 217));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Cadastro de Cursos");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menuAdministrador.add(jButton2);

        jLabel3.setText(" ");
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));
        menuAdministrador.add(jLabel3);

        jButton3.setBackground(new java.awt.Color(217, 224, 217));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Cadastro de Disciplinas");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menuAdministrador.add(jButton3);

        jLabel7.setText(" ");
        jLabel7.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel7.setPreferredSize(new java.awt.Dimension(30, 30));
        menuAdministrador.add(jLabel7);

        jButton4.setBackground(new java.awt.Color(217, 224, 217));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Cadastro de Relações");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menuAdministrador.add(jButton4);

        javax.swing.GroupLayout AdministradorLayout = new javax.swing.GroupLayout(Administrador);
        Administrador.setLayout(AdministradorLayout);
        AdministradorLayout.setHorizontalGroup(
            AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AdministradorLayout.setVerticalGroup(
            AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMenu.add(Administrador, "Administrador");

        Professor.setBackground(new java.awt.Color(76, 175, 80));

        menuProfessor.setBackground(new java.awt.Color(76, 175, 80));
        menuProfessor.setFloatable(false);
        menuProfessor.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuProfessor.setBorderPainted(false);

        jLabel11.setText(" ");
        jLabel11.setMaximumSize(new java.awt.Dimension(30, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(30, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(30, 20));
        menuProfessor.add(jLabel11);

        jButton12.setBackground(new java.awt.Color(217, 224, 217));
        jButton12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton12.setText("Dados Pessoais");
        jButton12.setActionCommand("");
        jButton12.setBorder(new javax.swing.border.MatteBorder(null));
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setEnabled(false);
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton12.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton12);

        jLabel12.setText(" ");
        jLabel12.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel12.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel12.setPreferredSize(new java.awt.Dimension(30, 30));
        menuProfessor.add(jLabel12);

        jButton15.setBackground(new java.awt.Color(217, 224, 217));
        jButton15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton15.setText("Painel do Professor");
        jButton15.setActionCommand("");
        jButton15.setBorder(new javax.swing.border.MatteBorder(null));
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton15.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton15.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        menuProfessor.add(jButton15);

        jLabel14.setText(" ");
        jLabel14.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel14.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel14.setPreferredSize(new java.awt.Dimension(30, 30));
        menuProfessor.add(jLabel14);

        jButton13.setBackground(new java.awt.Color(217, 224, 217));
        jButton13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton13.setText("Consultar Grade");
        jButton13.setActionCommand("");
        jButton13.setBorder(new javax.swing.border.MatteBorder(null));
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setEnabled(false);
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton13);

        jLabel15.setText(" ");
        jLabel15.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel15.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel15.setPreferredSize(new java.awt.Dimension(30, 30));
        menuProfessor.add(jLabel15);

        jButton16.setBackground(new java.awt.Color(217, 224, 217));
        jButton16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton16.setText("Editar Calendário");
        jButton16.setActionCommand("");
        jButton16.setBorder(new javax.swing.border.MatteBorder(null));
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setEnabled(false);
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton16.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton16.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton16);

        jLabel19.setText(" ");
        jLabel19.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel19.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel19.setPreferredSize(new java.awt.Dimension(30, 30));
        menuProfessor.add(jLabel19);

        jButton19.setBackground(new java.awt.Color(217, 224, 217));
        jButton19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton19.setText("Emitir Documentos");
        jButton19.setBorder(new javax.swing.border.MatteBorder(null));
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setEnabled(false);
        jButton19.setFocusable(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton19.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton19.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProfessor.add(jButton19);

        javax.swing.GroupLayout ProfessorLayout = new javax.swing.GroupLayout(Professor);
        Professor.setLayout(ProfessorLayout);
        ProfessorLayout.setHorizontalGroup(
            ProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ProfessorLayout.setVerticalGroup(
            ProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMenu.add(Professor, "Professor");

        Aluno.setBackground(new java.awt.Color(76, 175, 80));

        menuAluno.setBackground(new java.awt.Color(76, 175, 80));
        menuAluno.setFloatable(false);
        menuAluno.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuAluno.setBorderPainted(false);

        jLabel4.setText(" ");
        jLabel4.setMaximumSize(new java.awt.Dimension(30, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(30, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(30, 20));
        menuAluno.add(jLabel4);

        jButton5.setBackground(new java.awt.Color(217, 224, 217));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Dados Pessoais");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setEnabled(false);
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton5.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton5);

        jLabel5.setText(" ");
        jLabel5.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(30, 30));
        menuAluno.add(jLabel5);

        jButton11.setBackground(new java.awt.Color(217, 224, 217));
        jButton11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton11.setText("Matrícula em Disciplinas");
        jButton11.setBorder(new javax.swing.border.MatteBorder(null));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        menuAluno.add(jButton11);

        jLabel6.setText(" ");
        jLabel6.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel6.setPreferredSize(new java.awt.Dimension(30, 30));
        menuAluno.add(jLabel6);

        jButton7.setBackground(new java.awt.Color(217, 224, 217));
        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("Consultar Disciplinas");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setEnabled(false);
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton7.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton7);

        jLabel10.setText(" ");
        jLabel10.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel10.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel10.setPreferredSize(new java.awt.Dimension(30, 30));
        menuAluno.add(jLabel10);

        jButton6.setBackground(new java.awt.Color(217, 224, 217));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("Consultar Grade");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setEnabled(false);
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton6);

        jLabel16.setText(" ");
        jLabel16.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel16.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel16.setPreferredSize(new java.awt.Dimension(30, 30));
        menuAluno.add(jLabel16);

        jButton17.setBackground(new java.awt.Color(217, 224, 217));
        jButton17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton17.setText("Consultar Calendário");
        jButton17.setBorder(new javax.swing.border.MatteBorder(null));
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setEnabled(false);
        jButton17.setFocusable(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton17.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton17.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton17);

        jLabel18.setText(" ");
        jLabel18.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel18.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel18.setPreferredSize(new java.awt.Dimension(30, 30));
        menuAluno.add(jLabel18);

        jButton18.setBackground(new java.awt.Color(217, 224, 217));
        jButton18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton18.setText("Emitir Documentos");
        jButton18.setBorder(new javax.swing.border.MatteBorder(null));
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setEnabled(false);
        jButton18.setFocusable(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton18.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton18.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuAluno.add(jButton18);

        javax.swing.GroupLayout AlunoLayout = new javax.swing.GroupLayout(Aluno);
        Aluno.setLayout(AlunoLayout);
        AlunoLayout.setHorizontalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AlunoLayout.setVerticalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMenu.add(Aluno, "Aluno");

        panelDados.setBackground(new java.awt.Color(76, 175, 80));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Perfil:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Matrícula:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Usuário:");

        txtMatricula.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtMatricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMatricula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPerfil.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Acesso:");

        txtAcesso.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtAcesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcesso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosLayout.createSequentialGroup()
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAcesso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(panelJanela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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
        JPanel painel = new CadastrarPessoaView();
        setPainel(painel);
    }//GEN-LAST:event_jButton1ActionPerformed

    public LoginModel obterDadosLogin() {
        return dadosLogin;
    }
    
    private void setPainel(JPanel painel){            
        panelJanela.removeAll();
        panelJanela.add(painel);
        panelJanela.repaint();  
        this.pack();    
        panelJanela.grabFocus();
    }
        
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        CardLayout layout = (CardLayout) panelMenu.getLayout();
        layout.show(panelMenu, dadosLogin.getPerfil()); 
        
        txtPerfil.setText(dadosLogin.getPerfil()); 
        txtMatricula.setText(Integer.toString(dadosLogin.getMatricula()));
        txtUsuario.setText(nomeUsuario);     
        txtAcesso.setText(Integer.toString(dadosLogin.getQtdAcesso() + 1));         
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPanel painel = new CadastrarCursoView();
        setPainel(painel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JPanel painel = new CadastrarDisciplinaView();
        setPainel(painel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JPanel painel = new CadastrarRelacaoView();
        setPainel(painel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        JPanel painel = new TelaRealizarMatriculaView(dadosLogin);
        setPainel(painel);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        JPanel painel = new TelaPainelProfessorView(dadosLogin);
        setPainel(painel);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "Você realmente deseja encerrar a sessão?", "SGDA - Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
            TelaLoginView login = new TelaLoginView();
            login.pack();
            login.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipalView().setVisible(true);
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
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel janelaVazia;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JToolBar menuAdministrador;
    private javax.swing.JToolBar menuAluno;
    private javax.swing.JToolBar menuProfessor;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelJanela;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel txtAcesso;
    private javax.swing.JLabel txtMatricula;
    private javax.swing.JLabel txtPerfil;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
