package dlp.control;

import java.sql.Connection;
import java.sql.DriverManager;
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
        try
        {
            conectar();
        } catch (Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer conexão com o banco de dados");
            System.exit(-1);
        }
    }

    private static void conectar() throws Exception
    {
        String url = "jdbc:postgresql://localhost:5432/gerenciador_financeiro";
        String usuario = "postgres";
        String senha = "123456";

        Class.forName("org.postgresql.Driver");

        con = DriverManager.getConnection(url, usuario, senha);
    }

    public static Connection getConnection()
    {
        if (con == null)
        {
            new DAO();
        }

        return con;
    }

}
