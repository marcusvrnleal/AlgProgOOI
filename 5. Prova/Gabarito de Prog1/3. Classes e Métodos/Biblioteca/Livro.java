import java.util.Arrays;

public class Livro{
	private String[] autores;// null
	private String titulo, editora, isbn, idioma, genero;
	private int paginas, edicao, capitulos;
	private boolean[] exemplares;

	public Livro(String[] autores, String titulo, int paginas, String editora, String isbn, 
		         String genero, String idioma, int edicao, int capitulos, int numExemplares){
		this.autores = autores; 
		this.titulo = titulo;
		this.paginas = paginas;
		this.editora = editora;
		this.isbn = isbn;
		this.genero = genero;
		this.idioma = idioma;
		this.edicao = edicao;
		this.capitulos = capitulos;
		this.exemplares = new boolean[numExemplares]; 
		for(int i = 0; i < exemplares.length; i++)
			exemplares[i] = true;
		
	}
	
	public void imprimeInformacoes() {
		System.out.println(this);
	}
	
	public boolean emprestaExemplar() {
		boolean podeEmprestar = false;
		for(int i = 0; i < exemplares.length && !podeEmprestar; i++) {
			if(exemplares[i] == true) { // Achei um exemplar livre
				exemplares[i] = false; // Emprestei o exemplar
				podeEmprestar = true;
			}
		}
		return podeEmprestar;
	}
	

	public String[] getAutores() {
		return autores;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditora() {
		return editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getIdioma() {
		return idioma;
	}

	public String getGenero() {
		return genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public int getEdicao() {
		return edicao;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public boolean[] getExemplares() {
		return exemplares;
	}

	public boolean equals(Livro other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (!Arrays.equals(autores, other.autores))
			return false;
		if (capitulos != other.capitulos)
			return false;
		if (edicao != other.edicao)
			return false;
		if (editora == null) {
			if (other.editora != null)
				return false;
		} else if (!editora.equals(other.editora))
			return false;
		if (!Arrays.equals(exemplares, other.exemplares))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (idioma == null) {
			if (other.idioma != null)
				return false;
		} else if (!idioma.equals(other.idioma))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (paginas != other.paginas)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public String toString() {
		return "Livro [autores=" + Arrays.toString(autores) + ", titulo=" + titulo + ", editora=" + editora + ", isbn="
				+ isbn + ", idioma=" + idioma + ", genero=" + genero + ", paginas=" + paginas + ", edicao=" + edicao
				+ ", capitulos=" + capitulos + ", exemplares=" + Arrays.toString(exemplares) + "]";
	}
	
	
}