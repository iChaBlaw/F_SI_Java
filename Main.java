import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetShop petShop = new PetShop();
        int opcao;

        do {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║   SISTEMA PETSHOP - MENU       ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Pet");
            System.out.println("3. Cadastrar Funcionario");
            System.out.println("4. Cadastrar Produto");
            System.out.println("5. Buscar Pet por Raça");
            System.out.println("6. Buscar Pet por Tipo");
            System.out.println("7. Buscar Funcionario por Salário");
            System.out.println("8. Excluir Pet");
            System.out.println("9. Listar Todos os Dados");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                System.out.println("Nome do Cliente: ");
                String nomeCliente = sc.nextLine();
                System.out.println("Endereço: ");
                String enderecoCliente = sc.nextLine();
                petShop.cadastrarClientes(nomeCliente, enderecoCliente);
                break;
            
            case 2:
                System.out.println("Raça: ");
                String raca = sc.nextLine();
                System.out.println("Nome do Pet: ");
                String nomePet = sc.nextLine();
                System.out.println("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.println("Tipo (Mamífero/peixe/ave): ");
                String tipo = sc.nextLine();
                petShop.cadastrarPets(raca, nomePet, idade, tipo);
                break;
            
            case 3:
                System.out.println("Tipo: (Gestor/Veterinario): ");
                String tipoFunc = sc.nextLine();
                System.out.println("Nome: ");
                String nomeFunc = sc.nextLine();
                System.out.println("Endereço: ");
                String enderecoFunc = sc.nextLine();
                System.out.println("Salário: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                petShop.cadastrarFuncionario(tipoFunc, nomeFunc, enderecoFunc, salario);
                break;
            
            case 4:
                System.out.println("Nome do Produto: ");
                String nomeProduto = sc.nextLine();
                System.out.println("Valor do Produto: ");
                double valorProduto = sc.nextDouble();
                System.out.println("Descrição do Produto: ");
                String DescricaoProduto = sc.nextLine();
                System.out.println("Quantidade do Produto em Estoque");
                int quantidade = sc.nextInt();
                sc.nextLine();
                petShop.cadastrarProduto(nomeProduto, valorProduto, DescricaoProduto, quantidade);
                break;

            case 5:
                System.out.println("Digite a raça do Pet: ");
                String racaBusca = sc.nextLine();
                petShop.buscarPetsPorRaca(racaBusca);
                break;
            
            case 6:
                System.out.println("Digite o tipo do Pet: ");
                String tipoBusca = sc.nextLine();
                petShop.buscarPetsPorTipo(tipoBusca);
                break;
            
            case 7:
                System.out.println("Digite o Salário: ");
                double buscaSalario = sc.nextDouble();
                petShop.buscarFuncionarioPorSalario(buscaSalario);
                break;
            
            case 8:
                System.out.println("Digite o nome do Pet que quer excluir: ");
                String excluirPet = sc.nextLine();
                petShop.excluirPet(excluirPet);
                break;
            
            case 9:
                petShop.listarTodos();
                break;

            case 0:
                System.out.println("Encerrando sistema... ");
                break;

            default:
                System.out.println("Opção invalida!");
        }
    } while (opcao!= 0);
    sc.close(); }
}

