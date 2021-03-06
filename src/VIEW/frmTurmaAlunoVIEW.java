/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.AlunoDAO;
import DAO.TurmaAlunoDAO;
import DAO.TurmaDAO;
import DTO.AlunoDTO;
import DTO.TurmaDTO;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thiago
 */
public class frmTurmaAlunoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmTurmaVIEW
     */
    public frmTurmaAlunoVIEW() {
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

        lvlNomeAluno = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();
        btnAtribuir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTurmas = new javax.swing.JTable();
        txtNomeTurma = new javax.swing.JTextField();
        lvlNomeAluno1 = new javax.swing.JLabel();
        btnPesquisarAluno = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lvlNomeAluno.setText("Pesquisa Aluno");

        txtNomeAluno.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNomeAlunoInputMethodTextChanged(evt);
            }
        });
        txtNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlunoActionPerformed(evt);
            }
        });

        tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NOME", "MATRICULA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAlunos);

        btnAtribuir.setText("Atribuir");
        btnAtribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtribuirActionPerformed(evt);
            }
        });

        tableTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "TURMA", "ANO"
            }
        ));
        jScrollPane2.setViewportView(tableTurmas);

        txtNomeTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeTurmaActionPerformed(evt);
            }
        });

        lvlNomeAluno1.setText("Pesquisa Turma");

        btnPesquisarAluno.setText("pesquisar");
        btnPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAlunoActionPerformed(evt);
            }
        });

        jButton3.setText("pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lvlNomeAluno1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lvlNomeAluno)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeAluno))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(40, 40, 40)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAtribuir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnPesquisarAluno)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarAluno)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlNomeAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtribuir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAlunoActionPerformed

    private void txtNomeTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTurmaActionPerformed

    private void txtNomeAlunoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNomeAlunoInputMethodTextChanged
        buscaAlunoPorNome();
    }//GEN-LAST:event_txtNomeAlunoInputMethodTextChanged

    private void btnPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAlunoActionPerformed
        buscaAlunoPorNome();

    }//GEN-LAST:event_btnPesquisarAlunoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.buscaTurmaPorNome();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAtribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtribuirActionPerformed
        this.alocarAlunoEmTurma();// TODO add your handling code here:
    }//GEN-LAST:event_btnAtribuirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       frmPrincipalVIEW obj = new frmPrincipalVIEW();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(frmTurmaAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTurmaAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTurmaAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTurmaAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTurmaAlunoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtribuir;
    private javax.swing.JButton btnPesquisarAluno;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lvlNomeAluno;
    private javax.swing.JLabel lvlNomeAluno1;
    private javax.swing.JTable tableAlunos;
    private javax.swing.JTable tableTurmas;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeTurma;
    // End of variables declaration//GEN-END:variables

    private void buscaAlunoPorNome() {
        try {

            String nome = txtNomeAluno.getText();

            AlunoDAO objAlunoDAO = new AlunoDAO();
            DefaultTableModel tabelaModel = (DefaultTableModel) tableAlunos.getModel();
            tabelaModel.setNumRows(0);

            ArrayList<AlunoDTO> listaAluno = objAlunoDAO.buscarAlunoPorNome(nome);
            for (AlunoDTO aluno : listaAluno) {

                tabelaModel.addRow(new Object[]{
                    aluno.getNome(),
                    aluno.getMatricula()

                });
            }

        } catch (Exception ex) {

            System.out.println("Erro ao listar profissionais buscados na tela");

        }
    }

    private void buscaTurmaPorNome() {
        try {

            String nome = txtNomeTurma.getText();

            TurmaDAO objTurmaDAO = new TurmaDAO();
            DefaultTableModel tabelaModel = (DefaultTableModel) tableTurmas.getModel();
            tabelaModel.setNumRows(0);

            ArrayList<TurmaDTO> listaTurma = objTurmaDAO.buscarTurmaPorNome(nome);
            for (TurmaDTO turma : listaTurma) {

                tabelaModel.addRow(new Object[]{
                    turma.getId_turma(),
                    turma.getNome_turma(),
                    turma.getAno()

                });
            }

        } catch (Exception ex) {

            System.out.println("Erro ao listar profissionais buscados na tela");

        }
    }

    public void alocarAlunoEmTurma() {
        int setarAluno = this.tableAlunos.getSelectedRow();
        int setarTurma = this.tableTurmas.getSelectedRow();

        TurmaAlunoDAO objTurmaAlunoDAO = new TurmaAlunoDAO();

        int matricula = Integer.parseInt(this.tableAlunos.getModel().getValueAt(setarAluno, 1).toString());
    
        int id_turma = Integer.parseInt(this.tableTurmas.getModel().getValueAt(setarTurma, 0).toString());
    
        objTurmaAlunoDAO.cadastrarAlunoEmTurma(matricula, id_turma);

    }

}
