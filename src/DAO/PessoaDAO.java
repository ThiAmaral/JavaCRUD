
package DAO;

import DTO.PessoaDTO;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PessoaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PessoaDTO> lista = new ArrayList();

    public PessoaDAO() {
    }
    
    public ArrayList<PessoaDTO> PesquisarPessoa() {
        String sql = "SELECT * FROM pessoa";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.rs = this.pstm.executeQuery();

            while(this.rs.next()) {
                PessoaDTO objPessoaDTO = new PessoaDTO();
                objPessoaDTO.setId_pessoa(this.rs.getInt("id_pessoa"));
                objPessoaDTO.setCpf(this.rs.getInt("cpf"));
                objPessoaDTO.setNome(this.rs.getString("nome"));
                objPessoaDTO.setData_nascimento(this.rs.getString("data_nascimento"));
                objPessoaDTO.setSexo(this.rs.getString("sexo"));
                objPessoaDTO.setEmail(this.rs.getString("email"));
                objPessoaDTO.setTelefone(this.rs.getInt("telefone"));
                this.lista.add(objPessoaDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO pesquisar: " + erro);
        }

        return this.lista;
    }
    
    public void cadastrarPessoa(PessoaDTO objPessoaDTO) {
        String sql = "insert into pessoa (cpf, nome, data_nascimento, sexo, email, telefone) VALUES (?, ?, ?, ?, ?, ?)";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, objPessoaDTO.getCpf());
            this.pstm.setString(2, objPessoaDTO.getNome());
            this.pstm.setString(3, objPessoaDTO.getData_nascimento());
            this.pstm.setString(4, objPessoaDTO.getSexo());
            this.pstm.setString(5, objPessoaDTO.getEmail());
            this.pstm.setInt(6, objPessoaDTO.getTelefone());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "PessoaDAO cadastrar: " + erro);
        }
    }
    
    public void alterarPessoa(PessoaDTO objPessoaDTO) {
        String sql = "update pessoa set cpf = ?, nome = ?, data_nascimento = ?, sexo = ?, email = ?, telefone = ? where id_pessoa = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            
            this.pstm.setInt(1, objPessoaDTO.getCpf());
            this.pstm.setString(2, objPessoaDTO.getNome());
            this.pstm.setString(3, objPessoaDTO.getData_nascimento());
            this.pstm.setString(4, objPessoaDTO.getSexo());
            this.pstm.setString(5, objPessoaDTO.getEmail());
            this.pstm.setInt(6, objPessoaDTO.getTelefone());
            this.pstm.setInt(7, objPessoaDTO.getId_pessoa());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "PessoaDAO alterar: " + erro);
        }
    }

    public void excluirPessoa(PessoaDTO objPessoaDTO) {
        String sql = "delete from pessoa where cpf = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, objPessoaDTO.getCpf());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "PessoaDAO deletar: " + erro);
        }

    }
}
