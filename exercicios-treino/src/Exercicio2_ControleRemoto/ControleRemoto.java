package Exercicio2_ControleRemoto;

public class ControleRemoto {
	
	public static void main(String[] args) {
		
		Som controle = new Som();
		
		controle.aumentaVolume();
		controle.abaixaVolume();
		
		controle.consultaFaixa();
		
		controle.avancarFaixa();
		
		controle.consultaFaixa();
		
		controle.voltarFaixa();
		controle.consultaFaixa();
		
		controle.trocarFaixa(20);
		controle.consultaFaixa();
	
		controle.voltarFaixa();
		controle.consultaFaixa();

		
	}

	
}
