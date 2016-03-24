
package comboboxmodel;

import daos.DAOGenerico;
import entidades.Prateleira;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ricardo
 */
public class ComboPrateleira implements ComboBoxModel{

    private DAOGenerico<Prateleira> dao;
    private List<Prateleira> lista;
    private Prateleira selecionado;
    
    public ComboPrateleira(){
        dao = new DAOGenerico<Prateleira>(Prateleira.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Prateleira) anItem;
        
    }

    @Override
    public Object getSelectedItem() {
        return selecionado;
        
    }

    @Override
    public int getSize() {
        return lista.size();
        
    }

    @Override
    public Object getElementAt(int index) {
        return lista.get(index);
        
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }

}
