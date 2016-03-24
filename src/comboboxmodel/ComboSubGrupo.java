
package comboboxmodel;

import daos.DAOGenerico;
import entidades.SubGrupo;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ricardo
 */
public class ComboSubGrupo implements ComboBoxModel{

    private DAOGenerico<SubGrupo> dao;
    private List<SubGrupo> lista;
    private SubGrupo selecionado;
    
    public ComboSubGrupo(){
        dao = new DAOGenerico<SubGrupo>(SubGrupo.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(SubGrupo) anItem;
        
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
