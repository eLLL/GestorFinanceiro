package dlp.control;

import dlp.model.*;
import dlp.view.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Lucas
 */
public class AddOperacao
{

    public static boolean add(String descricao, String valor, String categoria, String data)
    {
        Operacao operacao = new Operacao();

        operacao.setDescricao(descricao);
        operacao.setValor(Double.valueOf(valor.replace(',', '.')));
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

        if (operacao.addBD())
        {
            Menu.lb_despesas.setText("R$ " + Saldo.getDespesas());
            Menu.lb_receitas.setText("R$ " + Saldo.getReceitas());
            Menu.lb_saldoAcumulado.setText("R$ " + Saldo.getMontante());

            return true;
        }
        else
        {
            return false;
        }
    }

}
