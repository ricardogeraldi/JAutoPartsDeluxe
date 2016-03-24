
package comboboxmodel;

import daos.DAOGenerico;
import entidades.Fornecedor;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ricardo
 */
public class ComboFornecedor implements ComboBoxModel{

    private DAOGenerico<Fornecedor> dao;
    private List<Fornecedor> lista;
    private Fornecedor selecionado;
    
    public ComboFornecedor(){
        dao = new DAOGenerico<Fornecedor>(Fornecedor.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Fornecedor) anItem;
        
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
