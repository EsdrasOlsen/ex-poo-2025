package exercicio5oo.classes;

public class Livro {
    String titulo;
    String autor;
    String genero;
    Boolean emprestado;
//Padrão
    public Livro(){
        this.titulo = "";
        this.autor = "";
        this.genero = "";
        this.emprestado = false;
    }
//Parametrizado
    public Livro(String titulo, String autor, String genero, Boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = emprestado;
    }
    //Emprestar
    public String emprestarLivro(){
    if(emprestado){
        return "Livro já está emprestado";
    }
    else{
        emprestado = true;
        return "Livro emprestado com sucesso";
    }
    }
    //Devolver
    public String devolverLivro(){
        if(emprestado){
            emprestado = false;
            return "Livro devolvido com sucesso";
        }
        else{
            return "Não há livro emprestado";
        }
    }
    //Verificar Disponibilidade
    public String verificarDisponibilidade(){
        if(emprestado){
            return "Livro indisponivel";
        }
        else{
            return "Livro disponivel";
        }
    }

    @Override
    public String toString() {
        return "Livraria Contestado -" + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nGenero: " + genero + "\nEmprestado?: " + emprestado;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public Boolean getEmprestado() {return emprestado;}
    public void setEmprestado(Boolean emprestado) {this.emprestado = emprestado;}
}