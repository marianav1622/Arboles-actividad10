/**
 * Clase Nodo que representa cada elemento del árbol.
 * COMPONENTE: Puede ser Raíz, Nodo Interno o Hoja.
 */
public class Nodo {
    int valor; // Dato almacenado
    Nodo izquierdo; // RELACIÓN: Referencia al Hijo Izquierdo
    Nodo derecho;   // RELACIÓN: Referencia al Hijo Derecho

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}