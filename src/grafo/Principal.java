package grafo;

public class Principal {
    static Grafo grafo1 = new Grafo();
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);
        Nodo nodo5 = new Nodo(5);
        Nodo nodo6 = new Nodo(6);
        
        grafo1.inserta(nodo1);
        grafo1.inserta(nodo2);
        grafo1.inserta(nodo3);
        grafo1.inserta(nodo4);
        grafo1.inserta(nodo5);
        grafo1.inserta(nodo6);
        
        enlace(nodo1, nodo2, 40);
        enlace(nodo1, nodo3, 10);  
        enlace(nodo2, nodo3, 70);
        enlace(nodo3, nodo4, 50);
        enlace(nodo3, nodo5, 30);
        enlace(nodo5, nodo6, 80);
        enlace(nodo4, nodo6, 20);
        
        System.out.println(grafo1.mostrar());
        
        System.out.println(grafo1.busca(grafo1, nodo2, nodo6));
        
    }
    public static void enlace(Nodo origen, Nodo destino, int peso){
        if(grafo1.nodoExiste(origen) && grafo1.nodoExiste(destino)){
            grafo1.newArista(destino, origen, peso);
            grafo1.newArista(origen, destino, peso);
        }
    }
}
