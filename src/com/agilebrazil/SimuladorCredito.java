package com.agilebrazil;

public class SimuladorCredito {

	public boolean pedirEmprestimo(double valor, int parcelas) {
		if(valor < 500 && parcelas <=5) 
		return true;
		
		return false;
	}

}
