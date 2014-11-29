package dlp.control;

import dlp.model.Categoria;
import dlp.model.Operacao;
import java.util.HashMap;

public class Manager
{

    private static HashMap<Integer, Operacao> operacoes = new HashMap<>();
    private static HashMap<Integer, Categoria> categorias = new HashMap<>();
    private static double saldo;

    public Manager()
    {

    }

    public static HashMap<Integer, Operacao> getOperacoes()
    {
        return operacoes;
    }

    public static void setOperacoes(HashMap<Integer, Operacao> operacoes)
    {
        Manager.operacoes = operacoes;
    }

    public static HashMap<Integer, Categoria> getCategorias()
    {
        return categorias;
    }

    public static void setCategorias(HashMap<Integer, Categoria> categorias)
    {
        Manager.categorias = categorias;
    }

    public static double getSaldo()
    {
        return saldo;
    }

    public static void setSaldo(double saldo)
    {
        Manager.saldo = saldo;
    }
}
