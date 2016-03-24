package tablemodels;

import daos.DAOGenerico;
import entidades.Produto;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelProduto implements TableModel {

    private DAOGenerico<Produto> dao;
    private List<Produto> lista;

    public ModelProduto() {
        dao = new DAOGenerico<Produto>(Produto.class);
        lista = dao.list();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Nome","Marca","Modelo","Prateleira"};             
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
        Produto pro = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return pro.getProNome().toUpperCase();
            case 1 : return pro.getProMarca().toUpperCase();
            case 2 : return pro.getProModelo().toUpperCase();
            case 3 : return pro.getPrateleira();
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
