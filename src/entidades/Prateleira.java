
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
public class Prateleira implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long praId;

    public void setPraId(Long praId) {
        this.praId = praId;
    }

    public Long getPraId() {
        return praId;
    }
    
    @Temporal(value = javax.persistence.TemporalType.DATE)
    private Date praDataCadastro;
    
    private String praNome;
    
    private String praNumero;
    
    private String praDescricao;
    
    @ManyToOne
    private Veiculo veiculo;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (praId != null ? praId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prateleira)) {
            return false;
        }
        Prateleira other = (Prateleira) object;
        if ((this.praId == null && other.praId != null) || (this.praId != null && !this.praId.equals(other.praId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return praNumero+"."+praNome;
    }

    public Date getPraDataCadastro() {
        return praDataCadastro;
    }

    public void setPraDataCadastro(Date praDataCadastro) {
        this.praDataCadastro = praDataCadastro;
    }

    public String getPraDescricao() {
        return praDescricao;
    }

    public void setPraDescricao(String praDescricao) {
        this.praDescricao = praDescricao;
    }

    public String getPraNome() {
        return praNome;
    }

    public void setPraNome(String praNome) {
        this.praNome = praNome;
    }

    public String getPraNumero() {
        return praNumero;
    }

    public void setPraNumero(String praNumero) {
        this.praNumero = praNumero;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}