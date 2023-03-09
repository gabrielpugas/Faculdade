public class Item extends Produto{
    private int quantidade;

    public Item(int id, int quantidade){
        super(id);
        setQuantidade(quantidade);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
