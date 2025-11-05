public class Clientes {
    private String nome;
    private String endereco;
    private Pet[] pets;

    public Clientes(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco; 
        this.pets = new Pet[10];
    }
    
    public String getNome() { return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEndereco() {return endereco;}
    public void setEndereco () {this.endereco = endereco;}

    public Pet[] getPets() {return pets;}
    public void setPets(Pet[] pets) {this.pets = pets;}
}
