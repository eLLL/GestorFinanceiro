package dlp.control;

import java.sql.Connection;
import java.sql.DriverManager;

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

    public static boolean conectar()
    {
        try
        {
            String url = "jdbc:postgresql://localhost:5432/gerenciador_financeiro";
            String usuario = "postgres";
            String senha = "123456";

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, usuario, senha);

            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
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

}
