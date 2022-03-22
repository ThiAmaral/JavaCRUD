/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author Thiago
 */
public class frmFuncionarioVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmFuncionarioVIEW
     */
    public frmFuncionarioVIEW() {
        initComponents();
        ListarValoresFuncionario();
        RestaurarDadosComboBoxDisciplina();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdFuncionario = new javax.swing.JLabel();
        txtIdFuncionario = new javax.swing.JTextField();
        lblNomeFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        lblEnderecoFuncionario = new javax.swing.JLabel();
        txtEnderecoFuncionario = new javax.swing.JTextField();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnAtualizarFuncionario = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnDeletarFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        btnCarregarFuncionario = new javax.swing.JButton();
        lblDisciplinaFuncionario = new javax.swing.JLabel();
        cbxDisciplinaFuncionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdFuncionario.setText("Id");

        txtIdFuncionario.setEnabled(false);

        lblNomeFuncionario.setText("Nome");

        lblEnderecoFuncionario.setText("Endereço");

        btnCadastrarFuncionario.setText("Cadastrar");
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnAtualizarFuncionario.setText("Atualizar");
        btnAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncionarioActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnDeletarFuncionario.setText("Deletar");
        btnDeletarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarFuncionarioActionPerformed(evt);
            }
        });

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "ENDEREÇO, DISCIPLINA"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionario);

        btnCarregarFuncionario.setText("Carregar");
        btnCarregarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarFuncionarioActionPerformed(evt);
            }
        });

        lblDisciplinaFuncionario.setText("Disciplina");

        cbxDisciplinaFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        cbxDisciplinaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDisciplinaFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDisciplinaFuncionario)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnderecoFuncionario)
                            .addComponent(lblIdFuncionario)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrarFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizarFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCarregarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(txtEnderecoFuncionario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(30, 30, 30)
                                .addComponent(cbxDisciplinaFuncionario, 0, 121, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(lblDisciplinaFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDisciplinaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblEnderecoFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarFuncionario)
                    .addComponent(btnAtualizarFuncionario)
                    .addComponent(btnDeletarFuncionario))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarFuncionario)
                    .addComponent(btnLimparCampos))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        CadastrarFuncionario();
        
        LimparCampos();
        ListarValoresFuncionario();
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
       LimparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnDeletarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarFuncionarioActionPerformed
        DeletarFuncionario();
        
        LimparCampos();
        ListarValoresFuncionario();
    }//GEN-LAST:event_btnDeletarFuncionarioActionPerformed

    private void btnCarregarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFuncionarioActionPerformed
        CarregarFuncionario();
    }//GEN-LAST:event_btnCarregarFuncionarioActionPerformed

    private void btnAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncionarioActionPerformed
        AtualizarFuncionario();
        
        LimparCampos();
        ListarValoresFuncionario();
    }//GEN-LAST:event_btnAtualizarFuncionarioActionPerformed

    private void cbxDisciplinaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDisciplinaFuncionarioActionPerformed
        RestaurarDadosComboBoxDisciplina();
    }//GEN-LAST:event_cbxDisciplinaFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFuncionarioVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnCarregarFuncionario;
    private javax.swing.JButton btnDeletarFuncionario;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cbxDisciplinaFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisciplinaFuncionario;
    private javax.swing.JLabel lblEnderecoFuncionario;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtEnderecoFuncionario;
    private javax.swing.JTextField txtIdFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    // End of variables declaration//GEN-END:variables
    
    private void CadastrarFuncionario() {
        String nome = this.txtNomeFuncionario.getText();
        String endereco = this.txtEnderecoFuncionario.getText();
        FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
        objFuncionarioDTO.setNome_funcionario(nome);
        objFuncionarioDTO.setEndereco_funcionario(endereco);
        FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
        objFuncionarioDAO.cadastrarFuncionario(objFuncionarioDTO);
        this.LimparCampos();
        this.ListarValoresFuncionario();
    }

    private void ListarValoresFuncionario() {
        try {
            FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
            DefaultTableModel model = (DefaultTableModel) this.tblFuncionario.getModel();
            model.setNumRows(0);
            ArrayList<FuncionarioDTO> lista = objFuncionarioDAO.PesquisarFuncionario();

            for (int num = 0; num < lista.size(); ++num) {
                model.addRow(new Object[]{((FuncionarioDTO) lista.get(num)).getId_funcionario(), ((FuncionarioDTO) lista.get(num)).getNome_funcionario(), ((FuncionarioDTO) lista.get(num)).getEndereco_funcionario()});
            }
        } catch (Exception var5) {
            JOptionPane.showMessageDialog((Component) null, "Listar Valores VIEW: " + var5);
        }

    }

    private void CarregarFuncionario() {
        int setar = this.tblFuncionario.getSelectedRow();
        this.txtIdFuncionario.setText(this.tblFuncionario.getModel().getValueAt(setar, 0).toString());
        this.txtNomeFuncionario.setText(this.tblFuncionario.getModel().getValueAt(setar, 1).toString());
        this.txtEnderecoFuncionario.setText(this.tblFuncionario.getModel().getValueAt(setar, 2).toString());
    }

    private void AtualizarFuncionario() {
        int id_funcionario = Integer.parseInt(this.txtIdFuncionario.getText());
        String nome_funcionario = this.txtNomeFuncionario.getText();
        String endereco_funcionario = this.txtEnderecoFuncionario.getText();
        FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
        objFuncionarioDTO.setId_funcionario(id_funcionario);
        objFuncionarioDTO.setNome_funcionario(nome_funcionario);
        objFuncionarioDTO.setEndereco_funcionario(endereco_funcionario);
        FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
        objFuncionarioDAO.alterarFuncionario(objFuncionarioDTO);
    }

    private void DeletarFuncionario() {
        int id_funcionario = Integer.parseInt(this.txtIdFuncionario.getText());
        FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
        objFuncionarioDTO.setId_funcionario(id_funcionario);
        FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
        objFuncionarioDAO.excluirFuncionario(objFuncionarioDTO);
    }

    private void LimparCampos() {
        this.txtIdFuncionario.setText("");
        this.txtNomeFuncionario.setText("");
        this.txtEnderecoFuncionario.setText("");
        this.txtIdFuncionario.requestFocus();
    }
    
    Vector<Integer> id_disciplina = new Vector<Integer>();
    
    private void RestaurarDadosComboBoxDisciplina(){
        try {
            FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
            ResultSet rs = objFuncionarioDAO.listarDisciplina();
        
            while(rs.next()) {
                id_disciplina.addElement(rs.getInt(1));
                cbxDisciplinaFuncionario.addItem(rs.getString(2));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Restaurar Dados Combo Box Disciplina: " + erro);
        }
        
    }
}
