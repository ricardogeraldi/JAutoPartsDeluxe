package tablemodels;

import daos.DAOGenerico;
import entidades.Saida;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelSaida implements TableModel {

    private DAOGenerico<Saida> dao;
    private List<Saida> lista;

    public ModelSaida() {
        dao = new DAOGenerico<Saida>(Saida.class);
        lista = dao.list();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Cliente","Produto","Quantidade",
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
        Saida sai = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return sai.getCliente().getCliNome();
            case 1 : return sai.getItemsaida().getProduto();
            case 2 : return sai.getItemsaida().getItemsaimerQuantidade();
            case 3 : return sai.getItemsaida().getItemsaimerValorUnitario();
            case 4 : return sai.getSaiValor();
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
