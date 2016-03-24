
package comboboxmodel;

import daos.DAOGenerico;
import entidades.Funcionario;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ricardo
 */
public class ComboFuncionario implements ComboBoxModel{

    private DAOGenerico<Funcionario> dao;
    private List<Funcionario> lista;
    private Funcionario selecionado;
    
    public ComboFuncionario(){
        dao = new DAOGenerico<Funcionario>(Funcionario.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Funcionario) anItem;
        
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
