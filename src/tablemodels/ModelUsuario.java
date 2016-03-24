package tablemodels;

import daos.DAOGenerico;
import entidades.Usuario;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelUsuario implements TableModel {
    
    private DAOGenerico<Usuario> dao;
    private List<Usuario> lista;
    
    public ModelUsuario() {
        dao = new DAOGenerico<Usuario>(Usuario.class);
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
        String colunas[] = {"Nome","Login",/*"Privilégio"*/};
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
        Usuario usu = lista.get(rowIndex);
        switch (columnIndex) {
            case 0 : return usu.getUsuNome().toUpperCase();
            case 1 : return usu.getUsuLogin().toLowerCase();
            //case 2 : return usu.getUsuSenha().toString();
            //case 3 : return usu.getPrivilegioToString().toString().toUpperCase();
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