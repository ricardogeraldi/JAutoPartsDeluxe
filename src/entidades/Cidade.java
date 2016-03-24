package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cidId;
    
    private String cidNome;
    
    @ManyToOne
    private Estado estado;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cidId != null ? cidId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.cidId == null && other.cidId != null) || 
                 (this.cidId != null && !this.cidId.equals(other.cidId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cidNome;
    }
    
    public void setCidId(Long cidId) {
        this.cidId = cidId;
    }
    
    public Long getCidId() {
        return cidId;
    }
    
    public String getCidNome() {
        return cidNome;
    }

    public void setCidNome(String cidNome) {
            this.cidNome = cidNome;
    }
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}