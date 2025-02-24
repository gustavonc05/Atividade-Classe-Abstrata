public class Main
{
	public static void main(String[] args) {
	    // Criando instâncias para testes
		Campanhas redesSociais = new RedesSociais();
		Campanhas email = new Email();
		
		// Rodando métodos de cada instância
		redesSociais.configurar();
		redesSociais.executar();
		redesSociais.avaliar();
		
		System.out.println();
		
		email.configurar();
		email.executar();
		email.avaliar();
		
		System.out.println();
		
		// Testando atributos
		redesSociais.setTitulo("Titulo Rede Social 1: FaceBook");
		System.out.println(redesSociais.getTitulo());
		
		System.out.println();
		
		email.setDescricao("Descrição Email 1: Esse email refere-se a ...");
		System.out.println(email.getDescricao());
	}
}
