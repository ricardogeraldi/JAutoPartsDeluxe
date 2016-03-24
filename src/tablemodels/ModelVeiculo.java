package tablemodels;

import daos.DAOGenerico;
import entidades.Veiculo;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelVeiculo implements TableModel {
    
    private DAOGenerico<Veiculo> dao;
    private List<Veiculo> lista;
    
    public ModelVeiculo() {
        dao = new DAOGenerico<Veiculo>(Veiculo.class);
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
        String colunas[] = {"Tipo Veículo","Marca","Modelo","Combustível"};
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
        Veiculo vei = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return vei.getVeiTipoVeiculo().toUpperCase();
            case 1 : return vei.getVeiMarca().toUpperCase();
            case 2 : return vei.getVeiModelo().toUpperCase();
            case 3 : return vei.getVeiCombustivel().toUpperCase();
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