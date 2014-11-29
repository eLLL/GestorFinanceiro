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

        Operacao operacao = new Operacao();

        operacao.setDescricao(AddDespesa.txt_descricao.getText());
        operacao.setValor(Double.valueOf(AddDespesa.txt_valor.getText()));
        operacao.setCategoria(Manager.getCategoria(AddDespesa.slct_categoria.getSelectedItem().toString()));

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            Calendar c = Calendar.getInstance();
            c.setTime(format.parse(AddDespesa.txt_data.getText()));
            operacao.setData(c);
        } catch (ParseException ex)
        {
            Logger.getLogger(AddOperacao.class.getName()).log(Level.SEVERE, null, ex);
        }

        operacao.addBD();
    }

    public static void addReceita(ActionEvent evt)
    {

        Operacao operacao = new Operacao();

        operacao.setDescricao(AddReceita.txt_descricao.getText());
        operacao.setValor(Double.valueOf(AddReceita.txt_valor.getText()));
        operacao.setCategoria(Manager.getCategoria(AddReceita.slct_categoria.getSelectedItem().toString()));

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            Calendar c = Calendar.getInstance();
            c.setTime(format.parse(AddReceita.txt_data.getText()));
            operacao.setData(c);
        } catch (ParseException ex)
        {
            Logger.getLogger(AddOperacao.class.getName()).log(Level.SEVERE, null, ex);
        }

        operacao.addBD();
    }

}
