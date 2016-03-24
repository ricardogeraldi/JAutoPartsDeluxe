
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import util.Criptografia;

@Entity
public class Usuario implements Serializable {
    public static final long serialVersionUID = 1L;
    public static final char VENDEDOR = '0';
    public static final char DIRETOR_FINANCEIRO = '1';
    public static final char ADMINISTRADOR = '2';
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usuId;
    private String usuNome;
    private String usuLogin;
    private String usuSenha;
    private char usuPrivilegio;
    
    public Usuario(){
        
    }
    
    public Usuario(String usuNome, String usuLogin, String usuSenha, char usuPrivilegio){
        this.usuNome = usuNome.toUpperCase();
        this.usuLogin = usuLogin.toLowerCase();
        this.usuSenha = Criptografia.usuSenha(usuSenha);
        this.usuPrivilegio = usuPrivilegio;
    }
    
    public void setUsuId(Long usuId) {
        this.usuId = usuId;
    }


    public Long getUsuId() {
        return usuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getUsuId() != null ? getUsuId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.getUsuId() == null && other.getUsuId() != null) || 
                (this.getUsuId() != null && !this.usuId.equals(other.usuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getUsuId()+" - "+getUsuNome();
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
       this.usuSenha = Criptografia.usuSenha(usuSenha);
    }

    public char getUsuPrivilegio() {
        return usuPrivilegio;
    }

    public String getPrivilegioToString(){
        String p = null;
        if (usuPrivilegio == VENDEDOR){
            p = "CLIENTE";
        } else if(usuPrivilegio == DIRETOR_FINANCEIRO){
            p = "VENDEDOR";
        } else if(usuPrivilegio == ADMINISTRADOR){
            p = "ADMINISTRADOR";
        }
        return p;
    }
    
    public void setUsuPrivilegio(char usuPrivilegio) {
        this.usuPrivilegio = usuPrivilegio;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin.toLowerCase();
    }
}
