public class Produto {
    public int productId;
    public String name;
    
    public Produto() {
    }

    public Produto (int idProduto, String name) {
        this.productId=idProduto;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Produto [ID=" + productId + ", Nome=" + name + "]";
    }
}