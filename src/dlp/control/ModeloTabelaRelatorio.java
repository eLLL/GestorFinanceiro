package dlp.control;

import dlp.control.Manager;
import dlp.model.*;
import java.util.*;
import javax.swing.table.*;

public class ModeloTabelaRelatorio extends AbstractTableModel
{

    public ModeloTabelaRelatorio(TipoOperacao tipo)
    {
        dados.addAll(Manager.getOperacaoList(tipo));
    }

    final String[] nomesColunas =
    {
        "Cor", "ID", "Descrição", "Categoria", "Data", "Valor"
    };
    final Class[] classesColunas =
    {
        Object.class, Integer.class, String.class, String.class, String.class, String.class
    };
    final Vector dados = new Vector();

    // adds a row
    public void addOperacao(Operacao o)
    {
        dados.add(o);
        fireTableRowsInserted(dados.size() - 1, dados.size() - 1);
    }

    @Override
    public int getColumnCount()
    {
        return nomesColunas.length;
    }

    @Override
    public int getRowCount()
    {
        return dados.size();
    }

    @Override
    public String getColumnName(int col)
    {
        return nomesColunas[col];
    }

    @Override
    public Class getColumnClass(int c)
    {
        return classesColunas[c];
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        Operacao operacao = (Operacao) dados.elementAt(row);
        if (col == 1)
        {
            return operacao.getId();
        }
        else if (col == 2)
        {
            return operacao.getDescricao();
        }
        else if (col == 3)
        {
            return operacao.getCategoria().getNome();
        }
        else if (col == 4)
        {
            return operacao.getData().get(Calendar.DAY_OF_MONTH) + "/" + (operacao.getData().get(Calendar.MONTH) + 1) + "/" + operacao.getData().get(Calendar.YEAR);
        }
        else if (col == 5)
        {
            return String.valueOf(operacao.getValor());
        }
        else
        {
            return null;
        }
    }

    public Object getValueAt(int row)
    {
        return (Operacao) dados.elementAt(row);
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return false;
    }

    public void removeRow(int row)
    {
        dados.remove(row);
    }

}
