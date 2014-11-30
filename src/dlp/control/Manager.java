package dlp.control;

import dlp.model.Categoria;
import dlp.model.Operacao;
import dlp.model.TipoOperacao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager
{

    private static HashMap<Integer, Operacao> operacoes = new HashMap<>();
    private static HashMap<Integer, Categoria> categorias = new HashMap<>();

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

    public static List<Categoria> getCagetoriaList()
    {
        List<Categoria> cats = new ArrayList<>();

        for (Map.Entry<Integer, Categoria> categoria : categorias.entrySet())
        {
            cats.add(categoria.getValue());
        }

        return cats;
    }

    public static List<Categoria> getCagetoriaList(TipoOperacao tipo)
    {
        List<Categoria> cats = new ArrayList<>();

        for (Map.Entry<Integer, Categoria> categoria : categorias.entrySet())
        {
            Categoria value = categoria.getValue();
            if (value.getTipo() == tipo)
            {
                cats.add(value);
            }
        }

        return cats;
    }

    static Operacao getOperacaoList(int id)
    {

        for (Map.Entry<Integer, Operacao> operacao : operacoes.entrySet())
        {
            Operacao value = operacao.getValue();

            if (value.getId() == id)
            {
                return value;
            }
        }

        return null;

    }

    public static List<Operacao> getOperacaoList(TipoOperacao tipo)
    {
        List<Operacao> ops = new ArrayList<>();

        for (Map.Entry<Integer, Operacao> operacao : operacoes.entrySet())
        {
            Operacao value = operacao.getValue();

            if (tipo == TipoOperacao.GERAL)
            {
                ops.add(value);
            }
            else if (value.getCategoria().getTipo() == tipo)
            {
                ops.add(value);
            }
        }

        return ops;
    }
    
    public static Categoria getCategoria(String nome)
    {
        for (Map.Entry<Integer, Categoria> categoria : categorias.entrySet())
        {
            Categoria value = categoria.getValue();

            if (value.getNome().equalsIgnoreCase(nome))
            {
                return value;
            }
        }

        return null;
    }
}
