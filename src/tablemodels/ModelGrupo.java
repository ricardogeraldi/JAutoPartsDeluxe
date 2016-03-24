package tablemodels;

import daos.DAOGenerico;
import entidades.Grupo;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelGrupo implements TableModel {
    
    private DAOGenerico<Grupo> dao;
    private List<Grupo> lista;
    
    public ModelGrupo() {
        dao = new DAOGenerico<Grupo>(Grupo.class);
        lista = dao.list();
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Grupo de Produtos Descrição"};
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
        Grupo gru = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return gru.getGruProdutosDescricao().toUpperCase();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        /*
        Fornecedor forn=lista.get(rowIndex);
        forn.setFornNumero((String)aValue);
        dao.update(forn);
        */
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}