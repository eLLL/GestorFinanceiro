package dlp.control;

import dlp.model.*;
import java.util.*;
import javax.swing.table.*;

public class ModeloTabelaRelatorio extends AbstractTableModel
{

    public ModeloTabelaRelatorio(TipoOperacao tipo)
    {
        data.addAll(Manager.getOperacaoList(tipo));
    }

    final String[] columnNames =
    {
        "ID", "Descrição", "Categoria", "Data", "Valor"
    };
    final Class[] columnClasses =
    {
        Integer.class, String.class, String.class, String.class, String.class
    };
    final Vector data = new Vector();

    // adds a row
    public void addOperacao(Operacao o)
    {
        data.add(o);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        return data.size();
    }

    @Override
    public String getColumnName(int col)
    {
        return columnNames[col];
    }

    @Override
    public Class getColumnClass(int c)
    {
        return columnClasses[c];
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        Operacao operacao = (Operacao) data.elementAt(row);
        if (col == 0)
        {
            return operacao.getId();
        }
        else if (col == 1)
        {
            return operacao.getDescricao();
        }
        else if (col == 2)
        {
            return operacao.getCategoria().getNome();
        }
        else if (col == 3)
        {
            return operacao.getData().get(Calendar.DAY_OF_MONTH) + "/" + (operacao.getData().get(Calendar.MONTH) + 1) + "/" + operacao.getData().get(Calendar.YEAR);
        }
        else if (col == 4)
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
        return (Operacao) data.elementAt(row);
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return false;
    }

    public void removeRow(int row)
    {
        data.remove(row);
    }

}
