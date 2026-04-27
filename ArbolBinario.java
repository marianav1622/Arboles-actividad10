public class ArbolBinario {
    Nodo raiz; // Componente: Raíz del árbol

    public ArbolBinario() {
        this.raiz = null;
    }
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor); 
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }
 // Recorrido Inorden
    public void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInorden(nodo.derecho);
        }
    }

    // Recorrido Preorden
    public void recorrerPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorrerPreorden(nodo.izquierdo);
            recorrerPreorden(nodo.derecho);
        }
    }
    // Recorrido Postorden
    public void recorrerPostorden(Nodo nodo) {
        if (nodo != null) {
            recorrerPostorden(nodo.izquierdo);
            recorrerPostorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
     // Método 1: Altura del árbol
    public int getAltura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(Nodo nodo) {
        if (nodo == null) return -1; 
        return 1 + Math.max(calcularAltura(nodo.izquierdo), calcularAltura(nodo.derecho));
    }

    // Método 2: Conteo de Hojas
    public int contarHojas() {
        return calcularHojas(raiz);
    }

    private int calcularHojas(Nodo nodo) {
        if (nodo == null) return 0;
        if (nodo.izquierdo == null && nodo.derecho == null) return 1;
        return calcularHojas(nodo.izquierdo) + calcularHojas(nodo.derecho);
    }
}