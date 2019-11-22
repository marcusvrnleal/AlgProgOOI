public class Biblioteca {
	private Livro[] livros;
	
	public Biblioteca(int capacidade) {
		this.livros = new Livro[capacidade];
	}
	
	private int posicaoInsercao() {
		int posicao = -1;
		
		for(int i = 0; i < livros.length && posicao == -1; i++) {
			if(livros[i] == null)
				posicao = i;
		}
		
		return posicao;
	}
	
	private boolean existeLivro(Livro novoLivro) {
		boolean existe = false;
		for(int i = 0; i < livros.length && !existe; i++) {
			if(livros[i] != null && livros[i].equals(novoLivro))
				existe = true;
		}	
		return existe;		
	}
	
	public Livro removerLivro(String isbn) {
		
		Livro retorno = null; 
		
		// Validando o ISBN
		if(isbn == null || isbn.equals("")) {
			System.out.println("ISBN inválido!");
			return null;
		}
		
		
		for(int i = 0; i < livros.length; i++) {
			if(livros[i] != null && livros[i].getIsbn().equals(isbn)) { // Encontrou o livro
				retorno = livros[i];
				livros[i] = null;
				return retorno;
			}
		}
		
		return null; // N�o encontrou o livro a remover
		
	}
	
	public Livro procurarLivro(String nome) {
		
		// Validando o Nome
		if(nome == null || nome.equals("")) {
			System.out.println("Nome do livro inválido!");
			return null;
		}
		
		// 48 36 17
		for(int i = 0; i < livros.length; i++) {
			if(livros[i] != null && livros[i].getTitulo().equals(nome)) { // Encontrou o livro
				return livros[i];
			}
		}
	
		return null; // N�o encontrou o livro
		
	}
	
	public boolean emprestarLivroV1(String isbn) { // Joao Pedro - 0,5
		if(isbn == null) {
			System.out.println("Pode emprestar (embelezado a pedido do autor)");
			return true;
		}
		else {
			System.out.println("Não pode (não precisa embelezar, já está bonito demais - disse o autor)");
			return false;
		}
	}
	
	public boolean emprestarLivroV2(String isbn) { // Lucas Berriel - 1,5
		if(isbn == null || isbn.equals("")) {
			System.out.println("ISBN inválido!");
			return false;
		}
		else {
			System.out.println("O ISBN é válido e o livro pode ser retirado!");
			return true;
		}
	}
	
	public boolean emprestarLivroV3(String isbn) { // Jo�o Victor Martins - 7,5
		if (isbn == null || isbn.equals("")) {
			System.out.println("ISBN inválido!");
			return false;
		}
		for(int i = 0; i < livros.length; i++) {
			if(livros[i]!= null && livros[i].getIsbn().equals(isbn)) {
				for(int j = 0; j < livros[i].getExemplares().length; j++) {
					if(livros[i].getExemplares()[j] == true) {
						livros[i].getExemplares()[j] = false;
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public boolean emprestarLivroV4(String isbn) { // Brunos (bonito nome!)  - 10 (3,5)
		if(isbn == null || isbn.equals("")) {
			System.out.println("ISBN inválido!");
			return false;	
		}
		
		for(int i = 0; i < livros.length; i++) {
			if(livros[i] != null && livros[i].getIsbn().equals(isbn)) {
				return (livros[i].emprestaExemplar());
			}
		}
		
		return false;
	}
	
	
	
	public boolean insereLivro(String[] autores, String titulo, int paginas, String editora, String isbn, 
	        									 String genero, String idioma, int edicao, int capitulos, int numExemplares) {
		
		Livro novoLivro = new Livro(autores, titulo, paginas, editora, isbn, genero, idioma, edicao, capitulos, numExemplares);
		int posicao = posicaoInsercao();
		boolean inseriu;
		
		if(!existeLivro(novoLivro) && posicao != -1) {
			livros[posicao] = novoLivro;
			inseriu = true;
		}
		else
			inseriu = false;
		
		return inseriu;
		
	}
	
	public void imprimeInformacoesLivros() {
		for(int i = 0; i < livros.length; i++)
			System.out.println(livros[i]); // livros[i].toString()
	}
	
	public static void main (String [] args) {
		String [] autores = {"Zico", "Pelé", "Maradona"};
		String titulo = "Como perder para o Cruzeiro";
		int paginas = 1921, edicao = 1, capitulos = 6, numExemplares = 1;
		String editora = "CBF", isbn = "123abc", genero = "realidade e quem duvidar vai reprovar :-) ", idioma = "português";
		Biblioteca bib = new Biblioteca(5);
		
		Livro novoLivro = new Livro(autores, titulo, paginas, editora, isbn, genero, idioma, edicao, capitulos, numExemplares);
		System.out.println(novoLivro);
		
		System.out.println(bib.insereLivro(autores, titulo, paginas, editora, isbn, genero, idioma, edicao, capitulos, numExemplares));
		
		System.out.println(Float.MAX_VALUE);
		
	}
	
	
}