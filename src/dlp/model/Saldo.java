package dlp.model;

public class Saldo
{
    private double receitas;
    private double despesas;

    public Saldo()
    {

    }

    public double getReceitas()
    {
        return receitas;
    }

    public void setReceitas(double receitas)
    {
        this.receitas = receitas;
    }

    public double getDespesas()
    {
        return despesas;
    }

    public void setDespesas(double despesas)
    {
        this.despesas = despesas;
    }

    protected double calcular()
    {
        return receitas - despesas;
    }

}
