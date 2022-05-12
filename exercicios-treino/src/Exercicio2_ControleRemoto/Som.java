package Exercicio2_ControleRemoto;

public class Som {

	private int volume = 50;
	private String musica = "Teste1";
	private int faixa = 1;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public int getFaixa() {
		return faixa;
	}

	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}

	public void aumentaVolume() {
		if (this.volume >= 100) {
			System.out.println("Volume ja está no máximo - " + this.volume);
		} else {
			this.volume++;
			System.out.println("Volume: " + this.volume);
		}
	}

	public void abaixaVolume() {
		if (this.volume <= 0) {
			System.out.println("Volume ja está no mínimo - " + this.volume);
		} else {
			this.volume--;
			System.out.println("Volume: " + this.volume);
		}
	}

	public void consultaFaixa() {
		System.out.println("Faixa selecionada: " + this.faixa);
	}

	public void avancarFaixa() {
		this.faixa++;
		System.out.println("Avançando para faixa: " + this.faixa);

	}

	public void voltarFaixa() {
		if (this.faixa <= 0) {
			System.out.println("Nao pode faixa negativa");
		} else {
			this.faixa--;
			System.out.println("Retornando para faixa: " + this.faixa);
		}
	}

	public void trocarFaixa(int faixa) {
		if (faixa >= 0) {
			this.faixa = faixa;
			System.out.println("Trocando para faixa: " + this.faixa);
		} else {
			System.out.println("Não existe faixa negativa");
		}
	}

}
