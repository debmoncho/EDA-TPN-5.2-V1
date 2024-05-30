
package eda.tpn.pkg5.pkg2;

import java.util.Arrays;


public class EDATPN52 {

    
    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        Nodo nodo = new Nodo(6);

        arbol.insertarN(nodo, 2);
        arbol.insertarN(nodo, 8);
        arbol.insertarN(nodo, 1);
        arbol.insertarN(nodo, 4);
        arbol.insertarN(nodo, 3);
        arbol.insertarN(nodo, 5);
        


        System.out.println("Recorrido PRE orden");
        arbol.recorridoPreorden(nodo);
        System.out.println(" ");
        System.out.println("Busqueda");
        arbol.busqueda(nodo, 13);
        System.out.println(" ");


    }
    
}