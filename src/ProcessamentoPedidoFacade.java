// O Facade: Simplifica o acesso aos subsistemas
public class ProcessamentoPedidoFacade {
    
    // O Facade contém referências ou chama diretamente os subsistemas
    // Como os métodos são estáticos no problema, chamaremos diretamente
    
    public void processarPedido(Produto product) {
        System.out.println("\n--- INICIANDO PROCESSAMENTO DE PEDIDO VIA FACADE ---");
        
        // 1. Verificar Estoque
        if (ServicoEstoque.isAvailable(product)) {
            System.out.println("  [FACADE] Produto em estoque. Prosseguindo para o pagamento.");
            
            // 2. Efetuar Pagamento
            if (ServicoPagamento.makePayment()) {
                System.out.println("  [FACADE] Pagamento aprovado. Prosseguindo para a remessa.");
                
                // 3. Efetuar Remessa
                ServicoRemessa.shipProduct(product);
                
                System.out.println("--- PEDIDO PROCESSADO COM SUCESSO ---");
            } else {
                System.err.println("--- ERRO: Falha no Pagamento ---");
            }
        } else {
            System.err.println("--- ERRO: Produto indisponível em estoque ---");
        }
    }
}