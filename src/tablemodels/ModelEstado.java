package tablemodels;

import daos.DAOGenerico;
import entidades.Estado;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelEstado implements TableModel {

    private DAOGenerico<Estado> dao;
    private List<Estado> lista;

    public ModelEstado() {
        dao = new DAOGenerico<Estado>(Estado.class);
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
        String colunas[]={"Estado","Sigla"};
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
        Estado est = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return est.getEstNome().toUpperCase();
            case 1 : return est.getEstSigla().toUpperCase();
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
