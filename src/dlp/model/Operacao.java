package dlp.model;

import java.util.Calendar;

enum Recorrencia
{
    DIA, SEMANA, MES, ANO
}

public class Operacao
{
    int id;
    String descricao;
    Calendar data;
    Categoria categoria;
    boolean recorrencia;
    int tempoRecorrencia;
    Recorrencia periodoRecorencia;
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

    public boolean isRecorrencia()
    {
        return recorrencia;
    }

    public void setRecorrencia(boolean recorrencia)
    {
        this.recorrencia = recorrencia;
    }

    public int getTempoRecorrencia()
    {
        return tempoRecorrencia;
    }

    public void setTempoRecorrencia(int tempoRecorrencia)
    {
        this.tempoRecorrencia = tempoRecorrencia;
    }

    public Recorrencia getPeriodoRecorencia()
    {
        return periodoRecorencia;
    }

    public void setPeriodoRecorencia(Recorrencia periodoRecorencia)
    {
        this.periodoRecorencia = periodoRecorencia;
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
