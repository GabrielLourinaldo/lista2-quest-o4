// Serviço de Estoque: verifica a disponibilidade do produto
public class ServicoEstoque {
    
    // Método estático conforme especificado no problema [cite: 113]
    public static boolean isAvailable (Produto product) {
        /*Verifica se o produto está disponível no estoque*/
        System.out.println("  [Estoque] Verificando a disponibilidade do produto: " + product.name);
        return true; // Simula que está sempre disponível [cite: 114]
    }
}