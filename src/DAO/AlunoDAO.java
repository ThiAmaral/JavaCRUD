
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
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog((Component)null, "FuncionarioDAO cadastrar: " + var4);
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
