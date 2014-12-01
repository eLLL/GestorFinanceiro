package dlp.model;

import dlp.control.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class CategoriaComboModel implements ComboBoxModel
{

    private List<Categoria> categorias;
    private Categoria selectedCategoria;

    public CategoriaComboModel(TipoOperacao tipo)
    {
        categorias = Manager.getCagetoriaList(tipo);
        selectedCategoria = categorias.get(0);
    }

    @Override
    public void setSelectedItem(Object o)
    {
        selectedCategoria = Manager.getCategoria(o.toString());
    }

    @Override
    public Object getSelectedItem()
    {
        return selectedCategoria.getNome();
    }

    @Override
    public int getSize()
    {
        return categorias.size();
    }

    @Override
    public Object getElementAt(int i)
    {
        return categorias.get(i).getNome();
    }

    @Override
    public void addListDataListener(ListDataListener ll)
    {

    }

    @Override
    public void removeListDataListener(ListDataListener ll)
    {

    }
}
