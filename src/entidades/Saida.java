
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Ricardo
 */
@Entity
public class Saida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long SaiMerId;
    
    public Long getSaiMerId() {
        return SaiMerId;
    }
    
    public void setSaiMerId(Long SaiMerId) {
        this.SaiMerId = SaiMerId;
    }

    @Temporal(value = javax.persistence.TemporalType.DATE)
    private Date saiDataSaida;
    
    private double saiValor;
    
    private String saiObservacao;
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Funcionario funcionario;
    
    private ItemSaida itemsaida;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (SaiMerId != null ? SaiMerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saida)) {
            return false;
        }
        Saida other = (Saida) object;
        if ((this.SaiMerId == null && other.SaiMerId != null) || 
                (this.SaiMerId != null && !this.SaiMerId.equals(other.SaiMerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Entrada[entId=" + SaiMerId + "]";
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getSaiDataSaida() {
        return saiDataSaida;
    }

    public void setSaiDataSaida(Date saiDataSaida) {
        this.saiDataSaida = saiDataSaida;
    }

    public String getSaiObservacao() {
        return saiObservacao;
    }

    public void setSaiObservacao(String saiObservacao) {
        this.saiObservacao = saiObservacao;
    }

    public double getSaiValor() {
        return saiValor;
    }

    public void setSaiValor(double saiValor) {
        this.saiValor = saiValor;
    }

    public ItemSaida getItemsaida() {
        return itemsaida;
    }

    public void setItemsaida(ItemSaida itemsaida) {
        this.itemsaida = itemsaida;
    }
}