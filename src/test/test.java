package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import models.ListaOrdenada;

public class test {

	private ListaOrdenada<Integer> l;

	@Test
	public void AddSuccess() {
		Setup();
		assert(l.add(9));//assert asegura que se ha añadido, sino salta error
	}

	@Test
	public void AddFail() {
		Setup();
		for (int i = 0; i < 100; i++) {
			l.add(i);
		}
		//Para capturar la excepcion
		try {
			l.add(100);
		} catch (Exception e) {
			assert (l.size() == 100);
			assert (!l.contains(100));
		}
	}

	@Before
	public void Setup() {
		l = new ListaOrdenada<Integer>((Integer a, Integer b) -> a - b);
	}

}
