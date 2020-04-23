package gui;

import dados.Tabela;
import dao.Prof_DAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Professores extends javax.swing.JFrame {

    static int id = 0;

    private final Prof_DAO prof_DAO = new Prof_DAO();

    public Professores() {
        initComponents();
        setLocationRelativeTo(null);
        carregarGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bt_DeleteAll = new javax.swing.JToggleButton();
        Bt_Voltar = new javax.swing.JButton();
        Bt_DeleteID = new javax.swing.JButton();
        Bt_Edit = new javax.swing.JButton();
        Bt_Atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new Tabela());
        jScrollPane1.setViewportView(jTable1);

        Bt_DeleteAll.setText("Deletar registros");
        Bt_DeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DeleteAllActionPerformed(evt);
            }
        });

        Bt_Voltar.setText("Voltar");
        Bt_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_VoltarActionPerformed(evt);
            }
        });

        Bt_DeleteID.setText("Deletar por ID");
        Bt_DeleteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DeleteIDActionPerformed(evt);
            }
        });

        Bt_Edit.setText("Editar");
        Bt_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_EditActionPerformed(evt);
            }
        });

        Bt_Atualizar.setText("Atualizar");
        Bt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Bt_Voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_Atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_DeleteID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_DeleteAll)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_DeleteAll)
                    .addComponent(Bt_Voltar)
                    .addComponent(Bt_DeleteID)
                    .addComponent(Bt_Edit)
                    .addComponent(Bt_Atualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_DeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DeleteAllActionPerformed

        try {
            prof_DAO.deletar();
            this.dispose();
            new Professores().setVisible(true);
            JOptionPane.showMessageDialog(this, "Dados deletados com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar informações.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Bt_DeleteAllActionPerformed

    private void Bt_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_Bt_VoltarActionPerformed

    private void Bt_DeleteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DeleteIDActionPerformed
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID para deletar"));

        try {
            prof_DAO.deletarID(id);
            this.dispose();
            new Professores().setVisible(true);
            JOptionPane.showMessageDialog(this, "Professor deletado com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar informação.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Bt_DeleteIDActionPerformed

    private void Bt_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_EditActionPerformed

        try {
            new Edit_Prof().setVisible(true);
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(Professores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt_EditActionPerformed

    private void Bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AtualizarActionPerformed
        this.dispose();
        new Professores().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_Bt_AtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Professores().setVisible(true);
            }
        });
    }

    private void carregarGrade() {
        Tabela tm = (Tabela) jTable1.getModel();
        try {

            tm.setDados(prof_DAO.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Atualizar;
    private javax.swing.JToggleButton Bt_DeleteAll;
    private javax.swing.JButton Bt_DeleteID;
    private javax.swing.JButton Bt_Edit;
    private javax.swing.JButton Bt_Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
