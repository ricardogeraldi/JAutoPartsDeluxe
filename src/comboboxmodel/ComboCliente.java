
package comboboxmodel;

import daos.DAOGenerico;
import entidades.Cliente;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ricardo
 */
public class ComboCliente implements ComboBoxModel{

    private DAOGenerico<Cliente> dao;
    private List<Cliente> lista;
    private Cliente selecionado;
    
    public ComboCliente(){
        dao = new DAOGenerico<Cliente>(Cliente.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Cliente) anItem;
        
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
