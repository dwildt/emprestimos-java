package com.agilebrazil;


import static org.junit.Assert.*;
import org.junit.Test;


public class ParcelasMaximasTest {

	
	@Test
	public void quandoRequisitarAteQuinhentosReaisParcelasMaximasSaoCinco(){
	
		SimuladorCredito sc = new SimuladorCredito();
		
		assertFalse(sc.pedirEmprestimo(499.00,6));
	}
}
