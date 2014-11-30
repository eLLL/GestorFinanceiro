/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlp.control;

import dlp.model.Operacao;
import dlp.view.AddDespesa;
import dlp.view.AddReceita;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class AddOperacao
{

    public static void addDespesa(ActionEvent evt)
    {
        add(AddDespesa.txt_descricao.getText(), AddDespesa.txt_valor.getText(), AddDespesa.slct_categoria.getSelectedItem().toString(), AddDespesa.txt_data.getText());
    }

    public static void addReceita(ActionEvent evt)
    {
        add(AddReceita.txt_descricao.getText(), AddReceita.txt_valor.getText(), AddReceita.slct_categoria.getSelectedItem().toString(), AddReceita.txt_data.getText());
    }

    private static void add(String descricao, String valor, String categoria, String data)
    {
        Operacao operacao = new Operacao();

        operacao.setDescricao(descricao);
        operacao.setValor(Double.valueOf(valor));
        operacao.setCategoria(Manager.getCategoria(categoria));

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            Calendar c = Calendar.getInstance();
            c.setTime(format.parse(data));
            operacao.setData(c);
        } catch (ParseException ex)
        {
            Logger.getLogger(AddOperacao.class.getName()).log(Level.SEVERE, null, ex);
        }

        operacao.addBD();
    }

}
