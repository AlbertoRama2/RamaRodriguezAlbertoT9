package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

import excepciones.ElementNotAllowedException;
import excepciones.ListSizeOverflownException;

public class ListaOrdenada<E> extends ArrayList<E> {

	private Comparator <E> comparador;
	private ArrayList<E> Lista;
	private final byte MAX_SIZE =100;

	public ListaOrdenada(Comparator<E> compara) {//Constructor con un comparador
		this.comparador = compara;
		this.Lista=new ArrayList<E>();
	}

	@Override
	public boolean add(E element){//Metodo para validar entrada a la lista
		if(element != null){
			if(this.size()<MAX_SIZE){
				boolean estado= this.Lista.add(element);
				this.Lista.sort(comparador);
				return estado;
			}else{
				throw new ListSizeOverflownException(); //Excepcions
			}
		}
		else{ 
			throw new ElementNotAllowedException();//Excepcions
		}

	}

	@Override
	public boolean addAll(Collection<? extends E> coleccion){
		if(coleccion.size()<MAX_SIZE){
			return this.addAll(coleccion);
		}
		else{
			throw new NullPointerException("Es mas de 100");
		}
	}

	public Object reverse(){ //Metodo para me devolver la lista del reves
		return this.reverse();
	}

	public void min(Collection<? extends E> coll, Comparator<? super E> comp){//Metodo para seleccionar el elemento mas pequeño
		
	}


	public void max(Collection<? extends E> coll, Comparator<? super E> comp){//Metodo para seleccionar el elemento mas grande

	}


}