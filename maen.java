public class maen {
public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
         // Inserción ordenada según las reglas del ABB
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

    
        System.out.println("\n=== MÉTRICAS Y TERMINOLOGÍA ===");
        System.out.println("Altura del árbol: " + arbol.getAltura());
        System.out.println("Cantidad de hojas: " + arbol.contarHojas());
        System.out.println("\n=== RECORRIDOS DEL ÁRBOL ===");
        
        System.out.print("Recorrido Preorden: ");
        arbol.recorrerPreorden(arbol.raiz);
        System.out.println();

        System.out.print("Recorrido Inorden: ");
        arbol.recorrerInorden(arbol.raiz);
        System.out.println();

        System.out.print("Recorrido Postorden: ");
        arbol.recorrerPostorden(arbol.raiz);
        System.out.println();
    }
}

