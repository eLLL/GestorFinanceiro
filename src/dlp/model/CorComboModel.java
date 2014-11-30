package dlp.model;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class CorComboModel implements ComboBoxModel
{

    private List<String> cores = new ArrayList<String>();
    private Cor selectedCor;

    public CorComboModel()
    {
        for (Cor cor : Cor.values())
        {
            cores.add(cor.name());
        }

        java.util.Collections.sort(cores, Collator.getInstance());
    }

    @Override
    public void setSelectedItem(Object o)
    {
        selectedCor = Cor.valueOf(o.toString().toUpperCase());
    }

    @Override
    public Object getSelectedItem()
    {
        return selectedCor;
    }

    @Override
    public int getSize()
    {
        return cores.size();
    }

    @Override
    public Object getElementAt(int i)
    {
        return toCamelCase(cores.get(i).toLowerCase());
    }

    @Override
    public void addListDataListener(ListDataListener ll)
    {

    }

    @Override
    public void removeListDataListener(ListDataListener ll)
    {

    }

    private String toCamelCase(String string)
    {
        StringBuffer sb = new StringBuffer(string);
        sb.replace(0, 1, string.substring(0, 1).toUpperCase());
        return sb.toString();

    }
}
