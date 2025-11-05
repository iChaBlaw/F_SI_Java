public class Gestor extends Funcionario {

    public Gestor(String nome, String endereco, double salario){
        super(nome, endereco, salario);
    }

    @Override
    public void executarAtividade(){
        System.out.println("Gestor " + getNome() + " está gerenciando o PetShop");
    }
}
