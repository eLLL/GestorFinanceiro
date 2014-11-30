package dlp.control;

import dlp.model.Categoria;
import dlp.model.Cor;
import dlp.model.Operacao;
import dlp.model.TipoOperacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
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

        String sql2 = String.format("SELECT * FROM categoria");

        PreparedStatement pstmt2 = con.prepareStatement(sql);
        ResultSet rs2 = pstmt2.executeQuery();

        while (rs2.next())
        {
            Operacao o = new Operacao();
            
            o.setId(rs.getInt("id_operacao"));
            o.setCategoria(Manager.getCategorias().get(rs.getInt("id_categoria")));
            o.setDescricao(rs.getString("descricao"));
            
            Calendar c = Calendar.getInstance();
            c.setTime(rs.getDate("data"));
            
            o.setData(c);
            
            o.setValor(rs.getDouble("valor"));
            
            Manager.getOperacoes().put(o.getId(), o);
            
            if (o.getCategoria().getTipo() == TipoOperacao.DESPESA)
            {
                Manager.setSaldo(Manager.getSaldo() - o.getValor());
            } else
            {
                Manager.setSaldo(Manager.getSaldo() + o.getValor());
            }
        }
        
        
    }

}
