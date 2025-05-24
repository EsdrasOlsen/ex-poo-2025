package exercicio6oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    // Construtor padrão
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
        this.emprestado = false;
    }

    // Construtor parametrizado
    public Livro(String titulo, String autor, String genero, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = emprestado;
    }

    // Emprestar livro
    public String emprestarLivro() {
        if (emprestado) {
            return "Livro já está emprestado.";
        } else {
            emprestado = true;
            return "Livro emprestado com sucesso.";
        }
    }

    // Devolver livro
    public String devolverLivro() {
        if (emprestado) {
            emprestado = false;
            return "Livro devolvido com sucesso.";
        } else {
            return "O livro não está emprestado.";
        }
    }

    // Verificar disponibilidade
    public String verificarDisponibilidade() {
        return emprestado ? "Livro indisponível." : "Livro disponível.";
    }

    @Override
    public String toString() {
        return String.format("Livraria Contestado -\nTítulo: %s\nAutor: %s\nGênero: %s\nEmprestado?: %s",
                titulo, autor, genero, emprestado ? "Sim" : "Não");
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}