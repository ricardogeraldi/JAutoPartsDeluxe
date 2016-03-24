
package comboboxmodel;

import daos.DAOGenerico;
import entidades.Veiculo;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ricardo
 */
public class ComboVeiculo implements ComboBoxModel{

    private DAOGenerico<Veiculo> dao;
    private List<Veiculo> lista;
    private Veiculo selecionado;
    
    public ComboVeiculo(){
        dao = new DAOGenerico<Veiculo>(Veiculo.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Veiculo) anItem;
        
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
