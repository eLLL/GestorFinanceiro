package dlp.model;

import dlp.control.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

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
        super();
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
        this.valor = valor;
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

    /**
     * Salva no banco de dados
     *
     * @return status da operação
     */
    public boolean addBD()
    {
        Statement stmt = null;
        String sql = "";

        try
        {
            Connection con = DAO.getConnection();

            stmt = con.createStatement();

            String data = this.data.get(Calendar.YEAR) + "-" + this.data.get(Calendar.MONTH) + "-"
                    + this.data.get(Calendar.DAY_OF_MONTH);

            sql = String.format("INSERT INTO Operacao VALUES(DEFAULT, %d, '%s', '%s', '%s');",
                    this.categoria.getId(), this.descricao, data, String.valueOf(valor).replace(",", "."));

            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next())
            {
                // Retrieve the auto generated key(s).
                this.id = rs.getInt(1);
            }

            // Salva na lista interna e atualiza saldo
            Manager.getOperacoes().put(id, this);
            if (this.categoria.getTipo() == TipoOperacao.DESPESA)
            {
                Saldo.addDespesa(this.valor);
            }
            else
            {
                Saldo.addReceita(this.valor);
            }

            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("SQL: " + sql);
        } finally
        {
            try
            {
                stmt.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean removeBD()
    {
        Statement stmt = null;
        String sql = "";

        try
        {
            Connection con = DAO.getConnection();

            stmt = con.createStatement();

            sql = String.format("DELETE FROM Operacao WHERE id_operacao = %d;", this.id);

            stmt.executeUpdate(sql);


            // Remove na lista interna e atualiza saldo
            Manager.getOperacoes().remove(id);
            if (this.categoria.getTipo() == TipoOperacao.DESPESA)
            {
                Saldo.removeDespesa(this.valor);
            }
            else
            {
                Saldo.removeReceita(this.valor);
            }

            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("SQL: " + sql);
        } finally
        {
            try
            {
                stmt.close();
            } catch (SQLException ex)
            {
                Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

}
