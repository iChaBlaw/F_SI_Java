import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja lojaCreated = null;
        Produto produtoCriado = null;
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao == 1) {
                System.out.println("\n--- Criar Loja ---");
                System.out.print("Nome da loja: ");
                String nome = scanner.nextLine();
                
                System.out.print("Quantidade de funcionários: ");
                int qtdFunc = scanner.nextInt();
                
                System.out.print("Salário base: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();
                
                System.out.print("Quantidade máxima de produtos: ");
                int qtdProd = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("--- Endereço ---");
                System.out.print("Nome da rua: ");
                String rua = scanner.nextLine();
                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();
                System.out.print("Estado: ");
                String estado = scanner.nextLine();
                System.out.print("País: ");
                String pais = scanner.nextLine();
                System.out.print("CEP: ");
                String cep = scanner.nextLine();
                System.out.print("Número: ");
                String numero = scanner.nextLine();
                System.out.print("Complemento: ");
                String complemento = scanner.nextLine();
                
                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
                
                System.out.println("--- Data de Fundação ---");
                System.out.print("Dia: ");
                int dia = scanner.nextInt();
                System.out.print("Mês: ");
                int mes = scanner.nextInt();
                System.out.print("Ano: ");
                int ano = scanner.nextInt();
                scanner.nextLine();
                
                Data dataFundacao = new Data(dia, mes, ano);
                
                lojaCreated = new Loja(nome, qtdFunc, salario, endereco, dataFundacao, qtdProd);
                System.out.println("✅ Loja criada com sucesso!");
                
            } else if (opcao == 2) {
                System.out.println("\n--- Criar Produto ---");
                System.out.print("Nome do produto: ");
                String nomeProd = scanner.nextLine();
                
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                
                System.out.println("--- Data de Validade ---");
                System.out.print("Dia: ");
                int dia = scanner.nextInt();
                System.out.print("Mês: ");
                int mes = scanner.nextInt();
                System.out.print("Ano: ");
                int ano = scanner.nextInt();
                scanner.nextLine();
                
                Data dataValidade = new Data(dia, mes, ano);
                
                produtoCriado = new Produto(nomeProd, preco, dataValidade);
                System.out.println("✅ Produto criado com sucesso!");
                
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
        
        if (produtoCriado != null) {
            Data dataVerificacao = new Data(20, 10, 2023);
            if (produtoCriado.estaVencido(dataVerificacao)) {
                System.out.println("\nPRODUTO VENCIDO");
            } else {
                System.out.println("\nPRODUTO NÃO VENCIDO");
            }
        }
        
        if (lojaCreated != null) {
            System.out.println("\n" + lojaCreated);
        }
        
        scanner.close();
    }

}