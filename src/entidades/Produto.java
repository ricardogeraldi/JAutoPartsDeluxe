
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
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long proId;

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public Long getProId() {
        return proId;
    }

    @Temporal(value = javax.persistence.TemporalType.DATE)
    private Date proDataCadastro;

    private String proNome;
    
    private String proMarca;
    
    private String proModelo;
    
    private int proQuantidade;
    
    private int proQuantidadeMinima;
    
    private double proPreco;
    
    private String proObservacao;
            
    @ManyToOne
    private SubGrupo subgrupo;
    
    @ManyToOne
    private Prateleira prateleira;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proId != null ? proId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.proId == null && other.proId != null) || (this.proId != null && !this.proId.equals(other.proId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return proNome;
    }

    public Date getProDataCadastro() {
        return proDataCadastro;
    }

    public void setProDataCadastro(Date proDataCadastro) {
        this.proDataCadastro = proDataCadastro;
    }

    public String getProMarca() {
        return proMarca;
    }

    public void setProMarca(String proMarca) {
        this.proMarca = proMarca;
    }

    public String getProModelo() {
        return proModelo;
    }

    public void setProModelo(String proModelo) {
        this.proModelo = proModelo;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public String getProObservacao() {
        return proObservacao;
    }

    public void setProObservacao(String proObservacao) {
        this.proObservacao = proObservacao;
    }

    public double getProPreco() {
        return proPreco;
    }

    public void setProPreco(double proPreco) {
        this.proPreco = proPreco;
    }

    public int getProQuantidade() {
        return proQuantidade;
    }

    public void setProQuantidade(int proQuantidade) {
        this.proQuantidade = proQuantidade;
    }

    public int getProQuantidadeMinima() {
        return proQuantidadeMinima;
    }

    public void setProQuantidadeMinima(int proQuantidadeMinima) {
        this.proQuantidadeMinima = proQuantidadeMinima;
    }

    public Prateleira getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(Prateleira prateleira) {
        this.prateleira = prateleira;
    }

    public SubGrupo getSubGrupo() {
        return subgrupo;
    }

    public void setSubGrupo(SubGrupo subgrupo) {
        this.subgrupo = subgrupo;
    }
}