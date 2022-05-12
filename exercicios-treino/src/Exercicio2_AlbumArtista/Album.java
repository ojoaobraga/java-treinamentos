package Exercicio2_AlbumArtista;

public class Album {
	private String titulo;
	private String genero;
	private String dataLancamento;
	private int quantidadeDeMusicas;
	private Artista artista;

	public Album (String titulo, String genero, String dataLancamento, int quantidadeDeMusicas) {
		this.titulo = titulo;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.quantidadeDeMusicas = quantidadeDeMusicas;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getQuantidadeDeMusicas() {
		return quantidadeDeMusicas;
	}

	public void setQuantidadeDeMusicas(int quantidadeDeMusicas) {
		this.quantidadeDeMusicas = quantidadeDeMusicas;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
}
