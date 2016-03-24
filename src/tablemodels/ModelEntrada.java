package tablemodels;

import daos.DAOGenerico;
import entidades.Entrada;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelEntrada implements TableModel {

    private DAOGenerico<Entrada> dao;
    private List<Entrada> lista;

    public ModelEntrada() {
        dao = new DAOGenerico<Entrada>(Entrada.class);
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
        String colunas[]={"Fornecedor","Produto","Quantidade",
                          "Valor Unitário","Valor Total"};
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
        Entrada ent = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return ent.getFornecedor();
            case 1 : return ent.getItemEntrada().getProduto();
            //case 2 : return ent.getItementrada().getItementmerQuantidade();
            //case 3 : return ent.getItementrada().getItementmerValorUnitario();
            //case 4 : return ent.getEntValor();
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
