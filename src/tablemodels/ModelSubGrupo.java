package tablemodels;

import daos.DAOGenerico;
import entidades.SubGrupo;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelSubGrupo implements TableModel {
    
    private DAOGenerico<SubGrupo> dao;
    private List<SubGrupo> lista;
    
    public ModelSubGrupo() {
        dao = new DAOGenerico<SubGrupo>(SubGrupo.class);
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
        String colunas[] = {"Sub-Grupo Descrição","Grupo Descrição"};
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
        SubGrupo subgru = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return subgru.getSubgruProdutosDescricao().toUpperCase();
            case 1 : return subgru.getGrupo().toString().toUpperCase();
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