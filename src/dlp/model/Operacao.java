package dlp.model;

import java.util.Calendar;


public class Operacao
{
    int id;
    String descricao;
    Calendar data;
    Categoria categoria;
    boolean parcelamento;
    int numeroParcelas;

    public Operacao()
    {
        // TODO Auto-generated constructor stub
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

    public boolean isParcelamento()
    {
        return parcelamento;
    }

    public void setParcelamento(boolean parcelamento)
    {
        this.parcelamento = parcelamento;
    }

    public int getNumeroParcelas()
    {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas)
    {
        this.numeroParcelas = numeroParcelas;
    }

}
