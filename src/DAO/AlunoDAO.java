
package DAO;

import DTO.AlunoDTO;
import DTO.PessoaDTO;
import DTO.TurmaDTO;
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
        String sql = "SELECT * FROM aluno";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.rs = this.pstm.executeQuery();

            while(this.rs.next()) {
                AlunoDTO objAlunoDTO = new AlunoDTO();
                objAlunoDTO.setId_aluno(this.rs.getInt("id_aluno"));
                objAlunoDTO.setMatricula(this.rs.getInt("matricula"));
                objAlunoDTO.setId_pessoa(this.rs.getInt("id_pessoa"));
                objAlunoDTO.setId_turma(this.rs.getInt("id_turma"));
                objAlunoDTO.setAlergia(this.rs.getString("alergia"));
                this.lista.add(objAlunoDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO pesquisar: " + erro);
        }

        return this.lista;
    }

    public void cadastrarAluno(AlunoDTO objAlunoDTO) {
        String sql = "insert into aluno (matricula, id_pessoa, id_turma, alergia) VALUES (?, ?)";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, objAlunoDTO.getMatricula());
            this.pstm.setInt(2, objAlunoDTO.getId_pessoa());
            this.pstm.setInt(3, objAlunoDTO.getId_turma());
            this.pstm.setString(4, objAlunoDTO.getAlergia());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO cadastrar: " + erro);
        }
    }
    
    public void alterarFuncionario(AlunoDTO objAlunoDTO) {
        String sql = "update funcionario set matricula = ?, id_pessoa = ? where id_turma = ?, alergia = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, objAlunoDTO.getMatricula());
            this.pstm.setInt(2, objAlunoDTO.getId_pessoa());
            this.pstm.setInt(3, objAlunoDTO.getId_turma());
            this.pstm.setString(4, objAlunoDTO.getAlergia());
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO alterar: " + erro);
        }

    }
    
    public void excluirAluno(AlunoDTO objAlunoDTO) {
        String sql = "delete from aluni where matricula = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, objAlunoDTO.getMatricula());
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component)null, "AlunoDAO deletar: " + erro);
        }

    }
    
    public ResultSet listarTurma(){
        String sql = "select * from turma order by id_turma";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO listar turma: " + erro);
            return null;
        }
    }
    
    
}
