
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
public class Entrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long EntMerId;
    
    public Long getEntMerId() {
        return EntMerId;
    }
    
    public void setEntMerId(Long EntMerId) {
        this.EntMerId = EntMerId;
    }

    @Temporal(value = javax.persistence.TemporalType.DATE)
    private Date entDataEntrada;
    
    private double entValor;
    
    private String entObservacao;
    
    @ManyToOne
    private Fornecedor fornecedor;
    
    @ManyToOne
    private Funcionario funcionario;
    
    @ManyToOne
    private ItemEntrada itementrada;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (EntMerId != null ? EntMerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
        if ((this.EntMerId == null && other.EntMerId != null) || 
                (this.EntMerId != null && !this.EntMerId.equals(other.EntMerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Entrada[entId=" + EntMerId + "]";
    }

    public Date getEntDataEntrada() {
        return entDataEntrada;
    }

    public void setEntDataEntrada(Date entDataEntrada) {
        this.entDataEntrada = entDataEntrada;
    }

    public double getEntValor() {
        return entValor;
    }

    public void setEntValor(double entValor) {
        this.entValor = entValor;
    }

    public String getEntObservacao() {
        return entObservacao;
    }

    public void setEntObservacao(String entObservacao) {
        this.entObservacao = entObservacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ItemEntrada getItemEntrada() {
        return itementrada;
    }

    public void setItemEntrada(ItemEntrada itementrada) {
        this.itementrada = itementrada;
    }

}