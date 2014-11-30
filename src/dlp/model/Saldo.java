package dlp.model;

public class Saldo
{

    private static double receitas;
    private static double despesas;

    public Saldo()
    {

    }

    public static double getReceitas()
    {
        return receitas;
    }

    public static void setReceitas(double valor)
    {
        receitas = valor;
    }

    public static double getDespesas()
    {
        return despesas;
    }

    public static void setDespesas(double valor)
    {
        despesas = valor;
    }

    public static void addReceita(double valor)
    {
        receitas += valor;
    }

    public static void addDespesa(double valor)
    {
        despesas += valor;
    }

    static void removeDespesa(double valor)
    {
        despesas -= valor;
    }

    static void removeReceita(double valor)
    {
        receitas -= valor;
    }

    public static double getMontante()
    {
        return receitas - despesas;
    }

}
