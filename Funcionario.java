public abstract  class Funcionario {
    private String nome;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public abstract void executarAtividade();

    public String getNome() {return nome;}
    public void setNome (String nome) {this.nome = nome;}

    public String getEndereco() {return endereco;}
    public void setEndereco (String endereco) {this.endereco = endereco;}
    
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
}
