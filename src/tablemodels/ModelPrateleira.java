package tablemodels;

import daos.DAOGenerico;
import entidades.Prateleira;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelPrateleira implements TableModel {
    
    private DAOGenerico<Prateleira> dao;
    private List<Prateleira> lista;
    
    public ModelPrateleira() {
        dao = new DAOGenerico<Prateleira>(Prateleira.class);
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
        String colunas[] = {"Nome","Número",
                            "Veículo","Descrição"};
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
        Prateleira pra = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return pra.getPraNome().toUpperCase();
            case 1 : return pra.getPraNumero().toUpperCase();
            case 2 : return pra.getVeiculo().toString().toUpperCase();
            case 3 : return pra.getPraDescricao().toUpperCase();
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