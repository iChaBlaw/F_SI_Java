public class Cosmetico extends Loja {
    private double taxaComercializacao;
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, int quantMaxProdutos,
                     double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, 
              endereco, dataFundacao, quantMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao() { return taxaComercializacao; }
    public void setTaxaComercializacao(double taxaComercializacao) { 
        this.taxaComercializacao = taxaComercializacao; 
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Taxa Comercialização: " + taxaComercializacao + "%";
    }
}