
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
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cliId;
    
    public Long getCliId() {
        return cliId;
    }

    public void setCliId(Long cliId) {
        this.cliId = cliId;
    }
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cliDataCadastro;
    
    private String cliNome;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cliDataNascimento;
    
    private String cliCpf; 
    
    private String cliRg;
    
    private String cliEndereco;
    
    private String cliNumero;
    
    private String cliBairro;
    
    private String cliCep;
    
    private String cliComplemento;
    
    private String cliTrabalho;
    
    private String cliTelefone;
    
    private String cliCelular;
    
    private String cliEmail;
    
    private String cliObservacao;

    private String copo;
    
    @ManyToOne
    private Cidade cidade;
    
    @ManyToOne
    private Estado estado;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliId != null ? cliId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliId == null && other.cliId != null) || (this.cliId != null && !this.cliId.equals(other.cliId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cliNome;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    public String getCliCelular() {
        return cliCelular;
    }

    public void setCliCelular(String cliCelular) {
        this.cliCelular = cliCelular;
    }

    public String getCliCep() {
        return cliCep;
    }

    public void setCliCep(String cliCep) {
        this.cliCep = cliCep;
    }

    public String getCliComplemento() {
        return cliComplemento;
    }

    public void setCliComplemento(String cliComplemento) {
        this.cliComplemento = cliComplemento;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        this.cliCpf = cliCpf;
    }

    public Date getCliDataCadastro() {
        return cliDataCadastro;
    }

    public void setCliDataCadastro(Date cliDataCadastro) {
        this.cliDataCadastro = cliDataCadastro;
    }

    public Date getCliDataNascimento() {
        return cliDataNascimento;
    }

    public void setCliDataNascimento(Date cliDataNascimento) {
        this.cliDataNascimento = cliDataNascimento;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliNumero() {
        return cliNumero;
    }

    public void setCliNumero(String cliNumero) {
        this.cliNumero = cliNumero;
    }

    public String getCliObservacao() {
        return cliObservacao;
    }

    public void setCliObservacao(String cliObservacao) {
        this.cliObservacao = cliObservacao;
    }

    public String getCliRg() {
        return cliRg;
    }

    public void setCliRg(String cliRg) {
        this.cliRg = cliRg;
    }

    public String getCliTelefone() {
        return cliTelefone;
    }

    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }

    public String getCliTrabalho() {
        return cliTrabalho;
    }

    public void setCliTrabalho(String cliTrabalho) {
        this.cliTrabalho = cliTrabalho;
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