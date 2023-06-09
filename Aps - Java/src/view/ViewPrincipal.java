/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbUsuario = new javax.swing.JButton();
        jbProduto = new javax.swing.JButton();
        jbEstoque = new javax.swing.JButton();
        jbSobre = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiUsuario = new javax.swing.JMenuItem();
        jmiProduto = new javax.swing.JMenuItem();
        jmiMovimentacaoEstoque = new javax.swing.JMenuItem();
        jmiSobre = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APS-JAVA");

        jbUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-user-80.png"))); // NOI18N
        jbUsuario.setText("Usuários");
        jbUsuario.setPreferredSize(new java.awt.Dimension(210, 80));
        jbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioActionPerformed(evt);
            }
        });

        jbProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-produto-80.png"))); // NOI18N
        jbProduto.setText("Produtos");
        jbProduto.setPreferredSize(new java.awt.Dimension(210, 80));
        jbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutoActionPerformed(evt);
            }
        });

        jbEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-movimento-de-estoque-80.png"))); // NOI18N
        jbEstoque.setText("Estoque");
        jbEstoque.setPreferredSize(new java.awt.Dimension(210, 80));
        jbEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstoqueActionPerformed(evt);
            }
        });

        jbSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-sobre-80.png"))); // NOI18N
        jbSobre.setText("Sobre");
        jbSobre.setPreferredSize(new java.awt.Dimension(210, 80));
        jbSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSobreActionPerformed(evt);
            }
        });

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-desligar-80.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.setPreferredSize(new java.awt.Dimension(210, 80));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivos");

        jmiUsuario.setText("Usuários");
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiUsuario);

        jmiProduto.setText("Produtos");
        jmiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProduto);

        jmiMovimentacaoEstoque.setText("Movimentação de estoque");
        jmiMovimentacaoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMovimentacaoEstoqueActionPerformed(evt);
            }
        });
        jMenu1.add(jmiMovimentacaoEstoque);

        jmiSobre.setText("Sobre");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSobre);
        jMenu1.add(jSeparator1);

        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed

    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        // finalizar o software
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // finalizar o software
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSobreActionPerformed
        // exibir dados sobre o projeto
        JOptionPane.showMessageDialog(this, "Programa desenvolvido em linguagem de programação Java,\n"
                + "IDE - Netbeans, banco de dados - SQLite.\n"
                + "Alunos:\n"
                + "Leonardo Rosalem Santos Rosa - G427AG9,\n"
                + "Henrique Lima da Silva - N807539\n"
                + "Victor Inocencio Torres - G555318", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbSobreActionPerformed

    private void jbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutoActionPerformed
        // chamar interface de produto
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_jbProdutoActionPerformed

    private void jbEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstoqueActionPerformed
        // chamar interface de estoque
        new ViewEstoque().setVisible(true);
    }//GEN-LAST:event_jbEstoqueActionPerformed

    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
        // chamar interface de usuário
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoActionPerformed
        // chamar interface de produto
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_jmiProdutoActionPerformed

    private void jmiMovimentacaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMovimentacaoEstoqueActionPerformed
        // chamar interface de estoque
        new ViewEstoque().setVisible(true);
    }//GEN-LAST:event_jmiMovimentacaoEstoqueActionPerformed

    private void jbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioActionPerformed
        // chamar interface de usuário
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_jbUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbEstoque;
    private javax.swing.JButton jbProduto;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSobre;
    private javax.swing.JButton jbUsuario;
    private javax.swing.JMenuItem jmiMovimentacaoEstoque;
    private javax.swing.JMenuItem jmiProduto;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JMenuItem jmiUsuario;
    // End of variables declaration//GEN-END:variables
}
