
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Ricardo
 */
@Entity
public class Veiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long veiId;

    public void setVeiId(Long veiId) {
        this.veiId = veiId;
    }

    public Long getVeiId() {
        return veiId;
    }

    @Temporal(value = javax.persistence.TemporalType.DATE)
    private Date veiDataCadastro;

    private String veiTipoVeiculo;

    @Temporal(value = javax.persistence.TemporalType.DATE)
    private Date veiAnoFabricacao;
    
    private String veiMarca;
    
    private String veiModelo;
    
    private String veiCombustivel;
    
    private String veiCor;
    
    private String veiObservacao;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (veiId != null ? veiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.veiId == null && other.veiId != null) || (this.veiId != null && !this.veiId.equals(other.veiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return veiModelo;
    }

    public Date getVeiAnoFabricacao() {
        return veiAnoFabricacao;
    }

    public void setVeiAnoFabricacao(Date veiAnoFabricacao) {
        this.veiAnoFabricacao = veiAnoFabricacao;
    }

    public String getVeiCombustivel() {
        return veiCombustivel;
    }

    public void setVeiCombustivel(String veiCombustivel) {
        this.veiCombustivel = veiCombustivel;
    }

    public String getVeiCor() {
        return veiCor;
    }

    public void setVeiCor(String veiCor) {
        this.veiCor = veiCor;
    }

    public Date getVeiDataCadastro() {
        return veiDataCadastro;
    }

    public void setVeiDataCadastro(Date veiDataCadastro) {
        this.veiDataCadastro = veiDataCadastro;
    }

    public String getVeiMarca() {
        return veiMarca;
    }

    public void setVeiMarca(String veiMarca) {
        this.veiMarca = veiMarca;
    }

    public String getVeiModelo() {
        return veiModelo;
    }

    public void setVeiModelo(String veiModelo) {
        this.veiModelo = veiModelo;
    }

    public String getVeiObservacao() {
        return veiObservacao;
    }

    public void setVeiObservacao(String veiObservacao) {
        this.veiObservacao = veiObservacao;
    }

    public String getVeiTipoVeiculo() {
        return veiTipoVeiculo;
    }

    public void setVeiTipoVeiculo(String veiTipoVeiculo) {
        this.veiTipoVeiculo = veiTipoVeiculo;
    }
    
}