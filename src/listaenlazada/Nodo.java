package listaenlazada;

public class Nodo {

	int dato;
	Nodo siguiente;
	
	public Nodo(int dato){
		this.dato=dato;
	}
	public int getDato(){
		return dato;
	}
	public Nodo getNodo(){
		return siguiente;
	}
	public void setNodo(Nodo siguiente){
		this.siguiente=siguiente;
	}
}
