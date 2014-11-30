package dlp.control;

import dlp.model.Categoria;
import dlp.model.Cor;
import dlp.model.TipoOperacao;
import dlp.view.CategoriaDespesa;
import dlp.view.CategoriaReceita;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class AddCategoria
{

    public static void AddDespesa(ActionEvent evt)
    {
        add(CategoriaDespesa.txt_nome.getText(), CategoriaDespesa.slct_cor.getSelectedItem().toString().toUpperCase(), TipoOperacao.DESPESA);
    }

    public static void AddReceita(ActionEvent evt)
    {
        add(CategoriaReceita.txt_nome.getText(), CategoriaReceita.slct_cor.getSelectedItem().toString().toUpperCase(), TipoOperacao.RECEITA);
    }

    private static void add(String nome, String cor, TipoOperacao tipo)
    {
        Categoria categoria = new Categoria();
        categoria.setNome(nome);
        categoria.setCor(Cor.valueOf(cor));
        categoria.setTipo(tipo);

        if (categoria.addBD())
        {
            JOptionPane.showMessageDialog(null, "Categoria inserida com sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao inserir categoria!");
        }
    }

}
