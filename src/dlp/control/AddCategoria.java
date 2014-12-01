package dlp.control;

import dlp.model.*;

public class AddCategoria
{

    public static boolean add(String nome, String cor, TipoOperacao tipo)
    {
        Categoria categoria = new Categoria();
        categoria.setNome(nome);
        categoria.setCor(Cor.valueOf(cor));
        categoria.setTipo(tipo);

        if (categoria.addBD())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
