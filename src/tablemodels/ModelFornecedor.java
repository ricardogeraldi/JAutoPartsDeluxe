package tablemodels;

import entidades.Fornecedor;
import daos.DAOGenerico;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelFornecedor implements TableModel {
    
    private DAOGenerico<Fornecedor> dao;
    private List<Fornecedor> lista;
    
    public ModelFornecedor() {
        dao = new DAOGenerico<Fornecedor>(Fornecedor.class);
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
        String colunas[] = {"Razao Social","Nome Fantasia",
                            "CNPJ","Fone"};
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
        Fornecedor forn = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return forn.getFornRazaoSocial().toUpperCase();
            case 1 : return forn.getFornNomeFantasia().toUpperCase();
            case 2 : return forn.getFornCNPJ().toUpperCase();
            case 3 : return forn.getFornTelefone().toUpperCase();
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