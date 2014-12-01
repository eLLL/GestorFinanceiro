package dlp.control;

import dlp.control.*;
import dlp.model.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class RenderizadorCelulaTabelaRelatorio extends DefaultTableCellRenderer
{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == 0)
        {
            Cor cor = Manager.getOperacao((Integer) table.getModel().getValueAt(row, 1)).getCategoria().getCor();
            c.setBackground(new Color(cor.getR(), cor.getG(), cor.getB()));
        }
        else
        {
            c.setBackground(Color.WHITE);
        }

        return c;
    }
}
