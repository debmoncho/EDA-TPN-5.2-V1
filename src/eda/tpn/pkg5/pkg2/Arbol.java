
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

        return null;
    }
    
    public void recorrido(){
    
        int elem = 0;
        
        if (raiz.izquierdo != null) {
            
            System.out.println(raiz.izquierdo);
        }
        
        if (raiz.izquierdo == null) {
            System.out.println(raiz.derecho);
            if(){
            
            }
        }  
            
        

        return null;
    
    }
    
    
    public void busqueda(int valor){
    
       Nodo punt = new Nodo();
       punt = raiz;
       
       while(punt != null && punt.valor != valor){
       
           if(valor < punt.valor){
               punt = punt.izquierdo;
           } else {
               punt = punt.derecho;
           }
           if(punt == null){
               System.out.println("No se encontro");
           } else {
               System.out.println("Se encontro");
           }
       }
    }
      
}
