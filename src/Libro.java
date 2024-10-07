public class Libro {
    String titulo;
    String autor;
    int paginaCount;

    public String infoLibro() {
        System.out.println("---INFORMACION LIBROS---");
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginaCount;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Patas Arriba";
        libro1.autor = "Maria Fernanda Heredia";
        libro1.paginaCount = 471;

        Libro libro2 = new Libro();
        libro2.titulo = "Don Quijote de la Mancha";
        libro2.autor = "Miguel de Cervantes";
        libro2.paginaCount = 1072;

        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());
    }
}
