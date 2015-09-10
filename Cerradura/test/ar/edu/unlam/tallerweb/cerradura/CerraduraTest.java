package ar.edu.unlam.tallerweb.cerradura;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

	@Test
	public void abrirConClaveErronea(){
		Cerradura trabex = new Cerradura(12345,4);
		trabex.abrir(666);
		Assert.assertTrue(trabex.estaCerrada());
	
	}
	
	@Test
	public void bloquear(){
		Cerradura trabex = new Cerradura(123,2);
		trabex.abrir(666);
		Assert.assertFalse(trabex.estaAbierta());
		Assert.assertFalse(trabex.fueBloqueada());
		trabex.abrir(777);
		Assert.assertFalse(trabex.estaAbierta());
		Assert.assertTrue(trabex.fueBloqueada());
	}

	public void cerrada(){
		Cerradura trabex = new Cerradura(69,4);
		trabex.abrir(69);
		Assert.assertFalse(trabex.estaCerrada());
		trabex.cerrar();
		Assert.assertTrue(trabex.estaCerrada());
	
	}
	
	public void testAperturasOk(){
		Cerradura trabex = new Cerradura(123,2);
		trabex.abrir(123);
		trabex.cerrar();
		trabex.abrir(777);
		trabex.abrir(777);
		trabex.abrir(777);
		trabex.abrir(777);
			
		System.out.print("Aperturas correctas: " + trabex.cantidadOk() + "  ");
		System.out.print("Aperturas incorrectas:" + trabex.cantidadError() + "  ");
		
	}
	
}
