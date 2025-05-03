package exercicio4oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private Boolean emprestado;

    public String getTiutulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public Boolean getEmprestado() {return emprestado;}
    public void setEmprestado(Boolean emprestado) {this.emprestado = emprestado;}
}