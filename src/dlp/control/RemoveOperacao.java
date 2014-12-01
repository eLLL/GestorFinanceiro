package dlp.control;

import dlp.model.*;
import dlp.view.*;
import javax.swing.*;

public class RemoveOperacao
{

    public static boolean remove(int id)
    {
        Operacao o = Manager.getOperacaoList(id);
        if (o.removeDB())
        {
            Menu.lb_despesas.setText("R$ " + Saldo.getDespesas());
            Menu.lb_receitas.setText("R$ " + Saldo.getReceitas());
            Menu.lb_saldoAcumulado.setText("R$ " + Saldo.getMontante());

            JOptionPane.showMessageDialog(null, "Registro removido!");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao remover registro!");
            return false;
        }
    }
}
