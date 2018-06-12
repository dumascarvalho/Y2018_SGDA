package sgda.view;

import javax.swing.JOptionPane;
import sgda.controller.DadosLoginController;
import sgda.dao.LoginDAO;
import sgda.model.LoginModel;

public class TelaLoginView extends javax.swing.JFrame {

    public TelaLoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUsuário = new javax.swing.JLabel();
        txtUsuário = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblRedefinirSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setResizable(false);

        Login.setBackground(new java.awt.Color(165, 214, 167));

        lblLogo.setBackground(new java.awt.Color(76, 175, 80));
        lblLogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("Tela de Login");

        lblUsuário.setText("Nome de Usuário:");

        lblSenha.setText("Senha de Acesso:");

        lblRedefinirSenha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblRedefinirSenha.setForeground(java.awt.SystemColor.textHighlight);
        lblRedefinirSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRedefinirSenha.setText("<html><font color = 'black'>Você também pode</font> <u>redefinir sua senha</u> <font color = 'black'>aqui.</font></html>");
        lblRedefinirSenha.setToolTipText("Clique aqui para redefinir a sua senha.");
        lblRedefinirSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRedefinirSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRedefinirSenhaMouseClicked(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(217, 224, 217));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(new javax.swing.border.MatteBorder(null));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(217, 224, 217));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.MatteBorder(null));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuário)
                            .addComponent(lblSenha))
                        .addGap(260, 260, 260))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha)
                            .addComponent(txtUsuário)
                            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblRedefinirSenha)))
                        .addGap(15, 15, 15))))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsuário)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRedefinirSenha)
                .addGap(30, 30, 30)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limparCampos() {
        txtUsuário.setText("");
        txtSenha.setText("");
        txtUsuário.grabFocus();
    }
    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        LoginDAO dao = new LoginDAO();
        LoginModel dadosInformados = new LoginModel();
        
        dadosInformados.setUsuario(txtUsuário.getText());
        dadosInformados.setSenha(txtSenha.getText());
        
        LoginModel dadosLogin = dao.autenticar(dadosInformados);
        
        if (dadosInformados.getUsuario().equals(dadosLogin.getUsuario()) && dadosInformados.getSenha().equals(dadosLogin.getSenha())) {
            JOptionPane.showConfirmDialog(null, "Usuário e senha autenticados com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);          
            DadosLoginController loginController = new DadosLoginController();
            loginController.primeiroAcesso(dadosLogin);
            this.dispose();
        } else {
            JOptionPane.showConfirmDialog(null, "Usuário e/ou senha inválidos!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            limparCampos();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblRedefinirSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRedefinirSenhaMouseClicked
            RedefinirSenhaView senha = new RedefinirSenhaView();

            senha.pack();
            senha.setVisible(true);
    }//GEN-LAST:event_lblRedefinirSenhaMouseClicked

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
            new TelaLoginView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRedefinirSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuário;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuário;
    // End of variables declaration//GEN-END:variables
}
