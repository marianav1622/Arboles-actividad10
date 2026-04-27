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
public void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInorden(nodo.derecho);
        }
    }
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
public void mostrarArbol() {
        mostrarArbolRecursivo(raiz, "", true);
    }

    private void mostrarArbolRecursivo(Nodo nodo, String prefijo, boolean esUltimo) {
        if (nodo != null) {
            System.out.print(prefijo);
            System.out.print(esUltimo ? "└── " : "├── ");
            String etiqueta = (nodo == raiz) ? " [Raíz]" : 
                              (nodo.izquierdo == null && nodo.derecho == null) ? " [Hoja]" : " [Interno]";
            System.out.println(nodo.valor + etiqueta);

            String nuevoPrefijo = prefijo + (esUltimo ? "    " : "│   ");

            if (nodo.izquierdo != null || nodo.derecho != null) {
                if (nodo.izquierdo != null) {
                    mostrarArbolRecursivo(nodo.izquierdo, nuevoPrefijo, nodo.derecho == null);
                }
                if (nodo.derecho != null) {
                     mostrarArbolRecursivo(nodo.derecho, nuevoPrefijo, true);
                }
            }
        }
    }
}