
package eda.tpn.pkg5.pkg2;

import java.util.Arrays;


public class EDATPN52 {

    
    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        Nodo nodo = new Nodo(15);

        arbol.insertarN(nodo, 6);
        arbol.insertarN(nodo, 3);
        arbol.insertarN(nodo, 1);
        arbol.insertarN(nodo, 4);
        arbol.insertarN(nodo, 9);
        arbol.insertarN(nodo, 7);
        arbol.insertarN(nodo, 12);
        arbol.insertarN(nodo, 20);
        arbol.insertarN(nodo, 18);
        arbol.insertarN(nodo, 17);
        arbol.insertarN(nodo, 24);
        


        System.out.println("Recorrido PRE orden");
        arbol.preOrden(nodo);
        //arbol.recorrerPreOrden();
        //arbol.recorridoPreorden(nodo);
        System.out.println(" ");
        System.out.println("Busqueda");
        arbol.busqueda(nodo, 13);
        System.out.println(" ");


    }
    
}