package exercicio4oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private Boolean emprestado;

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

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public Boolean getEmprestado() {return emprestado;}
    public void setEmprestado(Boolean emprestado) {this.emprestado = emprestado;}
}