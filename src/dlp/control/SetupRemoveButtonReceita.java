package dlp.control;

import dlp.view.ModeloTabelaRelatorio;
import dlp.model.*;
import dlp.view.*;
import java.awt.event.*;
import javax.swing.*;

public class SetupRemoveButtonReceita implements ActionListener
{

    public static void setup(JTable tb_relatorio)
    {
        tb_relatorio.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent e)
            {
                int r = tb_relatorio.rowAtPoint(e.getPoint());
                if (r >= 0 && r < tb_relatorio.getRowCount())
                {
                    tb_relatorio.setRowSelectionInterval(r, r);
                }
                else
                {
                    tb_relatorio.clearSelection();
                }

                int rowindex = tb_relatorio.getSelectedRow();
                if (rowindex < 0)
                {
                    return;
                }
                if (e.isPopupTrigger() && e.getComponent() instanceof JTable)
                {
                    JPopupMenu popup = new SetupRemoveButtonReceita().createYourPopUp(rowindex, tb_relatorio);
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }

        }
        );
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        JMenuItem menu = (JMenuItem) event.getSource();
        if (menu.getText().endsWith("Remover"))
        {
            int row = RelatorioReceita.tb_relatorio.getSelectedRow();

            int selectedObject = (Integer) RelatorioReceita.tb_relatorio.getModel().getValueAt(row, 1);

            System.out.println(selectedObject);

            if (RemoveOperacao.remove(selectedObject))
            {
                ModeloTabelaRelatorio model = (ModeloTabelaRelatorio) RelatorioReceita.tb_relatorio.getModel();
                model.removeRow(row);
                model.fireTableDataChanged();
            }
        }
    }

    public JPopupMenu createYourPopUp(int rowindex, JTable jTable1)
    {
        JPopupMenu popup = new JPopupMenu();
        JMenuItem delete = new JMenuItem("Remover");
        delete.addActionListener(this);
        popup.add(delete);
        return popup;
    }

}
