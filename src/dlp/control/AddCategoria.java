/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlp.control;

import dlp.model.Categoria;
import dlp.model.Cor;
import dlp.model.TipoOperacao;
import dlp.view.CategoriaDespesa;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class AddCategoria
{

    public static void AddDespesa(ActionEvent evt)
    {
        add(TipoOperacao.DESPESA);
    }

    public static void AddReceita(ActionEvent evt)
    {
        add(TipoOperacao.RECEITA);
    }

    private static void add(TipoOperacao tipo)
    {
        Categoria categoria = new Categoria();
        categoria.setNome(CategoriaDespesa.txt_nome.getText());
        categoria.setCor(Cor.valueOf(CategoriaDespesa.slct_cor.getSelectedItem().toString().toUpperCase()));
        categoria.setTipo(tipo);

        if (categoria.addBD())
        {
            JOptionPane.showConfirmDialog(null, "Inserido com sucesso");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao inserir");
        }
    }

}
