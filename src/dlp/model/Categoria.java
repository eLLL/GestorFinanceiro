package dlp.model;

import dlp.control.DAO;
import java.sql.Connection;
import java.sql.Statement;

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
        try
        {
            Connection con = DAO.getConnection();

            Statement st = con.createStatement();
            String sql = String.format("INSERT INTO Categoria VALUES (DEFAULT, '%s', '%s', '%s');", this.nome, cor.toString(),
                    this.tipo.toString());
            st.executeUpdate(sql);

            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return false;
    }
}
