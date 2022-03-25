
package DAO;

import DTO.AlunoDTO;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AlunoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AlunoDTO> lista = new ArrayList();

    public AlunoDAO() {
    }
    
    public ArrayList<AlunoDTO> PesquisarAluno() {
        String sql = "SELECT * FROM Aluno";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.rs = this.pstm.executeQuery();

            while(this.rs.next()) {
                AlunoDTO objAlunoDTO = new AlunoDTO();
                objAlunoDTO.setCpf(this.rs.getString("cpf"));
                objAlunoDTO.setNome(this.rs.getString("nome"));
                objAlunoDTO.setMatricula(this.rs.getInt("matricula"));
                objAlunoDTO.setData_nascimento(this.rs.getString("data_nascimento"));
                objAlunoDTO.setSexo(this.rs.getString("sexo"));
                objAlunoDTO.setEmail(this.rs.getString("email"));
                objAlunoDTO.setTelefone(this.rs.getInt("telefone"));
                objAlunoDTO.setAlergia(this.rs.getString("alergia"));
                this.lista.add(objAlunoDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO pesquisar: " + erro);
        }

        return this.lista;
    }
    
    public void cadastrarAluno(AlunoDTO objAlunoDTO) {
        String sql = "insert into Aluno (cpf, nome, matricula, data_nascimento, sexo, email, telefone, alergia) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setString(1, objAlunoDTO.getCpf());
            this.pstm.setString(2, objAlunoDTO.getNome());
            this.pstm.setInt(3, objAlunoDTO.getMatricula());
            this.pstm.setString(4, objAlunoDTO.getData_nascimento());
            this.pstm.setString(5, objAlunoDTO.getSexo());
            this.pstm.setString(6, objAlunoDTO.getEmail());
            this.pstm.setInt(7, objAlunoDTO.getTelefone());
            this.pstm.setString(8, objAlunoDTO.getAlergia());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO cadastrar: " + erro);
        }
    }
    
    public void alterarAluno(AlunoDTO objAlunoDTO) {
        String sql = "update Aluno set nome = ?, data_nascimento = ?, sexo = ?, email = ?, telefone = ?, alergia = ? where cpf = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            
            this.pstm.setString(1, objAlunoDTO.getNome());
            this.pstm.setString(2, objAlunoDTO.getData_nascimento());
            this.pstm.setString(3, objAlunoDTO.getSexo());
            this.pstm.setString(4, objAlunoDTO.getEmail());
            this.pstm.setInt(5, objAlunoDTO.getTelefone());
            this.pstm.setString(6, objAlunoDTO.getAlergia());
            this.pstm.setString(7, objAlunoDTO.getCpf());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO alterar: " + erro);
        }
    }
     public ArrayList<AlunoDTO> buscarAlunoPorNome(String nome){

        

        ArrayList<AlunoDTO> lista = new ArrayList<>();

        

        try {

            String sql = "SELECT matricula, nome FROM aluno WHERE nome LIKE CONCAT('%',?,'%')";

            conn = new ConexaoDAO().conectaBD();

            pstm = conn.prepareStatement(sql);

            

            pstm.setString(1, nome);

            

            ResultSet rs = pstm.executeQuery();

             

            while (rs.next()) {                

               AlunoDTO objAlunoDTO = new AlunoDTO();

               objAlunoDTO.setNome(rs.getString("nome"));

               objAlunoDTO.setMatricula(rs.getInt("matricula"));

               

               lista.add(objAlunoDTO);

               

            }

            pstm.close();

        } catch (SQLException ex) {

            System.out.println("Erro ao buscar." + ex);

        }

        return lista;

    }


    public void excluirAluno(AlunoDTO objAlunoDTO) {
        String sql = "delete from Aluno where cpf = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setString(1, objAlunoDTO.getCpf());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO deletar: " + erro);
        }

    }
}



