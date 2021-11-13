package happypet;

public class ColaUsuarios {

    NodoUsuarios raiz, fondo;

    public ColaUsuarios() {
        raiz = null;
        fondo = null;
    }

    public boolean vacia() {
        return raiz == null;
    }

    public void insertar(Usuario datos) {
        NodoUsuarios nuevo = new NodoUsuarios(datos);

        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.setSiguiente(nuevo);
            fondo = nuevo;
        }
    }

    public void imprimir() {
        NodoUsuarios reco = raiz;
        System.out.println("Usuarios: ");
        while (reco != null) {
            System.out.print(reco + "\n");
            reco = reco.getSiguiente();
        }
        System.out.println();
    }

    public void Inactivar(Usuario datos) {
        NodoUsuarios reco = raiz;      
        while (!reco.getDato().getNickName().equals(datos.getNickName())){            
            reco = reco.getSiguiente();
        }
        reco.setDato(datos);
    }
}
