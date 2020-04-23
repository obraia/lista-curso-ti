/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

// adicionando os imports
import dados.Prof;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Prof_DAO {

    public void inserir(Prof professor) throws Exception {
        Conexao c = new Conexao();
        String sql = "INSERT INTO professor(nome,turma, disciplina) VALUES (?, ?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, professor.getNome());
        ps.setInt(2, professor.getTurma());
        ps.setString(3, professor.getDisciplina());
        ps.execute();
        c.confirmar();

    }

    public void deletar() throws Exception {
        Conexao c;
        c = new Conexao();
        String sql;
        sql = "DELETE FROM professor";
        PreparedStatement ps;
        ps = c.getConexao().prepareStatement(sql);
        ps.execute();
        c.confirmar();
    }

    public void editarID(String id, String nome, String turma, String disciplina) throws Exception {
        Conexao c;
        c = new Conexao();
        String sql;
        //sql = "UPDATE professor SET nome = 'Julia', turma = 100, disciplina = 'Portugues' WHERE idprofessor = 2";
        sql = "UPDATE professor SET nome = " + "'" + nome + "'" + ", turma = " + turma + ", disciplina = " + "'" + disciplina + "'" + " WHERE idprofessor = " + id;
        PreparedStatement ps;
        ps = c.getConexao().prepareStatement(sql);
        ps.execute();
        c.confirmar();
    }

    public void deletarID(int id) throws Exception {
        Conexao c;
        c = new Conexao();
        String sql;
        sql = "DELETE FROM `professor` WHERE `idprofessor` = " + id;
        PreparedStatement ps;
        ps = c.getConexao().prepareStatement(sql);
        ps.execute();
        c.confirmar();
    }

    /**
     *
     * @return @throws Exception
     */
    public Prof recuperarCodigo() throws Exception {
        Conexao c;
        c = new Conexao();
        String sql = "SELECT max(idprofessor) as idprofessor FROM tcc_escola.professor";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        Prof produto = new Prof();
        if (rs.next()) {
            produto.setCodigo(rs.getInt("idprofessor") + 1);

        } else {
            produto = null;
        }

        return produto;
    }

        public ArrayList<String> listarID() throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT idprofessor FROM professor";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaID = new ArrayList();
        while (rs.next()) {
            Prof professor = new Prof();
            professor.setCodigo(rs.getInt("idprofessor"));
            listaID.add(professor);
        }

        return listaID;
    }
    
    public ArrayList<Prof> listarTodos() throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM professor ORDER BY idprofessor";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaProf = new ArrayList();
        while (rs.next()) {
            Prof professor = new Prof();
            professor.setCodigo(rs.getInt("idprofessor"));
            professor.setNome(rs.getString("nome"));
            professor.setTurma(rs.getInt("turma"));
            professor.setDisciplina(rs.getString("disciplina"));
            listaProf.add(professor);
        }

        return listaProf;
    }

}
