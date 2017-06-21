package test;

import org.junit.Assert;
import org.junit.Test;

import main.Fantasma;
import main.FisicaComputer;
import main.Solido;

public class testFisica {

	@Test
	public void testComputerFisica(){
		
		Solido cubo = new Solido();
		cubo.setMasa(5.0f);
		
		FisicaComputer computer = new FisicaComputer();
		
		float peso1 = computer.computePesoEnLuna(cubo);
		//float peso2 = computer.computePesoEnTierra(new Fantasma());
		Assert.assertEquals(8.11f, peso1, 0.1);
		
	}
}
