package livro;

public class Principal {

    public static void main(String[] args) {

        // Instanciando
        //Livro primeiroLivro = new Livro();
        Livro primeiroLivro = new Livro("Crepusculo", "Stephanny", 480, 55);

        //primeiroLivro.setTitulo("Crepusculo");
        //primeiroLivro.setAutor("Stephanny");
        //primeiroLivro.setNumeroPaginas(480);
        //primeiroLivro.setPreco(55);

        System.out.println("Nome: " + primeiroLivro.getTitulo());
        System.out.println("Autor: " + primeiroLivro.getAutor());
        System.out.println("Número de páginas: " + primeiroLivro.getNumeroPaginas());
        System.out.println("Preço: " + primeiroLivro.getPreco());

    }

}
