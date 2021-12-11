/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author Usuario
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastrarGeral = new javax.swing.JMenuItem();
        buscarJogos = new javax.swing.JMenuItem();
        AlterarJogos = new javax.swing.JMenuItem();
        excluirJogos = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Todos");

        cadastrarGeral.setText("Cadastrar Produto");
        cadastrarGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarGeralActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarGeral);

        buscarJogos.setText("Buscar Jogos");
        buscarJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJogosActionPerformed(evt);
            }
        });
        jMenu1.add(buscarJogos);

        AlterarJogos.setText("Alterar Jogos");
        AlterarJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarJogosActionPerformed(evt);
            }
        });
        jMenu1.add(AlterarJogos);

        excluirJogos.setText("Excluir Jogos");
        excluirJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirJogosActionPerformed(evt);
            }
        });
        jMenu1.add(excluirJogos);

        Sair.setText("Sair");
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem5.setText("Sobre");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarGeralActionPerformed
        TelaCadastroGeral telaCadastroGeral = new TelaCadastroGeral();
        telaCadastroGeral.setVisible(true);
    }//GEN-LAST:event_cadastrarGeralActionPerformed

    private void buscarJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJogosActionPerformed
        TelaBusca telaBusca = new TelaBusca();
        telaBusca.setVisible(true);
    }//GEN-LAST:event_buscarJogosActionPerformed

    private void excluirJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirJogosActionPerformed
        TelaBusca telaBusca = new TelaBusca();
        telaBusca.setVisible(true);
    }//GEN-LAST:event_excluirJogosActionPerformed

    private void AlterarJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarJogosActionPerformed
        TelaBusca telaBusca = new TelaBusca();
        telaBusca.setVisible(true);
    }//GEN-LAST:event_AlterarJogosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlterarJogos;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem buscarJogos;
    private javax.swing.JMenuItem cadastrarGeral;
    private javax.swing.JMenuItem excluirJogos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
