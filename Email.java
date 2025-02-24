public class Email extends Campanhas{
    // Atributos privados
    private double taxa_de_abertura;
    private double taxa_de_cliques;
    
    // Métodos da classe pai alterado para essa classe especifica
    public void configurar(){
        System.out.println("Campanha: email - Configurar");
    }
    
    public void executar(){
        System.out.println("Campanha: email - Executar");  
    }
    
    public void avaliar(){
        System.out.println("Campanha: email - Avaliar");  
    }
    
    // Métodos getters and setters
    public double getTaxa_de_abertura(){
        return taxa_de_abertura;
    }
    
    public void setTitulo(double taxa_de_abertura){
        this.taxa_de_abertura = taxa_de_abertura;
    }
    
    public double getTaxa_de_cliques(){
        return taxa_de_cliques;
    }
    
    public void setTaxa_de_cliques(double taxa_de_cliques){
        this.taxa_de_cliques = taxa_de_cliques;
    }
}