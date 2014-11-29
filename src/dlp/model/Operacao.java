package dlp.model;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Calendar;
import dlp.control.DAO;
import dlp.control.Manager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacao
{

    private int id;
    private String descricao;
    private Calendar data;
    private Categoria categoria;
    private double valor;

    public Operacao()
    {
        // TODO Auto-generated constructor stub
    }

    public Operacao(int id, String descricao, Calendar data, Categoria categoria, double valor)
    {  
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
        this.valor = valor;
        if(addBD())
        {
            Manager.getOperacoes().put(id, this);
            if(this.categoria.getTipo() == TipoOperacao.DESPESA)
                Manager.setSaldo(Manager.getSaldo() - this.valor);
            else
                Manager.setSaldo(Manager.getSaldo() + this.valor);
        }
    }

    
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public Calendar getData()
    {
        return data;
    }

    public void setData(Calendar data)
    {
        this.data = data;
    }

    public Categoria getCategoria()
    {
        return categoria;
    }

    public void setCategoria(Categoria categoria)
    {
        this.categoria = categoria;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public boolean addBD()
    {
        try
        {
            Connection con = DAO.getConnection();

            Statement st = con.createStatement();

            String data = this.data.get(Calendar.YEAR) + "-" + this.data.get(Calendar.MONTH) + "-"
                    + this.data.get(Calendar.DAY_OF_MONTH);

            String sql = String.format("INSERT INTO Operacao VALUES(DEFAULT, %d, '%s', '%s', %.2f);",
                    this.categoria.getId(), this.descricao, data, this.valor);

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
