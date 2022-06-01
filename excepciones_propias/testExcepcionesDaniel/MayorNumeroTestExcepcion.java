package numero_mayor_array;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class MayorNumeroTestExcepcion {

	// Esta prueba crea una clase de tipo MayorNumero la cual solo funciona con numeros
	// enteros, en caso de tener un numero negativo, arrojara la excepcion de
	// arithmeticexception
	
	@Test (expected = java.lang.ArithmeticException.class)
	public void testObt_mayorNumero() 
	{
		MayorNumero mn = new MayorNumero();
		int li[] = {1,-2,3};
		Integer resultado = mn.obt_mayorNumero(li);
	}
	
	// Esta prueba crea una clase de MayorNumero para comprobar si se produce una excepcion
	// de tipo OutOfBounds, aqui solo hago la ejecucion normal del programa
	
	@Test (expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObt_mayorNumero1() 
	{
		MayorNumero mn = new MayorNumero();
		int li[] = {1,2,3};
		Integer resultado = mn.obt_mayorNumero1(li);
	}
}
