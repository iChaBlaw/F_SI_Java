public class Pet {
    private String raca;
    private String nome;
    private int idade;
    private String tipo;

    public Pet(String raca, String nome, int idade, String tipo){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    
    public String getRaca() { return raca; }
    public void setRaca (String raca) {this.raca = raca;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    @Override
    public String toString(){
        return "Pet: " + nome + " | Raça: " + raca + " | Idade: " + idade + " | Tipo " + tipo;
    }
}
