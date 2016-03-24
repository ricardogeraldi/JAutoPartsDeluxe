
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ricardo
 */
@Entity
public class Grupo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gruId;

    public void setGruId(Long gruId) {
        this.gruId = gruId;
    }

    public Long getGruId() {
        return gruId;
    }
    
    private String gruProdutosDescricao;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gruId != null ? gruId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.gruId == null && other.gruId != null) || (this.gruId != null && !this.gruId.equals(other.gruId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return gruProdutosDescricao;
    }

    public String getGruProdutosDescricao() {
        return gruProdutosDescricao;
    }

    public void setGruProdutosDescricao(String gruProdutosDescricao) {
        this.gruProdutosDescricao = gruProdutosDescricao;
    }
}