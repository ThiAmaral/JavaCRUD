/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.AlunoDAO;
import DAO.FuncionarioDAO;
import DTO.AlunoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class frmAlunoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmAlunoVIEW
     */
    public frmAlunoVIEW() {
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

        lblIdPessoa = new javax.swing.JLabel();
        txtIdPessoa = new javax.swing.JTextField();
        cbxAlergiaAluno = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlergiaAluno = new javax.swing.JTextArea();
        cbxTurma = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtMatriculaAluno = new javax.swing.JTextField();
        lblIdAluno = new javax.swing.JLabel();
        txtIdAluno = new javax.swing.JTextField();
        btnCadastrarAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdPessoa.setText("ID Pessoa");

        txtIdPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPessoaActionPerformed(evt);
            }
        });

        cbxAlergiaAluno.setText("Possui Alergia");

        txtAlergiaAluno.setColumns(20);
        txtAlergiaAluno.setRows(5);
        jScrollPane1.setViewportView(txtAlergiaAluno);

        cbxTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecionar" }));

        jLabel1.setText("Matricula");

        lblIdAluno.setText("ID ALuno");

        txtIdAluno.setEditable(false);
        txtIdAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlunoActionPerformed(evt);
            }
        });

        btnCadastrarAluno.setText("Cadastrar");
        btnCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(cbxAlergiaAluno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdPessoa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdPessoa, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMatriculaAluno)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdAluno)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnCadastrarAluno)))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIdPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAlergiaAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarAluno))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPessoaActionPerformed

    private void txtIdAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlunoActionPerformed

    private void btnCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlunoActionPerformed
        CadastrarAluno();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlunoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.JCheckBox cbxAlergiaAluno;
    private javax.swing.JComboBox<String> cbxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdAluno;
    private javax.swing.JLabel lblIdPessoa;
    private javax.swing.JTextArea txtAlergiaAluno;
    private javax.swing.JTextField txtIdAluno;
    private javax.swing.JTextField txtIdPessoa;
    private javax.swing.JTextField txtMatriculaAluno;
    // End of variables declaration//GEN-END:variables

    private void CadastrarAluno() {
        int id_pessoa = Integer.parseInt(this.txtIdPessoa.getText());
        int matricula = Integer.parseInt(this.txtMatriculaAluno.getText());
        String alergia = this.txtAlergiaAluno.getText();
        int id_turma = this.cbxTurma.getSelectedIndex();
        
        AlunoDTO objAlunoDTO = new AlunoDTO();
        objAlunoDTO.setId_pessoa(id_pessoa);
        objAlunoDTO.setMatricula(matricula);
        objAlunoDTO.setAlergia(alergia);
        objAlunoDTO.setId_turma(id_turma);
        AlunoDAO objAlunoDAO = new AlunoDAO();
        objAlunoDAO.cadastrarAluno(objAlunoDTO);
    }
    
    Vector<Integer> turma = new Vector<Integer>();
    
    private void RestaurarDadosComboBoxTurma(){
        try {
            AlunoDAO objAlunoDAO = new AlunoDAO();
            ResultSet rs = objAlunoDAO.listarTurma();
        
            while(rs.next()) {
                turma.addElement(rs.getInt(1));
                cbxTurma.addItem(rs.getString(2));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Restaurar Dados Combo Box Turma: " + erro);
        }
        
    }
    
    
    
    
    
    private void LimparCampos() {
        this.txtIdPessoa.setText("");
        this.txtMatriculaAluno.setText("");
        this.txtIdAluno.setText("");
        this.txtAlergiaAluno.setText("");
        this.txtIdAluno.requestFocus();
    }
}
