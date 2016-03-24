
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
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date empDataCadastro;
    
    private String empRazaoSocial;
    
    private String empNomeFantasia;
    
    private String empCNPJ;
    
    private String empInscricaoEstadual;
    
    private String empEndereco;
    
    private String empNumero;
    
    private String empBairro;
    
    private String empComplemento;
    
    private String empCep;
    
    private String empTelefone;
    
    private String empEmail;
    
    private String empObservacao;
    
    @ManyToOne
    private Cidade cidade;
    
    @ManyToOne
    private Estado estado;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Empresa[empId=" + empId + "]";
    }

    public String getEmpBairro() {
        return empBairro;
    }

    public void setEmpBairro(String empBairro) {
        this.empBairro = empBairro;
    }

    public String getEmpCNPJ() {
        return empCNPJ;
    }

    public void setEmpCNPJ(String empCNPJ) {
        this.empCNPJ = empCNPJ;
    }

    public String getEmpCep() {
        return empCep;
    }

    public void setEmpCep(String empCep) {
        this.empCep = empCep;
    }

    public String getEmpComplemento() {
        return empComplemento;
    }

    public void setEmpComplemento(String empComplemento) {
        this.empComplemento = empComplemento;
    }

    public Date getEmpDataCadastro() {
        return empDataCadastro;
    }

    public void setEmpDataCadastro(Date empDataCadastro) {
        this.empDataCadastro = empDataCadastro;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpEndereco() {
        return empEndereco;
    }

    public void setEmpEndereco(String empEndereco) {
        this.empEndereco = empEndereco;
    }

    public String getEmpTelefone() {
        return empTelefone;
    }

    public void setEmpTelefone(String empTelefone) {
        this.empTelefone = empTelefone;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpInscricaoEstadual() {
        return empInscricaoEstadual;
    }

    public void setEmpInscricaoEstadual(String empInscricaoEstadual) {
        this.empInscricaoEstadual = empInscricaoEstadual;
    }

    public String getEmpNomeFantasia() {
        return empNomeFantasia;
    }

    public void setEmpNomeFantasia(String empNomeFantasia) {
        this.empNomeFantasia = empNomeFantasia;
    }

    public String getEmpObservacao() {
        return empObservacao;
    }

    public void setEmpObservacao(String empObservacao) {
        this.empObservacao = empObservacao;
    }

    public String getEmpRazaoSocial() {
        return empRazaoSocial;
    }

    public void setEmpRazaoSocial(String empRazaoSocial) {
        this.empRazaoSocial = empRazaoSocial;
    }

    public String getEmpNumero() {
        return empNumero;
    }

    public void setEmpNumero(String empNumero) {
        this.empNumero = empNumero;
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