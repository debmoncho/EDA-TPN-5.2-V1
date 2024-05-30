
package eda.tpn.pkg5.pkg2;


/**
 * 1- Diseñe la clase árbol binario usando arreglo, agregue el método insertar,
 * uno de los recorridos y una búsqueda
 *
 * 2. Diseñe la clase árbol binario usando una implementación enlazada, agregue
 * el método insertar, uno de los recorridos, una búsqueda.
 *
 *
 */
public class Arbol {
    
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }
    
    
    public Nodo insertarN(Nodo raiz, int valor) {

        if (raiz == null) {
            
            raiz = new Nodo(valor);
            return raiz;
        }
        
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarN(raiz.izquierdo, valor);
        } else {
            raiz.derecho = insertarN(raiz.derecho, valor);
        }

        return raiz;
    }
    
    
    public void recorridoPreorden(Nodo nodo) {
        if (nodo == null) {
            return;
        }

        // Visita el nodo raíz
        System.out.print(nodo.valor + " ");

        
        // Recorre el subárbol izquierdo
        recorridoPreorden(nodo.izquierdo);

        // Recorre el subárbol derecho
        recorridoPreorden(nodo.derecho);
    }
    
    
//    public void recorrido() {
//
//        recorridoPreorden(raiz);
//
//    }
    
    
    public void busqueda(Nodo nodo, int valor) {

        //Nodo punt = new Nodo();
        //punt = raiz;
        Nodo punt = nodo;

        while (punt != null && punt.valor != valor) {

            if (valor < punt.valor) {
                punt = punt.izquierdo;
            } else {
                punt = punt.derecho;
            }

        }

        if (punt == null) {
            System.out.println("No se encontro");
        } else {
            System.out.println("Se encontro");
        }

    }
    
    
    
    
//    public void recorrerInOrden() {
//        inorden(arbol, 0);
//    }
//
//    public void inorden(int[] arbol, int i) {
//        if ((arbol[i] != -1) && (i <= tam)) {
//            inorden(arbol, (2 * i + 1)); //recorro el subarbol izquierdo
//            System.out.println(arbol[i]); //muestro la raiz
//            inorden(arbol, (2 * i + 2)); //Recorro el subárbol derecho
//        }
//    }


    
      
}
