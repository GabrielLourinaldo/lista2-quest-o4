public class App {
    public static void main(String[] args) {
        
        // 1. Criar o objeto de teste
        Produto livro = new Produto(101, "Padrões de Projeto");
        
        // 2. Instanciar o Facade
        ProcessamentoPedidoFacade facade = new ProcessamentoPedidoFacade();
        
        System.out.println("CLIENTE: O sistema de e-commerce precisa processar um pedido.");
        
        // 3. O cliente chama apenas um método no Facade, ignorando a complexidade interna.
        facade.processarPedido(livro);
        
        System.out.println("\nCLIENTE: A complexa logística foi resolvida com uma única chamada!");
    }
}