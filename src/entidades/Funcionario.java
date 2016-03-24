
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
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long funId;

    public void setFunId(Long funId) {
        this.funId = funId;
    }

    public Long getFunId() {
        return funId;
    }
    
    private String funNome;
    
    private String funCargo;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (funId != null ? funId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.funId == null && other.funId != null) || (this.funId != null && !this.funId.equals(other.funId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return funNome;
    }

    public String getFunCargo() {
        return funCargo;
    }

    public void setFunCargo(String funCargo) {
        this.funCargo = funCargo;
    }

    public String getFunNome() {
        return funNome;
    }

    public void setFunNome(String funNome) {
        this.funNome = funNome;
    }
}