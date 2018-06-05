package sgda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sgda.model.ConnectionFactoryModel;
import sgda.model.CursoModel;
import sgda.model.FormatarCamposModel;

public class CursoDAO implements InterfaceCursoDAO {

    private PreparedStatement stm = null;
    private ResultSet rs = null;
    private Connection con = null;

    @Override
    public List selectForCombo(String coluna) {

        try {
            List<String> listColuna = new ArrayList();

            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM curso");
            rs = stm.executeQuery();

            while (rs.next()) {
                listColuna.add(rs.getString(coluna));
            }

            return listColuna;

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public TableModel selectForTable() {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM curso");
            rs = stm.executeQuery();

            return FormatarCamposModel.colocarDadosTabela(rs);

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }
    
    @Override
    public TableModel selectForTable(String texto) {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("SELECT * FROM curso WHERE nome_curso LIKE '" + texto + "%'");
            rs = stm.executeQuery();

            return FormatarCamposModel.colocarDadosTabela(rs);

        } catch (SQLException ex) {
            throw new RuntimeException("Exceção: " + ex);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void insert(CursoModel cr) {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("INSERT INTO curso (nome_curso, carga_horaria, periodo) VALUES (?, ?, ?)");
            stm.setString(1, cr.getDescricao());
            stm.setInt(2, cr.getCargaHoras());
            stm.setString(3, cr.getPeriodo());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Inserção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a inserção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void delete(CursoModel cr) {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("DELETE FROM curso WHERE cod_curso = ?");
            stm.setInt(1, cr.getCodCurso());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Remoção feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a remoção!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }

    @Override
    public void update(CursoModel cr) {

        try {
            con = ConnectionFactoryModel.getConnection();
            stm = con.prepareStatement("UPDATE curso SET nome_curso = ?, carga_horaria = ?, periodo = ? WHERE cod_curso = ?");
            stm.setString(1, cr.getDescricao());
            stm.setInt(2, cr.getCargaHoras());
            stm.setString(3, cr.getPeriodo());
            stm.setInt(4, cr.getCodCurso());
            stm.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Alteração feita com sucesso!", "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Houve algum erro durante a alteração!\n\nInformações técnicas sobre o erro: " + ex, "SGDA - Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } finally {
            ConnectionFactoryModel.closeConnection(con, stm, rs);
        }
    }
}
