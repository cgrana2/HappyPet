package happypet;


public class NodoUsuarios {
    
    private Usuario dato;
    private NodoUsuarios siguiente;
    
    public NodoUsuarios(Usuario dato) {
        this.dato = dato;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoUsuarios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuarios siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato + "" ;
    }
}
