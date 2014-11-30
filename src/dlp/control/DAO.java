package dlp.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        conectar();
    }

    private static void conectar()
    {
        try
        {
            String url = "jdbc:postgresql://localhost:5432/gerenciador_financeiro";
            String usuario = "postgres";
            String senha = "123456";

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer conexão com o banco de dados");
        }
    }

    public static Connection getConnection()
    {
        if (con == null)
        {
            conectar();
        }

        return con;
    }

}
