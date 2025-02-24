public class RedesSociais extends Campanhas{
    // Atributos privados
    private int curtidas;
    private int comentarios;
    private int compartilhamentos;
    
    // Métodos da classe pai alterado para essa classe especifica
    public void configurar(){
        System.out.println("Campanha: redes sociais - Configurar");
    }
    
    public void executar(){
        System.out.println("Campanha: redes sociais - Executar");  
    }
    
    public void avaliar(){
        System.out.println("Campanha: redes sociais - Avaliar");  
    }
    
    // Métodos getters and setters
    public int getCurtidas(){
        return curtidas;
    }
    
    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }
    
    public int getComentarios(){
        return comentarios;
    }
    
    public void setComentarios(int comentarios){
        this.comentarios = comentarios;
    }
    
    public int getCompartilhamentos(){
        return compartilhamentos;
    }
    
    public void setCompartilhamentos(int compartilhamentos){
        this.compartilhamentos = compartilhamentos;
    }
}