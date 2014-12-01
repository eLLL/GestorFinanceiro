package dlp.model;

import dlp.control.*;
import java.sql.*;
import java.util.logging.*;

public class Categoria
{

    private int id;
    private String nome;
    private Cor cor;
    private TipoOperacao tipo;

    public Categoria()
    {

    }

    public Categoria(int id, String nome, Cor cor, TipoOperacao tipo)
    {
        super();
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Cor getCor()
    {
        return cor;
    }

    public void setCor(Cor cor)
    {
        this.cor = cor;
    }

    public TipoOperacao getTipo()
    {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo)
    {
        this.tipo = tipo;
    }

    public boolean addBD()
    {
        Statement stmt = null;
        try
        {
            Connection con = DAO.getConnection();

            stmt = con.createStatement();
            String sql = String.format("INSERT INTO Categoria VALUES (DEFAULT, '%s', '%s', '%s');", this.nome,
                    this.tipo.toString(), cor.toString());

            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next())
            {
                this.id = rs.getInt(1);
            }

            // Adiconado na lista de categorias
            Manager.getCategorias().put(id, this);

            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {
            try
            {
                stmt.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }
}
