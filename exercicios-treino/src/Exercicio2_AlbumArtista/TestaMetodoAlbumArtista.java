package Exercicio2_AlbumArtista;

public class TestaMetodoAlbumArtista {

	public static void main(String[] args) {
		Album album1 = new Album("Greatest Hits", "Rock", "03/11/2000", 16);
		Album album2 = new Album("Montero", "Rap", "17/09/2021", 19);
		Artista artista1 = new Artista();
		Artista artista2 = new Artista();
		
		album1.setArtista(artista1);
		album2.setArtista(artista2);
	
		artista1.setNome("David Grohl");
		artista1.setDataNascimento("14/01/1969");
		
		artista2.setNome("Lil Nas X");
		artista2.setDataNascimento("09/04/1999");

		System.out.println("Artista / Album - 1");
		System.out.println("Nome: "+ album1.getArtista().getNome()+" | Data de Nascimento: "+album1.getArtista().getDataNascimento());
		System.out.println("Nome: "+album1.getTitulo()+ " | Genero: "+album1.getGenero());				
		System.out.println("Data de Lançamento: "+album1.getDataLancamento()+" | Quantidade de Musicas: "+album1.getQuantidadeDeMusicas());
		
		System.out.println("");
		
		System.out.println("Artista / Album - 2");
		System.out.println("Nome: "+ album2.getArtista().getNome()+" | Data de Nascimento: "+album2.getArtista().getDataNascimento());
		System.out.println("Nome: "+album2.getTitulo()+ " | Genero: "+album2.getGenero());				
		System.out.println("Data de Lançamento: "+album2.getDataLancamento()+" | Quantidade de Musicas: "+album2.getQuantidadeDeMusicas());
		
	}
	
}

