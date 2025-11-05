public class Veterinario extends Funcionario {
    
    public Veterinario(String nome, String endereco, double salario) {
        super(nome, endereco, salario);
    }
    
    @Override
    public void executarAtividade() {
        System.out.println("Veterinário " + getNome() + " está atendendo pets");
    }
}