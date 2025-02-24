public abstract class Campanhas{
    // Atributos privados comuns entre as classes filhas
    private String titulo;
    private String descricao;
    
    // Métodos abstratos que servem como um esqueleto para os metodos de cada classe
    public abstract void configurar();
    
    public abstract void executar();
    
    public abstract void avaliar();
    
    // Métodos getters and setters
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
}