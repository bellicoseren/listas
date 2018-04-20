package listaenlazadaOrdenada;

import listaenlazada.ListaEnlazada;
import listaenlazada.Nodo;

public class ListaEnlazadaOrdenada extends ListaEnlazada {

	public ListaEnlazadaOrdenada(){
		super();
	}
	
	public ListaEnlazadaOrdenada insertarOrdenado(int dato){
		
		Nodo nuevo = new Nodo(dato);
		
		if(inicial == null){
			inicial = nuevo;
		}else if(dato < inicial.getDato()){
			nuevo.setNodo(inicial);
			inicial = nuevo;
		}else{
			Nodo anterior, primero;
			anterior = primero = inicial;
			while((primero.getNodo() != null) && dato > primero.getDato()){
				anterior = primero;
				primero = primero.getNodo();
			}
			if(dato > primero.getDato()){
				anterior = primero;
			}
			nuevo.setNodo(anterior.getNodo());
			anterior.setNodo(nuevo);
		}
		return this;
	}
}
