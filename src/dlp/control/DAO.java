package dlp.control;

import dlp.model.Categoria;
import dlp.model.Cor;
import dlp.model.TipoOperacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class DAO
{

    private static Connection con;

    public DAO()
    {
        if (conectar())
        {
            try
            {
                loadCategorias();
            } catch (SQLException ex)
            {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static boolean conectar()
    {
        try
        {
            String url = "jdbc:postgresql://localhost:5432/gerenciador_financeiro";
            String usuario = "postgres";
            String senha = "123456";

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, usuario, senha);

            return true;
        } catch (ClassNotFoundException | SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer conexão com o banco de dados");
        }
        return false;
    }

    public static Connection getConnection()
    {
        if (con == null)
        {
            conectar();
        }

        return con;
    }

    private void loadCategorias() throws SQLException
    {

        String sql = String.format("SELECT * FROM categoria");

        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next())
        {
            Categoria c = new Categoria();
            c.setId(rs.getInt("id_categoria"));
            c.setNome(rs.getString("nome"));
            c.setTipo(TipoOperacao.valueOf(rs.getString("tipo")));
            c.setCor(Cor.valueOf(rs.getString("cor")));
            
            Manager.getCategorias().put(c.getId(), c);
        }

    }

}
