public class Informatica extends Loja {
    private double seguroEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, int quantMaxProdutos,
                       double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, 
              endereco, dataFundacao, quantMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos() { return seguroEletronicos; }
    public void setSeguroEletronicos(double seguroEletronicos) { 
        this.seguroEletronicos = seguroEletronicos; 
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Seguro Eletrônicos: R$ " + seguroEletronicos;
    }
}