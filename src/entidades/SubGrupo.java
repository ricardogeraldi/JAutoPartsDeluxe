
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
public class SubGrupo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subgruId;

    public Long getSubgruId() {
        return subgruId;
    }

    public void setSubgruId(Long subgruId) {
        this.subgruId = subgruId;
    }
    
    private String subgruProdutosDescricao;
    
    @ManyToOne
    private Grupo grupo;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subgruId != null ? subgruId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubGrupo)) {
            return false;
        }
        SubGrupo other = (SubGrupo) object;
        if ((this.subgruId == null && other.subgruId != null) || (this.subgruId != null && !this.subgruId.equals(other.subgruId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return subgruProdutosDescricao;
    }

    public String getSubgruProdutosDescricao() {
        return subgruProdutosDescricao;
    }

    public void setSubgruProdutosDescricao(String subgruProdutosDescricao) {
        this.subgruProdutosDescricao = subgruProdutosDescricao;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}