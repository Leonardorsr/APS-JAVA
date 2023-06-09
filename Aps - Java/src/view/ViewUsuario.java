/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MUsuario;

/**
 *
 * @author Administrador
 */
public class ViewUsuario extends javax.swing.JFrame {

    private final CUsuario controller_usuario = new CUsuario();
    private MUsuario modelUsuario = new MUsuario();
    private ArrayList<MUsuario> listaModelUsuarios = new ArrayList<>();
    private String salvarAlterar = "salvar";

    /**
     * Creates new form ViewUsuario ....
     */
    public ViewUsuario() {
        initComponents();
        carregarUsuarios();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        JBInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuário");
        setResizable(false);

        jLabel1.setText("Código");

        jtfCodigo.setEditable(false);
        jtfCodigo.setToolTipText("Não preencher este campo");
        jtfCodigo.setEnabled(false);

        jLabel2.setText("Nome do usuário");

        jtfLogin.setToolTipText("Login deve ser único");

        jLabel3.setText("Login");

        jLabel4.setText("Senha");

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ));
        jScrollPane1.setViewportView(jtUsuario);
        if (jtUsuario.getColumnModel().getColumnCount() > 0) {
            jtUsuario.getColumnModel().getColumn(0).setMinWidth(120);
            jtUsuario.getColumnModel().getColumn(0).setPreferredWidth(120);
            jtUsuario.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        jbSalvar.setBackground(new java.awt.Color(0, 153, 102));
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-salvar-20.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-lixo-20.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        JBInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-sobre-45.png"))); // NOI18N
        JBInfo.setText("Info");
        JBInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 114, Short.MAX_VALUE))
                            .addComponent(jtfSenha)))
                    .addComponent(jbSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(JBInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(JBInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        //pegar dados da interface e salvar um novo usuário ou alterar o selecionado
        try {
            modelUsuario.setUsuId(Integer.parseInt(jtfCodigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelUsuario.setUsuNome(jtfNome.getText());
        modelUsuario.setUsuLogin(jtfLogin.getText());
        modelUsuario.setUsuSenha(String.valueOf(jtfSenha.getPassword()));

        if (controller_usuario.validarUsuarioFormController(modelUsuario)) {
            //salva
            if (this.salvarAlterar.equals("salvar")) {
                if (controller_usuario.salvarUsuarioController(modelUsuario)) {
                    JOptionPane.showMessageDialog(this, "Usuário salvo com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    carregarUsuarios();
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar usuário","ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        //pegar usuário selecionado e excluir do banco
        int linha = jtUsuario.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this,"Nenhum item selecionado!","Atenção",JOptionPane.WARNING_MESSAGE);
        } else {
            int codigoUsuario = (int) jtUsuario.getValueAt(linha, 0);
            if (controller_usuario.excluirUsuarioController(codigoUsuario)) {
                JOptionPane.showMessageDialog(this,"Usuário excluído com sucesso","Atenção",JOptionPane.INFORMATION_MESSAGE);
                this.carregarUsuarios();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this,"Erro ao excluir o usuario", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void JBInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInfoActionPerformed
        JOptionPane.showMessageDialog(this,
                "ADICIONANDO UM USUÁRIO\n" 
                +"Para adicionar um usuário, digite seu nome, login e senha, então, clique em salvar",
                "Info", JOptionPane.INFORMATION_MESSAGE);         // TODO add your handling code here:
    }//GEN-LAST:event_JBInfoActionPerformed

    //limpar formuluario usuario
    private void limparCampos() {
        jtfCodigo.setText("");
        jtfNome.setText("");
        jtfLogin.setText("");
        jtfSenha.setText("");
        salvarAlterar = "salvar";
    }

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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    /**
     * Carregar usuários cadastrados no banco
     */
    private void carregarUsuarios() {
        listaModelUsuarios = controller_usuario.getListaUsuarioController();
        DefaultTableModel modelo = (DefaultTableModel) jtUsuario.getModel();
        modelo.setNumRows(0);

        int cont = listaModelUsuarios.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUsuarios.get(i).getUsuId(),
                listaModelUsuarios.get(i).getUsuNome(),
                listaModelUsuarios.get(i).getUsuLogin()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
