package happypet;

public class Usuario {
    private String nomCompleto;
    private String nickName;
    private String password;
    private String estado;
    
    public Usuario (){
        this.estado="";
        this.nickName="";
        this.nomCompleto="";
        this.password="";
    }

    public Usuario(String nomCompleto, String nickName, String password, String estado) {
        this.nomCompleto = nomCompleto;
        this.nickName = nickName;
        this.password = password;
        this.estado = estado;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre Completo=" + nomCompleto + ", Nickname=" + nickName + ", Password=" + password + ", Estado=" + estado + '}';
    }
    
    
    
}

