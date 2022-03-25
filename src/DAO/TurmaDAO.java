package DAO;

import DTO.TurmaDTO;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TurmaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<TurmaDTO> lista = new ArrayList();

    public TurmaDAO() {
    }

    public ArrayList<TurmaDTO> PesquisarTurma() {
        String sql = "SELECT * FROM turma";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.rs = this.pstm.executeQuery();

            while (this.rs.next()) {
                TurmaDTO objTurmaDTO = new TurmaDTO();
                objTurmaDTO.setId_turma(this.rs.getInt("id_turma"));
                objTurmaDTO.setNome_turma(this.rs.getString("nome"));
                objTurmaDTO.setAno(this.rs.getInt("ano"));
                this.lista.add(objTurmaDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component) null, "TurmaDAO pesquisar: " + erro);
        }

        return this.lista;
    }

    public void cadastrarTurma(TurmaDTO objTurmaDTO) {
        String sql = "insert into turma (nome, ano) VALUES (?, ?)";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setString(1, objTurmaDTO.getNome_turma());
            this.pstm.setInt(2, objTurmaDTO.getAno());

            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component) null, "TurmaDAO cadastrar: " + erro);
        }
    }

    public void alterarTurma(TurmaDTO objTurmaDTO) {
        String sql = "update turma set nome = ?, ano = ? where id_turma = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setString(1, objTurmaDTO.getNome_turma());
            this.pstm.setInt(2, objTurmaDTO.getAno());
            this.pstm.setInt(3, objTurmaDTO.getId_turma());

            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component) null, "TurmaDAO alterar: " + erro);
        }
    }

    public void excluirTurma(TurmaDTO objTurmaDTO) {
        String sql = "delete from turma where id_turma = ?";
        this.conn = (new ConexaoDAO()).conectaBD();

        try {
            this.pstm = this.conn.prepareStatement(sql);
            this.pstm.setInt(1, objTurmaDTO.getId_turma());
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog((Component) null, "TurmaDAO deletar: " + erro);
        }

    }

    public ArrayList<TurmaDTO> buscarTurmaPorNome(String nome) {
        ArrayList<TurmaDTO> lista = new ArrayList<>();

        try {

            String sql = "SELECT id_turma, nome, ano FROM turma WHERE nome LIKE CONCAT('%',?,'%')";

            conn = new ConexaoDAO().conectaBD();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, nome);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                TurmaDTO objTurmaDTO = new TurmaDTO();
                objTurmaDTO.setNome_turma(rs.getString("nome"));
                objTurmaDTO.setId_turma(rs.getInt("id_turma"));
                objTurmaDTO.setAno(rs.getInt("ano"));

                lista.add(objTurmaDTO);

            }

            pstm.close();

        } catch (SQLException ex) {

            System.out.println("Erro ao buscar." + ex);

        }

        return lista;

    }

}
