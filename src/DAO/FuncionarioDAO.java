
package DAO;

import DTO.FuncionarioDTO;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList();

    public FuncionarioDAO() {
    }

    public void cadastrarFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "insert into funcionario (nome, endereco) VALUES (?, ?)";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setString(1, objFuncionarioDTO.getNome_funcionario());
            this.pstm.setString(2, objFuncionarioDTO.getEndereco_funcionario());
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog((Component)null, "FuncionarioDAO cadastrar: " + var4);
        }

    }

    public ArrayList<FuncionarioDTO> PesquisarFuncionario() {
        String sql = "SELECT * FROM funcionario";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.rs = this.pstm.executeQuery();

            while(this.rs.next()) {
                FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                objFuncionarioDTO.setId_funcionario(this.rs.getInt("id"));
                objFuncionarioDTO.setNome_funcionario(this.rs.getString("nome"));
                objFuncionarioDTO.setEndereco_funcionario(this.rs.getString("endereco"));
                this.lista.add(objFuncionarioDTO);
            }
        } catch (SQLException var3) {
            JOptionPane.showMessageDialog((Component)null, "FuncionarioDAO pesquisar: " + var3);
        }

        return this.lista;
    }

    public void alterarFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "update funcionario set nome = ?, endereco = ? where id = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setString(1, objFuncionarioDTO.getNome_funcionario());
            this.pstm.setString(2, objFuncionarioDTO.getEndereco_funcionario());
            this.pstm.setInt(3, objFuncionarioDTO.getId_funcionario());
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog((Component)null, "FuncionarioDAO alterar: " + var4);
        }

    }

    public void excluirFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "delete from funcionario where id = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, objFuncionarioDTO.getId_funcionario());
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog((Component)null, "FuncionarioDAO deletar: " + var4);
        }

    }
}
