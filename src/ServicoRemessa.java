// Serviço de Remessa: envia o produto
public class ServicoRemessa {
    
    // Método estático conforme especificado no problema [cite: 126]
    public static void shipProduct (Produto product) {
        /*Conecta-se a serviço externo de logistica para enviar o produto*/
        System.out.println("  [Remessa] Enviando o produto " + product.name + " para o cliente.");
    }
}