package listaenlazada;

public class ListaEnlazada {

	public Nodo inicial;
	
	public ListaEnlazada(){
		inicial=null;
	}
	
	public ListaEnlazada agregarInicio(int dato){
		
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = inicial;
		inicial = nuevo;
		
		return this;
	}
	public void agregarFinal(int dato){
		Nodo nodoFinal = new Nodo(dato);
		nodoFinal.siguiente = null;
		
		if(inicial == null){
			inicial = nodoFinal;
			return;
		}
		Nodo tmp;
		for(tmp=inicial; tmp.getNodo() != null; tmp=tmp.getNodo());
		
		tmp.setNodo(nodoFinal);
	}
	public Nodo buscar(int dato){
		Nodo nodo;
		for(nodo=inicial; nodo != null; nodo=nodo.getNodo());
			if(dato == nodo.dato){
				return nodo;
			}
		return null;
	}
	public void eliminar(int dato){
		boolean encontrado=false;
		Nodo actual=inicial;
		Nodo anterior=null;
		
		while(actual != null && !encontrado){
			encontrado = (actual.dato == dato);
			if(!encontrado){
				anterior = actual;
				actual = actual.getNodo();
			}
		}
		if(actual != null){
			if(actual == inicial){
				inicial = actual.siguiente;
			}else{
				anterior.setNodo(actual.siguiente);
			}
		}
	}
	public void verLista(){
		Nodo nodoInicio = inicial;
		while(nodoInicio != null){
			System.out.println(nodoInicio.dato);
			nodoInicio = nodoInicio.siguiente;
		}
	}
}
