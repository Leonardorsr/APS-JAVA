package view;

import controller.CEstProdUsu;
import controller.CProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.MProduto;
import util.Formatador;

/**
 *
 * @author Administrador
 */
public class ViewProduto extends javax.swing.JFrame {

    private MProduto modelProduto = new MProduto();
    private ArrayList<MProduto> listaModelProdutos = new ArrayList<>();
    private String salvarAlterar = "salvar";
    private final CProduto controller_produto = new CProduto();
    private final CEstProdUsu controller_estoque_produto_usuario = new CEstProdUsu();
    private final Formatador formatador = new Formatador();

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        carregarProdutos();
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
        jtfDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        JBInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);

        jLabel1.setText("Código");

        jtfCodigo.setEditable(false);
        jtfCodigo.setToolTipText("Não preencher este campo");
        jtfCodigo.setEnabled(false);

        jLabel2.setText("Descrição produto");

        jLabel4.setText("Valor");

        jtfValor.setToolTipText("Zero ou maior");

        jbSalvar.setBackground(new java.awt.Color(0, 153, 102));
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-salvar-20.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setMinWidth(80);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtProdutos.getColumnModel().getColumn(0).setMaxWidth(80);
            jtProdutos.getColumnModel().getColumn(2).setMinWidth(100);
            jtProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
            jtProdutos.getColumnModel().getColumn(3).setMinWidth(100);
            jtProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-lixo-20.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/icons8-editar-20.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDescricao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(JBInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar)
                    .addComponent(JBInfo))
                .addContainerGap())
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

        modelProduto.setProDescricao(this.jtfDescricao.getText());
        modelProduto.setProQuantidade(0);
        modelProduto.setProValor(0.0d);
        if (!this.estaVazio(this.jtfValor)) {
            modelProduto.setProValor(formatador.converterVirgulaParaPonto(this.jtfValor.getText()));
        }

        if (controller_produto.validarProdutoFormController(modelProduto)) {
            if (salvarAlterar.equals("salvar")) {
                //salvar um novo produto
                if (controller_produto.salvarProdutoController(modelProduto)) {
                    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    this.carregarProdutos();
                    this.limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else if (salvarAlterar.equals("alterar")) {
                //alterar um produto cadastrado
                if (controller_produto.alterarProdutoController(modelProduto)) {
                    JOptionPane.showMessageDialog(this, "Produto alterado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    this.carregarProdutos();
                    this.limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar produto", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this,"Alguns dados não foram preenchidos ou foram preenchidos de maneira errada","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        salvarAlterar = "alterar";
        int linha = jtProdutos.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um item para alterar", "INFO.", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                int codigoProduto = (int) this.jtProdutos.getValueAt(linha, 0);
                //recuperar dados do banco
                modelProduto = controller_produto.getProdutoController(codigoProduto);
                //setar na interface
                this.jtfCodigo.setText(String.valueOf(modelProduto.getProId()));
                this.jtfDescricao.setText(modelProduto.getProDescricao());
                this.jtfValor.setText(String.valueOf(modelProduto.getProValor()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtProdutos.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int codigoProduto = (int) jtProdutos.getValueAt(linha, 0);

            if (!controller_estoque_produto_usuario.produtoEstaNoEstoqueController(codigoProduto)) {

                // excluir um produto pelo código
                if (controller_produto.excluirProdutoController(codigoProduto)) {
                    JOptionPane.showMessageDialog(this, "Produto excluido com sucesso", "INFO", JOptionPane.INFORMATION_MESSAGE);;
                    this.carregarProdutos();
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir produto", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                    JOptionPane.showMessageDialog(this, "O produto selecionado já se encontra registrado no estoque. Para excluí-lo é necessário removê-lo do estoque.", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void JBInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInfoActionPerformed
        // TODO add your handling code here:
        // exibir dados sobre o projeto
        JOptionPane.showMessageDialog(this,
                "ADICIONANDO UM PRODUTO\n" 
                +"Para adicionar um produto, clique digite sua descrição e preço, então, clique em salvar"
                + "\n"
                + "\n"
                + "ALTERANDO UM PRODUTO\n"
                + "Para alterar um produto, selecione o produto desejado e altere na parte de cima, então, clique em salvar",
                "Info", JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_JBInfoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    /**
     * Limpar os campos do formulário
     */
    private void limparCampos() {
        jtfCodigo.setText("");
        jtfDescricao.setText("");
        jtfValor.setText("0");
        salvarAlterar = "salvar";
    }

    private boolean estaVazio(JTextField pCampoTexto) {
        if (pCampoTexto.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Carregar produtos cadastrados no banco
     */
    private void carregarProdutos() {
        listaModelProdutos = controller_produto.getListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);
        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getProId(),
                listaModelProdutos.get(i).getProDescricao(),
                listaModelProdutos.get(i).getProQuantidade(),
                listaModelProdutos.get(i).getProValor()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}