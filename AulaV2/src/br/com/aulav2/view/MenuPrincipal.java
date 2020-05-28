package br.com.aulav2.view;

import br.com.aulav2.view.Cliente.CadastroCliente;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jdpMenuPrincipal = new javax.swing.JDesktopPane();
        jmbMenuPrincipal = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmCadastros = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmiFornecedor = new javax.swing.JMenuItem();
        jmiProdutos = new javax.swing.JMenuItem();
        jmMovimentacoes = new javax.swing.JMenu();
        jmiEntradaDeEstoque = new javax.swing.JMenuItem();
        jmiVendas = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmiRelacaoDeClientes = new javax.swing.JMenuItem();
        jmiRelacaoDeFornecedores = new javax.swing.JMenuItem();
        jmiRelacaoDeProdutos = new javax.swing.JMenuItem();
        jmiRelaçaoDeEstoquePorPeriodo = new javax.swing.JMenuItem();
        jmiVendasPorPeriodo = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiSobreoSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpMenuPrincipalLayout = new javax.swing.GroupLayout(jdpMenuPrincipal);
        jdpMenuPrincipal.setLayout(jdpMenuPrincipalLayout);
        jdpMenuPrincipalLayout.setHorizontalGroup(
            jdpMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        jdpMenuPrincipalLayout.setVerticalGroup(
            jdpMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/salvar.png"))); // NOI18N
        jmArquivo.setText("Arquivo");

        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/sair.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jmbMenuPrincipal.add(jmArquivo);

        jmCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/iniciarNovo.png"))); // NOI18N
        jmCadastros.setText("Cadastros");

        jmiClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/iniciarNovo.png"))); // NOI18N
        jmiClientes.setText("Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiClientes);

        jmiFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/iniciarNovo.png"))); // NOI18N
        jmiFornecedor.setText("Fornecedor");
        jmCadastros.add(jmiFornecedor);

        jmiProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/iniciarNovo.png"))); // NOI18N
        jmiProdutos.setText("Produtos");
        jmCadastros.add(jmiProdutos);

        jmbMenuPrincipal.add(jmCadastros);

        jmMovimentacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/incluir.png"))); // NOI18N
        jmMovimentacoes.setText("Movimentações");

        jmiEntradaDeEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/incluir.png"))); // NOI18N
        jmiEntradaDeEstoque.setText("Entrada de estoque");
        jmMovimentacoes.add(jmiEntradaDeEstoque);

        jmiVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/incluir.png"))); // NOI18N
        jmiVendas.setText("Vendas");
        jmMovimentacoes.add(jmiVendas);

        jmbMenuPrincipal.add(jmMovimentacoes);

        jmRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/imprimir.png"))); // NOI18N
        jmRelatorios.setText("Relatórios");

        jmiRelacaoDeClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/imprimir.png"))); // NOI18N
        jmiRelacaoDeClientes.setText("Relação de Clientes");
        jmRelatorios.add(jmiRelacaoDeClientes);

        jmiRelacaoDeFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/imprimir.png"))); // NOI18N
        jmiRelacaoDeFornecedores.setText("Relação de Fornecedores");
        jmRelatorios.add(jmiRelacaoDeFornecedores);

        jmiRelacaoDeProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/imprimir.png"))); // NOI18N
        jmiRelacaoDeProdutos.setText("Relação de Produtos");
        jmRelatorios.add(jmiRelacaoDeProdutos);

        jmiRelaçaoDeEstoquePorPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/imprimir.png"))); // NOI18N
        jmiRelaçaoDeEstoquePorPeriodo.setText("Relação de Estoque por período");
        jmRelatorios.add(jmiRelaçaoDeEstoquePorPeriodo);

        jmiVendasPorPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/imprimir.png"))); // NOI18N
        jmiVendasPorPeriodo.setText("Vendas por período");
        jmiVendasPorPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendasPorPeriodoActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmiVendasPorPeriodo);

        jmbMenuPrincipal.add(jmRelatorios);

        jmAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/consultar.png"))); // NOI18N
        jmAjuda.setText("Ajuda");

        jmiSobreoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/aulav2/view/icons/consultar.png"))); // NOI18N
        jmiSobreoSistema.setText("Sobre o Sistema");
        jmAjuda.add(jmiSobreoSistema);

        jmbMenuPrincipal.add(jmAjuda);

        setJMenuBar(jmbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMenuPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMenuPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
    dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiVendasPorPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendasPorPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiVendasPorPeriodoActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
    CadastroCliente obj = new CadastroCliente();
        jdpMenuPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jdpMenuPrincipal;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmMovimentacoes;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenuBar jmbMenuPrincipal;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiEntradaDeEstoque;
    private javax.swing.JMenuItem jmiFornecedor;
    private javax.swing.JMenuItem jmiProdutos;
    private javax.swing.JMenuItem jmiRelacaoDeClientes;
    private javax.swing.JMenuItem jmiRelacaoDeFornecedores;
    private javax.swing.JMenuItem jmiRelacaoDeProdutos;
    private javax.swing.JMenuItem jmiRelaçaoDeEstoquePorPeriodo;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobreoSistema;
    private javax.swing.JMenuItem jmiVendas;
    private javax.swing.JMenuItem jmiVendasPorPeriodo;
    // End of variables declaration//GEN-END:variables
}
