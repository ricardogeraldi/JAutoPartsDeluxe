
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ricardo
 */
@Entity
public class ItemEntrada implements Serializable {
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
    
    private int itementmerQuantidade;
    
    private double itementmerValorUnitario;
    
    @ManyToOne
    private Produto produto;
    
    @ManyToOne
    private Entrada entrada;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (EntMerId != null ? EntMerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemEntrada)) {
            return false;
        }
        ItemEntrada other = (ItemEntrada) object;
        if ((this.EntMerId == null && other.EntMerId != null) || 
                (this.EntMerId != null && !this.EntMerId.equals(other.EntMerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ItemEntrada[id=" + EntMerId + "]";
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public int getItementmerQuantidade() {
        return itementmerQuantidade;
    }

    public void setItementmerQuantidade(int itementmerQuantidade) {
        this.itementmerQuantidade = itementmerQuantidade;
    }

    public double getItementmerValorUnitario() {
        return itementmerValorUnitario;
    }

    public void setItementmerValorUnitario(double itementmerValorUnitario) {
        this.itementmerValorUnitario = itementmerValorUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}