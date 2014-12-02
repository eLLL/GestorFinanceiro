package dlp.control;

import dlp.model.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import org.postgresql.util.*;

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
            if (!checkTable("Categoria"))
            {
                try
                {
                    String sql = String.format("CREATE TABLE categoria (id_categoria serial NOT NULL, nome VARCHAR(80) NOT NULL, tipo  VARCHAR(10), cor VARCHAR(20), CONSTRAINT categoria_tipo_check CHECK ((tipo = 'DESPESA') OR (tipo= 'RECEITA')) ); INSERT INTO Categoria VALUES(DEFAULT, 'Padrao Despesa', 'DESPESA', 'VERMELHO'); INSERT INTO Categoria VALUES(DEFAULT, 'Padrao Receita', 'RECEITA', 'VERDE');");

                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.executeUpdate();
                } catch (SQLException ex)
                {
                }
            }

            if (!checkTable("Operacao"))
            {
                try
                {
                    String sql = String.format("CREATE TABLE operacao (id_operacao serial NOT NULL, id_categoria integer NOT NULL, descricao text, data date DEFAULT CURRENT_DATE, valor numeric(14,2));");

                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.executeUpdate();
                } catch (SQLException ex)
                {
                }
            }

            try
            {
                carregarCategorias();
                carregarOperacoes();

            } catch (SQLException ex)
            {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static boolean conectar()
    {
        String usuario = "postgres";
        String senha = "123456";

        try
        {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try
        {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/?user=" + usuario + "&password=" + senha);
            Statement s = conn.createStatement();
            s.executeUpdate("CREATE DATABASE gerenciador_financeiro");
            s.close();
            conn.close();
        } catch (Exception e)
        {
        }

        try
        {
            String url = "jdbc:postgresql://localhost:5432/gerenciador_financeiro";

            con = DriverManager.getConnection(url, usuario, senha);

            return true;
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer conexão com o banco de dados.");
            JOptionPane.showMessageDialog(null, "É necessário ter instalado o PostgreSQL.");
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

    public boolean checkTable(String tableName)
    {
        DatabaseMetaData dbm = null;

        try
        {
            dbm = con.getMetaData();
            ResultSet tables = dbm.getTables(null, null, tableName, null);

            if (tables.next())
            {
                return true;
            }
            else
            {
                return false;
            }

        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    private void carregarCategorias() throws SQLException
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

    private void carregarOperacoes() throws SQLException
    {
        String sql2 = String.format("SELECT * FROM operacao");

        PreparedStatement pstmt2 = con.prepareStatement(sql2);
        ResultSet rs2 = pstmt2.executeQuery();

        while (rs2.next())
        {
            Operacao o = new Operacao();

            o.setId(rs2.getInt("id_operacao"));
            o.setCategoria(Manager.getCategorias().get(rs2.getInt("id_categoria")));
            o.setDescricao(rs2.getString("descricao"));

            Calendar c = Calendar.getInstance();
            c.setTime(rs2.getDate("data"));

            o.setData(c);

            o.setValor(rs2.getDouble("valor"));

            Manager.getOperacoes().put(o.getId(), o);

            if (o.getCategoria().getTipo() == TipoOperacao.DESPESA)
            {
                Saldo.addDespesa(o.getValor());
            }
            else
            {
                Saldo.addReceita(o.getValor());
            }
        }
    }
}
