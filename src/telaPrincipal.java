/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maicon
 */
public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        principalInserirTicket = new javax.swing.JMenu();
        MenuItem1Usuario = new javax.swing.JMenuItem();
        MenuItem1Host = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        principalEditar = new javax.swing.JMenu();
        MenuItem2Usuario = new javax.swing.JMenuItem();
        MenuItem2Host = new javax.swing.JMenuItem();
        principalRelatorio = new javax.swing.JMenu();
        MenuItem4RelatorioUsuario = new javax.swing.JMenuItem();
        MenuItem4RelatorioIncidente = new javax.swing.JMenuItem();
        principalSair = new javax.swing.JMenu();
        MenuItem3SairUsuario = new javax.swing.JMenuItem();
        MenuItem3SairSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        getContentPane().setLayout(null);

        principalPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(principalPesquisa);
        principalPesquisa.setBounds(570, 50, 210, 24);

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel1.setText("Pesquisar :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 30, 70, 16);

        principalInserirTicket.setText("Inserir");

        MenuItem1Usuario.setText("Usuário");
        MenuItem1Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1UsuarioActionPerformed(evt);
            }
        });
        principalInserirTicket.add(MenuItem1Usuario);

        MenuItem1Host.setText("Host");
        MenuItem1Host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1HostActionPerformed(evt);
            }
        });
        principalInserirTicket.add(MenuItem1Host);

        jMenuItem1.setText("Ticket");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        principalInserirTicket.add(jMenuItem1);

        jMenuBar1.add(principalInserirTicket);

        principalEditar.setText("Editar");

        MenuItem2Usuario.setText("Usuário");
        MenuItem2Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem2UsuarioActionPerformed(evt);
            }
        });
        principalEditar.add(MenuItem2Usuario);

        MenuItem2Host.setText("Host");
        principalEditar.add(MenuItem2Host);

        jMenuBar1.add(principalEditar);

        principalRelatorio.setText("Relatórios");

        MenuItem4RelatorioUsuario.setText("Usuário");
        MenuItem4RelatorioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem4RelatorioUsuarioActionPerformed(evt);
            }
        });
        principalRelatorio.add(MenuItem4RelatorioUsuario);

        MenuItem4RelatorioIncidente.setText("Incidente");
        principalRelatorio.add(MenuItem4RelatorioIncidente);

        jMenuBar1.add(principalRelatorio);

        principalSair.setText("Sair");

        MenuItem3SairUsuario.setText("Sair do Usuário");
        MenuItem3SairUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem3SairUsuarioActionPerformed(evt);
            }
        });
        principalSair.add(MenuItem3SairUsuario);

        MenuItem3SairSistema.setText("Sair do Sistema");
        MenuItem3SairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem3SairSistemaActionPerformed(evt);
            }
        });
        principalSair.add(MenuItem3SairSistema);

        jMenuBar1.add(principalSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(833, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem2UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem2UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem2UsuarioActionPerformed

    private void MenuItem1UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem1UsuarioActionPerformed
        // TODO add your handling code here:
        telaCadastroUser cadastro = new telaCadastroUser();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuItem1UsuarioActionPerformed

    private void MenuItem3SairUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem3SairUsuarioActionPerformed
        // TODO add your handling code here:
        telaUser user = new telaUser();
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuItem3SairUsuarioActionPerformed

    private void MenuItem4RelatorioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem4RelatorioUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem4RelatorioUsuarioActionPerformed

    private void MenuItem1HostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem1HostActionPerformed
        // TODO add your handling code here:
        telaHost host = new telaHost();
        host.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuItem1HostActionPerformed

    private void principalPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_principalPesquisaActionPerformed

    private void MenuItem3SairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem3SairSistemaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MenuItem3SairSistemaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        telaTicket ticket = new telaTicket();
        ticket.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem1Host;
    private javax.swing.JMenuItem MenuItem1Usuario;
    private javax.swing.JMenuItem MenuItem2Host;
    private javax.swing.JMenuItem MenuItem2Usuario;
    private javax.swing.JMenuItem MenuItem3SairSistema;
    private javax.swing.JMenuItem MenuItem3SairUsuario;
    private javax.swing.JMenuItem MenuItem4RelatorioIncidente;
    private javax.swing.JMenuItem MenuItem4RelatorioUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu principalEditar;
    private javax.swing.JMenu principalInserirTicket;
    private javax.swing.JTextField principalPesquisa;
    private javax.swing.JMenu principalRelatorio;
    private javax.swing.JMenu principalSair;
    // End of variables declaration//GEN-END:variables
}
