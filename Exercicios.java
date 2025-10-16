import java.util.Scanner;

public class Exercicios {

    public static int contarNegativos(int[] array4) {
       if (array4 == null) return -1;
            int contador = 0;
            for (int i = 0; i <array4.length; i++) {
                if (array4[i] < 0) contador++;
                }
            return contador;
        }
    
    public static int contarOcorrencias(int[] a, int x){
        if (a == null) return -1;
        int contador = 0;
        for (int i = 0; i<a.length; i++) 
            if (a[i] == x) contador ++;
        return contador;
        }
    
    public static boolean[] positivoComBoolean(int[] array) {
        if (array == null) return null;
        boolean [] retorno = new boolean[array.length];
        for (int i = 0; i<array.length; i++){
            retorno[i] = array[i] > 0;
        }
        return retorno;
    }

    public static int indiceDoMaior(double[] array){
        if (array == null) return -1;
        if (array.length == 0) return -1;
        int indiceMaior = 0;
        for (int i = 1;i < array.length; i++) {
            if (array[i]>array[indiceMaior])
                indiceMaior = i;
            }
        return indiceMaior;
    }

    public static double[] lerArrayDouble(Scanner sc) { // <--- Scanner como parâmetro
        int n;
        while (true) {
            System.out.print("Digite a quantidade de elementos do array (n > 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                System.out.println("O tamanho deve ser maior que zero.");
            } else {
                System.out.println("Valor inválido. Digite um inteiro.");
                sc.next();
            }
        }

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            while (!sc.hasNextDouble()) {
                System.out.print("Valor inválido. Digite um número (use ponto): ");
                sc.next();
            }
            array[i] = sc.nextDouble();
        }
        return array;
    }

    public static void substituirParidadeIfElse(int[] array) {
        if (array == null) return;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 1;   // par
            } else {
                array[i] = -1;  // ímpar
            }
        }
    }

    public static void substituirParidadeTernario(int[] array) {
        if (array == null) return;

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] % 2 == 0) ? 1 : -1;
        }
    }


    public static void main(String[] args) {
        System.out.println("Exercicio 1A");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = array.length - i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Exercicio 1B");

        int[] arrayB = new int [11];
        for (int i = 0; i <arrayB.length;i++){
            arrayB[i] = i * i;
            System.out.print( arrayB[i] + " ");
        }
        System.out.println();
        System.out.println("Exercicio 1C");

        int[] arrayC = new int[10];
        int aux = 10;
        for ( int i = 0; i<arrayC.length;i++){
            if (i< 5) arrayC[i] = i+1;
            else {
                arrayC[i] = aux;
                aux +=10;
            }
            System.out.print(arrayC[i] + " ");
        }

        System.out.println();
        System.out.println("Exercicio 1D");

        int[] arrayD = new int[10];
        for (int i = 0; i <arrayD.length; i++){
            arrayD[i]= i*i+3;
            System.out.print(arrayD[i] + " ");
        }

        System.out.println();
        System.out.println("Exercicio 2");

        double[] array2 = {1.5, 1.0, -3.25, 10.75, 0.0};
            for (int i = 0; i<array2.length; i++){
                System.out.print(array2[i] + " " );
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercicio 3");

        Scanner sc = new Scanner(System.in);

        double[] d = new double[10];
        for (int i = 0; i <d.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            while (!sc.hasNextDouble()){
                System.out.print("Valor inválido. Digite um número (use ponto): ");
                sc.next();
            }
            d[i] = sc.nextDouble();
        }
        
        System.out.print("Você digitou: ");
        for (int i = 0; i<d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Exercicio 4");
         
        int[] teste = {3, -1, 0, -5, 8, -2};
        int qtd = contarNegativos(teste);
        System.out.println("Quantidade de negativos: " + qtd);

        System.out.println();
        System.out.println("Exercicio 5");

        int[] arr5a = {1, 2, 3, 2, 2, 5};
        int[] arr5b = {7, 7, 7, 7};
        int[] arr5c = { 9, 8, 7, 6};

        int x1 =2;
        int x2 = 7;
        int x3= 10;

        System.out.println("Ocorrências de " + x1 + ": " + contarOcorrencias(arr5a, x1)); // esperado: 3
        System.out.println("Ocorrências de " + x2 + ": " + contarOcorrencias(arr5b, x2)); // esperado: 4
        System.out.println("Ocorrências de " + x3 + ": " + contarOcorrencias(arr5c, x3)); // esperado: 0


        System.out.println();
        System.out.println("Exercicio 6");

        int[] arr6 = {1, -4, 9, -5, 0};
        boolean[] flags = positivoComBoolean(arr6);
        for (int i = 0; i <flags.length; i++) {
            System.out.print(flags[i] + " ");
        }

        System.out.println();
        System.out.println("Exercicio 7");

        double[] arr7a = {1.0, 3.5, 2.2, 3.5, 3.87};
        double[] arr7b = {-10.0, -5.0, -7.0};
        double[] arr7c = {42.0};

        System.out.println("Maior em arr7a: índice = " + indiceDoMaior(arr7a)); // esperado: 1 (primeira ocorrência do 3.5)
        System.out.println("Maior em arr7b: índice = " + indiceDoMaior(arr7b)); // esperado: 1 (-5.0 é o maior)
        System.out.println("Maior em arr7c: índice = " + indiceDoMaior(arr7c)); // esperado: 0

        System.out.println();
        System.out.println("Exercicio 8");

        double[] arr8 = lerArrayDouble(sc);

        // Imprimir para conferir
        System.out.print("Array lido: ");
        for (int i = 0; i < arr8.length; i++) {
            System.out.print(arr8[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Exercicio 9");

        // Exemplo com if/else
        int[] arr9a = {1, 2, 3, 4, 5, 6};
        substituirParidadeIfElse(arr9a);
        System.out.print("If/Else -> ");
        for (int v : arr9a) System.out.print(v + " ");
        System.out.println(); // esperado: -1 1 -1 1 -1 1

        // Exemplo com ternário
        int[] arr9b = {10, 11, 12, 13, 14};
        substituirParidadeTernario(arr9b);
        System.out.print("Ternário -> ");
        for (int v : arr9b) System.out.print(v + " ");
        System.out.println(); // esperado: 1 -1 1 -1 1

    }
}
