package tablemodels;

import daos.DAOGenerico;
import entidades.Cidade;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelCidade implements TableModel {

    private DAOGenerico<Cidade> dao;
    private List<Cidade> lista;

    public ModelCidade() {
        dao = new DAOGenerico<Cidade>(Cidade.class);
        lista = dao.list();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Nome","Estado"};
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cidade cid = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return cid.getCidNome().toUpperCase();
            case 1 : return cid.getEstado().getEstNome().toUpperCase();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
}
