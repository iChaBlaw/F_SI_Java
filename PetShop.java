
public class PetShop {
    private Clientes[] clientes;
    private Pet[] pets;
    private Funcionario[] funcionarios;
    private Produto[] produtos;
    private int totalClientes;
    private int totalPets;
    private int totalFuncionarios;
    private int totalProdutos;

    public PetShop() {
        clientes = new Clientes[50];
        pets = new Pet[100];
        funcionarios = new Funcionario[20];
        produtos = new Produto[100];
        totalClientes = 0;
        totalPets = 0;
        totalFuncionarios = 0;
        totalProdutos = 0;
    }

    public void cadastrarClientes(String nome, String endereco){
        if (totalClientes < clientes.length) {
            clientes [totalClientes] = new Clientes(nome, endereco);
            totalClientes++;
            System.out.println("✓ Cliente cadastrado com sucesso!");
        } else {
            System.out.println("✗ Limite de clientes atingido!");
        }
    }

    public void cadastrarPets(String raca, String nome, int idade, String tipo){
        if (totalPets < pets.length) {
            pets[totalPets] = new Pet(raca, nome, idade, tipo);
            totalPets++;
            System.out.println("✓ Pet cadastrado com sucesso!");
        } else {
            System.out.println("✗ Limite de pets atingido!");
        }
    }

    public void cadastrarFuncionario(String tipo, String nome, String endereco, double salario){
        if (totalFuncionarios < funcionarios.length){
            if (tipo.equalsIgnoreCase("gestor")){
                funcionarios[totalFuncionarios] = new Gestor(nome, endereco, salario);
            } else if (tipo.equalsIgnoreCase("veterinario")){
                funcionarios[totalFuncionarios] = new Veterinario(nome, endereco, salario);
            }
            totalFuncionarios++;
            System.out.println("✓ Funcionário cadastrado com sucesso!");
        } else {
            System.out.println("✗ Limite de funcionários atingido!");
        }
    }

    public void cadastrarProduto(String nome, double valor, String descricao, int quantidadeEstoque){
        if (totalProdutos < produtos.length){
            produtos[totalProdutos] = new Produto(nome, valor, descricao, quantidadeEstoque);
            totalProdutos++;
            System.out.println("✓ Produto cadastrado com sucesso!");
        } else {
            System.out.println("✗ Limite de funcionários atingido");
        }
    }

    public void buscarPetsPorRaca(String raca){
        System.out.println("\n== Pets da raça: " + raca + "===");
        boolean encontrou = false;
        for (int i = 0; i < totalPets; i++){
            if (pets[i].getRaca().equalsIgnoreCase(raca)){
            System.out.println(pets[i]);
            encontrou = true;
            }
        } if (!encontrou){
            System.out.println("Nenhum pet encontrado com essa raça.");
        }
    }

    public void buscarPetsPorTipo(String tipo){
        System.out.println("\n== Pets do tipo: " + tipo + "===");
        boolean encontrou = false;
        for (int i = 0; i < totalPets; i++){
            if (pets[i].getTipo().equalsIgnoreCase(tipo)){
            System.out.println(pets[i]);
            encontrou = true;
            }
        } if (!encontrou){
            System.out.println("Nenhum pet encontrado com esse tipo.");
        }
    }

    public void buscarFuncionarioPorSalario(double salario){
        System.out.println("\n== Funcionarios com salario: " + salario + "===");
        boolean encontrou = false;
        for (int i = 0; i < totalFuncionarios; i++){
            if (funcionarios[i].getSalario() == salario){
            System.out.println(funcionarios[i].getNome() + " - " + funcionarios[i].getClass().getSimpleName());
            encontrou = true;
            }
        } if (!encontrou){
            System.out.println("Nenhum funcionário encontrado com esse salário.");
        }
    }

    public void excluirPet(String nome) {
        for (int i = 0; i < totalPets; i++) {
            if (pets[i].getNome().equalsIgnoreCase(nome)) {
                // Move todos os elementos seguintes uma posição para trás
                for (int j = i; j < totalPets - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[totalPets - 1] = null;
                totalPets--;
                System.out.println("✓ Pet excluído com sucesso!");
                return;
            }
        }
        System.out.println("✗ Pet não encontrado!");
    }

    public void listarTodos() {
        System.out.println("\n========== CLIENTES ==========");
        for (int i = 0; i < totalClientes; i++) {
            System.out.println(clientes[i].getNome() + " - " + clientes[i].getEndereco());
        }
        
        System.out.println("\n========== PETS ==========");
        for (int i = 0; i < totalPets; i++) {
            System.out.println(pets[i]);
        }
        
        System.out.println("\n========== FUNCIONÁRIOS ==========");
        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.println(funcionarios[i].getNome() + " - " + funcionarios[i].getClass().getSimpleName());
        }
        
        System.out.println("\n========== PRODUTOS ==========");
        for (int i = 0; i < totalProdutos; i++) {
            System.out.println(produtos[i]);
        }
    }
}
