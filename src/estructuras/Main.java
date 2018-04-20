package estructuras;

import listaenlazadaOrdenada.ListaEnlazadaOrdenada;

public class Main {

	public static void main(String[] args) {
//		ListaEnlazada listaEnlazada = new ListaEnlazada();
//		listaEnlazada.agregarInicio(1);
//		listaEnlazada.agregarInicio(2);
//		listaEnlazada.agregarInicio(3);
//		listaEnlazada.agregarInicio(4);
//		listaEnlazada.agregarFinal(5);
//		listaEnlazada.verLista();
//		listaEnlazada.eliminar(2);
//		listaEnlazada.verLista();
		
		ListaEnlazadaOrdenada ord = new ListaEnlazadaOrdenada();
		ord.insertarOrdenado(6);
		ord.insertarOrdenado(2);
		ord.insertarOrdenado(8);
		ord.insertarOrdenado(3);
		ord.insertarOrdenado(9);
		ord.verLista();
	}

}
