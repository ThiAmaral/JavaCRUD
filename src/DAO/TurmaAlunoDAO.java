
package DAO;

import DTO.AlunoDTO;
import DTO.TurmaAlunoDTO;
import DTO.TurmaDTO;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TurmaAlunoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<TurmaAlunoDTO> lista = new ArrayList();

    public void cadastrarAlunoEmTurma(int matricula, int id_turma) {
        String sql = "insert into turma_aluno (matricula, id_turma) VALUES (?, ?)";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, matricula);
            this.pstm.setInt(2, id_turma);

            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component) null, "TurmaAlunoDAO cadastrar: " + erro);
        }
    }
    
    
}
