
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
public class ItemSaida implements Serializable {
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
    
    private int itemsaimerQuantidade;
    
    private double itemsaimerValorUnitario;
    
    @ManyToOne
    private Produto produto;
    
    @ManyToOne 
    private Saida saida;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (SaiMerId != null ? SaiMerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemSaida)) {
            return false;
        }
        ItemSaida other = (ItemSaida) object;
        if ((this.SaiMerId == null && other.SaiMerId != null) || 
                (this.SaiMerId != null && !this.SaiMerId.equals(other.SaiMerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ItemEntrada[id=" + SaiMerId + "]";
    }

    public int getItemsaimerQuantidade() {
        return itemsaimerQuantidade;
    }

    public void setItemsaimerQuantidade(int itemsaimerQuantidade) {
        this.itemsaimerQuantidade = itemsaimerQuantidade;
    }

    public double getItemsaimerValorUnitario() {
        return itemsaimerValorUnitario;
    }

    public void setItemsaimerValorUnitario(double itemsaimerValorUnitario) {
        this.itemsaimerValorUnitario = itemsaimerValorUnitario;
    }

    public Saida getSaida() {
        return saida;
    }

    public void setSaida(Saida saida) {
        this.saida = saida;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}