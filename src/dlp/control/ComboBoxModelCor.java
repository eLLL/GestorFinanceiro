package dlp.control;

import dlp.model.Cor;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class ComboBoxModelCor implements ComboBoxModel
{

    private List<String> cores = new ArrayList<>();
    private Cor selectedCor;

    public ComboBoxModelCor()
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
