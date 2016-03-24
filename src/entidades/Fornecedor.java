
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
 * @author Ricardo Theis Geraldi
 */
@Entity
public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fornId;
    
    public Long getFornId() {
        return fornId;
    }

    public void setFornId(Long fornId) {
        this.fornId = fornId;
    }
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fornDataCadastro;
    
    private String fornRazaoSocial;
    
    private String fornNomeFantasia;
    
    private String fornCNPJ;
    
    private String fornInscricaoEstadual;
    
    private String fornEndereco;
    
    private String fornNumero;
    
    private String fornBairro;
    
    private String fornComplemento;
    
    private String fornCep;
    
    private String fornTelefone;
    
    private String fornEmail;
    
    private String fornNomeVendedor;
    
    private String fornTelefoneVendedor;
    
    private String fornCelularVendedor;
    
    private String fornObservacao;
    
    @ManyToOne
    private Cidade cidade;
    
    @ManyToOne
    private Estado estado;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fornId != null ? fornId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.fornId == null && other.fornId != null) || 
             (this.fornId != null && !this.fornId.equals(other.fornId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return fornRazaoSocial;
    }

    public String getFornBairro() {
        return fornBairro;
    }

    public void setFornBairro(String fornBairro) {
        this.fornBairro = fornBairro;
    }

    public String getFornCNPJ() {
        return fornCNPJ;
    }

    public void setFornCNPJ(String fornCNPJ) {
        this.fornCNPJ = fornCNPJ;
    }

    public String getFornCelularVendedor() {
        return fornCelularVendedor;
    }

    public void setFornCelularVendedor(String fornCelularVendedor) {
        this.fornCelularVendedor = fornCelularVendedor;
    }

    public String getFornCep() {
        return fornCep;
    }

    public void setFornCep(String fornCep) {
        this.fornCep = fornCep;
    }

    public String getFornComplemento() {
        return fornComplemento;
    }

    public void setFornComplemento(String fornComplemento) {
        this.fornComplemento = fornComplemento;
    }

    public Date getFornDataCadastro() {
        return fornDataCadastro;
    }

    public void setFornDataCadastro(Date fornDataCadastro) {
        this.fornDataCadastro = fornDataCadastro;
    }

    public String getFornEmail() {
        return fornEmail;
    }

    public void setFornEmail(String fornEmail) {
        this.fornEmail = fornEmail;
    }

    public String getFornEndereco() {
        return fornEndereco;
    }

    public void setFornEndereco(String fornEndereco) {
        this.fornEndereco = fornEndereco;
    }

    public String getFornInscricaoEstadual() {
        return fornInscricaoEstadual;
    }

    public void setFornInscricaoEstadual(String fornInscricaoEstadual) {
        this.fornInscricaoEstadual = fornInscricaoEstadual;
    }

    public String getFornNomeFantasia() {
        return fornNomeFantasia;
    }

    public void setFornNomeFantasia(String fornNomeFantasia) {
        this.fornNomeFantasia = fornNomeFantasia;
    }

    public String getFornNomeVendedor() {
        return fornNomeVendedor;
    }

    public void setFornNomeVendedor(String fornNomeVendedor) {
        this.fornNomeVendedor = fornNomeVendedor;
    }

    public String getFornNumero() {
        return fornNumero;
    }

    public void setFornNumero(String fornNumero) {
        this.fornNumero = fornNumero;
    }

    public String getFornObservacao() {
        return fornObservacao;
    }

    public void setFornObservacao(String fornObservacao) {
        this.fornObservacao = fornObservacao;
    }

    public String getFornRazaoSocial() {
        return fornRazaoSocial;
    }

    public void setFornRazaoSocial(String fornRazaoSocial) {
        this.fornRazaoSocial = fornRazaoSocial;
    }

    public String getFornTelefone() {
        return fornTelefone;
    }

    public void setFornTelefone(String fornTelefone) {
        this.fornTelefone = fornTelefone;
    }

    public String getFornTelefoneVendedor() {
        return fornTelefoneVendedor;
    }

    public void setFornTelefoneVendedor(String fornTelefoneVendedor) {
        this.fornTelefoneVendedor = fornTelefoneVendedor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}