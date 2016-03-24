package tablemodels;

import daos.DAOGenerico;
import entidades.Cliente;
import java.util.Date;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModelCliente implements TableModel {
    
    private DAOGenerico<Cliente> dao;
    private List<Cliente> lista;
    
    public ModelCliente() {
        dao = new DAOGenerico<Cliente>(Cliente.class);
        lista = dao.list();
    }
    
    public ModelCliente(String consultar) {
        dao = new DAOGenerico<Cliente>(Cliente.class);
        Cliente cli = new Cliente();
        cli.setCliNome(consultar);
        lista = dao.findByExamplePartial(cli);
    }
        
    //Retorna quantas linhas tem na tabela
    @Override
    public int getRowCount() {
        return lista.size();
    }

    //Retorna quantas colunas tem na tabela
    @Override
    public int getColumnCount() {
        return 4;
    }

    // Retorna o nome das colunas
    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Nome","CPF","Fone","Celular"};
        return colunas[columnIndex];    
    }

    // Retorna a classe das colunas
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    //Retorna se cada uma das céluas são ou não editáveis
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /* Método mais importante
       Retorna qual é o valor ou o conteúdo de cada uma das células */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cli = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return cli.getCliNome().toUpperCase();
            case 1 : return cli.getCliCpf().toUpperCase();
            case 2 : return cli.getCliTelefone().toUpperCase();
            case 3 : return cli.getCliCelular().toUpperCase();
        }
        return null;
    }
    
    //Método que é executado quando o usuário alterar uma célula
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