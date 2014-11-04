package dlp.model;

import java.util.Calendar;

public class Fatura
{
    private int id;
    private double valor;
    private Calendar dataVencimento;

    public Fatura()
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

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public Calendar getDataVencimento()
    {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento)
    {
        this.dataVencimento = dataVencimento;
    }

}
