package tablemodels;

import daos.DAOGenerico;
import entidades.Funcionario;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelFuncionario implements TableModel {
    
    private DAOGenerico<Funcionario> dao;
    private List<Funcionario> lista;
    
    public ModelFuncionario() {
        dao = new DAOGenerico<Funcionario>(Funcionario.class);
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
        String colunas[] = {"Nome do Funcionário","Cargo do Funcionário"};
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
        Funcionario fun = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return fun.getFunNome().toUpperCase();
            case 1 : return fun.getFunCargo().toUpperCase();
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