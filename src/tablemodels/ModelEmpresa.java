package tablemodels;

import entidades.Empresa;
import daos.DAOGenerico;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelEmpresa implements TableModel {
    
    private DAOGenerico<Empresa> dao;
    private List<Empresa> lista;
    
    public ModelEmpresa() {
        dao = new DAOGenerico<Empresa>(Empresa.class);
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
        String colunas[] = {"Razao Social","Nome Fantasia","CNPJ","Fone"};
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
        Empresa emp = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return emp.getEmpRazaoSocial().toUpperCase();
            case 1 : return emp.getEmpNomeFantasia().toUpperCase();
            case 2 : return emp.getEmpCNPJ().toUpperCase();
            case 3 : return emp.getEmpTelefone().toUpperCase();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        /*
        Empresa emp=lista.get(rowIndex);
        emp.setEmpNumero((String)aValue);
        dao.update(emp);
        */
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}