/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import java.awt.Desktop;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author AndreLGSilva
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    Connection conexao = null;

    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDesktop = new javax.swing.JDesktopPane();
        lblImagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        mCadCliente = new javax.swing.JMenuItem();
        mCadOS = new javax.swing.JMenuItem();
        mCadUsu = new javax.swing.JMenuItem();
        mRel = new javax.swing.JMenu();
        mrelClientes = new javax.swing.JMenuItem();
        mService = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();
        mAjudaSobre = new javax.swing.JMenuItem();
        mOpc = new javax.swing.JMenu();
        mOpcSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - Sistema para Controle de O.S");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlDesktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout pnlDesktopLayout = new javax.swing.GroupLayout(pnlDesktop);
        pnlDesktop.setLayout(pnlDesktopLayout);
        pnlDesktopLayout.setHorizontalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        pnlDesktopLayout.setVerticalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/x.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuário: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Data: ");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        mCadastro.setText("Cadastro");

        mCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mCadCliente.setText("Cliente");
        mCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCadClienteActionPerformed(evt);
            }
        });
        mCadastro.add(mCadCliente);

        mCadOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        mCadOS.setText("OS");
        mCadOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCadOSActionPerformed(evt);
            }
        });
        mCadastro.add(mCadOS);

        mCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        mCadUsu.setText("Usuário");
        mCadUsu.setEnabled(false);
        mCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCadUsuActionPerformed(evt);
            }
        });
        mCadastro.add(mCadUsu);

        Menu.add(mCadastro);

        mRel.setText("Relatório");
        mRel.setEnabled(false);

        mrelClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        mrelClientes.setText("Clientes");
        mrelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrelClientesActionPerformed(evt);
            }
        });
        mRel.add(mrelClientes);

        mService.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mService.setText("Serviços");
        mService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mServiceActionPerformed(evt);
            }
        });
        mRel.add(mService);

        Menu.add(mRel);

        mAjuda.setText("Ajuda");

        mAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mAjudaSobre.setText("Sobre");
        mAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAjudaSobreActionPerformed(evt);
            }
        });
        mAjuda.add(mAjudaSobre);

        Menu.add(mAjuda);

        mOpc.setText("Opções");

        mOpcSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mOpcSair.setText("Sair");
        mOpcSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOpcSairActionPerformed(evt);
            }
        });
        mOpc.add(mOpcSair);

        Menu.add(mOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblImagem)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(920, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCadClienteActionPerformed
        // Chamando Cadastro de Cliente:
        TCadClientes cliente = new TCadClientes();
        cliente.setVisible(true);
        pnlDesktop.add(cliente);
    }//GEN-LAST:event_mCadClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Alterar a lblData para a data do sistema
        Date data = new Date();
        DateFormat formatarData = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatarData.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void mOpcSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOpcSairActionPerformed
        // Método para exibir caixa de diálogo ao sair
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o Sistema?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mOpcSairActionPerformed

    private void mAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAjudaSobreActionPerformed
        // Chamando tela sobre
        TSobre sobre = new TSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_mAjudaSobreActionPerformed

    private void mCadOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCadOSActionPerformed
        // Chamando tela de Cadastro de OS
        TelaOS os = new TelaOS();
        os.setVisible(true);
        pnlDesktop.add(os);
    }//GEN-LAST:event_mCadOSActionPerformed

    private void mCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCadUsuActionPerformed
        // Chamando tela de Cadastro de Usuários
        TCadUsuarios usuario = new TCadUsuarios();
        usuario.setVisible(true);
        pnlDesktop.add(usuario);
    }//GEN-LAST:event_mCadUsuActionPerformed

    private void mServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mServiceActionPerformed
        // Gerar de Relatório de Serviços
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a emissão do Relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //Imprimindo relatório com FrameWork jasperReports
            try {
                //Utilizando a classe JasperPrint
                JasperPrint print = JasperFillManager.fillReport("C:\\reports\\servicos.jasper", null, conexao);
                //Exibindo o relatório através da classe jasperViwer
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_mServiceActionPerformed

    private void mrelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrelClientesActionPerformed
        // Gerar relatório de Clientes
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do Relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //Imprimindo relatório com FrameWork jasperReports
            try {
                //Utilizando a classe JasperPrint
                JasperPrint print = JasperFillManager.fillReport("C:\\reports\\clientes.jasper", null, conexao);
                //Exibindo o relatório através da classe jasperViwer
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_mrelClientesActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblImagem;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenuItem mAjudaSobre;
    private javax.swing.JMenuItem mCadCliente;
    private javax.swing.JMenuItem mCadOS;
    public static javax.swing.JMenuItem mCadUsu;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mOpc;
    private javax.swing.JMenuItem mOpcSair;
    public static javax.swing.JMenu mRel;
    private javax.swing.JMenuItem mService;
    private javax.swing.JMenuItem mrelClientes;
    private javax.swing.JDesktopPane pnlDesktop;
    // End of variables declaration//GEN-END:variables

}
