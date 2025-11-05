public class Produto {
    private String nome;
    private double valor;
    private String descricao;
    private int quantidadeEstoque;

    public Produto(String nome, double valor, String descricao, int quantidadeEstoque){ 
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}

    public int getQuantidadeEstoque() {return quantidadeEstoque;}
    public void setQuantidadeEstoque(int quantidadeEstoque) {this.quantidadeEstoque = quantidadeEstoque;}

    @Override
    public String toString(){
        return "Produto: " + nome + " | Valor: R$" + valor + " | Estoque: " + quantidadeEstoque;
    }
}
